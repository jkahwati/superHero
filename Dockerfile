FROM openjdk:11.0.7

COPY build/libs/superHero-0.0.1-SNAPSHOT.jar /usr/local/superHero-0.0.1-SNAPSHOT.jar

CMD ["java", "-jar", "/usr/local/superHero-0.0.1-SNAPSHOT.jar"]
