(def namef (read-string (read-line)))
(def salary (read-string (read-line)))
(def sales (read-string (read-line)))

(def bonus (* 0.15 sales))
(def total (+ bonus salary))

(printf "TOTAL = R$ %.2f\n", total)