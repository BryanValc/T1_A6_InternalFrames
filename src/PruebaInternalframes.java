import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
import javax.xml.ws.spi.Invoker;

class Ventana extends JFrame{
	
	JMenuBar menuBar;
	JMenu masters,booking,testPerform,printing,transaction,labReports,settings,utilities,window,help;
	JMenuItem menuItemReg;
	JInternalFrame record;
	
	JToolBar tools;
	JButton calc1,calc2,calc3;
	JTextField patientId,hh,mm,labNo,name,age,mons,days,referredBy,blank,sampleBy,panelCode,panelId,email;
	
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
		
		//ToolBar start
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
		//ToolBar end
		
		//panel1 start
		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBackground(Color.WHITE);
		panel1.setBounds(1, 64, 1080, 162);
		
		
		metodoMagico(new JLabel("Patient ID"),panel1,15,5,62,15);//Labels
		metodoMagico(new JLabel("Name"),panel1,15,32,62,15);
		metodoMagico(new JLabel("Sex"),panel1,15,59,62,15);
		metodoMagico(new JLabel("Referred by"),panel1,15,86,70,15);
		metodoMagico(new JLabel("Date"),panel1,199,5,62,15);
		metodoMagico(new JLabel("*Time(hh:mm)"),panel1,340,5,110,15);
		metodoMagico(new JLabel(":"),panel1,439,5,3,15);
		metodoMagico(new JLabel("Lab No"),panel1,474,5,55,15);
		metodoMagico(new JLabel("Age"),panel1,134,55,62,15);
		metodoMagico(new JLabel("Mons"),panel1,189,55,62,15);
		metodoMagico(new JLabel("Days"),panel1,254,55,62,15);
		metodoMagico(new JLabel("Sample by"),panel1,323,55,62,15);
		metodoMagico(new JLabel("Panel Code"),panel1,323,80,65,15);
		metodoMagico(new JLabel("Panel ID"),panel1,323,105,62,15);
		metodoMagico(new JLabel("e-mail"),panel1,323,130,62,15);
		
		calc1=new JButton(new ImageIcon("Icons/Calc.png"));//Calc Buttons
		calc2=new JButton(new ImageIcon("Icons/Calc.png"));
		calc3=new JButton(new ImageIcon("Icons/Calc.png"));
		metodoMagico(calc1,panel1,159,86,12,14);
		metodoMagico(calc2,panel1,485,65,12,14);
		metodoMagico(calc3,panel1,485,89,12,14);
		
		patientId=new JTextField();
		metodoMagico(patientId, panel1, 75, 5, 70, 18);
		hh=new JTextField("0");
		metodoMagico(hh, panel1, 420, 5, 18, 18);
		mm=new JTextField("0");
		metodoMagico(mm, panel1, 445, 5, 18, 18);
		labNo=new JTextField();
		metodoMagico(labNo, panel1, 534, 5, 82, 18);
		name=new JTextField();
		metodoMagico(name, panel1, 134, 30, 170, 18);
		age=new JTextField("0");
		metodoMagico(age, panel1, 157, 54, 25, 18);
		mons=new JTextField("0");
		metodoMagico(mons, panel1, 221, 54, 25, 18);
		days=new JTextField("0");
		metodoMagico(days, panel1, 285, 54, 25, 18);
		referredBy=new JTextField();
		metodoMagico(referredBy, panel1, 78, 77, 76, 18);
		blank=new JTextField();
		metodoMagico(blank, panel1, 177, 79, 130, 20);
		sampleBy=new JTextField();
		metodoMagico(sampleBy, panel1, 390, 54, 88, 20);
		panelCode=new JTextField();
		metodoMagico(panelCode, panel1, 390, 80, 88, 20);
		panelId=new JTextField();
		metodoMagico(panelId, panel1, 390, 106, 88, 20);
		email=new JTextField();
		metodoMagico(email, panel1, 390, 132, 88, 20);
		
		
		
		record.add(panel1);
		//panel1 end
		
		dp.add(record);
		dp.setBounds(0, 0, 1080, 680);
		add(dp);
		
	}
	
	
	
	public void metodoMagico(Component c,JPanel p,int x, int y,int width, int height) {
		p.add(c);
		c.setBounds(x, y, width, height);
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
