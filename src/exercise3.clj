(ns exercise3)

(defn fibonacci[x]
  [x]
  (if (< x 2) x (+ (fibonacci(- x 2)) (fibonacci(- x 1))))
 )