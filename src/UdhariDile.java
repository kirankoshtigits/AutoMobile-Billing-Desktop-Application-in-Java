import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class UdhariDile extends JFrame {

	private JPanel contentPane;
	private JTextField idtext;
	private JTextField nametext;
	private JTextField citytext;
	private JTextField numbertext;
	private JTextField maltext;
	private JTextField rsdiletext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UdhariDile frame = new UdhariDile();
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
	public UdhariDile() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 642, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Customar La Udhari Dile");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(125, 30, 255, 29);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("Customer Id :");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(65, 92, 127, 22);
		contentPane.add(label);
		
		JLabel lblCustomerName = new JLabel("Customer Name :");
		lblCustomerName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCustomerName.setBounds(65, 138, 127, 22);
		contentPane.add(lblCustomerName);
		
		JLabel lblCustomerCity = new JLabel("Customer City :");
		lblCustomerCity.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCustomerCity.setBounds(65, 184, 127, 22);
		contentPane.add(lblCustomerCity);
		
		JLabel lblMobileNumber = new JLabel("Mobile Number :");
		lblMobileNumber.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMobileNumber.setBounds(65, 229, 127, 22);
		contentPane.add(lblMobileNumber);
		
		idtext = new JTextField();
		idtext.setColumns(10);
		idtext.setBounds(240, 90, 162, 28);
		contentPane.add(idtext);
		
		nametext = new JTextField();
		nametext.setColumns(10);
		nametext.setBounds(240, 136, 278, 28);
		contentPane.add(nametext);
		
		citytext = new JTextField();
		citytext.setColumns(10);
		citytext.setBounds(240, 182, 183, 28);
		contentPane.add(citytext);
		
		numbertext = new JTextField();
		numbertext.setColumns(10);
		numbertext.setBounds(240, 227, 183, 28);
		contentPane.add(numbertext);
		
		JButton dilebtn = new JButton("Save");
		dilebtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		dilebtn.setBounds(151, 377, 112, 35);
		contentPane.add(dilebtn);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCancel.setBounds(340, 377, 112, 35);
		contentPane.add(btnCancel);
		
		JLabel lblDileleghataleleMal = new JLabel("Dilele/Ghatalele Mal :");
		lblDileleghataleleMal.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDileleghataleleMal.setBounds(65, 277, 141, 22);
		contentPane.add(lblDileleghataleleMal);
		
		maltext = new JTextField();
		maltext.setColumns(10);
		maltext.setBounds(240, 275, 316, 28);
		contentPane.add(maltext);
		
		JLabel lblRupees = new JLabel("Rupees :");
		lblRupees.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRupees.setBounds(65, 324, 141, 22);
		contentPane.add(lblRupees);
		
		rsdiletext = new JTextField();
		rsdiletext.setColumns(10);
		rsdiletext.setBounds(240, 322, 183, 28);
		contentPane.add(rsdiletext);
	}

}
