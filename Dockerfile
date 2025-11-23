# ---- Build Stage ----
FROM eclipse-temurin:17-jdk-jammy AS build
WORKDIR /app

# Source Code kopieren
COPY . .

# Gradle Wrapper ausführbar machen (WICHTIG!)
RUN chmod +x ./gradlew

# Build ohne Tests
RUN ./gradlew clean build -x test

# ---- Run Stage ----
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app

# JAR aus dem Build kopieren
COPY --from=build /app/build/libs/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
