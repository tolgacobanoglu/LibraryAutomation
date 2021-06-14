import javax.swing.*;

public class NumberOfBooksPage
{
    JFrame frame=new JFrame("Number of Books");
    JLabel label=new JLabel("Enter year");
    JTextField textField=new JTextField();
    JTextArea textArea=new JTextArea();
    JButton button=new JButton("Display");
    JButton closeButton=new JButton("Close");

    NumberOfBooksPage(Library library)
    {
        label.setBounds(50,50,100,30);

        textField.setBounds(50,100,70,30);

        textArea.setBounds(175,75,50,50);

        button.setBounds(100,210,100,30);
        button.setFocusable(false);

        closeButton.setBounds(100,250,100,30);
        closeButton.setFocusable(false);

        button.addActionListener(e -> {
            int counter=0;
            for (int i = 0; i < library.books.size(); i++)
            {
                if (Integer.parseInt(textField.getText())==library.books.get(i).getYear())
                {
                    counter+=1;
                }
            }
            textArea.setText(""+counter);
        });

        closeButton.addActionListener(e -> {
            frame.dispose();
            new HomePage(library);
        });

        frame.add(label);
        frame.add(textField);
        frame.add(textArea);
        frame.add(button);
        frame.add(closeButton);

        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//finish program when close frame
        frame.setSize(300,350);//size x-y of frame
        frame.setVisible(true);//visible of frame
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }
}