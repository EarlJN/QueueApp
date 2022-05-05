import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MaxNum extends JFrame {

	private JPanel contentPane;
	private JFormattedTextField insertMaxNum;

	public MaxNum() {
		setTitle("Queueing App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextPane txtpnWindow_1_2_1_2_1 = new JTextPane();
		txtpnWindow_1_2_1_2_1.setText("     MAX QUEUEING NUMBER");
		txtpnWindow_1_2_1_2_1.setForeground(Color.WHITE);
		txtpnWindow_1_2_1_2_1.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 15));
		txtpnWindow_1_2_1_2_1.setEditable(false);
		txtpnWindow_1_2_1_2_1.setBackground(new Color(102, 102, 102));
		txtpnWindow_1_2_1_2_1.setBounds(100, 30, 234, 30);
		contentPane.add(txtpnWindow_1_2_1_2_1);

		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String input = insertMaxNum.getText();

				if (input.isBlank()) {
					JFrame warn = new JFrame("WARNING");
					warn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

					JOptionPane.showMessageDialog(warn, "The max queueing number is empty!", "WARNING",
							JOptionPane.WARNING_MESSAGE);
				} else {
					int desNum = Integer.parseInt(input);

					QueueApp qApp = new QueueApp(desNum);

					qApp.show();
					dispose();

				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(100, 250, 89, 35);
		contentPane.add(btnNewButton);

		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogInApp lApp = new LogInApp();
				lApp.show();
				dispose();

			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLogout.setBounds(245, 250, 89, 35);
		contentPane.add(btnLogout);

		insertMaxNum = new JFormattedTextField();
		insertMaxNum.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();

				if (!Character.isDigit(c)) {
					e.consume();
				}
			}
		});
		insertMaxNum.setFont(new Font("Lucida Console", Font.PLAIN, 99));
		insertMaxNum.setBackground(new Color(0, 255, 255));
		insertMaxNum.setHorizontalAlignment(SwingConstants.CENTER);
		insertMaxNum.setBounds(100, 71, 234, 168);
		contentPane.add(insertMaxNum);
	}
}
