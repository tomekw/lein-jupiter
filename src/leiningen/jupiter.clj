(ns leiningen.jupiter
  (:require [clj-time.core :as t]
            [clj-time.format :as f]))

(def ^{:private true} timestamp-format
  (f/formatter "yyyyMMddHHmmss"))

(def ^{:private true} migration-timestamp
  (f/unparse timestamp-format (t/now)))

(defn- create-new-migration
  ""
  [path name]
  (let [full-migration-name-with-path
        (str path "/" migration-timestamp "_" name ".sql")]
    (spit full-migration-name-with-path "")
    (println "Created file" full-migration-name-with-path)))

(defn jupiter
  ""
  ([project command migration-name]
   (cond
     (= command "new-migration")
     (create-new-migration "src/migrations" migration-name)))
  ([project command migration-name migrations-path]
   (cond
     (= command "new-migration")
     (create-new-migration migrations-path migration-name))))
