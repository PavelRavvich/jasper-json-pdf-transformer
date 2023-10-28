# jasper-json-pdf-transformer

## API Service transformation from JSON to PDF using JasperReports

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw clean install
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Dnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/report-generator-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

## Related Guides

- Hibernate Validator ([guide](https://quarkus.io/guides/validation)): Validate object properties (field, getter) and method parameters for your beans (REST, CDI, Jakarta Persistence)
- REST Client Classic ([guide](https://quarkus.io/guides/rest-client)): Call REST services
- Kotlin ([guide](https://quarkus.io/guides/kotlin)): Write your services in Kotlin
- RESTEasy Classic ([guide](https://quarkus.io/guides/resteasy)): REST endpoint framework implementing Jakarta REST and more

## Provided Code

### RESTEasy JAX-RS

Easily start your RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started#the-jax-rs-resources)

For test

**POST** `http://localhost:8080/api/v1/report/generate`

```json
{
  "companyName": "Company",
  "companyUrl": "www.company.com",
  "rows": [
    {
      "name": "John Smith",
      "age": "40",
      "gender": "Male",
      "phone": "321-654-9870",
      "birthday": "1983-11-10"
    },
    {
      "name": "Emily Brown",
      "age": "29",
      "gender": "Female",
      "phone": "456-789-1230",
      "birthday": "1994-05-21"
    },
    {
      "name": "Alice Johnson",
      "age": "35",
      "gender": "Female",
      "phone": "567-890-1234",
      "birthday": "1988-09-15"
    },
    {
      "name": "Bob Williams",
      "age": "50",
      "gender": "Male",
      "phone": "678-901-2345",
      "birthday": "1973-04-03"
    },
    {
      "name": "Charlie Davis",
      "age": "22",
      "gender": "Male",
      "phone": "789-012-3456",
      "birthday": "2001-12-25"
    },
    {
      "name": "Diana Miller",
      "age": "27",
      "gender": "Female",
      "phone": "890-123-4567",
      "birthday": "1996-02-18"
    },
    {
      "name": "Ethan Wilson",
      "age": "32",
      "gender": "Male",
      "phone": "901-234-5678",
      "birthday": "1991-08-09"
    },
    {
      "name": "Fiona Anderson",
      "age": "21",
      "gender": "Female",
      "phone": "012-345-6789",
      "birthday": "2002-10-01"
    },
    {
      "name": "George Thomas",
      "age": "45",
      "gender": "Male",
      "phone": "123-789-0456",
      "birthday": "1978-06-30"
    },
    {
      "name": "Helen Taylor",
      "age": "60",
      "gender": "Female",
      "phone": "234-890-1567",
      "birthday": "1963-01-05"
    }
  ]
}
```