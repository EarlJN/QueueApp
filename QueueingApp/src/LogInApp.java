import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import javax.swing.JCheckBox;

public class LogInApp extends JFrame {

	private JPanel contentPane;
	private JTextField textUser;
	private JPasswordField textPass;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInApp frame = new LogInApp();
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
	public LogInApp() {
		setResizable(false);
		setTitle("Queueing App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnLogin = new JButton("LOG-IN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String username = textUser.getText();
				String password = textPass.getText();

				if (username.equals("Admin") && password.equals("admin")) {
					MaxNum mApp = new MaxNum();
					mApp.show();
					dispose();

				} else {

					JFrame frame = new JFrame("WARNING");
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

					JOptionPane.showMessageDialog(frame, "The username or password is incorrect.", "WARNING",
							JOptionPane.WARNING_MESSAGE);

				}

			}
		});
		btnLogin.setFont(new Font("Lucida Console", Font.PLAIN, 11));
		btnLogin.setBounds(85, 250, 95, 25);
		contentPane.add(btnLogin);

		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setFont(new Font("Lucida Console", Font.PLAIN, 11));
		btnCancel.setBounds(255, 250, 95, 25);
		contentPane.add(btnCancel);

		textUser = new JTextField();
		textUser.setFont(new Font("Lucida Console", Font.PLAIN, 11));
		textUser.setBounds(85, 125, 265, 20);
		contentPane.add(textUser);
		textUser.setColumns(10);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBackground(new Color(0, 255, 255));
		panel.setBounds(85, 50, 265, 36);
		contentPane.add(panel);

		JLabel titleLabel = new JLabel("Queueing App Log-In");
		titleLabel.setForeground(Color.BLACK);
		titleLabel.setBackground(Color.WHITE);
		titleLabel.setFont(new Font("Lucida Console", Font.BOLD, 20));
		panel.add(titleLabel);

		JTextPane userLabel = new JTextPane();
		userLabel.setText("USERNAME");
		userLabel.setForeground(Color.WHITE);
		userLabel.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 12));
		userLabel.setEditable(false);
		userLabel.setBackground(new Color(102, 102, 102));
		userLabel.setBounds(85, 97, 73, 28);
		contentPane.add(userLabel);

		JTextPane passLabel = new JTextPane();
		passLabel.setText("PASSWORD\r\n");
		passLabel.setForeground(Color.WHITE);
		passLabel.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 12));
		passLabel.setEditable(false);
		passLabel.setBackground(new Color(102, 102, 102));
		passLabel.setBounds(85, 160, 73, 28);
		contentPane.add(passLabel);

		JCheckBox showPass = new JCheckBox("Show Password");
		showPass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (showPass.isSelected()) {

					textPass.setEchoChar((char) 0);
				} else {

					textPass.setEchoChar('*');
				}

			}
		});
		showPass.setForeground(new Color(255, 255, 255));
		showPass.setBackground(new Color(51, 51, 51));
		showPass.setFont(new Font("Lucida Console", Font.PLAIN, 9));
		showPass.setBounds(85, 215, 91, 21);
		contentPane.add(showPass);

		textPass = new JPasswordField();
		textPass.setBounds(85, 188, 265, 20);
		contentPane.add(textPass);
	}
}
