import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JInternalFrame.JDesktopIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

class Ventana extends JFrame{
	
	JMenuBar menuBar;
	JMenu masters,booking,testPerform,printing,transaction,labReports,settings,utilities,window,help;
	JMenuItem menuItemReg;
	JInternalFrame record;
	
	JToolBar tools;
	
	public Ventana() {
		
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1080,630);
		setLocationRelativeTo(null);
		setTitle("InternalFrames");
		setVisible(true);
		
		menuBar = new JMenuBar();

			masters = new JMenu("Master");
				menuItemReg= new JMenuItem("Record");
				masters.add(menuItemReg);
				menuItemReg.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						record.setVisible(true);
						
					}
				});
				
			booking = new JMenu("Booking");
			testPerform = new JMenu("Test Perform");
			transaction = new JMenu("Transaction");
			labReports = new JMenu("Lab Reports");
			settings = new JMenu("Settings");
			window = new JMenu("Window");
			help = new JMenu("Help");
			
		menuBar.add(masters);
		menuBar.add(booking);
		menuBar.add(testPerform);
		menuBar.add(transaction);
		menuBar.add(labReports);
		menuBar.add(settings);
		menuBar.add(window);
		menuBar.add(help);
		setJMenuBar(menuBar);
		
		JDesktopPane dp = new JDesktopPane();
		
		record = new JInternalFrame();
		record.getContentPane().setLayout(null);
		record.setDefaultCloseOperation(HIDE_ON_CLOSE);
		record.setSize(1080, 630);
		record.setTitle("Record");
		
	
		tools = new JToolBar(JToolBar.HORIZONTAL);
		tools.setBounds(0,0,1080,64);
		
		
		record.add(tools);
		dp.add(record);
		dp.setBounds(0, 0, 1080, 630);
		
		add(dp);
		
	}
	
	public void metodoMagico(Component c,JPanel p,int x, int y,int width, int height) {
		c.setBounds(x, y, width, height);
		p.add(c);
	}
	
	
}


public class PruebaInternalframes {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Ventana();
			}
		});
	}
	
}
