(ns register-all
  (:require [titan-interface.core :as titan])
  (:import (pool DatabaseActorPool))
  (:gen-class
  :name databaseinterface.registerall
  :method [#^{:static true} registerAll [] void]))



(defn -registerAll []
  (DatabaseActorPool/registerActor titan/titan-write))


(defn -main [& args]
  (-registerAll))