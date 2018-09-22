(ns exercise7)

(defmulti fmap (fn [funcion valores] (type valores)))

(defmethod fmap clojure.lang.PersistentList [funcion valores]
	(map funcion valores))

(defmethod fmap clojure.lang.PersistentVector [funcion valores]
	(map funcion valores))

(defmethod fmap clojure.lang.PersistentArrayMap [funcion valores]
	(into {} 
		(map (fn [[key value]] [key (inc value)]) valores
		))
)