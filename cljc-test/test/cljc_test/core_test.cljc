(ns cljc-test.core-test
  #?(:clj (:require [cljc-test.core :as core])))

(deftest reader-conditionals
  (is (= #?(:clj 2) (core/adder 1))))
