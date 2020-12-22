(require '[clojure.string :as str])

(def register (read-line))

(def line-data (str/split register #" "))

(def a (Integer/parseInt (get line-data 0)))
(def b (Integer/parseInt (get line-data 1)))
(def c (Integer/parseInt (get line-data 2)))

(def mab (/ (+ a b (Math/abs (- a b))) 2))

(def maior (/ (+ mab c (Math/abs (- mab c))) 2))

(printf "%d eh o maior\n", maior)