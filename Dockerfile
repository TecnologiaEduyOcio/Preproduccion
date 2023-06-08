
#
# Package stage
#
FROM openjdk:11-jdk-slim
COPY target/EduyOcio-0.0.1-SNAPSHOT.jar EduyOcio.jar
# ENV PORT=8080
# EXPOSE 8080
ENTRYPOINT ["java","-jar","EduyOcio.jar"]