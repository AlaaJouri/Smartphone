public class BuisnessContact extends Contact{
    public BuisnessContact(String name, String companyName) {
        super(name);
        this.companyName = companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    private String companyName;
    public String getCompanyName() {
        return companyName;
    }


    @Override
    public String toString() {
        return "BuisnessContact{" +
                super.toString()+
                "companyName='" + companyName + '\'' +
                '}';
    }
}
