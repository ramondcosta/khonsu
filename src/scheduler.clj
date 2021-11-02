(ns scheduler
  (:require [time-core :as tcore]))

(import 'java.util.concurrent.Executors)
(import 'java.util.concurrent.TimeUnit)

(defn runSchedule [schedule & [foo]]
  (let [{time :time} schedule
        {sleep :sleep} schedule
        {name :name} schedule]
    (.scheduleAtFixedRate (Executors/newScheduledThreadPool 1)
                          (or foo #(println name "Executed")) (tcore/time-left time) sleep TimeUnit/SECONDS)))