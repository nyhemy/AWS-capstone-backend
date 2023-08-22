# EC2 List Server
Simple web server that returns a list of EC2 instances. This project is used as part of the Beginning Cloud (AWS) Module.
### Getting Started

The server expects to connect to a Postgres Database

####Connection Properties
The server requires the following properties to be set.
* spring.datasource.url
* spring.datasource.username
* spring.datasource.password

Example command to run server
```
java -jar ec2_list_server-0.0.1-SNAPSHOT.jar --spring.datasource.url="jdbc:postgresql://<database_url>:5432/postgres" --spring.datasource.username="<username>" --spring.datasource.password="<password>"
```

Running the following Docker command will stand up a basic postgres container that this project's properties yaml file is configured to connect to:
```
docker run -d -e POSTGRES_USER=user -e POSTGRES_PASSWORD=root --name myDb -p 5432:5432 postgres
```

### Data

* The DataLoader class in the __data__ package will load a few examples of each entity into the database after the service starts up.

### Postman Collection
1. Open Postman.
2. On the top left-hand corner, click Import.
3. Select the tab for Import From Link, insert the url: https://www.getpostman.com/collections/e69168767788b1c8d405 and hit Import.
4. Items domain can be updated on it's own, or through the Order POSTs and PUTs
