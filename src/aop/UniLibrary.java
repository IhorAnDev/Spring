package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Mi berem knigu iz university library ");
        System.out.println("-------------------------------------");
    }

    public String returnBook() {
        int a = 10/0;
        System.out.println("Mi vozvrashaem knigu v university library ");
        return "Voyna i mir";
    }

    public void getMagazine() {
        System.out.println("Mi berem jurnal iz biblioteki");
        System.out.println("-------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("Mi vozvrachaem jurnal iz biblioteki");
        System.out.println("-------------------------------------");
    }

    public void addBook(String persone_name, Book book) {
        System.out.println("Mi dobavlaem knigu v biblioteku");
        System.out.println("-------------------------------------");
    }

    public void addMagazine() {
        System.out.println("Mi dobavlyaem jurnal v biblioteku");
        System.out.println("-------------------------------------");
    }
}
