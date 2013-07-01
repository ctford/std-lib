(ns std-lib.core)

(defn my-inc [x] (+ x 1))

(defn my-map [f coll]
  (if (pos? (count coll))
    (cons (f (first coll)) (my-map f (rest coll)))
    []))

(defn my-reverse [coll]
  (if (empty? coll)
    []
    (cons (last coll)
          (my-reverse
            (take (- (count coll) 1) coll)))
    )
  )

(def increment-a-list (partial map inc))

with-redefs
