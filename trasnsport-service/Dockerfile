# # define base docker image
# FROM openjdk:11
# LABEL maintainer="it19018256"
# ADD target/transportAPI-0.0.1-SNAPSHOT.jar springboot-docker-trasport.jar
# ENTRYPOINT [ "java","-jar", "springboot-docker-trasport.jar"]
FROM openjdk:11



ARG JAR_FILE=./trasport-service/target/*.jar



COPY ${JAR_FILE} app.jar



ENTRYPOINT ["java","-jar","/app.jar"]
