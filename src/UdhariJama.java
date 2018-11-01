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

public class UdhariJama extends JFrame {

	private JPanel contentPane;
	private JTextField Idiext;
	private JTextField nametext;
	private JTextField numbertext;
	private JTextField rsjamatext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UdhariJama frame = new UdhariJama();
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
	public UdhariJama() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 584, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Customer Udhari Jama");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(140, 32, 276, 23);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("Customer Id :");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(70, 103, 127, 22);
		contentPane.add(label);
		
		JLabel lblCustomerName = new JLabel("Customer Name :");
		lblCustomerName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCustomerName.setBounds(70, 146, 127, 22);
		contentPane.add(lblCustomerName);
		
		JLabel lblMobileNumber = new JLabel("Mobile Number :");
		lblMobileNumber.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMobileNumber.setBounds(70, 191, 127, 22);
		contentPane.add(lblMobileNumber);
		
		Idiext = new JTextField();
		Idiext.setColumns(10);
		Idiext.setBounds(237, 105, 162, 28);
		contentPane.add(Idiext);
		
		nametext = new JTextField();
		nametext.setColumns(10);
		nametext.setBounds(237, 148, 276, 28);
		contentPane.add(nametext);
		
		numbertext = new JTextField();
		numbertext.setColumns(10);
		numbertext.setBounds(237, 193, 179, 28);
		contentPane.add(numbertext);
		
		JButton btnJama = new JButton("Jama");
		btnJama.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnJama.setBounds(97, 296, 112, 35);
		contentPane.add(btnJama);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCancel.setBounds(304, 296, 112, 35);
		contentPane.add(btnCancel);
		
		JLabel lblRupees = new JLabel("Rupees :");
		lblRupees.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRupees.setBounds(70, 242, 127, 22);
		contentPane.add(lblRupees);
		
		rsjamatext = new JTextField();
		rsjamatext.setColumns(10);
		rsjamatext.setBounds(237, 240, 162, 28);
		contentPane.add(rsjamatext);
	}

}
