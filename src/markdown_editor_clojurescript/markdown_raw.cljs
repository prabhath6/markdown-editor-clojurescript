(ns markdown-editor-clojurescript.markdown-raw
  (:require [markdown-editor-clojurescript.state :as st]))

(defn markdown-raw []
  [:div.column.is-half
   [:div.control
    [:textarea.textarea
     {:on-change (fn [e]
                   (reset! st/raw-content (.. e -target -value)))
      :rows "30"
      :name "raw content"
      :defaultValue @st/raw-content}]]])

