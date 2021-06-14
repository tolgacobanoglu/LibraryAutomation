import javax.swing.*;

public class HomePage
{
    JFrame frame = new JFrame("  Home Page");
    ImageIcon homepageIcon = new ImageIcon("HomePageFrameImage.png");

    JButton addBookButton = new JButton("Add Book");
    JButton removeBookButton = new JButton("Remove Book");
    JButton informationBookButton = new JButton("Information of book");
    JButton bookCoverButton = new JButton("Book Covers");
    JButton numberOfBookButton = new JButton("Number Of Books");
    JButton listBooksWithAuthorName = new JButton("List Books (Author Name)");
    JButton listBooksWithCategory = new JButton("List Books (Category)");
    JButton exitButton = new JButton("EXIT");

    HomePage(Library library)
    {
        addBookButton.setBounds(150, 40, 200, 40);
        addBookButton.setFocusable(false);

        removeBookButton.setBounds(150, 120, 200, 40);
        removeBookButton.setFocusable(false);

        informationBookButton.setBounds(150, 200, 200, 40);
        informationBookButton.setFocusable(false);

        bookCoverButton.setBounds(150, 280, 200, 40);
        bookCoverButton.setFocusable(false);

        numberOfBookButton.setBounds(150, 360, 200, 40);
        numberOfBookButton.setFocusable(false);

        listBooksWithAuthorName.setBounds(150, 440, 200, 40);
        listBooksWithAuthorName.setFocusable(false);

        listBooksWithCategory.setBounds(150, 520, 200, 40);
        listBooksWithCategory.setFocusable(false);

        exitButton.setBounds(150, 600, 200, 40);
        exitButton.setFocusable(false);


        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 740);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        addBookButton.addActionListener(e -> {
            new AddBookPage(library);
            frame.dispose();
        });

        removeBookButton.addActionListener(e -> {
            new RemoveBookPage(library);
            frame.dispose();
        });

        informationBookButton.addActionListener(e -> {
            new InformationOfBookPage(library);
            frame.dispose();
        });

        bookCoverButton.addActionListener(e -> {
            new DisplayBookCoverPage(library);
            frame.dispose();
        });

        numberOfBookButton.addActionListener(e -> {
            new NumberOfBooksPage(library);
            frame.dispose();
        });

        listBooksWithAuthorName.addActionListener(e -> {
            new ListWithTitleAndDescriptionGivenAuthorNamePage(library);
            frame.dispose();
        });

        listBooksWithCategory.addActionListener(e -> {
            new ListWithTitleGivenCategory(library);
            frame.dispose();
        });

        exitButton.addActionListener(e -> System.exit(0)); // shut down program because when in homepage you dont want close if u want shut down system

        frame.setIconImage(homepageIcon.getImage());
        frame.add(addBookButton);
        frame.add(removeBookButton);
        frame.add(informationBookButton);
        frame.add(bookCoverButton);
        frame.add(numberOfBookButton);
        frame.add(listBooksWithAuthorName);
        frame.add(listBooksWithCategory);
        frame.add(exitButton);
    }
}