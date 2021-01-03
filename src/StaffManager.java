import java.util.ArrayList;

public class StaffManager {
    private ArrayList<Officer> officer = new ArrayList<>();

    public void addNewOfficer(Officer officers) {
        officer.add(officers);
    }

    public void findByName(String name) {
        String result = "";
        boolean isFound = true;
        for (Officer officers : officer) {
            String officerName = officers.getName();
            if (name.equals(officerName)) {
                result += officer.toString();
                isFound = false;
            }
        }
        if (isFound) {
            result += "Name not found !";
        }
        System.out.println(result);
    }
}
