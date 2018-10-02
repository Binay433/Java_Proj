<<<<<<< HEAD

# Use an official Python runtime as a parent image
FROM tomcat:8.0.20-jre8

# Copy the current directory contents into the container at /app
COPY target/HelloWithDocker.war /usr/share/tomcat8/webapps
=======

# Use an official Python runtime as a parent image
FROM tomcat:8.0.20-jre8

# Copy the current directory contents into the container at /app
COPY HelloWithDocker.war /usr/share/tomcat8/webapps
>>>>>>> 8402ccfff1c604deec505352b493d8fc2c6f0941
