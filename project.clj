(defproject otterviews/database-interface "0.1.0-SNAPSHOT"
            :description "FIXME: write description"
            :url "http://example.com/FIXME"
            :license {:name "Eclipse Public License"
                      :url  "http://www.eclipse.org/legal/epl-v10.html"}
            :dependencies [[org.clojure/clojure "1.6.0"]
                           [clojurewerkz/titanium "1.0.0-beta1"]
                           [org.clojure.pasviegas/okku "1.4"]
                           [com.typesafe.akka/akka-actor_2.11 "2.3.8"]
                           [cheshire "5.4.0"]]
            :repositories [["typesafe" {:url  "http://repo.typesafe.com/typesafe/releases/"
                                        :id   "typesafe"
                                        :name "Typesafe Repository"}]]
            :aot [titan-interface.core]
            :source-paths ["src/clj"]
            :java-source-paths ["src/pool"]
            :target-path "target/%s"
            :profiles {:uberjar {:aot :all}})
