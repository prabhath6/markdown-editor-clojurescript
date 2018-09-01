(ns markdown-editor-clojurescript.core
    (:require
     [reagent.core :as r]
     [markdown-editor-clojurescript.markdown-structure :as ms]))

;; -------------------------
;; Views
(defn t []
  (let [sss (.setOptions js/marked #js {:gfm true
                                      :tables true
                                      :breaks false
                                      :sanitize true
                                      })]
    (prn sss)
   (js/marked "### t3st" #js {:sanitize true})))

(defn home-page []
  (t)
   [:div.hero-body
    [:div.container
     [:h1.title.has-text-centered.has-text-white-ter "ClojureScript Markdown Editor"]
     [:h2.subtitle.has-text-white-bis "Start Typing...."]
     [ms/markdown-structure]
     [:div {:dangerouslySetInnerHTML {:__html (t)}}]]])

;; -------------------------
;; Initialize app

(defn mount-root []
  (r/render [home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))
