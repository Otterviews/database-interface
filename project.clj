(defproject otterviews/database-interface "0.1.0-SNAPSHOT"
            :description "FIXME: write description"
            :url "http://example.com/FIXME"
            :license {:name "Eclipse Public License"
                      :url  "http://www.eclipse.org/legal/epl-v10.html"}
            :dependencies [[org.clojure/clojure "1.6.0"]
                           [clojurewerkz/titanium "1.0.0-beta1"]
                           [org.clojure.gaverhae/okku "0.1.3"]
                           [com.typesafe.akka/akka-actor "2.0"]
                           [cheshire "5.4.0"]]
            :repositories [["typesafe" {:url  "http://repo.typesafe.com/typesafe/releases/"
                                        :id   "typesafe"
                                        :name "Typesafe Repository"}]]
            :main [register-all.core]
            :aot [register-all]
            :source-paths ["src/clj"]
            :java-source-paths ["src/pool"]
            :target-path "target/%s"
            :profiles {:uberjar {:aot :all}})
