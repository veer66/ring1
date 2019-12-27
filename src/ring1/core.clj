(ns ring1.core
  (:require [ring.adapter.jetty :refer [run-jetty]]
            [ring.middleware.reload :refer [wrap-reload]]))

(defn app
  [req]
  {:body "OK"})

(defn -main
  []
  (let [tracker (ns-tracker ["src"])]
    (run-jetty (wrap-reload #'app)
               {:port 3000})))
