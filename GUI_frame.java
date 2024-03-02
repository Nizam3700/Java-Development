import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;
public class GUI_frame  extends JFrame {

    GUI_frame() {

        Border border = BorderFactory.createLineBorder(Color.BLACK, 6);
        // label in the frame  
        JLabel label = new JLabel(); //Create the label
        label.setText("My First Java development Project");
        ImageIcon icon = new ImageIcon("./Assest/bloo.png");
        label.setIcon(icon);
        label.setHorizontalTextPosition(label.CENTER); //set the position of the text left, center, right, of 
        label.setVerticalTextPosition(label.TOP); //set the position of the text
        label.setForeground(Color.red); //set the foreground
        label.setFont(new Font("MV Boli", Font.PLAIN, 25)); //set the font
        label.setIconTextGap(30); //set the gap between the icon and the text
        label.setBackground(Color.black); //set the background
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //set the vertical alignment
        label.setHorizontalAlignment(JLabel.CENTER); //set the horizontal alignment


        // JFrame frame = new Jthis(); //Creates a this
        this.setTitle("First Java Project"); //sets the title of this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of the application
        // this.setResizable(false); //not resizable
        this.setSize(620,520); //make the dimension of the this
        this.setVisible(true); //make this visible

        ImageIcon image = new ImageIcon("./Assest/bloo.png"); //image path
        this.setIconImage(image.getImage()); //change the Icon pf this
        this.getContentPane().setBackground(Color.lightGray); //change the background

        this.add(label); //add the label
    }




    

}
