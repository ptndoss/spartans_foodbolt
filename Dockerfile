FROM openjdk:8

FROM maven:3.6.1-jdk-8

COPY src /tmp/app/src

COPY pom.xml /tmp/app/

RUN mvn -f /tmp/app/pom.xml clean package

RUN echo $(ls -lrt /tmp/app/)

CMD ["java", "-jar", "/tmp/app/target/original-Food_Bolt-0.0.1-SNAPSHOT.jar"]

