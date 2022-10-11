;;;; RLE (Run-Length Encoding) Algorithm in Clojure.
; 1 = prime number.
; 0 = isolated, composite number.
; else = how many composite numbers there are in 
; - a row before the next prime number.
; Prime numbers: 2,3,5,7,11,13,17,19,23...
; Composite numbers: 4,6,8,9,12,14,15...

(defn is-prime? [n]
  (if (< 1 n)
    (empty? (filter #(= 0 (mod n %)) (range 2 n)))
    false))
