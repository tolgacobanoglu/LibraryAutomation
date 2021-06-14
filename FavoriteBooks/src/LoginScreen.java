import javax.swing.*;
import java.awt.*;

public class LoginScreen
{
    LoginScreen(Library library)
    {
        User.addNewUser("tolgacobanoglu","denizozsoyeller");

        JFrame frame=new JFrame();
        JLabel usernameLabel=new JLabel("Enter your username");
        JTextField usernameInput=new JTextField();
        JButton logInButton=new JButton("Log in");

        logInButton.setForeground(new Color(0,0,0)); // button text colour
        logInButton.setFocusable(false); //to dont show around lines of text
        logInButton.setBackground(new Color(255,255,255)); // button colour
        logInButton.setBounds(200,280,100,50);

        logInButton.addActionListener(e -> {        // username control in arraylist

            String enteredUsername=usernameInput.getText();

            for (String username:User.users)
            {
                if (username.equals(enteredUsername))
                {
                    System.out.println("correct username");
                    frame.dispose(); // close login screen
                    new HomePage(library); // direct homepage frame into library automation
                    break; // because of don't search other username in user class's arraylist,if it is not hold there it will be work for others
                }
                else
                {
                    MessageDialogs.warningMessage("Incorrect username,Please try again","Error for Username");
                }
            }
        });

        usernameInput.setBounds(100,200,300,30);

        usernameLabel.setBounds(170,100,200,30);
        usernameLabel.setForeground(new Color(0,0,0 ));//set colour of text
        usernameLabel.setFont(new Font("Avenir Next LT Pro Demi",Font.PLAIN,17));//set type of writing text

        frame.setTitle("Login for Library");//title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//finish program when close frame
        frame.setResizable(false);//cannot be resizable
        frame.setSize(500,500);//size x-y of frame
        frame.setVisible(true);//visible of frame
        frame.setLocationRelativeTo(null);//make frame location main coordinate of screen

        ImageIcon image=new ImageIcon("loginFrameImage.png");//create an image icon
        frame.setIconImage(image.getImage());//logo of my frame image
        frame.getContentPane().setBackground(new Color(0,162,237));//change of color frame background rgb colours from htmlcolorcodes.com

        frame.add(usernameLabel);
        frame.add(usernameInput);
        frame.add(logInButton);
    }
}