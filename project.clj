(defproject grimoire "0.0.2-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [seesaw "1.4.2"]]
  :resource-paths ["libs/twitter4j-core-3.0.3.jar"]
  :main grimoire.core
  :aot [grimoire.core])
