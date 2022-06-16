(ns gen.x-test
  (:require [clojure.test :refer [deftest is]]
            [gen.x :as x]))

(deftest greet-test
  (is (= (x/greet "world")
         "hello, world!")))
