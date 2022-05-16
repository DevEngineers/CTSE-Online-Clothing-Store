# define base docker image
FROM openjdk:11
LABEL maintainer="it19018256"
ADD target/transport-service-0.0.1-SNAPSHOT.jar springboot-docker-trasport.jar
ENTRYPOINT [ "java","-jar", "springboot-docker-trasport.jar"]