(ns hard.animation
 (:use hard.core)
  (:import
    [UnityEngine]))


 ;mechanim animator
(defn ->animator [o]
  (.GetComponentInChildren o UnityEngine.Animator))

(defn play-state [o s] (.Play (->animator o) s))

(defn cross-fade [o s t] (.CrossFade (->animator o) s t))

(defn param-bool 
  ([o s] (.GetBool (->animator o) s))
  ([o s v] (.SetBool (->animator o) s v)))

(defn param-float 
  ([o s] (.GetFloat (->animator o) s))
  ([o s v] (.SetFloat (->animator o) s v)))


;legacy animations

(defn ->animation [o]
  (.GetComponentInChildren o UnityEngine.Animation))