# está puxando a imagem do dockerhub
FROM openjdk:17-jdk-alpine3.14
WORKDIR /diretorioprincipal
EXPOSE 8080
COPY target/BibliotecaDeFilmes-0.0.1-SNAPSHOT.jar /diretorioprincipal/app.jar
ENTRYPOINT ["java","-jar", "app.jar"]