[![lein-jupiter](http://clojars.org/lein-jupiter/latest-version.svg)](http://clojars.org/lein-jupiter)

# lein-jupiter

A Leiningen plugin to create empty SQL migration files

## Disclaimer

This project is a work in progress. There is no error-checking and
tests. It works for me, it doesn't mean it will work for you.
This should change in the future.

## Usage

Put `[lein-jupiter "0.1.0"]` into the `:plugins` vector of your `project.clj`.

`lein-jupiter` by default creates a migration file in the `src/migrations` directory:

```bash
$ lein jupiter new-migration create_users
Created file src/migrations/20141005181228_create_users.sql
```

Although, you can provide path to the migrations directory:

```bash
$ lein jupiter new-migration create_users src/sql
Created file src/sql/20141005181228_create_users.sql
```

## License

Copyright © 2014 Tomek Wałkuski

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
