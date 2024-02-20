# Use an official OpenJDK runtime as a parent image
FROM tomcat:8.0-alpine

# Set the working directory to /app
WORKDIR /usr/local/tomcat/webapps/

# Copy the executable JAR file from the target directory into the container at /app
COPY target/Salse-App-Backend-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/

# Expose the port that the application will run on
EXPOSE 8080

# Specify the command to run on container startup
CMD ["catalina.sh","run"]
