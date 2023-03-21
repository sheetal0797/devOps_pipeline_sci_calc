FROM openjdk
WORKDIR ./
COPY ./target/devOps_Pipeline_Maven-1.0-SNAPSHOT-jar-with-dependencies.jar .
CMD ["java", "-jar","devOps_Pipeline_Maven-1.0-SNAPSHOT.jar"]
