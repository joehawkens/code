;;;; RLE (Run-Length Encoding) Algorithm in Clojure.
; 1 = prime number.
; 0 = isolated, composite number.
; else = how many composite numbers there are in 
; - a row before the next prime number.


(defn is_zero? [num]

    (if (= num 0) 0 1)

)

(defn is_prime?[num]

    (if(<= num 1) 0))