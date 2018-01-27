(ns first-clojure-code.core
  (:gen-class))

(defn simpleGreeting [name]
	(println (str "Hello, "  name))
)

(defn sum [nums]
	(println (reduce + nums))
)

(defn simpleMap [nums]
	(println (map inc nums))
)

(defn -main
  [& args]
  (simpleGreeting "Theo")
  (sum [10 50 30])
  (simpleMap [1 5 6])
)