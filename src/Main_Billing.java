import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main_Billing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Billing frame = new Main_Billing();
					frame.setVisible(true);
					frame.setTitle("Navaratn Automobile");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main_Billing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 323);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNavaratnAutomobile = new JLabel("Navaratn Automobile ");
		lblNavaratnAutomobile.setHorizontalAlignment(SwingConstants.CENTER);
		lblNavaratnAutomobile.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNavaratnAutomobile.setBounds(164, 11, 177, 23);
		contentPane.add(lblNavaratnAutomobile);
		
		JButton add_btn = new JButton("Add Customer");
		add_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AddCustemer add=new AddCustemer();
				add.setVisible(true);
			}
		});
		add_btn.setFont(new Font("Tahoma", Font.BOLD, 10));
		add_btn.setBounds(22, 73, 131, 30);
		contentPane.add(add_btn);
		
		JButton remove_btn = new JButton("Remove Customer");
		remove_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RemoveCustomer remove=new RemoveCustomer();
				remove.setVisible(true);
			}
		});
		remove_btn.setFont(new Font("Tahoma", Font.BOLD, 10));
		remove_btn.setBounds(185, 73, 131, 30);
		contentPane.add(remove_btn);
		
		JButton list_btn = new JButton("Customer List");
		list_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerList list=new CustomerList();
				list.setVisible(true);
			}
		});
		list_btn.setFont(new Font("Tahoma", Font.BOLD, 10));
		list_btn.setBounds(342, 73, 131, 30);
		contentPane.add(list_btn);
		
		JButton udhari_list_btn = new JButton("Udhari List");
		udhari_list_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UdhariBill udhar=new UdhariBill();
				udhar.setVisible(true);
			}
		});
		udhari_list_btn.setFont(new Font("Tahoma", Font.BOLD, 10));
		udhari_list_btn.setBounds(22, 156, 131, 30);
		contentPane.add(udhari_list_btn);
		
		JButton udhar_dile_btn = new JButton("Udhari Mal Dile");
		udhar_dile_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UdhariDile udhar=new UdhariDile();
				udhar.setVisible(true);
			}
		});
		udhar_dile_btn.setFont(new Font("Tahoma", Font.BOLD, 10));
		udhar_dile_btn.setBounds(185, 156, 131, 30);
		contentPane.add(udhar_dile_btn);
		
		JButton Udhari_jama_btn = new JButton("Udhari Jama");
		Udhari_jama_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UdhariJama udhar=new UdhariJama();
				udhar.setVisible(true);
			}
		});
		Udhari_jama_btn.setFont(new Font("Tahoma", Font.BOLD, 10));
		Udhari_jama_btn.setBounds(342, 156, 131, 30);
		contentPane.add(Udhari_jama_btn);
	}
}
