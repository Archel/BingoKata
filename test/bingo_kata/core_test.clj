(ns bingo-kata.core-test
  (:require [clojure.test :refer :all]
            [clojure.set :refer :all]
            [bingo-kata.core :refer :all]))

(defn create-bingo
  "creates a bingo"
  []
  {:bingo-numbers (shuffle (set (range 1 76))) :call 0})

(defn call-number
  "gets a random number between 1 and 75 inclusive"
  [bingo]
  (nth (:bingo-numbers bingo) (:call bingo)))

(deftest bingo-numbers-should
  (testing "Be a random sequence of numbers between 1 and 75 inclusive"
    (is (= (count (intersection (:bingo-numbers (create-bingo)) (set (range 1 76)))) 75))))