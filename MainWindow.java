import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MainWindow extends JFrame {
    private JLabel titleLabel;
    private JButton btnAddContacts;
    private JButton btnUpdateContacts;
    private JButton btnSearchContacts;
    private JButton btnDeleteContacts;
    private JButton btnViewContacts;
    private JButton btnExit;

    private AddContacts addContacts;
    private UpdateContacts updateContacts;
    private SearchContacts searchContacts;
    private DeleteContacts deleteContacts;
    private ViewContacts viewContacts;

    public MainWindow() {
        setSize(700, 500);
        setTitle("iFriend Contact Organizer");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(0, 0, 700, 500);
        panel1.setBackground(new Color(71, 39, 71));

        titleLabel = new JLabel("HOME PAGE");
        titleLabel.setBounds(250, 10, 200, 60);
        titleLabel.setFont(new Font("", Font.BOLD, 24));
        titleLabel.setForeground(new Color(248, 205, 248));
        panel1.add(titleLabel);

        btnAddContacts = new JButton("Add New Contacts");
        btnAddContacts.setFont(new Font("", Font.BOLD, 20));
        btnAddContacts.setBounds(50, 90, 250, 35);
        btnAddContacts.setBackground(new Color(248, 205, 248));
        btnAddContacts.setForeground(new Color(71, 39, 71));
        btnAddContacts.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (addContacts == null) {
                    addContacts = new AddContacts();
                }
                addContacts.setVisible(true);
            }
        });
        panel1.add(btnAddContacts);

        btnUpdateContacts = new JButton("Update Contacts");
        btnUpdateContacts.setFont(new Font("", Font.BOLD, 20));
        btnUpdateContacts.setBounds(50, 150, 250, 35);
        btnUpdateContacts.setBackground(new Color(248, 205, 248));
        btnUpdateContacts.setForeground(new Color(71, 39, 71));
        btnUpdateContacts.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (updateContacts == null) {
                    updateContacts = new UpdateContacts();
                }
                updateContacts.setVisible(true);
            }
        });
        panel1.add(btnUpdateContacts);

        btnSearchContacts = new JButton("Search Contacts");
        btnSearchContacts.setFont(new Font("", Font.BOLD, 20));
        btnSearchContacts.setBounds(50, 210, 250, 35);
        btnSearchContacts.setBackground(new Color(248, 205, 248));
        btnSearchContacts.setForeground(new Color(71, 39, 71));
        btnSearchContacts.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (searchContacts == null) {
                    searchContacts = new SearchContacts();
                }
                searchContacts.setVisible(true);
            }
        });
        panel1.add(btnSearchContacts);

        btnDeleteContacts = new JButton("Delete Contacts");
        btnDeleteContacts.setFont(new Font("", Font.BOLD, 20));
        btnDeleteContacts.setBounds(50, 270, 250, 35);
        btnDeleteContacts.setBackground(new Color(248, 205, 248));
        btnDeleteContacts.setForeground(new Color(71, 39, 71));
        btnDeleteContacts.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (deleteContacts == null) {
                    deleteContacts = new DeleteContacts();
                }
                deleteContacts.setVisible(true);
            }
        });
        panel1.add(btnDeleteContacts);

        btnViewContacts = new JButton("View Contacts");
        btnViewContacts.setFont(new Font("", Font.BOLD, 20));
        btnViewContacts.setBounds(50, 330, 250, 35);
        btnViewContacts.setBackground(new Color(248, 205, 248));
        btnViewContacts.setForeground(new Color(71, 39, 71));
        btnViewContacts.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (viewContacts == null) {
                    viewContacts = new ViewContacts();
                }
                viewContacts.setVisible(true);
            }
        });
        panel1.add(btnViewContacts);

        btnExit = new JButton("Exit");
        btnExit.setFont(new Font("", Font.BOLD, 20));
        btnExit.setBounds(50, 390, 250, 35);
        btnExit.setBackground(new Color(248, 205, 248));
        btnExit.setForeground(new Color(71, 39, 71));
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                System.exit(0);
            }
        });
        panel1.add(btnExit);

        add(panel1);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
}
