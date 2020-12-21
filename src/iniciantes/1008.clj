(def number (read-string (read-line)))
(def hours (read-string (read-line)))
(def value (read-string (read-line)))

(printf "NUMBER = %d\nSALARY = U$ %.2f\n" number (* hours value))