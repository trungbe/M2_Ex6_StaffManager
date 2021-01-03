public class Engineer extends Officer {
    private String trainingIndustry;

    public Engineer(String name, String birthday, String gender, String address, String trainingIndustry) {
        super(name, birthday, gender, address);
        this.trainingIndustry = trainingIndustry;
    }

    @Override
    public String toString() {
        return super.toString() + "Engineer{"  +
                "trainingIndustry='" + trainingIndustry + '\'' +
                '}';
    }
}
