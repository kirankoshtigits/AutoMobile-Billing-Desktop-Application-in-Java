import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class RemoveCustomer extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoveCustomer frame = new RemoveCustomer();
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
	public RemoveCustomer() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 495, 316);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Remove Customer In The List");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(97, 34, 297, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Customer Id :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(97, 111, 125, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(232, 105, 162, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton rmvbtn = new JButton("Remove");
		rmvbtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		rmvbtn.setBounds(108, 187, 112, 35);
		contentPane.add(rmvbtn);
		
		JButton cnlbtn = new JButton("Cancel");
		cnlbtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		cnlbtn.setBounds(265, 187, 112, 35);
		contentPane.add(cnlbtn);
	}

}
