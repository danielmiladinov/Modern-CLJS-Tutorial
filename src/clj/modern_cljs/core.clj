(ns modern-cljs.core
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

;; defroutes macro defines a function that chains individual route
;; functions together. The request map is passed to each function in
;; turn, until a non-nil response is returned.
(defroutes app-routes
  ; Serve the document root "index"
  (GET "/" [] "<p>Howdy from compojure!!!</p>")
  ; Static content from resources/public
  (route/resources "/")
  ; Otherwise, not found
  (route/not-found "No such resource"))

(def handler
  (handler/site app-routes))
