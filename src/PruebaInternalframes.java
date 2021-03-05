import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

class Ventana extends JFrame{
	
	JMenuBar menuBar;
	JMenu masters,booking,testPerform,printing,transaction,labReports,settings,utilities,window,help;
	JMenuItem menuItemReg;
	JInternalFrame record;
	
	JToolBar tools;
	
	public Ventana() {
		
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1095,680);
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
		record.setSize(1080, 616);
		record.setTitle("Record");
		
	
		tools = new JToolBar(JToolBar.HORIZONTAL);
		tools.setBounds(0,0,1080,64);
		
		JButton add = new JButton(new ImageIcon("Icons/Add.png"));
		JButton edit = new JButton(new ImageIcon("Icons/Edit.png"));
		JButton back = new JButton(new ImageIcon("Icons/Back.png"));
		JButton list = new JButton(new ImageIcon("Icons/List.png"));
		JButton print = new JButton(new ImageIcon("Icons/Print.png"));
		JButton test = new JButton(new ImageIcon("Icons/Test.png"));
		JButton cancel = new JButton(new ImageIcon("Icons/Cancel.png"));
		JButton settings = new JButton(new ImageIcon("Icons/Settings.png"));
		JButton delete = new JButton(new ImageIcon("Icons/Delete.png"));
		JButton slip = new JButton(new ImageIcon("Icons/Slip.png"));
		JButton exit = new JButton(new ImageIcon("Icons/Exit.png"));
		
		tools.add(add);
		tools.add(edit);
		tools.add(back);
		tools.add(list);
		tools.add(print);
		tools.add(test);
		tools.add(cancel);
		tools.add(settings);
		tools.add(delete);
		tools.add(slip);
		tools.add(exit);
		record.add(tools);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.WHITE);
		
		dp.add(record);
		dp.setBounds(0, 0, 1080, 616);
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
