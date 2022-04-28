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
	
	

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
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
		
		String sDesNum = String.valueOf(desNum);
		

		
		
		
	
		
		JButton btnWindow1 = new JButton("Window 1");
		btnWindow1.setBounds(25, 250, 90, 30);
		btnWindow1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(curNumDis < desNum) {
					curNumDis += 1;
					labelCurrentNum.setText(String.valueOf(curNumDis));
				} else {
					labelCurrentNum.setText(String.valueOf("X"));
				}
				
				if(curNum < desNum + 1) {
					
					labelWin1.setText(String.valueOf(curNum));
					curNum += 1;

					
				} else {
				
					JFrame frame = new JFrame("WARNING");
				    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

					
					JOptionPane.showMessageDialog(frame, "You have reached the max queueing number. Reset or change the value.",
				               "WARNING", JOptionPane.WARNING_MESSAGE);

				}
				
	
				
			}
		});
		contentPane.setLayout(null);
		btnWindow1.setFont(new Font("Lucida Console", Font.PLAIN, 11));
		contentPane.add(btnWindow1);
		
		JButton btnWindow4 = new JButton("Window 4");
		btnWindow4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(curNumDis < desNum) {
					curNumDis += 1;
					labelCurrentNum.setText(String.valueOf(curNumDis));
				} else {
					labelCurrentNum.setText(String.valueOf("X"));
				}
				
				if(curNum < desNum + 1) {
					
					labelWin4.setText(String.valueOf(curNum));
					curNum += 1;

					
				} else {
				
					JFrame frame = new JFrame("WARNING");
				    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

					
					JOptionPane.showMessageDialog(frame, "You have reached the max queueing number. Reset or change the value.",
				               "WARNING", JOptionPane.WARNING_MESSAGE);

				}
			}
			
		});
		btnWindow4.setBounds(325, 250, 90, 30);
		btnWindow4.setFont(new Font("Lucida Console", Font.PLAIN, 11));
		contentPane.add(btnWindow4);
		
		JButton btnWindow3 = new JButton("Window 3");
		btnWindow3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(curNumDis < desNum) {
					curNumDis += 1;
					labelCurrentNum.setText(String.valueOf(curNumDis));
				} else {
					labelCurrentNum.setText(String.valueOf("X"));
				}
				
				if(curNum < desNum + 1) {
					
					labelWin3.setText(String.valueOf(curNum));
					curNum += 1;

					
				} else {
					
					JFrame frame = new JFrame("WARNING");
				    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

					
					JOptionPane.showMessageDialog(frame, "You have reached the max queueing number. Reset or change the value.",
				               "WARNING", JOptionPane.WARNING_MESSAGE);
		
				}
			}
		});
		btnWindow3.setBounds(225, 250, 90, 30);
		btnWindow3.setFont(new Font("Lucida Console", Font.PLAIN, 11));
		contentPane.add(btnWindow3);
		
		JButton btnWindow2 = new JButton("Window 2");
		btnWindow2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(curNumDis < desNum) {
					curNumDis += 1;
					labelCurrentNum.setText(String.valueOf(curNumDis));
				} else {
					labelCurrentNum.setText(String.valueOf("X"));
				}
				
				if(curNum < desNum + 1) {
					
					labelWin2.setText(String.valueOf(curNum));
					curNum += 1;

					
				} else {
					
					JFrame frame = new JFrame("WARNING");
				    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

					
					JOptionPane.showMessageDialog(frame, "You have reached the max queueing number. Reset or change the value.",
				               "WARNING", JOptionPane.WARNING_MESSAGE);
					
		
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
		
		JTextPane txtpnWindow = new JTextPane();
		txtpnWindow.setBackground(new Color(102, 102, 102));
		txtpnWindow.setForeground(new Color(255, 255, 255));
		txtpnWindow.setBounds(25, 100, 90, 30);
		txtpnWindow.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 15));
		txtpnWindow.setEditable(false);
		txtpnWindow.setText("WINDOW 1");
		contentPane.add(txtpnWindow);
		
		JTextPane txtpnWindow_2 = new JTextPane();
		txtpnWindow_2.setBackground(new Color(102, 102, 102));
		txtpnWindow_2.setForeground(new Color(255, 255, 255));
		txtpnWindow_2.setBounds(125, 100, 90, 30);
		txtpnWindow_2.setText("WINDOW 2");
		txtpnWindow_2.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 15));
		txtpnWindow_2.setEditable(false);
		contentPane.add(txtpnWindow_2);
		
		JTextPane txtpnWindow_1_1 = new JTextPane();
		txtpnWindow_1_1.setBackground(new Color(102, 102, 102));
		txtpnWindow_1_1.setForeground(new Color(255, 255, 255));
		txtpnWindow_1_1.setBounds(225, 100, 90, 30);
		txtpnWindow_1_1.setText("WINDOW 3");
		txtpnWindow_1_1.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 15));
		txtpnWindow_1_1.setEditable(false);
		contentPane.add(txtpnWindow_1_1);
		
		JTextPane txtpnWindow_1_1_1 = new JTextPane();
		txtpnWindow_1_1_1.setBackground(new Color(102, 102, 102));
		txtpnWindow_1_1_1.setForeground(new Color(255, 255, 255));
		txtpnWindow_1_1_1.setBounds(325, 100, 90, 30);
		txtpnWindow_1_1_1.setText("WINDOW 4");
		txtpnWindow_1_1_1.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 15));
		contentPane.add(txtpnWindow_1_1_1);
		
		JTextPane txtpnWindow_1_2_1_2_1 = new JTextPane();
		txtpnWindow_1_2_1_2_1.setForeground(new Color(255, 255, 255));
		txtpnWindow_1_2_1_2_1.setBackground(new Color(102, 102, 102));
		txtpnWindow_1_2_1_2_1.setEditable(false);
		txtpnWindow_1_2_1_2_1.setText("NEXT NUMBER");
		txtpnWindow_1_2_1_2_1.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 15));
		txtpnWindow_1_2_1_2_1.setBounds(298, 64, 117, 25);
		contentPane.add(txtpnWindow_1_2_1_2_1);
		
		labelCurrentNum = new Label("1");
		labelCurrentNum.setForeground(new Color(51, 51, 51));
		labelCurrentNum.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 50));
		labelCurrentNum.setBackground(new Color(0, 255, 255));
		labelCurrentNum.setAlignment(Label.CENTER);
		labelCurrentNum.setBounds(298, 10, 117, 50);
		contentPane.add(labelCurrentNum);
		
		JTextPane txtpnWindow_1_2_1_2_1_1 = new JTextPane();
		txtpnWindow_1_2_1_2_1_1.setText(" MAX NUMBER");
		txtpnWindow_1_2_1_2_1_1.setForeground(Color.WHITE);
		txtpnWindow_1_2_1_2_1_1.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 15));
		txtpnWindow_1_2_1_2_1_1.setEditable(false);
		txtpnWindow_1_2_1_2_1_1.setBackground(new Color(102, 102, 102));
		txtpnWindow_1_2_1_2_1_1.setBounds(25, 64, 117, 25);
		contentPane.add(txtpnWindow_1_2_1_2_1_1);
		
		Label labelCurrentNum_1 = new Label(sDesNum);
		labelCurrentNum_1.setForeground(new Color(51, 51, 51));
		labelCurrentNum_1.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 50));
		labelCurrentNum_1.setBackground(Color.CYAN);
		labelCurrentNum_1.setAlignment(Label.CENTER);
		labelCurrentNum_1.setBounds(25, 10, 117, 50);
		contentPane.add(labelCurrentNum_1);
		
		JButton btnNewButton_1_1_1 = new JButton("RESET");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				curNum =1;
				curNumDis =1;
				labelWin1.setText("0");
				labelWin2.setText("0");
				labelWin3.setText("0");
				labelWin4.setText("0");
				labelCurrentNum.setText(String.valueOf(curNum));

				
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Lucida Console", Font.PLAIN, 11));
		btnNewButton_1_1_1.setBounds(184, 55, 69, 23);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("CHANGE");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MaxNum mApp = new MaxNum();
				mApp.show();
				dispose();
				
			}
		});
		btnNewButton_1_1_1_1.setFont(new Font("Lucida Console", Font.PLAIN, 9));
		btnNewButton_1_1_1_1.setBounds(184, 20, 69, 23);
		contentPane.add(btnNewButton_1_1_1_1);
		
		
	}
}
