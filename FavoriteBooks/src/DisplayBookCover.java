import javax.swing.*;

public class DisplayBookCover
{
    JFrame frame=new JFrame("Book Cover");
    JLabel label=new JLabel();
    JButton closeButton=new JButton("Close");

    ImageIcon bookCover1=new ImageIcon("BookCover1.png");
    ImageIcon bookCover2=new ImageIcon("BookCover2.png");
    ImageIcon bookCover3=new ImageIcon("BookCover3.png");
    ImageIcon bookCover4=new ImageIcon("BookCover4.png");
    ImageIcon bookCover5=new ImageIcon("BookCover5.png");

    ImageIcon image=new ImageIcon("BookCoverFrameImage.png");//create an image icon

    DisplayBookCover(int input,Library library)
    {
        if (input==1)
        {
            label.setIcon(bookCover1);
        }
        else if (input==2)
        {
            label.setIcon(bookCover2);
        }
        else if (input==3)
        {
            label.setIcon(bookCover3);
        }
        else if (input==4)
        {
            label.setIcon(bookCover4);
        }
        else if (input==5)
        {
            label.setIcon(bookCover5);
        }

        label.setVerticalAlignment(JLabel.HORIZONTAL);//to center of image
        label.setHorizontalAlignment(JLabel.HORIZONTAL);//to center of image

        closeButton.setBounds(200,310,100,30);
        closeButton.setFocusable(false);

        closeButton.addActionListener(e -> {
            frame.dispose();
            new HomePage(library);
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


        frame.setIconImage(image.getImage());//logo of my frame image
        frame.add(closeButton);
        frame.add(label);
    }
}
