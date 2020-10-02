# Hello Clojurescript (and Figwheel)

A clojurescript skeleton project for reference

## Setup

* [Install Clojure](https://clojure.org/guides/getting_started#_installation_on_linux)
* [Install clojure-lsp](https://github.com/snoe/clojure-lsp#installation)
* Ensure kak-lsp is configured correctly and `deps.edn` is a project root for kak-lsp
* Use `htop` to monitor language server activity

## Dev Build

`clj -m figwheel.main --build dev --repl`

## Test

Run dev build, open [http://localhost:9500/figwheel-extra-main/auto-testing](http://localhost:9500/figwheel-extra-main/auto-testing)
