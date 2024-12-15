FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/producer-ms-1.0.jar
COPY ${JAR_FILE} producer-ms-1.0.jar
ENTRYPOINT ["java", "-jar", "/producer-ms-1.0.jar"]
