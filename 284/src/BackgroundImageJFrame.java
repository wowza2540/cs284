import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BackgroundImageJFrame extends JFrame{
	JButton b1;
	JLabel l1;
	 private JFrame window;
	    private JPanel panel1, panel2, panel3;
	    private JLabel lblBackgroundImage = new JLabel();
	    private JButton feedButton = new JButton("Feed Fish");
	    private JButton playGamesButton = new JButton("Play Game");
		public BackgroundImageJFrame()
		{
		setTitle("Background Color for JFrame");
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	
	//	One way
	//	-----------------
	/*	setLayout(new BorderLayout());
		JLabel background=new JLabel(new ImageIcon("bg1.jpg"));
		add(background);
		background.setLayout(new FlowLayout());
		l1=new JLabel("Here is a button");
		b1=new JButton("I am a button");
		background.add(l1);
		background.add(b1);*/
	
	// Another way
		//setLayout(new BorderLayout());
	/*	setContentPane(new JLabel(new ImageIcon("bg1.jpg")));
		setLayout(new FlowLayout());
		l1=new JLabel("Here is a button");
		b1=new JButton("I am a button");
		JPanel p = new JPanel();
		p.add(new JButton("btn"));
		add(p);
		add(l1);
		add(b1);*/
		setTitle("Virtual Pet Fish");
        setSize(650, 650);


        //initializes panels and panel layout
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel2.setLayout(new FlowLayout());
        panel3.setLayout(new FlowLayout());

        lblBackgroundImage.setLayout(new FlowLayout());

        //sets background image of panel
        lblBackgroundImage.setIcon(new ImageIcon("bg1.jpg"));
        panel1.add(lblBackgroundImage);
        validate();

        //adds button to panels
        panel2.add(feedButton);
        panel2.add(playGamesButton);

        //add panels to frame
        add(panel1);
        add(panel2);
		// Just for refresh :) Not optional!
		
		setSize(399,399);
		setSize(400,400);
		}
		public static void main(String args[])
		{
		new BackgroundImageJFrame();
		}

}
