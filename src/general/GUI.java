package general;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import tools.Query;

import javax.swing.JLabel;
import java.awt.Font;

public class GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblColumnNames = new JLabel("Column Names:");
		lblColumnNames.setBounds(16, 22, 108, 16);
		contentPane.add(lblColumnNames);
		
		JLabel columnNames = new JLabel(Query.columnList());
		columnNames.setFont(new Font("Lucida Bright", Font.PLAIN, 12));
		columnNames.setBounds(125, 22, 295, 16);
		contentPane.add(columnNames);
	}
}
