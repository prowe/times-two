FROM java:8-jdk-alpine

EXPOSE 8080

WORKDIR /
ADD target/takeTwo.jar /

CMD java -jar takeTwo.jar