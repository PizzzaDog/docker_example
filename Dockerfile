FROM adoptopenjdk:11-jre-hotspot

WORKDIR /app

COPY target/docker_example-1.0.jar /app/docker_example-1.0.jar

CMD ["java", "-jar", "docker_example-1.0.jar"]