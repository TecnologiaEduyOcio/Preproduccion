FROM openjdk:11-jdk
COPY target/EduyOcio-0.0.1-SNAPSHOT.jar EduyOcio.jar
ENTRYPOINT ["java","-jar","EduyOcio.jar"]