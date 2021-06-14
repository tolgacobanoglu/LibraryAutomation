import javax.swing.*;

public class ListWithTitleGivenCategory
{
    JFrame frame=new JFrame("List");
    JLabel label=new JLabel("Enter your Category Name");
    JTextField textField=new JTextField();
    JTextArea textArea=new JTextArea();
    JButton button=new JButton("Enter");
    JButton closeButton=new JButton("Close");

    ListWithTitleGivenCategory(Library library)
    {
        label.setBounds(15,30,1000,50);
        textField.setBounds(15,80,100,30);

        button.setBounds(15,150,100,30);
        button.setFocusable(false);

        closeButton.setBounds(150,150,100,30);
        closeButton.setFocusable(false);

        textArea.setBounds(50,200,200,200);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        button.addActionListener(e -> {
            String titles="";
            for (int i = 0; i < library.books.size(); i++)
            {
                if (library.books.get(i).getCategory().equals(textField.getText()))
                {
                    titles+=library.books.get(i).getTitle()+"\n";
                }
            }
            textArea.setText(titles);
        });

        closeButton.addActionListener(e -> {
            frame.dispose();
            new HomePage(library);
        });


        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(closeButton);
        frame.add(textArea);

        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//finish program when close frame
        frame.setSize(300,400);//size x-y of frame
        frame.setVisible(true);//visible of frame
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }
}
