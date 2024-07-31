#!/bin/bash

# Force Update git repository
git fetch --all
git reset --hard origin/master
git submodule update --init --recursive

git submodule foreach --recursive '
  git fetch --all
  git reset --hard origin/master'

# Update the services
docker-compose up -d --no-deps --build spring klimaralley-hub klimaralley-flut klimaralley-recycling klimaralley-wasserarm
