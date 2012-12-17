(ns lazymap.core-test
  (:use clojure.test
        lazymap.core)
  (:import
   (lazymap.core LazyMapEntry)))

(deftest global
  (testing "basic tests"
    (let [lme (new LazyMapEntry :foo (delay "Ok"))]
      (is (= :foo (. lme getKey)))
      (is (= :foo (. lme key)))
      (is (= "Ok" (. lme getValue)))
      (is (= "Ok" (. lme val))))))