import customP.dashBoard;
import javax.swing.*;
import java.awt.*;
import internalPages.dashboardPage;

public class LoginGUI {

    public static void main(String[] args) {
        LoginGUI loginGUI = new LoginGUI();
    }

    private JFrame loginFrame;
    private JPanel loginPanel;
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passwordLabel;
    private JPasswordField passwordText;
    private JButton loginButton;
    private JLabel messageLabel;
    
    

    public LoginGUI() {
        
        // Create the login GUI
        loginFrame = new JFrame("Report System");
        loginFrame.setSize(450, 350);
        loginFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Use DO_NOTHING_ON_CLOSE to handle closing manually
        loginPanel = new JPanel(new GridLayout(7, 1, 0, 10));
        userLabel = new JLabel("USERNAME:");
        userLabel.setForeground(Color.BLACK); // Set text color to white
        userText = new JTextField(20);
        passwordLabel = new JLabel("PASSWORD:");
        passwordLabel.setForeground(Color.BLACK); // Set text color to white
        passwordText = new JPasswordField(20);
        loginButton = new JButton("LogIn");
        loginButton.setBackground(new Color(135,206,235));
        loginButton.setForeground(Color.BLACK); // Set button text color to white
        messageLabel = new JLabel("");
        messageLabel.setForeground(Color.RED); // Set text color to white

        // Set panel background color to [95, 158, 160]
        loginPanel.setBackground(new Color(95, 158, 160));
        Font font = new Font("Times New Roman", Font.PLAIN, 24);
userLabel.setFont(font);
userText.setFont(font);
passwordLabel.setFont(font);
passwordText.setFont(font);
loginButton.setFont(font);
messageLabel.setFont(font);


        // Add components to the login panel
        loginPanel.add(userLabel);
        loginPanel.add(userText);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordText);
        loginPanel.add(loginButton);
        loginPanel.add(messageLabel);

        // Add action listener to the login button
        loginButton.addActionListener(e -> {
            String username = userText.getText();
            char[] password = passwordText.getPassword();
            
     

            if (username.equals("cano") && String.valueOf(password).equals("password")) {
                messageLabel.setText("Login Successful!");
                JOptionPane.showMessageDialog(loginFrame, "Welcome, CANO!"); 
                loginFrame.setVisible(false); // Hide the login frame
                showExistingGUI(); // Show the existing GUI
            } else {
                messageLabel.setText("INVALID INPUT!");
            }
        });
        
        

        // Add the login panel to the login frame
        loginFrame.add(loginPanel);

        // Display the login frame in the center of the screen
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);

        // Handle closing of the login frame manually
        loginFrame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                int confirmed = JOptionPane.showConfirmDialog(loginFrame,
                        "Are you sure you want to exit?", "Confirm Exit",
                        JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (confirmed == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
    }

    private void showExistingGUI() {
        // Create and display the existing GUI
        dashBoard existingFrame = new dashBoard(); // Replace this with the name of your existing JFrame class
        existingFrame.getContentPane().setBackground(Color.BLUE); // Set background color to blue
        existingFrame.setVisible(true);
    }
}
