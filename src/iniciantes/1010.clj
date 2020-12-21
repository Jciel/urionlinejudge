(def register-one (read-line))
(def register-two (read-line))

(def register-one-data (str/split register-one #" "))
(def register-two-data (str/split register-two #" "))

(def unit1-code (Integer/parseInt (get register-one-data 0)))
(def unit1-qtde (Integer/parseInt (get register-one-data 1)))
(def unit1-price (Float/parseFloat (get register-one-data 2)))

(def unit2-code (Integer/parseInt (get register-two-data 0)))
(def unit2-qtde (Integer/parseInt (get register-two-data 1)))
(def unit2-price (Float/parseFloat (get register-two-data 2)))


(def price1 (* unit1-qtde unit1-price))
(def price2 (* unit2-qtde unit2-price))

(printf "VALOR A PAGAR: R$ %.2f\n" (+ price1 price2))