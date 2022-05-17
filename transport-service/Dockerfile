FROM openjdk:11

# ARG JAR_FILE=./transport-service/target/*.jar

# COPY ${JAR_FILE} app.jar

ADD ./transport-service/target/*.jar springboot-docker-trasport.jar

ENTRYPOINT ["java","-jar","/springboot-docker-trasport.jar"]
# test