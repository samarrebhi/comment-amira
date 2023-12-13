FROM openjdk:17
EXPOSE 8761

LABEL authors="rebhi"
ADD target/Stock-0.0.1-SNAPSHOT.jar Stock.jar




ENTRYPOINT ["java", "-jar","Stock.jar"]