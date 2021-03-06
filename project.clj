(defproject modern-cljs "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  ;; CLJ source code path
  :source-paths ["src/clj"]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-1913"]
                 [compojure "1.1.5"]]

  ;; lein-cljsbuild plugin to build a CLJS project
  :plugins [
            [lein-cljsbuild "0.3.4"]
            [lein-ring "0.8.7"]]

  ;; ring tasks configuration
  :ring {:handler modern-cljs.core/handler}

  ;; cljsbuild tasks configuration
  :cljsbuild {:builds
              [{;; CLJS source code path
                :source-paths ["src/cljs"]

                ;; Google Closure (CLS) options configuration
                :compiler {;; CLJS generated JS script filename
                           :output-to "resources/public/js/modern.js"

                           ;; use minimal optimization CLJS directive
                           :optimizations :whitespace

                           ;; generated JS code pretty-ification
                           :pretty-print true}}]})

