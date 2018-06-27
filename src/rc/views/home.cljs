(ns rc.views.home
  (:require-macros [hiccups.core :as hiccups :refer [html]])
  (:require [hiccups.runtime :as hiccupsrt]))


(defn template-main [& content]
  [:html
   [:head
    [:title "Reddit Console"]
    [:link {:rel "stylesheet" :href "/css/main.css"}]]
   [:body content]
   [:script {:type "text/javascript" :src "js/compiled/main.js"}]])


(defn home-page []
  [:div#app "Reddit Console"])


(defn view-home []
  (html (template-main (home-page))))

