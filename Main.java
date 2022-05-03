package KPP.laba3.task3;


public class Main {

    public static void main(String[] args) {
        System.out.println((char)27 + "[92m" + "Laba3 Kononenko M.O. CB-24");
        Library library = new Library("Central  library of KhNU");

        BookStore bookStore1 = new BookStore("Science");
        BookStore bookStore2 = new BookStore("History");
        BookStore bookStore3 = new BookStore("Chemistry");

        Book b1 = new Book("T_1", new Author("Mikhailo", "Fapfokawoe"), 1996, 11);
        Book b2 = new Book("T_2", new Author("Max", "Hodwa"), 2011, 1);
        Book b3 = new Book("T_3", new Author("Dima", "Jkodfp"), 2014, 2);
        Book b4 = new Book("T_4", new Author("Anna", "Kpkoda"), 1995, 3);
        Book b5 = new Book("T_5", new Author("Ruslan", "Ljdfes"), 1965, 4);
        Book b6 = new Book("T_6", new Author("Key", "Pjueiwa"), 2007, 5);
        Book b7 = new Book("T_7", new Author("Monika", "Mdnjwa"), 1969, 15);
        Book b8 = new Book("T_8", new Author("Seven", "Fioevssdda"), 2018, 3);
        Book b9 = new Book("T_9", new Author("John", "Tiojae"), 1999, 10);


        bookStore1.addBook(b1);
        bookStore1.addBook(b2);

        bookStore2.addBook(b3);
        bookStore2.addBook(b4);
        bookStore2.addBook(b5);

        bookStore3.addBook(b6);

        bookStore1.addBook(b7);
        bookStore2.addBook(b8);
        bookStore3.addBook(b9);


        library.addBookStore(bookStore1);
        library.addBookStore(bookStore2);
        library.addBookStore(bookStore3);

        BookReader bookReader1 = new BookReader("Name_BR1", "Surname_BR1", 33);
        BookReader bookReader2 = new BookReader("Name_BR2", "Surname_BR2", 99);


        library.registerReader(bookReader1);
        library.registerReader(bookReader2);


        bookReader2.takeBook(library.giveBook(b1));
        bookReader2.takeBook(library.giveBook(b2));
        bookReader2.takeBook(library.giveBook(b3));
        bookReader2.takeBook(library.giveBook(b4));

        bookReader1.takeBook(library.giveBook(b5));
        bookReader1.takeBook(library.giveBook(b6));

        System.out.println((char)27 + "[35m" + "--- Before serialization ---");
        System.out.println(library);

        System.out.println("--- After deserialization ---");
        LibraryDriver.serializeObject(library);
        System.out.println(LibraryDriver.deserializeObject());


    }
}
