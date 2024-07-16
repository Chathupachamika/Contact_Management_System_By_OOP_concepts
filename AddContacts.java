import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
import java.awt.event.*;

public class AddContacts extends JFrame {
    // ----Line
public AddContacts(){
//---line 10


//----

panel2.add(txtId); //95

txtName=new JTextField(15);
txtName.setFont(new Font("",1,20));
txtName.setBounds(280,155,200,28);
panel2.add(txtName);

txtPhone=new JTextField(15);
txtPhone.setFont(new Font("",1,20));
txtPhone.setBounds(280,110,200,28);
txtPhone.addActionListener(new ActionListener{

   public void actionPerformed(ActionEvent evt){
        String phoneNumber=txtPhone.getText();
        boolean isValidPhone= ContactsController.isValidPhone(phoneNumber);
        if(isValidPhoneNumber){
            int option=JOptionPane.showConfirmDialog(null, "Invalid Phone Number.... Do you want to input phone number again ?..");
            if(option==JOptionPane.YES_OPTION){
     txtPhone.setText("");
            txtPhone.requestFocus();
            }else if(option==JOptionPane.NO_OPTION){
               ContactsController.count();
               txtId.setText(  ContactsController.generateId());
               txtName.setText("");
               txtPhone.setText("");
               txtCompany.setText("");
               txtSalary.setText("");
               txtBirthday.setText("");
               dispose();
            }
        }
    }
});

panel2.add(txtPhone);

txtCompany=new JTextField(15);
txtCompany.setFont(new Font("",1,20));
txtCompany.setBounds(280,155,200,28);
panel2.add(txtCompany);


txtSalary=new JTextField(15);
txtSalary.setFont(new Font("",1,20));
txtSalary.setBounds(280,200,200,28);
txtSalary.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt){
       double salary=Double.parseDouble(txtSalary.getText());
        boolean isValidSalary= ContactsController.isValidSalary(salary);
        if(isValidPhoneNumber){
            int option=JOptionPane.showConfirmDialog(null, "Invalid Phone Number.... Do you want to input phone number again ?..");
            if(option==JOptionPane.YES_OPTION){
     txtPhone.setText("");
            txtPhone.requestFocus();
            }else if(option==JOptionPane.NO_OPTION){
               ContactsController.count();
               txtId.setText(  ContactsController.generateId());
               txtName.setText("");
               txtPhone.setText("");
               txtCompany.setText("");
               txtSalary.setText("");
               txtBirthday.setText("");
               dispose();
            }
        }
    }
});

panel2.add(txtSalary);

