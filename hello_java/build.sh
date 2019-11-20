#!/bin/bash
imagename=$(basename $(pwd))
docker build -t ${imagename} .

