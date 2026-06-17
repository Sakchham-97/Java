import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class loginform {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Login Form");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);

        // panel for login form 
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // username Label and text field
        gbc.gridx = 0;
        gbc.gridy = 0;
        JLabel username = new JLabel("Name: ");
        panel.add(username, gbc);

        // textfield
        gbc.gridx = 1;
        gbc.gridy = 0;
        JTextField usernameField = new JTextField(20);
        panel.add(usernameField, gbc);

        // password label and textfield
        gbc.gridx = 0;
        gbc.gridy = 1;
        JLabel password = new JLabel("Password: ");
        panel.add(password, gbc);

        // password textfield
        gbc.gridx = 1;
        gbc.gridy = 1;
        JPasswordField passwordField = new JPasswordField(20);
        panel.add(passwordField, gbc);

        // Login button (size to text only)
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weightx = 0.0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(10, 0, 0, 0);

        JButton loginButton = new JButton("Login");
        loginButton.setPreferredSize(null);  // Button size = text size
        panel.add(loginButton, gbc);

        // Add action listener for login button
        loginButton.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                //check is name field is empty
                if(username.isEmpty()){
                    JOptionPane.showMessageDialog(frame,"Name field is empty","Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if(password.isEmpty()){
                    JOptionPane.showMessageDialog(frame, "Password Empty","Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                JOptionPane.showMessageDialog(frame,username, "Login Sucessful",JOptionPane.INFORMATION_MESSAGE);
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}