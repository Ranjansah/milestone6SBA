FROM openjdk:17
ADD target/StudentDetail-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]