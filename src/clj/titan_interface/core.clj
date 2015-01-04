(ns titan-interface.core
  (:use okku.core)
  (:require [cheshire.core :as j]
            [clojurewerkz.titanium.graph :as tg]
            [clojure.java.io :as io]
            [clojurewerkz.titanium.types :as tt]
            [clojurewerkz.titanium.vertices :as tv])
  (:gen-class))


(defn- persist-to-titan [data]
  (tg/open (j/parse-string (slurp (io/resource "cassandra.json"))))
  (try (tg/transact!
         (tt/defkey :title String {:indexed-vertex? true :unique-direction :out})
         (tv/create! data))
       (catch Exception e)))

(def titan-write (actor
                   (onReceive [post-json]
                              (->> post-json
                                   (#(j/parse-string % true))
                                   (persist-to-titan)))))