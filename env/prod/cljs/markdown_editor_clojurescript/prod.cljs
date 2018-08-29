(ns markdown-editor-clojurescript.prod
  (:require
    [markdown-editor-clojurescript.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
