public class Labor extends Officer {
    private int degree;

    public Labor(String name, String birthday, String gender, String address, int degree) {
        super(name, birthday, gender, address);
        this.degree = degree;
    }

    @Override
    public String toString() {
        return super.toString() + "Labor{" +
                "degree=" + degree +
                '}';
    }
}
