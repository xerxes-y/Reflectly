FROM openjdk:11
COPY ./target/iot-processor-0.0.1-SNAPSHOT.jar /usr/src/
COPY environmet.env environmet.env
RUN chmod +x entrypoint.sh
WORKDIR /usr/src/
EXPOSE 9202

CMD ["java", "-jar", "iot-processor-0.0.1-SNAPSHOT.jar"]