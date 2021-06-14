import javax.swing.*;

public class RemoveBookPage
{
    JFrame frame=new JFrame("Remove Book");
    JLabel removeLabel=new JLabel("Enter ID of book to remove");
    JTextField removeTextfield=new JTextField();
    JButton removeButton=new JButton("Remove");
    JButton closeButton=new JButton("Close");

    RemoveBookPage(Library library)
    {
        removeLabel.setBounds(130,50,200,30);

        removeTextfield.setBounds(180,90,50,30);

        removeButton.setBounds(160,150,90,30);
        removeButton.setFocusable(false);

        closeButton.setBounds(160,200,90,30);
        closeButton.setFocusable(false);



        removeButton.addActionListener(e -> {
            library.removeBook(Integer.parseInt(removeTextfield.getText()));
            FileOperation.deleteFile();
            MessageDialogs.informationMessage("Book is removed","Succesfull operations");
            FileOperation.createFile();
            for (int i=0;i<library.books.size();i++)
            {
                FileOperation.writeFile(library.books.get(i).returnBookInformationToWriteIntoTxt());
            }
            frame.dispose();

            new HomePage(library);
        });

        closeButton.addActionListener(e -> {
            frame.dispose();
            new HomePage(library);
        });

        frame.add(removeButton);
        frame.add(removeTextfield);
        frame.add(removeLabel);
        frame.add(closeButton);

        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//finish program when close frame
        frame.setSize(400,300);//size x-y of frame
        frame.setVisible(true);//visible of frame
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }
}