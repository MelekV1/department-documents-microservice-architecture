FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} document-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/document-service.jar"]
EXPOSE 9002
