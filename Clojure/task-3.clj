;;;; Task: Create a recursive function that finds the greatest common divisor (GCD).

;;;; the GCD of 10 and 100 is 10, since 10 goes into each with 0 left over for both.

;; two arguments - integers
;; uses modulo
;; GCD(b, a % b)

(defn hello-to [person-name] ; Defining a function
    (println (str "Hello " person-name))
    (println (str "Goodbye " person-name)))




;; (hello-to "joe") ; Calling a function.



(defn gcf [a b] (

    if ( = b 0)
    (println a)
    (gcf b (rem a b)))
)


;;;; Task 1 TESTS ;;;;;;;;;;;;;;;;;

(gcf 1 0) ; 1
(gcf 10 100) ; 10
(gcf 18 27) ; 9

;;;; Task 2 TEST ;;;;;;;;;;;;;;;;;;

(gcf 480 1001) ; 1
