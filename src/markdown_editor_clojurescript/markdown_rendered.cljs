(ns markdown-editor-clojurescript.markdown-rendered
  (:require [markdown-editor-clojurescript.state :as st]))

(defn markdown-rendered []
  [:div.column.is-half
   [:div.control
    [:textarea.textarea {:rows "30"
                         :name "raw content"
                         :contentEditable true
                         :readOnly true
                         :value [:strong "test"]}]]])

(defn markdown-test []
  [:div.column.is-half
   [:div {:contentEditable true
          :dangerouslySetInnerHTML {:__html (js/marked @st/raw-content)}}]])

