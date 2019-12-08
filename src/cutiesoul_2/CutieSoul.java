package cutiesoul_2;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class CutieSoul extends JFrame {
	private Image screenImage;
	private Graphics screenGraphic;
	private Image introBackground;

	public CutieSoul() {
		setTitle("CutieSoul");
		setSize(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		introBackground=new ImageIcon(Main.class.getResource("../images/introBackGraound(Title).jpg")).getImage();
	}
	
	public void paint(Graphics g) {
		screenImage=createImage(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
		screenGraphic=screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage,0,0,null);
		
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		this.repaint();
	}
}
