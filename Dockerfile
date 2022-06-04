FROM openjdk:11
COPY ExchangeRates-0.0.1-SNAPSHOT.jar ExchangeRates-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/ExchangeRates-0.0.1-SNAPSHOT.jar"]