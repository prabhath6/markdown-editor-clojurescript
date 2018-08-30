(ns markdown-editor-clojurescript.markdown-structure
  (:require [markdown-editor-clojurescript.markdown-rendered :as mr]
            [markdown-editor-clojurescript.markdown-raw :as mraw]))

(defn markdown-structure []
  [:div.columns
   [mraw/markdown-raw]
   [mr/markdown-rendered]])

