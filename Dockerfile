FROM openjdk:8-alpine
ADD build/libs/TriggerPP-0.0.1-SNAPSHOT-plain.jar .
EXPOSE 21000
CMD java -jar TriggerPP-0.0.1-SNAPSHOT-plain.jar
