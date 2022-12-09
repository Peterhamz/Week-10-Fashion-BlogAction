FROM openjdk:17

EXPOSE 8080

LABEL maintainer="peter.net"
ADD ./target/fashion-blog-images.jar fashion-blog-images.jar
ENTRYPOINT ["java","-jar","/fashion-blog-images"]