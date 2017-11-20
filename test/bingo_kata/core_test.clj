(ns bingo-kata.core-test
  (:require [clojure.test :refer :all]
            [clojure.set :refer :all]
            [bingo-kata.core :refer :all]))


(defn full-game [bingo-game]
  (nth (iterate call-number bingo-game) 75))

(deftest bingo-numbers-should
  (testing "Be a random sequence of numbers between 1 and 75 inclusive"
    (is (= (count (intersection (:bingo-numbers (create-bingo)) (set (range 1 76)))) 75)))
  (testing "after do the all calls we get all numbers"
    (is (= (:call (full-game (create-bingo)) 74)))))