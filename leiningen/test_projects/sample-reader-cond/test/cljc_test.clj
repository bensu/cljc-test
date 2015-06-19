(ns cljc-test
  (:use [clojure.test]
        [selectors :only [record-ran]]))

(deftest conditional-test
  (record-ran :cljc-test)
  (is true))
