FROM openjdk:8
EXPOSE 8080
ADD target/recipes-backend.jar recipes-backend.jar
ENTRYPOINT ["java","-jar","/recipes-backend.jar"]
