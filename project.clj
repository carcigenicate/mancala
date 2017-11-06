(defproject mancala "0.1.0-SNAPSHOT"
  :description "FIXME: write description"

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [seesaw "1.4.5"]
                 [helpers "1"]]

  :main ^:skip-aot mancala.main

  :target-path "target/%s"

  :profiles {:uberjar {:aot :all}})
