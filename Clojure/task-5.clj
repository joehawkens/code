;;;; RLE (Run-Length Encoding) Algorithm in Clojure.
; 1 = prime number.
; 0 = isolated, composite number.
; else = how many composite numbers there are in 
; - a row before the next prime number.
; Prime numbers: 2,3,5,7,11,13,17,19,23...
; Composite numbers: 4,6,8,9,12,14,15...


(def final 0)

; Example Code input/output:


(def primes '(2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97))
(def rleprimes '(1 1 0 1 0 1 3 1 0 1 3 1 0 1 3 1 5 1 0 1 5 1 3 1 0 1 3 1 5 1 5 1 0 1 5 1 3 1 0 1 5 1 3 1 5 1 7 1 3))


; Find out if a number is prime.

(defn is-prime? [n]
  (if (< 1 n)
    (empty? (filter #(= 0 (mod n %)) (range 2 n)))
    false))


; Return a 1 or a 0 depending on prime/composite.

(defn encode [number]
  
  (if (is-prime?[number])
    1
    0)
  
)
