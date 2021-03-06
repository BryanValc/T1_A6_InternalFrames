import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.xml.ws.spi.Invoker;

class Ventana extends JFrame{
	
	JMenuBar menuBar;
	JMenu masters,booking,testPerform,printing,transaction,labReports,settings,utilities,window,help;
	JMenuItem menuItemReg;
	JInternalFrame record;
	
	JToolBar tools;
	JButton calc1,calc2,calc3;
	JTextField patientId,hh,mm,labNo,name,age,mons,days,referredBy,blank,sampleBy,panelCode,panelId,email,totalLess,lestAmt,concession,homeColection,taxAmt,netAmt,balance,hc,pd,rn,functions;
	JComboBox cName,cSex,cDate,cPayType;
	
	
	
	public Ventana() {
		
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1095,700);
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
		record.setSize(1080, 636);
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
		metodoMagico(referredBy, panel1, 78, 83, 76, 18);
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
		
		String dateOpc[]= {"2/01/2012"};
		String nameOpc[]= {"MR.","MRS."};
		String sexOpc[]= {"MALE","FEMALE","OTHER"};
		
		cDate=new JComboBox(dateOpc);
		metodoMagico(cDate, panel1, 247, 5, 81, 18);
		cName=new JComboBox(nameOpc);
		metodoMagico(cName, panel1, 77, 30, 48, 18);
		cSex=new JComboBox(sexOpc);
		metodoMagico(cSex, panel1, 77, 56, 48, 18);
		
		record.add(panel1);
		//panel1 end
		
		//panel2 start
		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBackground(Color.WHITE);
		panel2.setBounds(1, 236, 656, 271);
		
		
			//tabla
		String atribs[]={"Test ID", "Test Name","Rate","Disc %","Discount\nAmount","Tax(%)","Tax Amt"};
		String values [][] = new String[1][7];
		
		DefaultTableModel mod = new DefaultTableModel();
		mod=new DefaultTableModel(values,atribs);
		JTable table=new JTable();
		table=new JTable(mod);
		JTableHeader header = table.getTableHeader();
		metodoMagico(header,panel2,0,236,551,42);
		metodoMagico(table,panel2,0,276,551,17);
		record.add(header);
		record.add(table);
		
		record.add(panel2);
		//panel2 end
		
		//panel3 start
		JPanel panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBounds(657, 237, 414, 271);
		
		metodoMagico(new JLabel("Total less"),panel3,30,20,100,15);
		metodoMagico(new JLabel("Test Amt."),panel3,30,41,100,15);
		metodoMagico(new JLabel("Concession"),panel3,30,62,100,15);
		metodoMagico(new JLabel("Home Colection"),panel3,30,84,100,15);
		metodoMagico(new JLabel("Tax Amt"),panel3,30,105,100,15);
		metodoMagico(new JLabel("Net Amt"),panel3,30,126,100,15);
		metodoMagico(new JLabel("Balance"),panel3,30,147,100,15);
		
		totalLess=new JTextField();
		totalLess.setBackground(Color.BLUE);
		metodoMagico(totalLess,panel3,135, 20, 66, 14);
		lestAmt=new JTextField();
		lestAmt.setBackground(Color.BLUE);
		metodoMagico(lestAmt,panel3, 135, 41, 66, 14);
		concession=new JTextField();
		concession.setBackground(Color.BLUE);
		metodoMagico(concession,panel3, 135, 62, 66, 14);
		homeColection=new JTextField();
		homeColection.setBackground(Color.BLUE);
		metodoMagico(homeColection,panel3, 135, 84, 66, 14);
		taxAmt=new JTextField();
		taxAmt.setBackground(Color.BLUE);
		metodoMagico(taxAmt,panel3, 135, 105, 66, 14);
		netAmt=new JTextField();
		netAmt.setBackground(Color.BLUE);
		metodoMagico(netAmt,panel3, 135, 126, 66, 14);
		balance=new JTextField();
		balance.setBackground(Color.BLUE);
		metodoMagico(balance,panel3, 135, 147, 66, 14);
				
		record.add(panel3);
		//panel3 end
			
		
		//panel4 start
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.WHITE);
		panel4.setLayout(null);
		panel4.setBounds(1, 508, 1064, 96);
		
		metodoMagico(new JLabel("Home Collection"),panel4,8,11,100,15);
		metodoMagico(new JLabel("Paid"),panel4,160,11,100,15);
		metodoMagico(new JLabel("Pay Type"),panel4,264,11,100,15);
		metodoMagico(new JLabel("Receipt No."),panel4,400,11,100,15);
		
		hc=new JTextField("0");
		metodoMagico(hc,panel4,106, 11, 43, 18);
		pd=new JTextField("0");
		metodoMagico(pd,panel4,202, 11, 43, 18);
		pd=new JTextField("0");
		metodoMagico(pd,panel4,475, 11, 94, 18);
		
		String opcPayType[]= {"CASH","CARD"};
		cPayType= new JComboBox(opcPayType);
		metodoMagico(cPayType, panel4,324, 11, 62, 18);
		
		functions=new JTextField();
		functions.setBackground(Color.BLUE);
		metodoMagico(functions, panel4, 1, 51, 1063, 45);
		
		record.add(panel4);
		//panelt4 end
		
		
		
		
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
