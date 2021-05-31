package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("7 navikov effectivnix ludey")
    private String name;

    @Value("Kovi Stiv")
    private String author;

    @Value("2010")
    private int yerOfPublication;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yerOfPublication;
    }
}
