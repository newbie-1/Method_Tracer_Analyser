package ibmcodes;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class IbmGuiWindow {
	public String passingClass;   //strings to accept the file names.
	public String failingClass;
	private JFrame frame;
	private JTextField file1;
	private JTextField file2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IbmGuiWindow window = new IbmGuiWindow();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/*code to access the file names*/
	
	public String getPassingFile() {
		return passingClass;
	}
	
	public String getFailingFile() {
		return failingClass;
	}

	/**
	 * Create the application.
	 */
	public IbmGuiWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(200, 400, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFilename = new JLabel("Enter passing class name");
		lblFilename.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblFilename.setBounds(31, 63, 217, 19);
		frame.getContentPane().add(lblFilename);
		
		file1 = new JTextField();
		file1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				passingClass = file1.getText();
				
			}
		});
		file1.setBounds(246, 62, 156, 20);
		frame.getContentPane().add(file1);
		file1.setColumns(10);
		
		
		file2 = new JTextField();
		file2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				failingClass = file2.getText();
				
			}
		});
		
		file2.setColumns(10);
		file2.setBounds(246, 94, 156, 20);
		frame.getContentPane().add(file2);
		
		
		JButton btnSubmit = new JButton("Submit");
		
		 btnSubmit.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				
					String[] command =
					    {
					        "cmd",
					    };
					    Process p;
	
					try {
						p = Runtime.getRuntime().exec(command);
					        new Thread(new SyncPipe(p.getErrorStream(), System.err)).start();
				                new Thread(new SyncPipe(p.getInputStream(), System.out)).start();
				                PrintWriter stdin = new PrintWriter(p.getOutputStream());
				                stdin.println("javac LogAnalysis.java");
				                stdin.println("java LogAnalysis");
				                stdin.close();
				                p.waitFor();
				    	} 
					catch (Exception e) {
				 		e.printStackTrace();
				 		}
				}
			
			});
	
		
		btnSubmit.setBounds(184, 186, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		JLabel lblMethodTracerGui = new JLabel("Method Tracer GUI Application");
		lblMethodTracerGui.setFont(new Font("Baskerville Old Face", Font.BOLD, 21));
		lblMethodTracerGui.setBounds(59, 11, 317, 20);
		frame.getContentPane().add(lblMethodTracerGui);
		
		JLabel lblEnterPassingClass = new JLabel("Enter failing class name");
		lblEnterPassingClass.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblEnterPassingClass.setBounds(37, 91, 211, 23);
		frame.getContentPane().add(lblEnterPassingClass);
		
		
	}
}
