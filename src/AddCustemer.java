import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AddCustemer extends JFrame {

	private JPanel contentPane;
	private JTextField nametext;
	private JTextField addrtext;
	private JTextField citytext;
	private JTextField mobiletext;
	private JTextField Idtext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCustemer frame = new AddCustemer();
					frame.setVisible(true);
					frame.setTitle("Navarant Automobile");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddCustemer() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 596, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add Customer Information");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(148, 11, 277, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Customer Name :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(73, 111, 127, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblCuntemerAddress = new JLabel("Customer Address :");
		lblCuntemerAddress.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCuntemerAddress.setBounds(73, 158, 127, 22);
		contentPane.add(lblCuntemerAddress);
		
		JLabel lblCity = new JLabel("Customer City :");
		lblCity.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCity.setBounds(73, 206, 127, 22);
		contentPane.add(lblCity);
		
		JLabel lblMobileNumber = new JLabel("Mobile Number :");
		lblMobileNumber.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMobileNumber.setBounds(73, 255, 127, 22);
		contentPane.add(lblMobileNumber);
		
		nametext = new JTextField();
		nametext.setBounds(240, 108, 291, 28);
		contentPane.add(nametext);
		nametext.setColumns(10);
		
		addrtext = new JTextField();
		addrtext.setColumns(10);
		addrtext.setBounds(240, 155, 291, 28);
		contentPane.add(addrtext);
		
		citytext = new JTextField();
		citytext.setColumns(10);
		citytext.setBounds(240, 203, 209, 28);
		contentPane.add(citytext);
		
		mobiletext = new JTextField();
		mobiletext.setColumns(10);
		mobiletext.setBounds(240, 253, 209, 28);
		contentPane.add(mobiletext);
		
		JButton savebtn = new JButton("Save");
		savebtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		savebtn.setBounds(172, 303, 112, 35);
		contentPane.add(savebtn);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCancel.setBounds(337, 303, 112, 35);
		contentPane.add(btnCancel);
		
		JLabel lblCustomerId = new JLabel("Customer Id :");
		lblCustomerId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCustomerId.setBounds(73, 63, 127, 22);
		contentPane.add(lblCustomerId);
		
		Idtext = new JTextField();
		Idtext.setColumns(10);
		Idtext.setBounds(240, 61, 162, 28);
		contentPane.add(Idtext);
	}
}
