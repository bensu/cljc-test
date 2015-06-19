(ns cljc-test.core)

(defn adder [x]
  (+ #?(:clj 1) x))
