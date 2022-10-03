;;;; Map, Filter, Reduce functions in Clojure.

;; Take two lists and find the cartesian product.
;; Do this by using the map function.

(defn cartesian-product
  ([] '(()))
  ([xs & more]
    (mapcat #(map (partial cons %)
                  (apply cartesian-product more))
            xs)))


(def flavors1 ["Vanilla" "Chocolate" "Cherry-Ripple"])

(def flavors2 ["Lemon" "Butterscotch" "Licorice-Ripple"])

(def all-flavors (concat flavors1 flavors2))



;; Chocolate Combos - Task 1

(defn chocolate-combos []

  (println "The chocolate combos are: "
    (newline)
    (map #(str "Chocolate " %) all-flavors))
  
)



;; All Combos -Task 2

(defn double-combos []
  
  (println "Here's a list of every combo: "
    (newline)
    (cartesian-product all-flavors all-flavors))
  
)



(defn -main []

  (println "The chocolate combos are: "
    (newline)
    (map #(str "Chocolate " %) all-flavors))

  (println "Here's a list of every combo: "
    (newline)
    (cartesian-product all-flavors all-flavors))

)


(-main)

;; Expected output: ((Vanilla Chocolate) (Chocolate Vanilla) (Chocolate Chocolate) (Chocolate Cherry-Ripple) (Chocolate Lemon) (Chocolate Butterscotch) (Chocolate Licorice-Ripple) 
;; (Cherry-Ripple Chocolate) (Lemon Chocolate) (Butterscotch Chocolate) (Licorice-Ripple Chocolate))