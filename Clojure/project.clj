;;;; This is a simple calculator made in Clojure.

(defn -main[]

    ; Intro to the user:
    (println "Welcome to the calculator. What do you want to do?")
    (newline)
    (println "1. add")
    (println "2. subtract")
    (println "3. multiply")
    (println "4. divide")


    ; Get input from user:
    (def answer (read-line))


    ; Calculate logic:

    (cond 
        (= answer "1") "What numbers do you want to add?" (def logic "add")
        (= answer "2") "What numbers do you want to subtract?" (def logic "subtract")
        (= answer "3") "What numbers do you want to multiply?" (def logic "multiply")
        (= answer "4") "What numbers do you want to divide?"(def logic "divide")
        :else  "Uh Oh, something went wrong, try again later.")

    
    ; Getting the numbers to be calculated:

    (println "First number: ")
    (def number_1 (read-line))
    (newline)
    (println "Second number: ")
    (def number_2 (read-line))
    (newline)
    (println "Here's your answer: ")
    
    (cond
        (= logic "add") (println (+ number_1 number_2))
        (= logic "subtract") (println (- number_1 number_2))
        (= logic "multiply") (println (* number_1 number_2))
        (= logic "divide") (println (/ number_1 number_2))
        :else "Something went wrong, please try again later."
        )


)