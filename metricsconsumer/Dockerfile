FROM azul/zulu-openjdk-alpine:17-jre-latest AS final
COPY ./build/libs/*.jar /app.jar
CMD ["java", "-jar", "/app.jar"]