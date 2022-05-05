import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import java.awt.Label;

public class QueueApp extends JFrame {

	private JPanel contentPane;
	private Label labelCurrentNum;
	private Label labelWin1;
	private Label labelWin2;
	private Label labelWin3;
	private Label labelWin4;
	private int curNum = 1;
	private int curNumDis = 1;

	public QueueApp(int desNum) {

		setResizable(false);
		setTitle("Queueing App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 102, 102));
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		ClientView cView = new ClientView();
		cView.show();

		String sDesNum = String.valueOf(desNum);

		JButton btnWindow1 = new JButton("Window 1");
		btnWindow1.setBounds(25, 250, 90, 30);
		btnWindow1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (curNumDis < desNum) {
					curNumDis += 1;
					labelCurrentNum.setText(String.valueOf(curNumDis));

				} else {
					labelCurrentNum.setText(String.valueOf("X"));
				}

				if (curNum < desNum + 1) {
					cView.labelToWindow.setText("1");
					cView.labelCurCustomer.setText(String.valueOf(curNum));
					cView.viewWin1.setText(String.valueOf(curNum));
					labelWin1.setText(String.valueOf(curNum));
					curNum += 1;

				} else {

					JFrame frame = new JFrame("WARNING");
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

					JOptionPane.showMessageDialog(frame,
							"You have reached the max queueing number. Reset or change the value.", "WARNING",
							JOptionPane.WARNING_MESSAGE);

				}

			}
		});
		contentPane.setLayout(null);
		btnWindow1.setFont(new Font("Lucida Console", Font.PLAIN, 11));
		contentPane.add(btnWindow1);

		JButton btnWindow4 = new JButton("Window 4");
		btnWindow4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (curNumDis < desNum) {
					curNumDis += 1;
					labelCurrentNum.setText(String.valueOf(curNumDis));

				} else {
					labelCurrentNum.setText(String.valueOf("X"));
				}

				if (curNum < desNum + 1) {
					cView.labelToWindow.setText("4");
					cView.labelCurCustomer.setText(String.valueOf(curNum));
					cView.viewWin4.setText(String.valueOf(curNum));
					labelWin4.setText(String.valueOf(curNum));
					curNum += 1;

				} else {

					JFrame frame = new JFrame("WARNING");
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

					JOptionPane.showMessageDialog(frame,
							"You have reached the max queueing number. Reset or change the value.", "WARNING",
							JOptionPane.WARNING_MESSAGE);

				}
			}

		});
		btnWindow4.setBounds(325, 250, 90, 30);
		btnWindow4.setFont(new Font("Lucida Console", Font.PLAIN, 11));
		contentPane.add(btnWindow4);

		JButton btnWindow3 = new JButton("Window 3");
		btnWindow3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (curNumDis < desNum) {
					curNumDis += 1;
					labelCurrentNum.setText(String.valueOf(curNumDis));
				} else {
					labelCurrentNum.setText(String.valueOf("X"));
				}

				if (curNum < desNum + 1) {
					cView.labelToWindow.setText("3");
					cView.labelCurCustomer.setText(String.valueOf(curNum));
					cView.viewWin3.setText(String.valueOf(curNum));
					labelWin3.setText(String.valueOf(curNum));
					curNum += 1;

				} else {

					JFrame frame = new JFrame("WARNING");
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

					JOptionPane.showMessageDialog(frame,
							"You have reached the max queueing number. Reset or change the value.", "WARNING",
							JOptionPane.WARNING_MESSAGE);

				}
			}
		});
		btnWindow3.setBounds(225, 250, 90, 30);
		btnWindow3.setFont(new Font("Lucida Console", Font.PLAIN, 11));
		contentPane.add(btnWindow3);

		JButton btnWindow2 = new JButton("Window 2");
		btnWindow2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (curNumDis < desNum) {
					curNumDis += 1;
					labelCurrentNum.setText(String.valueOf(curNumDis));
				} else {
					labelCurrentNum.setText(String.valueOf("X"));
				}

				if (curNum < desNum + 1) {
					cView.labelToWindow.setText("2");
					cView.labelCurCustomer.setText(String.valueOf(curNum));
					cView.viewWin2.setText(String.valueOf(curNum));
					labelWin2.setText(String.valueOf(curNum));
					curNum += 1;

				} else {

					JFrame frame = new JFrame("WARNING");
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

					JOptionPane.showMessageDialog(frame,
							"You have reached the max queueing number. Reset or change the value.", "WARNING",
							JOptionPane.WARNING_MESSAGE);

				}
			}
		});
		btnWindow2.setBounds(125, 250, 90, 30);
		btnWindow2.setFont(new Font("Lucida Console", Font.PLAIN, 11));
		contentPane.add(btnWindow2);

		labelWin1 = new Label("0");
		labelWin1.setAlignment(Label.CENTER);
		labelWin1.setForeground(new Color(51, 51, 51));
		labelWin1.setBounds(25, 130, 90, 100);
		labelWin1.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 50));
		labelWin1.setBackground(new Color(0, 255, 255));
		contentPane.add(labelWin1);

		labelWin2 = new Label("0");
		labelWin2.setForeground(new Color(51, 51, 51));
		labelWin2.setBounds(125, 130, 90, 100);
		labelWin2.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 50));
		labelWin2.setBackground(new Color(0, 255, 255));
		labelWin2.setAlignment(Label.CENTER);
		contentPane.add(labelWin2);

		labelWin3 = new Label("0");
		labelWin3.setForeground(new Color(51, 51, 51));
		labelWin3.setBounds(225, 130, 90, 100);
		labelWin3.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 50));
		labelWin3.setBackground(new Color(0, 255, 255));
		labelWin3.setAlignment(Label.CENTER);
		contentPane.add(labelWin3);

		labelWin4 = new Label("0");
		labelWin4.setForeground(new Color(51, 51, 51));
		labelWin4.setBounds(325, 130, 90, 100);
		labelWin4.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 50));
		labelWin4.setBackground(new Color(0, 255, 255));
		labelWin4.setAlignment(Label.CENTER);
		contentPane.add(labelWin4);

		JTextPane txtWindow1 = new JTextPane();
		txtWindow1.setBackground(new Color(102, 102, 102));
		txtWindow1.setForeground(new Color(255, 255, 255));
		txtWindow1.setBounds(25, 100, 90, 30);
		txtWindow1.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 15));
		txtWindow1.setEditable(false);
		txtWindow1.setText("WINDOW 1");
		contentPane.add(txtWindow1);

		JTextPane txtWindow2 = new JTextPane();
		txtWindow2.setBackground(new Color(102, 102, 102));
		txtWindow2.setForeground(new Color(255, 255, 255));
		txtWindow2.setBounds(125, 100, 90, 30);
		txtWindow2.setText("WINDOW 2");
		txtWindow2.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 15));
		txtWindow2.setEditable(false);
		contentPane.add(txtWindow2);

		JTextPane txtWindow3 = new JTextPane();
		txtWindow3.setBackground(new Color(102, 102, 102));
		txtWindow3.setForeground(new Color(255, 255, 255));
		txtWindow3.setBounds(225, 100, 90, 30);
		txtWindow3.setText("WINDOW 3");
		txtWindow3.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 15));
		txtWindow3.setEditable(false);
		contentPane.add(txtWindow3);

		JTextPane txtWindow4 = new JTextPane();
		txtWindow4.setBackground(new Color(102, 102, 102));
		txtWindow4.setForeground(new Color(255, 255, 255));
		txtWindow4.setBounds(325, 100, 90, 30);
		txtWindow4.setText("WINDOW 4");
		txtWindow4.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 15));
		contentPane.add(txtWindow4);

		JTextPane txtNextNum = new JTextPane();
		txtNextNum.setForeground(new Color(255, 255, 255));
		txtNextNum.setBackground(new Color(102, 102, 102));
		txtNextNum.setEditable(false);
		txtNextNum.setText("NEXT NUMBER");
		txtNextNum.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 15));
		txtNextNum.setBounds(298, 64, 117, 25);
		contentPane.add(txtNextNum);

		labelCurrentNum = new Label("1");
		labelCurrentNum.setForeground(new Color(51, 51, 51));
		labelCurrentNum.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 50));
		labelCurrentNum.setBackground(new Color(0, 255, 255));
		labelCurrentNum.setAlignment(Label.CENTER);
		labelCurrentNum.setBounds(298, 10, 117, 50);
		contentPane.add(labelCurrentNum);

		JTextPane txtMaxNum = new JTextPane();
		txtMaxNum.setText(" MAX NUMBER");
		txtMaxNum.setForeground(Color.WHITE);
		txtMaxNum.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 15));
		txtMaxNum.setEditable(false);
		txtMaxNum.setBackground(new Color(102, 102, 102));
		txtMaxNum.setBounds(25, 64, 117, 25);
		contentPane.add(txtMaxNum);

		Label labelMaxNum = new Label(sDesNum);
		labelMaxNum.setForeground(new Color(51, 51, 51));
		labelMaxNum.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 50));
		labelMaxNum.setBackground(Color.CYAN);
		labelMaxNum.setAlignment(Label.CENTER);
		labelMaxNum.setBounds(25, 10, 117, 50);
		contentPane.add(labelMaxNum);

		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				curNum = 1;
				curNumDis = 1;
				labelWin1.setText("0");
				labelWin2.setText("0");
				labelWin3.setText("0");
				labelWin4.setText("0");
				cView.labelToWindow.setText("X");
				cView.labelCurCustomer.setText("X");
				cView.viewWin1.setText("0");
				cView.viewWin2.setText("0");
				cView.viewWin3.setText("0");
				cView.viewWin4.setText("0");
				labelCurrentNum.setText(String.valueOf(curNum));

			}
		});
		btnReset.setFont(new Font("Lucida Console", Font.PLAIN, 11));
		btnReset.setBounds(184, 55, 69, 23);
		contentPane.add(btnReset);

		JButton btnChange = new JButton("CHANGE");
		btnChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				cView.dispose();
				MaxNum mApp = new MaxNum();
				mApp.show();
				dispose();

			}
		});
		btnChange.setFont(new Font("Lucida Console", Font.PLAIN, 9));
		btnChange.setBounds(184, 20, 69, 23);
		contentPane.add(btnChange);

	}
}
