package ProtoAlpha;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextPane;
public class UI {
	private JFrame frame;
	private final Action action = new SwingAction();
	private JPasswordField passwordField;
	private JTextField textField;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI window = new UI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public UI() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 800, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		passwordField = new JPasswordField();
		passwordField.setBounds(275, 36, 265, 20);
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setEchoChar('*');
		frame.getContentPane().add(passwordField);
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(275, 11, 265, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		JTextPane txtpnPleaseEnterYour = new JTextPane();
		txtpnPleaseEnterYour.setEditable(false);
		txtpnPleaseEnterYour.setText("Please Enter Your User Name");
		txtpnPleaseEnterYour.setBounds(10, 11, 255, 20);
		frame.getContentPane().add(txtpnPleaseEnterYour);
		JTextPane txtpnPleaseEnterYour_1 = new JTextPane();
		txtpnPleaseEnterYour_1.setEditable(false);
		txtpnPleaseEnterYour_1.setText("Please Enter Your Password");
		txtpnPleaseEnterYour_1.setBounds(10, 36, 255, 20);
		frame.getContentPane().add(txtpnPleaseEnterYour_1);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}	
		}
	public static void logIn(){
		String username = "shay barkham";
		String password = "temp";
		String usernameEnter = JTextField
		
		if (username == )
		
	}
	}

