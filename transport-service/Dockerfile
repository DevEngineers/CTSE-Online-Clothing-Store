FROM openjdk:11

LABEL maintainer="it19018256"

ADD ./transport-service/target/*.jar springboot-docker-trasport.jar

ENTRYPOINT ["java","-jar","/springboot-docker-trasport.jar"]