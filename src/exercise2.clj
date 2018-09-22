(ns exercise2)

(defn greater [number]
	(> number 5))

(defn only-greater-than-five
  [x]
  (filter greater x))
