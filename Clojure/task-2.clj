;;;; Practicing Clojure Math operators.

(defn exercise-math []

    ;; Define the variables.
    
    (def x 1)
    (def y 2)
    (def z 3)

    ;; Math Operations

    (println(+ x y z)) ; 6
    (println(* x y z)) ; 6
    (println(/ x y z)) ; 1/6
    (println(+ (int(Math/pow x 2)) (* 3 y) z)) ; 10
    (println(+ (int(Math/pow z x))(int(Math/pow x z)))) ; 4
    (println(+ (/ z x) x)) ; 4
    (println(+ (* x y z) 1)) ; 7
    (println(- (* x y z) 1)) ; 5

)

; (let y 1)

(defn exercise-logic []


    (def a 1)
    (def b 2)
    (def c 3)

    (println(> a b)) ; False
    (println(> b a)) ; True
    (println(< a b)) ; True
    (println(< b a)) ; False
    (println(< b c)) ; True
    (println(>= c c)) ; True
    (println(= a c)) ; False
    (println(<= a b)) ; True
    (println(and(< a b)(> b c))) ; False
    (println(or(< a b)(> b c))) ; True
    
    
)