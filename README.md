# Data Driven Travel
Create a Travel-app class and automate testing with data driven from SQL database<br>

[data types](https://www.w3schools.com/sql/sql_datatypes.asp),
[hsqldb](http://hsqldb.org/),
[java api](https://docs.oracle.com/javase/7/docs/api/),
[sql](https://www.w3schools.com/sql/)

## Steps
* Ensure the Eclipse IDE has Maven by looking for M2E from Help About ([details](https://www.vogella.com/tutorials/EclipseMaven/article.html))
* Install `DBViewer Plugin 1.2.2.v20101009` by ZIGEN from the Eclipse IDE marketplace
* Import into Eclipse as Git with smart import (accepting all defaults in wizard)
* Let the IDE finish building dependencies before proceeding (see bottom right of Eclipse)
* Run as JUnit test the file `TravelAppTest.java` for sanity testing the local database

## Database Schema

**Animal table**
- Hunger - INT
- Id - CHAR(36)
- Name - VARCHAR(100)
- OwnerId - CHAR(36)
- Species - CHAR(1)


**Owner table**
- Id - CHAR(36)
- Name - VARCHAR(100)
- Town - VARCHAR(100)

**To create the owner table**<br>
`CREATE TABLE Owner (Id CHAR(36), Name VARCHAR(100), Town VARCHAR(100), PRIMARY KEY(Id));`

** To create the animal table**<br>
`CREATE TABLE Animal (Hunger INT, Id CHAR(36), Name VARCHAR(100), OwnerId CHAR(36), Species CHAR(1), PRIMARY KEY(Id), FOREIGN KEY(OwnerId) REFERENCES KEY Owner(Id));`

**To insert a new Owner row**<br>
`INSERT INTO Owner (Id, Name, Town) VALUES ('c94161d9-d0cc-412e-9c13-4b17f873d822', 'Floz', 'Bridgnorth');`

**To inseRt a new Cat row**<br>
`INSERT INTO Animal (Hunger, Id, Name, OwnerId, Species) VALUES (0, 'b585e72f-6a18-4234-88a1-b4d4c333640d', 'Jess', 'c94161d9-d0cc-412e-9c13-4b17f873d822', C);`

**To inseRt a new Dog row**<br>
`INSERT INTO Animal (Hunger, Id, Name, OwnerId, Species) VALUES (0,'874e3bae-2c9a-48df-8fc8-f37b1dca440e', 'Milo', 'c94161d9-d0cc-412e-9c13-4b17f873d822', D);`

**To query an animal**<br>
`SELECT Hunger, Id, Species FROM Animal WHERE Name = 'Jess';`

**To query all pets for an owner**<br>
`SELECT animal.Name, animal.Species FROM Animal animal, Owner owner WHERE owner.Name = 'Floz';`

 


