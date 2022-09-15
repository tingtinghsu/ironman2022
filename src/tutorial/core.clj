(ns tutorial.core
  (:gen-class))

(defn -main
  [number]
  (println "hello world, Tingting!")
  (println "I bought"  number  "harry potter series"))

(def harry-potter-series
  ["the Philosopher's Stone" "the Chamber of Secrets" "the Prisoner of Azkaban"])

(defn x [a b] (+ a b))
;;  (x 2 3) => 5
(def y (fn [a b] (+ a b)))
;;  (y 2 3) => 5