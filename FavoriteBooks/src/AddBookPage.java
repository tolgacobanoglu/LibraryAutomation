import javax.swing.*;

public class AddBookPage
{
    static int counterOfBook = 5; // because we add program 5 book
    JFrame frame=new JFrame("Add Book");

    JLabel labelTitle=new JLabel("Title");
    JLabel labelCategory=new JLabel("Category");
    JLabel labelAuthorName =new JLabel("Name");
    JLabel labelAuthorSurname=new JLabel("Surname");
    JLabel labelAwardWinner=new JLabel("Award Winner");
    JLabel labelRating=new JLabel("Rating (1-5)");
    JLabel labelYear=new JLabel("Year has finished the Book");
    JLabel labelPages=new JLabel("Page of Book");
    JLabel labelDescription=new JLabel("Description");

    JTextField textFieldTitle=new JTextField();
    JTextField textFieldCategory=new JTextField();
    JTextField textFieldAuthorName =new JTextField();
    JTextField textFieldAuthorSurname=new JTextField();
    JTextField textFieldAwardWinner=new JTextField();
    JTextField textFieldRating=new JTextField();
    JTextField textFieldYear=new JTextField();
    JTextField textFieldPages=new JTextField();
    JTextField textFieldDescription=new JTextField();

    JButton addButton=new JButton("Add");
    JButton closeButton=new JButton("Close");

    AddBookPage(Library library)
    {
        labelTitle.setBounds(15,15,100,30);
        textFieldTitle.setBounds(15,45,250,30);

        labelCategory.setBounds(15,75,100,30);
        textFieldCategory.setBounds(15,105,250,30);

        labelAuthorName.setBounds(15,135,100,30);
        textFieldAuthorName.setBounds(15,165,100,30);

        labelAuthorSurname.setBounds(130,135,100,30);
        textFieldAuthorSurname.setBounds(130,165,100,30);

        labelAwardWinner.setBounds(15,195,100,30);
        textFieldAwardWinner.setBounds(15,225,250,30);

        labelRating.setBounds(15,255,100,30);
        textFieldRating.setBounds(15,285,250,30);

        labelYear.setBounds(15,315,250,30);
        textFieldYear.setBounds(15,345,250,30);

        labelPages.setBounds(15,375,100,30);
        textFieldPages.setBounds(15,405,250,30);

        labelDescription.setBounds(15,435,100,30);
        textFieldDescription.setBounds(15,465,250,30);

        addButton.setBounds(90,530,100,50);
        addButton.setFocusable(false);

        closeButton.setBounds(230,530,100,50);
        closeButton.setFocusable(false);

        frame.add(labelTitle);
        frame.add(textFieldTitle);
        frame.add(labelCategory);
        frame.add(textFieldCategory);
        frame.add(labelAuthorName);
        frame.add(textFieldAuthorName);
        frame.add(labelAwardWinner);
        frame.add(textFieldAwardWinner);
        frame.add(labelRating);
        frame.add(textFieldRating);
        frame.add(labelYear);
        frame.add(textFieldYear);
        frame.add(labelPages);
        frame.add(textFieldPages);
        frame.add(labelDescription);
        frame.add(textFieldDescription);
        frame.add(addButton);
        frame.add(closeButton);
        frame.add(labelAuthorSurname);
        frame.add(textFieldAuthorSurname);

        addButton.addActionListener(e -> {
            library.addBook(counterOfBook+1,textFieldTitle.getText(),textFieldCategory.getText(), textFieldAuthorName.getText(),textFieldAuthorSurname.getText(),textFieldAwardWinner.getText(),Integer.parseInt(textFieldRating.getText()),Integer.parseInt(textFieldYear.getText()),Integer.parseInt(textFieldPages.getText()),textFieldDescription.getText());
            FileOperation.writeFile(library.books.get(counterOfBook-5).returnBookInformationToWriteIntoTxt());
            counterOfBook+=1;
            addButton.setEnabled(false); // dont click again for same book
            frame.dispose();
            MessageDialogs.informationMessage("Book : "+textFieldTitle.getText()+" is added ","Book Added");
            new HomePage(library);
        });

        closeButton.addActionListener(e -> {
            frame.dispose();
            new HomePage(library);
        });

        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//finish program when close frame
        frame.setSize(400,650);//size x-y of frame
        frame.setVisible(true);//visible of frame
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }
}