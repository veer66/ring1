(ns ring1.core
  (:require [ring.adapter.jetty :refer [run-jetty]]))

(defn -main
  []
  (run-jetty (fn [req]
               {:body "OK"})
             {:port 3000}))
