# java9-meetup

Demo charla [Java 9](https://www.meetup.com/jugargentina/events/241336891/).

## requerimientos

 - Maven 3.x
 - [Java 9 EA](http://jdk.java.net/9)
 
 ## intro
 
Este repo contiene un proyecto Maven con 2 submodulos

- meetup-hello: Define un Java 9 module junto a un `Hello-World` service. See [module-info.java](https://github.com/jugargentina/java9-meetup/blob/master/meetup-hello/src/main/java/module-info.java)
- meetup-app: Ejecutable app que depende del module: `meetup-hello` y utiliza el servicio de `hello`. See [module-info.java](https://github.com/jugargentina/java9-meetup/blob/master/meetup-app/src/main/java/module-info.java)
 
 ## configuration
 
 - Fork and Star: https://github.com/jugargentina/java9-meetup
 - cd java9-meetup
 - mvn clean install
 
 ## executar
 
 - cd meetup-app
 - mvn clean exec:exec
 
