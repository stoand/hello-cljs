(ns ^:figwheel-always hello.cruel-world
    (:require [cljs.test :refer-macros [deftest is testing run-tests]]))

(defn what-kind? []
  "Cruel")

(deftest borntofail
    (is (= {:a 1} {:b 1})))

(deftest borntofail2
    (is (= 1 2)))

(deftest borntofail3
    (is (= 1 3)))
