package org.ironhack.mavenproject;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = List.of(
                new Book("The Raven", 50),
                new Book("The Black Cat", 60),
                new Book("The Tell-Tale Heart", 40)
        );

        Author author = new Author("Edgar", "Allan Poe", books);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(author));
    }
}
