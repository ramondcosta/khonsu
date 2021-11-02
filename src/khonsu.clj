(ns khonsu
  (:require schedules)
  (:require scheduler))

(defn run [opts]
  (scheduler/runSchedule (second schedules/currentSchedules) 
              ;;  #(prn currentSchedules)
               ))