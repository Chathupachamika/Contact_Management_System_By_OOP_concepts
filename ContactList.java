public class ContactList {
    private Node start;

    public Node getStart() {
        return start;
    }

    private boolean isEmpty() {
        return start == null;
    }

    public Contact[] toArray() {
        Contact[] contactArray = new Contact[getSize()];
        Node temp = start;
        for (int i = 0; temp != null; i++) {
            contactArray[i] = temp.getContact();
            temp = temp.getNext();
        }
        return contactArray;
    }

    // ---------------------------SEARCH METHOD--------------------------
    public int searchByNameOrPhoneNumber(String nameOrPhone) {
        Node temp = start;
        int index = 0;
        while (temp != null) {
            if (temp.getContact().getName().equals(nameOrPhone)
                    || temp.getContact().getPhoneNumber().equals(nameOrPhone)) {
                return index;
            }
            temp = temp.getNext();
            index++;
        }
        return -1;
    }

    // ---------------------------DELETE-------------------------------
    public void delete(int index) {
        if (!isValidIndex(index)) {
            System.out.println("Invalid index.");
            return;
        }
        if (index == 0) {
            start = start.getNext();
            return;
        }
        Node prev = null;
        Node current = start;
        for (int i = 0; current != null && i < index; i++) {
            prev = current;
            current = current.getNext();
        }
        if (current == null) {
            System.out.println("Invalid index.");
            return;
        }
        prev.setNext(current.getNext());
    }

    // --------------------ADD METHOD---------------------------
    public void add(Contact contact) {
        Node n1 = new Node(contact);
        Node lastNode = start;
        if (isEmpty()) {
            start = n1;
        } else {
            while (lastNode.getNext() != null) {
                lastNode = lastNode.getNext();
            }
            lastNode.setNext(n1);
        }
    }

    public Contact get(int index) {
        if (isValidIndex(index)) {
            Node temp = start;
            for (int i = 0; temp != null && i < index; i++) {
                temp = temp.getNext();
            }
            return temp != null ? temp.getContact() : null;
        }
        return null;
    }

    // -------------------GET SIZE------------------------------------
    public int getSize() {
        Node temp = start;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.getNext();
        }
        return count;
    }

    private boolean isValidIndex(int index) {
        return index >= 0 && index < getSize();
    }

    public void updatePhoneNumber(int index, String phoneNumber) {
        Contact contact = get(index);
        if (contact != null) {
            contact.setPhoneNumber(phoneNumber);
        }
    }

    public void updateSalary(int index, double newSalary) {
        Contact contact = get(index);
        if (contact != null) {
            contact.setSalary(newSalary);
        }
    }

    public void updateCompanyName(int index, String companyName) {
        Contact contact = get(index);
        if (contact != null) {
            contact.setCompanyname(companyName);
        }
    }

    public void updateName(int index, String name) {
        Contact contact = get(index);
        if (contact != null) {
            contact.setName(name);
        }
    }

    // -------------------------SALARY SORT---------------------------
    public void sortBySalary() {
        if (start == null) {
            return;
        }
        for (Node temp = start; temp != null; temp = temp.getNext()) {
            for (Node index = temp.getNext(); index != null; index = index.getNext()) {
                if (temp.getContact().getSalary() > index.getContact().getSalary()) {
                    Contact tempContact = temp.getContact();
                    temp.setContact(index.getContact());
                    index.setContact(tempContact);
                }
            }
        }
    }

    // -------------------------BIRTHDAY SORT---------------------------
    public void sortByBirthday() {
        if (start == null) {
            return;
        }
        for (Node temp = start; temp != null; temp = temp.getNext()) {
            for (Node index = temp.getNext(); index != null; index = index.getNext()) {
                if (temp.getContact().getBirthday().compareTo(index.getContact().getBirthday()) > 0) {
                    Contact tempContact = temp.getContact();
                    temp.setContact(index.getContact());
                    index.setContact(tempContact);
                }
            }
        }
    }

    // -------------------------NAME SORT---------------------------
    public void sortByName() {
        if (start == null) {
            return;
        }
        for (Node temp = start; temp != null; temp = temp.getNext()) {
            for (Node index = temp.getNext(); index != null; index = index.getNext()) {
                if (temp.getContact().getName().compareTo(index.getContact().getName()) > 0) {
                    Contact tempContact = temp.getContact();
                    temp.setContact(index.getContact());
                    index.setContact(tempContact);
                }
            }
        }
    }

    private class Node {
        private Contact contact;
        private Node next;

        public Node(Contact contact) {
            this.contact = contact;
            this.next = null;
        }

        public Contact getContact() {
            return contact;
        }

        public void setContact(Contact contact) {
            this.contact = contact;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
