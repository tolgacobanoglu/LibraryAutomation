import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation
{
    public static void createFile()
    {
        try
        {
            File FavoriteBooks = new File("FavoriteBooks.txt");
            if (FavoriteBooks.createNewFile())
            {
                System.out.println("File created : " + FavoriteBooks.getName());
            }
            else
            {
                System.out.println("File already exists.");
            }
        }
        catch (IOException e)
        {
            System.out.println("ERROR !");
            e.printStackTrace();
        }
    }

    public static void writeFile(String string)// write a file on FavoriteBooks
    {
        try
        {
            BufferedWriter writer = new BufferedWriter(new FileWriter("FavoriteBooks.txt", true));
            writer.write(string);
            writer.newLine(); //for printing book information one under the other
            writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void deleteFile()
    {
        File myObj = new File("FavoriteBooks.txt");

        if (myObj.delete())
        {
            System.out.println("Deleted the file: " + myObj.getName());
        }
        else
        {
            System.out.println("Failed to delete the file.");
        }
    }

}
