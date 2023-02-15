import java.util.*;

class Book {
    String title;
    int year;
    public Book(String title, int year){
        this.title = title;
        this.year = year;
    }
}

class LinkedLists {
    public static void main (String[] args){
        List<Book> BooksList = new LinkedList<>();
        BooksList.add(new Book("Zorro ", 1919));
        BooksList.add(new Book("Foucault's pendulum ", 1988));
        BooksList.add(new Book("The da Vinci code ", 2003));
        BooksList.add(new Book("Dune ", 1965));
        BooksList.add(new Book("Earthsea ", 1968));
        BooksList.add(new Book("The Little Prince", 1943));

        for (Book date : BooksList) {
            if (date.year >=2000){
                System.out.println("Books that where publihed after year 2000: " + date.year + " " + date.title);
            }
        }
    }
}