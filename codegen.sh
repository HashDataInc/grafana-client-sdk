#!/usr/bin/env bash

set -uex

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

pushd ${DIR}

# Generate api doc
pushd ${DIR}/grafana-fake-server
mvn test
popd

# Generate grafana-client-sprint-sdk
docker run --rm -it -v `pwd`:/code swaggerapi/swagger-codegen-cli:latest \
  generate \
  -l java \
  -c /code/codegen/java-spring-resttemplate.json \
  -i /code/apidoc/grafana-client-swagger.json \
  -o /code/grafana-client-spring-sdk

popd
