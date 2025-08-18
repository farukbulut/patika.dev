package bulut.com.week3.bookorder.service;

import bulut.com.week3.bookorder.model.Author;
import bulut.com.week3.bookorder.model.enums.Gender;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AuthorService {
    public static Map<String, Author> authors = new HashMap<>();

    public void create(String name, String lastname, Gender gender){
        Author author = new Author(name, lastname, gender);
        authors.put(name,author);
    }

    public Author findAuthor(String name){
        return authors.get(name);
    }
}
