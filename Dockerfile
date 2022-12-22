# Alpine because it's lighter
FROM openjdk:8-jdk-alpine
MAINTAINER Wendell Adriel <wendelladriel.ti@gmail.com>

# Add JAR file and run it as entrypoint
ADD target/article-service.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
