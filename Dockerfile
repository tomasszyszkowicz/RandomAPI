# Use OpenJDK 17 JDK (slim version) as the base image
FROM openjdk:17-slim

# Set the working directory in the container (optional)
WORKDIR /app

# Copy the JAR file from your target folder to the container
COPY target/randomAPI-0.0.1-SNAPSHOT.jar /app/randomAPI.jar

COPY random.mv.db /app/random.mv.db

# Expose port 8080 to the outside world
EXPOSE 8080

# Execute the application
ENTRYPOINT ["java", "-jar", "/app/randomAPI.jar"]
