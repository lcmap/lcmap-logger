(ns lcmap.logger.components.logger-test
  (:require [clojure.test :refer :all]
            [lcmap.logger.components.logger :as logger]))

(def test-component
  {:cfg
    {:lcmap.logger
      {:level "warn"
       :namespaces ["lcmap.rest", "lcmap.config", "cassaforte.*"]}}})

(deftest get-log-level-test
  (is (= :warn (logger/get-log-level test-component))))

(deftest get-namespaces-test
  (is (= '(lcmap.rest lcmap.config cassaforte.*)
         (logger/get-namespaces test-component))))

