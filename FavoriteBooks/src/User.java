import java.util.ArrayList;

public class User
{
    public static ArrayList<String> users = new ArrayList();

    public static void addNewUser(String... usernames)
    {
        for (String username : usernames)
        {
            users.add(username);
        }
    }
}
