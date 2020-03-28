FROM openjdk:8-jre-alpine
ENV APP_FILE uinstub-0.0.1-SNAPSHOT.jar
ENV APP_HOME /usr/app
COPY target/$APP_FILE $APP_HOME/
WORKDIR $APP_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -jar -Dserver.port=8090 $APP_FILE"]
EXPOSE 8090