(ns ^:figwheel-no-load markdown-editor-clojurescript.dev
  (:require
    [markdown-editor-clojurescript.core :as core]
    [devtools.core :as devtools]))


(enable-console-print!)

(devtools/install!)

(core/init!)
