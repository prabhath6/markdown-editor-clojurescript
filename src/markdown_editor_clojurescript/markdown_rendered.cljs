(ns markdown-editor-clojurescript.markdown-rendered
  (:require [markdown-editor-clojurescript.state :as st]))

(defn tt [code]
  (.-value (js/hljs.highlightAuto code)))

(defn markdown-rendered []
  (.setOptions js/marked #js {:gfm true
                              :tables true
                              :breaks false
                              :sanitize true
                              :pedantic false
                              :smartLists true
                              :martypants true
                              :highlight (partial tt)}) ;;TODO: complete highlight
  [:div.column.is-half
   [:div.card {:style {:height "740px" :overflow "auto"}}
    [:div.content {:style {:margin-left "15px"}
                   :dangerouslySetInnerHTML {:__html (js/marked @st/raw-content {:sanitize true})}}]]])

