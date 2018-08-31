(ns markdown-editor-clojurescript.core
    (:require
     [reagent.core :as r]
     [markdown-editor-clojurescript.markdown-structure :as ms]))

;; -------------------------
;; Views

(defn home-page []
   [:div.hero-body
    [:div.container
     [:h1.title.has-text-centered.has-text-white-ter "ClojureScript Markdown Editor"]
     [:h2.subtitle.has-text-white-bis "Start Typing...."]
     [ms/markdown-structure]]])

;; -------------------------
;; Initialize app

(defn mount-root []
  (r/render [home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))
