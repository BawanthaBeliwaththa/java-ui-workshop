import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame {

    private JTextField UNF;
    private JPasswordField PWF;
    private JButton LBTN;

    public login() {

        setTitle("Sign In : Vehicle Management platform");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        
        JPanel pnl = new JPanel(new GridLayout(3, 2, 5, 5));
        pnl.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        
        pnl.add(new JLabel("Username:"));
        UNF = new JTextField();
        pnl.add(UNF);

        
        pnl.add(new JLabel("Password:"));
        PWF = new JPasswordField();
        pnl.add(PWF);

        
        LBTN = new JButton("Login");
        pnl.add(new JLabel());
        pnl.add(LBTN);

        
        LBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String un = UNF.getText();
                String pw = new String(PWF.getPassword());

                
                if (un.equals("bawa") && pw.equals("1234")) {
                    JOptionPane.showMessageDialog(login.this, "Login Successful!");
                    openfleet_sys(); 
                    dispose(); 
                } else {
                    JOptionPane.showMessageDialog(login.this, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        
        add(pnl);

        
        setVisible(true);
    }

    private void openfleet_sys() {
        
        fleet_sys newWindow = new fleet_sys();
        newWindow.setVisible(true);
    }

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new login();
            }
        });
    }
}