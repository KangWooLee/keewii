(ns drawing.toolbox
  (:require [clojure.string :as string])
  ;(:use [overtone.at-at])
  )
(import 'java.util.Date)
(import java.text.SimpleDateFormat)

;Date
 (defn date
    ([](Date.))
    ([systime](Date. systime)))
 (defn format-date
    ([](format-date (date) "yyyy MM dd HH mm ss"))
    ([x](if (string? x)
            (format-date (date) x)
            (format-date x "yyyy MM dd HH mm ss")))
    ([dt fmt](.format (SimpleDateFormat. fmt) dt)))
 (defn get-date [] (string/replace (format-date) " " ""))
 
 ;Name input
 (defn get-name []
   (let [reader (java.io.BufferedReader. *in*)
         ln (.readLine reader)] ln))
 
 
