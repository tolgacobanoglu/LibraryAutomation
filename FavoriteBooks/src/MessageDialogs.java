import javax.swing.*;

public class MessageDialogs
{
    public static void warningMessage(String message,String title)
    {
        JOptionPane.showMessageDialog(null,message,title,JOptionPane.WARNING_MESSAGE);
    }

    public static void informationMessage(String message,String title)
    {
        JOptionPane.showMessageDialog(null,message,title,JOptionPane.PLAIN_MESSAGE);
    }
}