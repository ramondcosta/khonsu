(ns schedules
  (:require [java-time :as t]))

(def currentSchedules 
  [
   {
    :name "Basic interval"
    :type :interval
    :time 0
    :timeFormat :seconds
    :sleep 5
    }
   {
    :type :calendar
    :time (t/local-time 23 17);; "12/1/2021T14:20:00"
    :timeFormat :seconds
    :sleep 4
    }
  ;;  {
  ;;   :type :calendar
  ;;   :time {
  ;;          :date "12/1/2021"
  ;;          :hour 12
  ;;          :minute 25
  ;;          }
  ;;   :timeFormat :seconds
  ;;   :sleep 60
  ;;   }
   ]
  )
   
