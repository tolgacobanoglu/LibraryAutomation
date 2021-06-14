import javax.swing.*;

public class InformationOfBookPage
{
    JFrame frame=new JFrame("Information Of Book");
    JLabel label=new JLabel("Enter title of book to show information");
    JTextField textField=new JTextField();
    JTextArea informationArea=new JTextArea();
    JButton button=new JButton("Enter");
    JButton closeButton=new JButton("Close");

    InformationOfBookPage(Library library)
    {
        label.setBounds(80,50,500,100);

        textField.setBounds(130,150,110,30);

        informationArea.setBounds(100,300,200,200);
        informationArea.setLineWrap(true);
        informationArea.setWrapStyleWord(true);
        informationArea.setVisible(true);


        button.setBounds(150,230,70,30);
        button.setFocusable(false);

        button.addActionListener(e -> {
            for (int i = 0; i <= library.books.size(); i++)
            {
                if (library.books.get(i).getTitle().equals(textField.getText()))
                {
                    informationArea.setText(library.books.get(i).toString());
                }
            }

        });

        closeButton.setBounds(150,550,100,30);
        closeButton.setFocusable(false);

        closeButton.addActionListener(e -> {
            frame.dispose();
            new HomePage(library);
        });

        frame.add(button);
        frame.add(textField);
        frame.add(label);
        frame.add(informationArea);
        frame.add(closeButton);

        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//finish program when close frame
        frame.setSize(400,700);//size x-y of frame
        frame.setVisible(true);//visible of frame
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }
}