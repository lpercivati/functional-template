(ns exercise6)

(defn faverage[x]
  [x]
  (/ (reduce + 0 x) (count x))
)