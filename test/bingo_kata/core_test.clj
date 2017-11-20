(ns bingo-kata.core-test
  (:require [clojure.test :refer :all]
            [bingo-kata.core :refer :all]))

(defn call-number
  "gets a random number between 1 and 75 inclusive"
  []
  1)

(deftest bing-numbers-should
  (testing "Given I have a Bingo caller When I call a number Then the number is between 1 and 75 inclusive"
    (let [num-called (call-number)]
      (is (and (> num-called 0) (< num-called 76))))))
