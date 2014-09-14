# Physician Finder project

## Import project in Eclipse

1. Import -> Maven -> Existing Maven projects
2. Browse -> ... Finish

## Run project

1. Run -> Run configurations
2. Maven Build -> New launch configuration 
3. Name: pf 
4. Base directory: ${workspace_loc:/PhysicianFinder} 
5. Goals: tomcat7:run
6. Profiles: pom.xml 
7. Run (this saves the configuration)

## MySQL Settings (in data-access.properties)

* jdbc.driverClassName=com.mysql.jdbc.Driver
* jdbc.url=jdbc:mysql://localhost:3306/pf?useUnicode=true&characterEncoding=UTF-8
* jdbc.username=root
* jdbc.password=admin

## Database diagram

![Database diagram](http://i.imgur.com/vYggZQI.png)

