FROM openjdk:8-jdk-alpine

RUN mkdir -p /opt/flume/lib  /opt/flume/bin

ADD ./flume-agent-1.0.0.jar /opt/flume/lib/

ADD ./flume-agent-1.0.0-jar-with-dependencies.jar /opt/flume/lib/

ADD ./entrypoint.sh /opt/flume/bin/

WORKDIR /opt/flume

ENTRYPOINT ["bash", "./bin/entrypoint.sh"]
