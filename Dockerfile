  FROM java:8
  MAINTAINER bellamy
  ADD target/Hugo-blog-4.0.0-SNAPSHOT.jar /app.jar
  ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
