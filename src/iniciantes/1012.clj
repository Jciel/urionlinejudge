(require '[clojure.string :as str])

(def register (read-line))

(def line-data (str/split register #" "))

(def A (Float/parseFloat (get line-data 0)))
(def B (Float/parseFloat (get line-data 1)))
(def C (Float/parseFloat (get line-data 2)))
(def PI 3.14159)

(printf "TRIANGULO: %.3f\n" (/ (* A C) 2))
(printf "CIRCULO: %.3f\n" (* PI (* C C)))
(printf "TRAPEZIO: %.3f\n" (/ (* (+ A B) C) 2))
(printf "QUADRADO: %.3f\n" (* B B))
(printf "RETANGULO: %.3f\n" (* A B))


(defn teste
  (def aa (StringBuffer. (read-line)))
  )