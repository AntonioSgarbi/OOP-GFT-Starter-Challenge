FROM docker.io/eclipse-temurin:17-jre-alpine as BUILD

COPY ./target/ExerciciosPOO-1.0-SNAPSHOT.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java","-jar", "ExerciciosPOO-1.0-SNAPSHOT.jar"]