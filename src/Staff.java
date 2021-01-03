public class Staff extends Officer {
    private String job;

    public Staff(String name, String birthday, String gender, String address, String job) {
        super(name, birthday, gender, address);
        this.job = job;
    }

    @Override
    public String toString() {
        return super.toString() + "Staff{" +
                "job='" + job + '\'' +
                '}';
    }
}
