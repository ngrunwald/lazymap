# lazymap

Take the greediness out of maps.

## Description

This is a (small) fork from (Kotorak's lazymap)[https://bitbucket.org/kotarak/lazymap]. LazyMap is a transparent wrapper around the map types of Clojure. It works similar to lazy-seq for sequences: the value associated with a key via lazy-assoc is not evaluated until it is actually accessed. So if the value is dissoc'd before it is accessed the code necessary to generate the value is not executed at all.

## Usage


```clojure
    user=> (use 'lazymap.core)
    nil
    user=> (def m (lazy-hash-map :x (do (println :a) :y)))
    #'user/m
    user=> (get m :x)
    :a
    :y
    user=> (get m :x)
    :y
```

## License

Copyright © 2008-2012 Meikel Brandmeyer, Nils Grunwald

Distributed under the Eclipse Public License, the same as Clojure.
