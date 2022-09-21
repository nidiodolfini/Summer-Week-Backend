FROM openjdk:17-jdk-alpine3.14
WORKDIR /app
EXPOSE 8080
ADD ["https://github.com/nidiodolfini/Summer-Week-Backend/blob/31c1cc9f83d2efae45ef476c1239f59f9c07dbbb/target/BibliotecaDeFilmes-0.0.1-SNAPSHOT.jar", " /app/app.jar" ]

#COPY target/BibliotecaDeFilmes-0.0.1-SNAPSHOT.jar /app/app.jar
ENTRYPOINT ["java","-jar", "app.jar"]