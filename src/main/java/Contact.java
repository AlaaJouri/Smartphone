public abstract class Contact {


    public Contact(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                '}';
    }

    private String name;

    public String getName() {
        return name;
    }
}
