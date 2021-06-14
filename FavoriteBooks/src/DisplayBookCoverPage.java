import javax.swing.*;

public class DisplayBookCoverPage
{
    JFrame frame=new JFrame("Cover Page");
    JLabel label=new JLabel("Enter id to display cover of book");
    JTextField textField=new JTextField();
    JButton enterButton=new JButton("Enter");
    JButton closeButton=new JButton("Close");

    DisplayBookCoverPage(Library library)
    {

        label.setBounds(100,50,250,30);

        textField.setBounds(150,120,100,30);

        enterButton.setBounds(100,200,100,30);
        enterButton.setFocusable(false);

        closeButton.setBounds(200,200,100,30);
        closeButton.setFocusable(false);

        enterButton.addActionListener(e -> {
            frame.dispose();
            new DisplayBookCover(Integer.parseInt(textField.getText()),library);
        });

        closeButton.addActionListener(e -> {
            frame.dispose();
            new HomePage(library);
        });

        frame.add(label);
        frame.add(textField);
        frame.add(enterButton);
        frame.add(closeButton);


        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//finish program when close frame
        frame.setSize(400,400);//size x-y of frame
        frame.setVisible(true);//visible of frame
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }
}