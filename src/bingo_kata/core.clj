(ns bingo-kata.core
  (:gen-class))

(defn create-bingo
  "creates a bingo"
  []
  {:bingo-numbers (shuffle (set (range 1 76))) :call 0})

(defn call-number [bingo-game]
  (update-in bingo-game [:call] inc))