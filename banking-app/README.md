# BANKING-APP

**Description:** This is a simple banking application built using Spring Boot framework. It provides RESTful APIs for performing various banking operations such as account creation, deposit, withdrawal, and deletion.
- **Spring Web** 
- **Spring Boot** 
- **Spring Data JPA** 
- **Lombok** 
- **PostgreSQL** 



## Requirements :
Java 17 or higher
Maven
PostgreSQL database server
## Getting Started:
git clone https://github.com/omerfarukkodat/banking-app.git

Setup PostgreSQL:
Install PostgreSQL if you haven't already.
Create a new database for the application.

Configure Database:
Open application.properties file in src/main/resources directory.
Update the database URL, username, and password.
Build and Run:
mvn spring-boot:run

The application will start at http://localhost:8080.


## API Endpoints:
Create Account
Method: POST
Endpoint: /api/accounts

Get Account by ID
Method: GET
Endpoint: /api/accounts/{id}

Deposit
Method: POST
Endpoint: /api/accounts/{id}/deposit

Withdraw
Method: POST
Endpoint: /api/accounts/{id}/withdraw

Delete Account
Method: DELETE
Endpoint: /api/accounts/{id}

## Contributing:
Contributions are welcome! Please feel free to open a pull request or submit an issue if you find any problems or want to suggest improvements.

## License:
This project is licensed under the [MIT License](LICENSE).


