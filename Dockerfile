FROM adoptopenjdk:jdk-11.0.11_9-alpine-slim
ADD target/spring-docker-0.0.1-SNAPSHOT.jar .
EXPOSE 8000
CMD java -jar spring-docker-0.0.1-SNAPSHOT.jar