import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import java.awt.Label;
import javax.swing.JTextArea;

public class ClientView extends JFrame {

	private JPanel contentPane;
	public Label viewWin1;
	public Label viewWin2;
	public Label viewWin3;
	public Label viewWin4;
	public Label labelCurCustomer;
	public Label labelToWindow;

	public ClientView() {
		setResizable(false);
		setTitle("Queueing App Client View");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 102, 102));
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		viewWin1 = new Label("0");
		viewWin1.setAlignment(Label.CENTER);
		viewWin1.setForeground(new Color(51, 51, 51));
		viewWin1.setBounds(25, 160, 90, 100);
		viewWin1.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 50));
		viewWin1.setBackground(new Color(0, 255, 255));
		contentPane.add(viewWin1);

		viewWin2 = new Label("0");
		viewWin2.setForeground(new Color(51, 51, 51));
		viewWin2.setBounds(125, 160, 90, 100);
		viewWin2.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 50));
		viewWin2.setBackground(new Color(0, 255, 255));
		viewWin2.setAlignment(Label.CENTER);
		contentPane.add(viewWin2);

		viewWin3 = new Label("0");
		viewWin3.setForeground(new Color(51, 51, 51));
		viewWin3.setBounds(225, 160, 90, 100);
		viewWin3.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 50));
		viewWin3.setBackground(new Color(0, 255, 255));
		viewWin3.setAlignment(Label.CENTER);
		contentPane.add(viewWin3);

		viewWin4 = new Label("0");
		viewWin4.setForeground(new Color(51, 51, 51));
		viewWin4.setBounds(325, 160, 90, 100);
		viewWin4.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 50));
		viewWin4.setBackground(new Color(0, 255, 255));
		viewWin4.setAlignment(Label.CENTER);
		contentPane.add(viewWin4);

		JTextPane txtViewWindow1 = new JTextPane();
		txtViewWindow1.setBackground(new Color(102, 102, 102));
		txtViewWindow1.setForeground(new Color(255, 255, 255));
		txtViewWindow1.setBounds(25, 130, 90, 30);
		txtViewWindow1.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 15));
		txtViewWindow1.setEditable(false);
		txtViewWindow1.setText("WINDOW 1");
		contentPane.add(txtViewWindow1);

		JTextPane txtViewWindow2 = new JTextPane();
		txtViewWindow2.setBackground(new Color(102, 102, 102));
		txtViewWindow2.setForeground(new Color(255, 255, 255));
		txtViewWindow2.setBounds(125, 130, 90, 30);
		txtViewWindow2.setText("WINDOW 2");
		txtViewWindow2.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 15));
		txtViewWindow2.setEditable(false);
		contentPane.add(txtViewWindow2);

		JTextPane txtViewWindow3 = new JTextPane();
		txtViewWindow3.setBackground(new Color(102, 102, 102));
		txtViewWindow3.setForeground(new Color(255, 255, 255));
		txtViewWindow3.setBounds(225, 130, 90, 30);
		txtViewWindow3.setText("WINDOW 3");
		txtViewWindow3.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 15));
		txtViewWindow3.setEditable(false);
		contentPane.add(txtViewWindow3);

		JTextPane txtViewWindow4 = new JTextPane();
		txtViewWindow4.setBackground(new Color(102, 102, 102));
		txtViewWindow4.setForeground(new Color(255, 255, 255));
		txtViewWindow4.setBounds(325, 130, 90, 30);
		txtViewWindow4.setText("WINDOW 4");
		txtViewWindow4.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 15));
		contentPane.add(txtViewWindow4);

		labelCurCustomer = new Label("X");
		labelCurCustomer.setForeground(new Color(51, 51, 51));
		labelCurCustomer.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 50));
		labelCurCustomer.setBackground(Color.CYAN);
		labelCurCustomer.setAlignment(Label.CENTER);
		labelCurCustomer.setBounds(25, 26, 117, 50);
		contentPane.add(labelCurCustomer);

		labelToWindow = new Label("X");
		labelToWindow.setForeground(new Color(51, 51, 51));
		labelToWindow.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 50));
		labelToWindow.setBackground(new Color(0, 255, 255));
		labelToWindow.setAlignment(Label.CENTER);
		labelToWindow.setBounds(298, 26, 117, 50);
		contentPane.add(labelToWindow);

		JTextPane txtCurCustomer = new JTextPane();
		txtCurCustomer.setText(" CUSTOMER #");
		txtCurCustomer.setForeground(Color.WHITE);
		txtCurCustomer.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 15));
		txtCurCustomer.setEditable(false);
		txtCurCustomer.setBackground(new Color(102, 102, 102));
		txtCurCustomer.setBounds(25, 80, 117, 25);
		contentPane.add(txtCurCustomer);

		JTextPane txtToWindow = new JTextPane();
		txtToWindow.setForeground(new Color(255, 255, 255));
		txtToWindow.setBackground(new Color(102, 102, 102));
		txtToWindow.setEditable(false);
		txtToWindow.setText(" WINDOW NO.");
		txtToWindow.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 15));
		txtToWindow.setBounds(298, 80, 117, 25);
		contentPane.add(txtToWindow);

		JTextArea txtrPleaseProceedTo = new JTextArea();
		txtrPleaseProceedTo.setFont(new Font("Lucida Fax", Font.BOLD, 14));
		txtrPleaseProceedTo.setForeground(new Color(255, 255, 255));
		txtrPleaseProceedTo.setBackground(new Color(102, 102, 102));
		txtrPleaseProceedTo.setText("PROCEED TO");
		txtrPleaseProceedTo.setBounds(171, 55, 101, 22);
		contentPane.add(txtrPleaseProceedTo);

	}
}