txtBirthday=new JTextField(15);
txtBirthday.setFont(new Font("",1,20);
txtBirthday.setBounds(200,245,200,28);
txtBirthday.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt){
        String birthday=txtBirthday.getText();
       boolean isValidBirthday= ContactsController.isValidBirthday(birthday);
    if(!isValidBirthday){
       int option=JOptionPane.showConfirmDialog(null, "Invalid Birthday.... Do you want to input birthday again ?..");
       if(option==JOptionPane.YES_OPTION){
txtBirthday.setText("");
       txtBirthday.requestFocus();
       }else if(option==JOptionPane.NO_OPTION){
          ContactsController.count();
          txtId.setText(  ContactsController.generateId());
          txtName.setText("");
          txtPhone.setText("");
          txtCompany.setText("");
          txtSalary.setText("");
          txtBirthday.setText("");
          dispose();//176

          btnAdd=new JButton("Add");
          btnAdd.setFont(new Font("",1,20));
          btnAdd.setBounds(400,300,100,28);
          btnAdd.setForeground(new Color(248,205,245));
          btnAdd.setBackground(new Color(70,39,69));
          btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                try{
                    String id=txtId.getText();
                    String name=txtName.getText();
                    String phone=txtPhone.getText();
                    String company=txtCompany.getText();
                    double salary=Double.parseDouble(txtSalary.getText());
                    String birthday=txtBirthday.getText();
Contacts contacts=new Contacts(id,name,phoneNumber,companyName,salary,birthday);

boolean isValidPhoneNumber=ContactsController.isValidPhoneNumber(phoneNumber);
boolean isValidSalary=ContactsController.isValidSalary(salary);
boolean isValidBirthday=ContactsController.isValidBirthday(birthday);

        if(isValidPhoneNumber){
                int option=JOptionPane.showConfirmDialog(null, "Invalid Phone Number.... Do you want to input phone number again ?..");
                if(option==JOptionPane.YES_OPTION){
         txtPhone.setText("");
                txtPhone.requestFocus();
                }else if(option==JOptionPane.NO_OPTION){
                   ContactsController.count();
                   txtId.setText(  ContactsController.generateId());
                   txtName.setText("");
                   txtPhone.setText("");
                   txtCompany.setText("");
                   txtSalary.setText("");
                   txtBirthday.setText("");
                   dispose();
                }

            }else if{(isValidSalary){
                int option=JOptionPane.showConfirmDialog(null, "Invalid Salary.... Do you want to input salary again ?..");
                if(option==JOptionPane.YES_OPTION){
         txtSalary.setText("");
                txtSalary.requestFocus();
                }else if(option==JOptionPane.NO_OPTION){
                   ContactsController.count();
                   txtId.setText(  ContactsController.generateId());
                   txtName.setText("");
                   txtPhone.setText("");
                   txtCompany.setText("");
                   txtSalary.setText("");
                   txtBirthday.setText("");
                   dispose();
                }


            }else if{(isValidBirthday){
                int option=JOptionPane.showConfirmDialog(null, "Invalid Birthday.... Do you want to input Birthday again ?..");
                if(option==JOptionPane.YES_OPTION){
         txtBirthday.setText("");
                txtBirthday.requestFocus();
                }else if(option==JOptionPane.NO_OPTION){
                   ContactsController.count();
                   txtId.setText(  ContactsController.generateId());
                   txtName.setText("");
                   txtPhone.setText("");
                   txtCompany.setText("");
                   txtSalary.setText("");
                   txtBirthday.setText("");
                   dispose();
                }



}else{
    ContactsController.addContacts(contacts);
    int option=JOptionPane.showConfirmDialog(null,"Added Successfull...Do you want to add another contact ?...");
    if(option==JOptionPane.YES_OPTION){
        txtId.setText(ContactsController.generateId());
        txtName.setText("");
        txtPhone.setText("");
        txtCompany.setText("");
        txtSalary.setText("");
        txtBirthday.setText("");
        txtName.requestFocus();
    }else if(option==JOptionPane.NO_OPTION){
        txtId.setText(ContactsController.generateId());
        txtName.setText("");
        txtPhone.setText("");
        txtCompany.setText("");
        txtSalary.setText("");
        txtBirthday.setText("");
dispose();
}
}
}catch(NumberFormatExeption ex){
    JOptionPane.showMessageDialog(null,"No Contact added....");
}
}
});
panel2.add(btnAdd);

btnBackToHome=new JButon("Cancel");
btnBackToHome.setFont(new Font("",1,20));
btnBackToHome.setBounds(400,340,220,28);
btnBackToHome.setForeground(new Color(248,205,245));
btnBackToHome.setBackground(new Color(70,39,69));
btnBackToHome.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt){
        txtName.setText("");
        txtPhone.setText("");
        txtCompany.setText("");
        txtSalary.setText("");
        txtBirthday.setText("");

panel2.add(btnCancel);

btnBackToHome=new JButon("Back To Homepage");
btnBackToHome.setFont(new Font("",1,20));
btnBackToHome.setBounds(400,340,220,28);
btnBackToHome.setForeground(new Color(248,205,245));
btnBackToHome.setBackground(new Color(70,39,69));
btnBackToHome.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt){
        txtName.setText("");
        txtPhone.setText("");
        txtCompany.setText("");
        txtSalary.setText("");
        txtBirthday.setText("");
dispose();

}
});
panel2.add(btnBackToHome);

add(panel1);
add(panel2);

}