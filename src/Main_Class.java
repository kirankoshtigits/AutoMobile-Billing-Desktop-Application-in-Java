import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class Main_Class {

	private JFrame frame;
	private JTextField usertext;
	private JTextField passtext;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Class window = new Main_Class();
					window.frame.setVisible(true);
					window.frame.setTitle("Navaratn Automobile");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main_Class() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 620, 422);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNavaratnAutomobile = new JLabel("Navaratn Automobile ");
		lblNavaratnAutomobile.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNavaratnAutomobile.setHorizontalAlignment(SwingConstants.CENTER);
		lblNavaratnAutomobile.setBounds(203, 23, 206, 23);
		frame.getContentPane().add(lblNavaratnAutomobile);
		
		JLabel label = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/images.jpg")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(10, 68, 238, 227);
		frame.getContentPane().add(label);
		
		
		JLabel lblNewLabel = new JLabel("Username :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(295, 123, 85, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(295, 187, 79, 23);
		frame.getContentPane().add(lblPassword);
		
		usertext = new JTextField();
		usertext.setBounds(390, 122, 181, 29);
		frame.getContentPane().add(usertext);
		usertext.setColumns(10);
		
		passtext = new JTextField();
		passtext.setColumns(10);
		passtext.setBounds(390, 186, 181, 29);
		frame.getContentPane().add(passtext);
		
		JButton loginbtn = new JButton("Login");
		loginbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String JDBC_DRIVER="com.mysql.jdbc.Driver";
				String DB_URL="jdbc:mysql://localhost/navaratn";
				String DB_USER="root";
				String DB_Pass="";
				Connection conn=null;
				
				try
				{
					Class.forName(JDBC_DRIVER);
					conn = DriverManager.getConnection(DB_URL,DB_USER,DB_Pass);
					
					String query="select * from admin where Userid=? and Password=? ";
					PreparedStatement stm=conn.prepareStatement(query);
					stm.setString(1,usertext.getText());
					stm.setString(2,passtext.getText());
					ResultSet rs=stm.executeQuery();
					int count=0;
					while(rs.next())
					{
						count=count+1;
					}
						if(count==1)
						{
							JOptionPane.showMessageDialog(null,"Login is Successfully");
							Main_Billing bill=new Main_Billing();
							bill.setVisible(true);
						}
						else if(usertext.getText().equals("")) 
						{
							JOptionPane.showMessageDialog(null,"Please Enter Username And Password");
					    }
						else
						{
							JOptionPane.showMessageDialog(null,"UserName And Password is Incorrect");
						}
				rs.close();
				stm.close();
				}
				catch(Exception e1) 
				{
					System.out.println("Error...Connection is faild:"+e1);
				}
			}
		});
		loginbtn.setFont(new Font("Tahoma", Font.BOLD, 18));
		loginbtn.setBounds(371, 260, 129, 35);
		frame.getContentPane().add(loginbtn);
	}
}
