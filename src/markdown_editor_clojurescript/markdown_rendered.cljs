(ns markdown-editor-clojurescript.markdown-rendered
  (:require [markdown-editor-clojurescript.state :as st]))

(defn markdown-rendered []
  (.setOptions js/marked #js {:renderer (.Renderer js/marked)
                              :gfm true
                              :tables true
                              :breaks false
                              :sanitize true
                              :pedantic false
                              :smartLists true
                              :martypants true})
  [:div.column.is-half
   [:div.card {:style {:height "755px" :overflow "auto"}}
    [:div.content {:style {:margin-left "18px"}
                   :dangerouslySetInnerHTML {:__html (js/marked @st/raw-content {:sanitize true})}}]]])
