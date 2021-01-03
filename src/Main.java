import java.util.Scanner;

public class Main {
    public static StaffManager staffManager = new StaffManager();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Add new person");
            System.out.println("2. Find by name and display ");
            System.out.println("0. Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addNewOfficer();
                    break;
                case 2:
                    System.out.println("Enter the search name");
                    String findName = scanner.nextLine();
                    staffManager.findByName(findName);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);

    }

    public static void addNewOfficer() {
        int choice;
        System.out.println("1. Add new Staff");
        System.out.println("2. Add new Labor");
        System.out.println("3. Add new Engineer");

        choice = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter birthday");
        String birthday = scanner.nextLine();
        System.out.println("Enter gender");
        String gender = scanner.nextLine();
        System.out.println("Enter address");
        String address = scanner.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Enter job");
                String job = scanner.nextLine();
                Officer staff = new Staff(name, birthday, gender, address, job);
                staffManager.addNewOfficer(staff);
                break;
            case 2:
                System.out.println("Enter degree");
                int degree = Integer.parseInt(scanner.nextLine());
                Officer labor = new Labor(name, birthday, gender, address, degree);
                staffManager.addNewOfficer(labor);
                break;
            case 3:
                System.out.println("Enter trainingIndustry");
                String trainingIndustry = scanner.nextLine();
                Officer engineer = new Engineer(name, birthday, gender, address, trainingIndustry);
                staffManager.addNewOfficer(engineer);
                break;
        }
    }
}

