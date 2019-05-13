FROM openjdk:8
VOLUME /tmp
COPY target/spring-reactive-*.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]