FROM openjdk:17
#installer maven
RUN apk add --update maven
#definir working directory
WORKDIR /app
#copy project source in directory
COPY . /app/
#run command mvn clean
RUN mvn clean
RUN mvn install
#CMD ["java", "-jar", "target/elya-0.0.7.jar"]
COPY app/target/elya-0.0.7.jar elya.jar
ENTRYPOINT ["java","-jar","/elya.jar"]
EXPOSE 8083