public class Main
{
    public static void main(String[] args)
    {
        FileOperation.createFile(); // create our txt file

        Library library=new Library();  // new library for operations

        Book book1=new Book(1,"Nutuk","History","Mustafa Kemal","Atatürk","Nobel",5,2021,1197,"lifetime' of Atatürk and his fight");
        Book book2=new Book(2,"Martin Eden","Fantastic","Jack","London","Nobel",5,2021,650,"transformation story of Martin");
        Book book3=new Book(3,"Introduction to Algorithms","Education","Thomash H.","Cormen","No",4,2021,1312,"Good for train yourself about programming");
        Book book4=new Book(4,"Design Patterns: Elements of Reusable Object-Oriented Software","Education","Erich","Gamma","No",4,2021,395,"a software engineering book describing software design patterns");
        Book book5=new Book(5,"Clean Code","Education","Robert Cecil","Martin","No",5,2021,490,"Best book for being good software engineer");

        library.books.add(book1);
        library.books.add(book2);
        library.books.add(book3);
        library.books.add(book4);
        library.books.add(book5);

        FileOperation.writeFile(book1.returnBookInformationToWriteIntoTxt());
        FileOperation.writeFile(book2.returnBookInformationToWriteIntoTxt());
        FileOperation.writeFile(book3.returnBookInformationToWriteIntoTxt());
        FileOperation.writeFile(book4.returnBookInformationToWriteIntoTxt());
        FileOperation.writeFile(book5.returnBookInformationToWriteIntoTxt());

        new LoginScreen(library);
    }
}