public class Friend extends Contact{

    private int telefonnummer;

    public Friend(String name, int telefonnummer) {
        super(name);
        this.telefonnummer = telefonnummer;
    }


    @Override
    public String toString() {
        return "Friend{" +
                "name="+super.getName()+
                "telefonnummer=" + telefonnummer +
                '}';
    }
}
