FROM eclipse-temurin:17
COPY target/mywebapp.jar mywebapp.jar
CMD [ "java","-jar","mywebapp.jar" ]