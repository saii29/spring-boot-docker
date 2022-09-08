FROM openjdk:11
MAINTAINER springbootwithdocker.com
COPY target/SpringBootWithDocker-0.0.1-SNAPSHOT.jar docker-message-server-0.0.1.jar
ENTRYPOINT ["java","-jar","/docker-message-server-0.0.1.jar"]
