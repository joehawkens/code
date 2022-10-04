;; Clojure Task 1: Defining a Function

(defn morning-greeting []

    (print "Good Morning, Vietnam!\n")
    
)


;; To run the code:
;; Type "clj" into powershell, go into directory, load file:
;; (load-file "task-1.clj")
;; type (morning-greeting)


(defn hello-to [person-name] ; Defining a function
    (println (str "Hello " person-name))
    (println (str "Goodbye " person-name)))



(hello-to "joe") ; Calling a function.




; If statement:

(defn is-small? [number]

    (if (< number 100) "yes" "no"))
  
  user=> (is-small? 50)
  "yes"
  
  user=> (is-small? 500)
  "no"


; Running commands:


(is_zero? 10) ;proper format to run code, with argument.

