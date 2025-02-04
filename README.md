Quarkus REST CRUD Example 
==================

This example shows a simple REST-API with intern H2 Database access running with Quarkus.

Technologies
------------

- Quarkus
- Hibernate
- H2 Database
- Java 8

Main Classes
------------
- **PersonEndpoint** - Responsible to receive all requests and provides all responses in JSON Format
- **PersonResource**- Responsible to make all database operations 
- **Person** - Represents the model entity Person with your attributes.
- **PersonsEndpointTest** - Tests for some endpoints

DATABASE Configurations
-----------------------

- application.properties - all database configurations 

Build
----------

Run `./mvnw clean package` or `mvnw.cmd clean package` (Windows) to build this project.

Run
----------

`java -jar target/restCRUDQuarkus-0.0.1-SNAPSHOT-runner.jar`
 

 - To run in eclipse [ECLIPSE](https://quarkus.io/blog/eclipse-got-quarkused/) 
 - Download [POSTMAN](https://www.postman.com/downloads/) for JSON requests.

REST call examples
----------
#### Create Person

- Open your postman application in **localhost:8080/api/persons**
- METHOD: **POST**
- BODY: raw - type **JSON**

```yaml
{
 "name":"NAME",
 "email": "NAME@gmail.com",
 "actived": false
}
```
- RETURN

```yaml
{
    "id": 1,
    "name": "NAME",
    "email": "NAME@gmail.com",
    "actived": false
}
```

#### UPDATE PERSON

- Open your postman application in **localhost:8080/api/persons/{id}**
- METHOD:**PUT**
- BODY: raw - type **JSON**
- ID: 1

```yaml
{
 "name":"NAME",
 "email": "NAME@gmail.com",
 "actived": true
}
```
- RETURN

```yaml
{
    "id": 1,
    "name": "NAME",
    "email": "NAME@gmail.com",
    "actived": true
}
```

#### GET ALL PERSONS

- Open your postman application in **localhost:8080/api/persons/**
- METHOD:**GET**
- BODY: EMPTY
- RETURN

```yaml
[
    {
        "id": 1,
        "name": "NAME",
        "email": "NAME@gmail.com",
        "actived": true
    },
    {
        "id": 2,
        "name": "NAME2",
        "email": "NAME2@gmail.com",
        "actived": false
    },
    {
        "id": 3,
        "name": "NAME3",
        "email": "NAME3@gmail.com",
        "actived": false
    }
]
```

### DELETE ONE PERSON

- Open your postman application in **localhost:8080/api/persons/{id}**
- METHOD:**DELETE**
- BODY: EMPTY
- RETURN: **204 No Content**
