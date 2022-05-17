# FROM openjdk:11

# ARG JAR_FILE=./search-service/target/*.jar

# COPY ${JAR_FILE} app.jar

# ENTRYPOINT ["java","-jar","/app.jar"]

FROM openjdk:11

LABEL maintainer="it19175126"

ADD ./search-service/target/*.jar springboot-docker-search.jar

ENTRYPOINT ["java","-jar","/springboot-docker-search.jar"]