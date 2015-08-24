# SpringBootApi
An application to demonstrate how Spring Boot, Spring MVC, Spring Data, and Mongo can be used together to create a simple RESTful API using an embedded tomcat server.

# Dependencies
* Java 1.8 JDK
* Maven
* MongoDB 
  * Included at the root of the project is the file 'data.json', this data needs to be imported to Mongo.
  * To import the dataset into mongo issue the following command:
  * mongoimport --db restaurantData --collection restaurants --drop --file (pathToData.JsonFile)

# Usage
* mvn clean
* mvn package
* cd target  
* java -jar springBootApi-1.0-SNAPSHOT.jar
* Verify the server is running @ http://localhost:8080/api/status

# Example  
* Access a resource @ http://localhost:8080/api/restaurants/40361322
