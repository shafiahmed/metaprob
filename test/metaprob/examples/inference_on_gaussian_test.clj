
(ns metaprob.examples.inference-on-gaussian-test
  (:require [clojure.test :refer :all]
            [metaprob.syntax :refer :all]
            [metaprob.trace :refer :all]
            [metaprob.builtin-impl :refer :all]
            [metaprob.distributions :refer :all]
            [metaprob.interpreters :refer :all]
            [metaprob.inference :refer :all]
            [metaprob.examples.inference-on-gaussian :refer :all])
  (:require [metaprob.prelude :as prelude]
            [metaprob.builtin :as impl]))

(deftest smoke-1
  (testing "testing check-sampler"
    ;; (let [variance
    ;;       (check-sampler (fn [] (uniform 0 0.99))
    ;;                      (fn [x]      ;pdf
    ;;                        (if (and (> x 0) (< x 1))
    ;;                          1
    ;;                          0))
    ;;                      10
    ;;                      50)]
    ;;   (print [variance])
    ;;   (is (< variance 0.2)))
    0))

(deftest prior-density-1
  (testing "checking prior density"
    (is (> (prior-density 0) 0.01))))

(deftest target-density-1
  (testing "checking prior density"
    (is (> (target-density 1) 0.01))))

