(ns std-lib.test.core
  (:use midje.sweet std-lib.core))

(fact "You can compare the output to fixed values."
    (+ 1 1) => 2
    (+ 1 0) => 1)

(fact "You can use predicates to check the output."
    0 => even? 
    1 => odd?)

(fact "You can match inside of collections."
  {:foo 3, :bar 77} => (contains {:foo 3}) 
  {:foo 3, :bar 77} => (contains {:bar odd?}) 
  [2 3 4 5 6 7] => (has-prefix [2 3])
  [4 3 2] => (just [2 3 4] :in-any-order))
