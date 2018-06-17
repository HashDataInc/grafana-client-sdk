#!/usr/bin/env bash

set -uex

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

pushd ${DIR}

docker run --rm -it -v `pwd`:/code swaggerapi/swagger-codegen-cli:latest \
  generate \
  -l java \
  -c /code/codegen/java-spring-resttemplate.json \
  -i /code/apidoc/grafana-client-swagger.json \
  -o /code/grafana-client-spring-sdk

popd
