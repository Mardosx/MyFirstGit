import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Front extends JFrame {

	private JPanel contentPane;
	private JTextField txt_inout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Front frame = new Front();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Front() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_plus5 = new JButton("+ 5");
		btn_plus5.setBounds(34, 199, 89, 23);
		contentPane.add(btn_plus5);
		
		JButton btn_plus10 = new JButton("+ 10");
		btn_plus10.setBounds(278, 199, 89, 23);
		contentPane.add(btn_plus10);
		
		txt_inout = new JTextField();
		txt_inout.setBounds(34, 66, 333, 20);
		contentPane.add(txt_inout);
		txt_inout.setColumns(10);
	}
}
