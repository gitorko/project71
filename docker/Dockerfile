FROM java:8
WORKDIR /var/app
ADD libs/demo-0.0.1-SNAPSHOT.jar /var/app/demo.jar
ENV _JAVA_OPTIONS '-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005'
CMD [ "java", "-jar", "/var/app/demo.jar" ]
EXPOSE 8080 5005
