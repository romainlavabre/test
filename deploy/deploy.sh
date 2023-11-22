#!/bin/bash

apt-get install jq -y

REQUEST_BODY=$(printenv FREE_COMMIT_REQUEST_BODY)

echo "$REQUEST_BODY" > payload.json

echo "$(jq '.ref' payload.json)"