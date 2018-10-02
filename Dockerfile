
# Use an official Python runtime as a parent image
FROM tomcat:8.0.20-jre8

# Copy the current directory contents into the container at /app
COPY target/HelloWithDocker.war /usr/share/tomcat8/webapps