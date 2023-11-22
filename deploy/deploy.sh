#!/bin/bash

apt-get install jq -y

REQUEST_BODY=$(printenv FREE_COMMIT_REQUEST_BODY)


echo "$(jq '.ref' <<< REQUEST_BODY)"