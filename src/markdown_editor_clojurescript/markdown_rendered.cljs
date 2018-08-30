(ns markdown-editor-clojurescript.markdown-rendered
  (:require [markdown-editor-clojurescript.state :as st]))

(defn markdown-rendered []
  [:div.column.is-half
   [:div.control
    [:textarea.textarea {:rows "30"
                         :name "raw content"
                         :readOnly true
                         :value @st/raw-content}]]])

