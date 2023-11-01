FROM openjdk:8-jdk-alpine

VOLUME /tmp
COPY target/challenge6-0.0.1-SNAPSHOT.jar challenge6-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","challenge6-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080