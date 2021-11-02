(ns khonsu
  (:require schedules)
  (:require scheduler))

(defn run [opts]
  (scheduler/runSchedule (first schedules/currentSchedules) 
              ;;  #(prn currentSchedules)
               ))