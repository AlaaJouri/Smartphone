import java.util.List;

public class Smartphone implements Radio, GPS{

    private static String nameModells ;
    private static String nameHerstelles;

    public List<Contact> getContentList() {
        List<Contact> contactList1 = contactList;
        return contactList1;
    }

    public void setContentList(List<Contact> contentList) {
        this.contactList = contentList;
    }

    private List<Contact>contactList;

    public Smartphone(String nameModells, String nameHerstelles, List<Contact> contentList) {
        this.nameModells = nameModells;
        this.nameHerstelles = nameHerstelles;
        this.contactList = contentList;
    }


    public static String getNameHerstelles() {
        return nameHerstelles;
    }

    public static void setNameHerstelles(String nameHerstelles) {
        Smartphone.nameHerstelles = nameHerstelles;
    }

    public static String getNameModells() {
        return nameModells;
    }

    public static void setNameModells(String nameModells) {
        Smartphone.nameModells = nameModells;
    }


    @Override
    public String toString() {
        return "Smartphone{" +
                "nameModells='" + nameModells + '\'' +
                ", nameHerstelles='" + nameHerstelles + '\'' +
                ", contentList=" + contactList +
                '}';
    }

    @Override
    public String getPosition() {
        return null;
    }

    @Override
    public boolean startRadio() {
        return false;
    }

    @Override
    public boolean stopRadio() {
        return false;
    }


    public void addContact(Contact addedContact) {
        contactList.add(addedContact);
    }

    public Contact getContact(int i) {
        return contactList.get(i);
    }

    public Contact getContactByName(String contactName) {
        for (Contact contact : contactList) {
            if (contact.getName().equals(contactName)) {
                return contact;
            }
        }
        return null;
    }
    public List<Contact> removeContactByName(String removedContact) {
        for(int i =0; i<contactList.size(); i++) {
            if (contactList.get(i).getName().equals(removedContact)) {
                contactList.remove(i);
                return contactList;
            }
        }
        return null;
    }


}
