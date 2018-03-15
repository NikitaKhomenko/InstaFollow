import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame extends JFrame implements KeyListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4731035233227046365L;
	
	private JLabel lblTitle;
	private JLabel instruction1;
	private JLabel instruction2;
	private JLabel instruction3;
	private JLabel instruction4;
	
	Bot botLiker;

	
	public MainFrame() throws AWTException {
		
		botLiker = new Bot();
		addKeyListener(this);
		
		setTitle("Insta-Follow");
		setSize(new Dimension(400, 300));
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setAlwaysOnTop(true);
		setFocusable(true);
		
		
		
		lblTitle = new JLabel("  This is an instagram auto follower.");
		instruction1 = new JLabel("  1. To start upload instagram website.");
		instruction2 = new JLabel("  2. Go to profiles and enter a group.");
		instruction3 = new JLabel("  3. Press 1 to start.");
		instruction4 = new JLabel("  Press ctrl + atl + dlt to exit.");		
		
		setLayout(new GridLayout(5,0));
		
		add(lblTitle);
		add(instruction1);
		add(instruction2);
		add(instruction3);
		add(instruction4);


	}

	@Override
	public void keyPressed(KeyEvent e) {
	       if (e.getKeyCode() == KeyEvent.VK_1) 
	    	   botLiker.startLike();
	}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {}

}