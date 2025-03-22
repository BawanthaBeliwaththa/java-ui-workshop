import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fleet_sys extends JFrame {

    private JLabel lbl;
    private JButton trc_btn;
    private JButton fun_btn;
    private JButton fuel_btn;
    private JButton con_btn;
    private JButton sys_btn;
    private JButton no_btn;

    public fleet_sys() {
        setTitle("Vehicle Management Platform");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); 


        lbl = new JLabel("Status: ");
        mainPanel.add(lbl);


        mainPanel.add(track_pan());
        mainPanel.add(Box.createVerticalStrut(5)); 

        mainPanel.add(fun_pan());
        mainPanel.add(Box.createVerticalStrut(5)); 

        mainPanel.add(fuel_pan());
        mainPanel.add(Box.createVerticalStrut(5)); 

        mainPanel.add(cond_pan());
        mainPanel.add(Box.createVerticalStrut(5)); 

        mainPanel.add(sys_pan());

        
        JScrollPane scp = new JScrollPane(mainPanel);
        scp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        
        add(scp);

        
        setVisible(true);
    }


    private JPanel track_pan() {
        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5)); 
        panel.setBorder(BorderFactory.createTitledBorder("Tracker present"));

        JPanel pnl = new JPanel(new GridLayout(4, 2, 5, 5)); 
        pnl.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5)); 

        pnl.add(new JLabel("Vehicle Has a Tracker ? "));

        trc_btn = new JButton("Yes");
        pnl.add(trc_btn);

        no_btn = new JButton("No");
        pnl.add(no_btn);

        trc_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(fleet_sys.this, "Vehicle has a tracker installed");
            }
        });
        no_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(fleet_sys.this, "Try Fixing the error");
                System.exit(0);
            }
        });

        panel.add(pnl);
        return panel;
    }

    private JPanel fun_pan() {
        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5)); 
        panel.setBorder(BorderFactory.createTitledBorder("Functions present"));

        JPanel pnl = new JPanel(new GridLayout(4, 2, 5, 5)); 
        pnl.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5)); 

        pnl.add(new JLabel("All the vehicle functions are working ? "));

        fun_btn = new JButton("Yes");
        pnl.add(fun_btn);

        no_btn = new JButton("No");
        pnl.add(no_btn);

        fun_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(fleet_sys.this, "Vehicle functions are working");
            }
        });
        no_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(fleet_sys.this, "Try Fixing the error");
                System.exit(0);
            }
        });

        panel.add(pnl);
        return panel;
    }

    private JPanel fuel_pan() {
        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5)); 
        panel.setBorder(BorderFactory.createTitledBorder("Fuel present"));

        JPanel pnl = new JPanel(new GridLayout(4, 2, 5, 5)); 
        pnl.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5)); 

        pnl.add(new JLabel("Vehicle has enough fuel ? "));

        fuel_btn = new JButton("Yes");
        pnl.add(fuel_btn);

        no_btn = new JButton("No");
        pnl.add(no_btn);

        fuel_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(fleet_sys.this, "Vehicle has enough fuel");
            }
        });
        no_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(fleet_sys.this, "Try Fixing the error");
                System.exit(0);
            }
        });

        panel.add(pnl);
        return panel;
    }

    
    private JPanel cond_pan() {
        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5)); 
        panel.setBorder(BorderFactory.createTitledBorder("Conditions present"));

        JPanel pnl = new JPanel(new GridLayout(4, 2, 5, 5)); 
        pnl.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5)); 

        pnl.add(new JLabel("Vehicle is in valid conditions ? "));

        con_btn = new JButton("Yes");
        pnl.add(con_btn);

        no_btn = new JButton("No");
        pnl.add(no_btn);

        con_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(fleet_sys.this, "Vehicle is in valid conditions");
            }
        });
        no_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(fleet_sys.this, "Try Fixing the error");
                System.exit(0);
            }
        });

        panel.add(pnl);
        return panel;
    }

    
    private JPanel sys_pan() {
        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5)); 
        panel.setBorder(BorderFactory.createTitledBorder("New system present"));

        JPanel pnl = new JPanel(new GridLayout(4, 2, 5, 5)); 
        pnl.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5)); 

        pnl.add(new JLabel("Vehicle has installed the new system ? "));

        sys_btn = new JButton("Yes");
        pnl.add(sys_btn);

        no_btn = new JButton("No");
        pnl.add(no_btn);

        sys_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(fleet_sys.this, "Vehicle has installed the new system");
            }
        });
        no_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(fleet_sys.this, "Try Fixing the error");
                System.exit(0);
            }
        });

        panel.add(pnl);
        return panel;
    }

 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new fleet_sys());
    }
}