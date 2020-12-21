(def a (read-string (read-line)))
(def b (read-string (read-line)))
(def c (read-string (read-line)))

(def media (/ (+ (* 2 a) (* 3 b) (* 5 c)) 10))

(printf "MEDIA = %.1f\n", media)