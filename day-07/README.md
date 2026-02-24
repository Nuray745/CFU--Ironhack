--Exercise 1--: JSON to Java
Instructions
Translate the following JSON object into Java classes:

{
"id": "YMZ-0000001",
"total": 30.5,
"isPaid": false,
"invoiceItems": [
{ "name": "Coca Cola 2L", "price": 10.0 },
{ "name": "Rum Santa Teresa 0.7L", "price": 15.0 },
{ "name": "Ice bag L", "price": 5.5 }
]
}


--Exercise 2:-- Maven Project with Gson

Instructions

1.Create a new Maven project in IntelliJ IDEA.

2.Add the Gson dependency to your pom.xml:
Go to Maven Central and select the latest version.
Copy the Maven dependency XML.
In your pom.xml, paste the dependency inside the <dependencies> tag.

3.Create a Book class with title (String) and pages (int) properties.

4.Create an Author class with name (String), lastName (String), and publishedBooks (List of Book) properties.

5.In your Main class, create an Author object with at least 3 books. Use Gson to convert it to a JSON string and print it to the console.


---Exercise 3---: Reading the POM

Instructions

Examine the following pom.xml snippet and answer the questions below:

<project>
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.ironhack</groupId>
    <artifactId>invoice-manager</artifactId>
    <version>2.0-SNAPSHOT</version>
    <packaging>jar</packaging>

    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
    </properties>

    <dependencies>
        <dependency>
            <groupId>com.google.code.gson</groupId>
            <artifactId>gson</artifactId>
            <version>2.11.0</version>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.10.2</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
</project>

1.What is the groupId of this project?

2.What Java version is configured for compilation?

3.How many dependencies does this project have?

4.Which dependency is only available during testing? How can you tell?

5.What command would you run to compile this project from the terminal?