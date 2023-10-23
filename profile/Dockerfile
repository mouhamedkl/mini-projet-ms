FROM openjdk:8
EXPOSE 8089
ENV NEXUS_USERNAME=admin
ENV NEXUS_PASSWORD=midou
ENV NEXUS_REPO_URL=http://192.168.57.131:8081/repository/maven-releases/com/example/Profile/1.0/Profile-1.0.jar

# Download the JAR file from Nexus and copy it to the container
RUN curl -L -o profile.jar -u $NEXUS_USERNAME:$NEXUS_PASSWORD $NEXUS_REPO_URL
ENTRYPOINT ["java","-jar","profile.jar"]