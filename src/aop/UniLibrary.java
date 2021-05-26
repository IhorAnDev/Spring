package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook(String bookName) {
        System.out.println("Mi berem knigu iz university library " + bookName);
    }

    public void returnBook() {
        System.out.println("Mi vozvrashaem knigu v university library ");
    }

    public void getMagazine() {
        System.out.println("Mi berem jurnal iz biblioteki");
    }
}
