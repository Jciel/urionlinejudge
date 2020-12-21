(def r (read-string (read-line)))

(def r3 (* r r r))
(def pi 3.14159)

(def volume (* (* (/ 4.0 3.0) pi) r3))

(printf "VOLUME = %.3f\n", volume)