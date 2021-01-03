public class Officer {
    private String name;
    private String birthday;
    private String gender;
    private String address;

    public Officer(String name, String birthday, String gender, String address) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Officer{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
