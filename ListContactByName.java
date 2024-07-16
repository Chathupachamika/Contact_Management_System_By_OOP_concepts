import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class ListContactByName extends JFrame {
    private JLabel titleLabel;

    private JTable contactsTable;
    private DefaultTableModel dtm;

    private JButton backaToMenu;
    private JButton btnReload;

    public ListContactByName(){
        setSize(700, 500);
        setTitle("List Contacts By Salary");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);

        JPanel panel1=new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(300,0,400,500);
        panel1.setBackground(new Color(71,39,71));
        
        titleLabel=new JLabel("HOME PAGE");
        titleLabel.setBounds(100,10,350,60);        
        titleLabel.setFont(new Font("",1,20));
        titleLabel.setBackground(new Color(248,205,248));
        panel1.add(titleLabel);

        JPanel panel2=new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(0,55,700,300);
        panel2.setBackground(new Color(248,205,248));

        String[] columnNames={"Id","Name","Phone Number","Company Name","Salary","Birthday"};
        dtm=new DefaultTableModel(columnNames,0);
        contactsTable=new JTable(dtm);

        JScrollPane tablePane=new JScrollPane(contactsTable);
        tablePane.setBounds(0,30,700,300);
        tablePane.setBackground(new Color(248,205,248));
        panel2.add(tablePane);

        backaToMenu=new JButton("Add New Contacts");
        backaToMenu.setFont(new Font("",1,20));
        backaToMenu.setBounds(70,90,250,35);
        backaToMenu.setBackground(new Color(248,205,248));
        backaToMenu.setForeground(new Color(71,39,71));
        backaToMenu.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                dispose();
    }
});
panel2.add(backaToMenu);

btnReload=new JButton("Reload");
btnReload.setFont(new Font("",1,20));
btnReload.setBounds(70,90,250,35);
btnReload.setBackground(new Color(248,205,248));
btnReload.setForeground(new Color(71,39,71));
btnReload.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent evt){
        Contact[] contactArray=ContactsController.ListByName();
        dtm.setRowCount(0);
        for (int i=0;i<contactArray.length;i++;){
            Contact contacts=contactArray[i];

            Object[] rowData={contacts.getId(),contacts.getName(),contacts.getCompanyName(),contacts.getSalary(),contacts.getBirthday()};
            dtm.addRow(rowData);
        }
    }
});
panel2.add(btnReload);

add(panel1);
add(panel2);
}
}