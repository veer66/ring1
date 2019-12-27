# ring1

ring1 is a tiny Ring example.

## Run

```
docker run --rm -it -u 1000 --net=host -v $(pwd):/work -e HOME=/work -w /work clojure:tools-deps
```

```
clojure -m ring1.core
```

Then a web page should be available at http://localhost:3000.
