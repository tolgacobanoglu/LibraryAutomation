import java.util.ArrayList;

public class Library
{
    ArrayList<Book> books =new ArrayList<>();

    public void addBook(int id,String title,String category,String authorName,String authorSurname,String awardWinner,int rating,int year,int pages,String description)
    {
        books.add(new Book(id,title,category,authorName,authorSurname,awardWinner,rating,year,pages,description));// add new book object in library class's books arraylist
    }

    public void removeBook(int id)
    {
        if (id > books.size())
        {
            MessageDialogs.warningMessage("Invalid remove operation","ERROR");
        }
        else
        {
            books.remove(id-1);
        }
    }
}