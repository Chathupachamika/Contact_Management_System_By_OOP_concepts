import java.time.*;

public class ContactsController {
    public static boolean addContacts(Contacts contacts) {
        ContactList contactList = DBConnection.getInstance().getContactList();
        contactList.add(contacts);
        return true;
    }

    public static boolean remove(int index) {
        ContactList contactList = DBConnection.getInstance().getContactList();
        contactList.remove(index);
        return true;
    }

    public static Contacts[] getAllContacts() {
        ContactList contactList = DBConnection.getInstance().getContactList();
        return contactList.toArray();
    }

    public static Contacts[] ListBySalary(){
        ContactList contactList=DBConnection.getInstance().getContactList();
       Contacts[] contactArray=contactList.toArray();
       for(int i=1;i<contactArray.length;i++;){
        for (int j = 0; j < contactArray.length-j; j++) {
            if(contactArray[j].getSalary()>contactArray[j+1].getSalary()) {
                Contacts  temp=contactArray[j];
                contactArray[j] = contactArray[j+1];
                contactArray[j+1] = temp;
        }
       }            
    }

    return contactArray; //---30 

}

}