(ns time-core
  (:require [java-time :as t]))

(defn time-left [alarm]
  (cond
    (t/local-time? alarm) (let [now (t/local-time)]
                            (t/as (t/duration now alarm) :seconds))
    (number? alarm) alarm))