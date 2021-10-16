FROM openjdk:11-alpine
ADD target/spring-docker-0.0.1-SNAPSHOT.jar .
EXPOSE 8000
CMD java -jar spring-docker-0.0.1-SNAPSHOT.jar