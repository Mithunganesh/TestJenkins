
FROM openjdk:8-jdk-alpine

ADD /target/Get*.jar GetInventoryService.jar

EXPOSE 8082

ENTRYPOINT ["java","-jar","GetInventoryService.jar"]
