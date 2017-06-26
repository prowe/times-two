FROM maven:3-jdk-8-alpine

EXPOSE 8080

ADD src /workspace/src
ADD pom.xml /workspace
WORKDIR /workspace

RUN mvn package \
    && mv target/takeTwo.jar /takeTwo.jar

WORKDIR /
RUN rm -rf /workspace

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /takeTwo.jar" ]