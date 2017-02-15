(defproject microscope "0.1.0"
  :description "Microservice architecture for Clojure"
  :url "https://github.com/acessocard/microscope"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.logging "0.3.1"]
                 [com.novemberain/langohr "3.6.1"]
                 [cheshire "5.6.3"]
                 [finagle-clojure/core "0.7.0"]
                 [finagle-clojure/http "0.7.0"]
                 [environ "1.1.0"]]

  :profiles {:dev {:src-paths ["dev"]
                   :dependencies [[midje "1.8.3"]]
                   :plugins [[lein-midje "3.2.1"]]}})
