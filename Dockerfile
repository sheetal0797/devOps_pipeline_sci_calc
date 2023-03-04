FROM openjdk
WORKDIR ./
COPY ./target/devOps_Pipeline_Maven-1.0-SNAPSHOT.jar .
CMD ["java", "-jar","devOps_Pipeline_Maven-1.0-SNAPSHOT.jar"]
