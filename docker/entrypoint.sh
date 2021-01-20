#!/bin/bash

echo "java -cp /opt/flume/lib/*:/opt/flume/plugin-lib/* ${JAVA_OPTS} org.springframework.boot.loader.JarLauncher $@"

java -cp "/opt/flume/lib/*:/opt/flume/plugin-lib/*" ${JAVA_OPTS} org.springframework.boot.loader.JarLauncher $@