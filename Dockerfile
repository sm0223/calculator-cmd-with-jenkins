FROM openjdk:11
COPY ./target/calculator3-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "calculator3-1.0-SNAPSHOT.jar"]