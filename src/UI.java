import java.util.Scanner;

import static java.lang.System.exit;

public class UI {

    FileHandle file = new FileHandle();
    Operations operations = new Operations();
    Scanner scanner = new Scanner(System.in);

    UserData userData = new UserData(); // New UserData object to store data temporarily

    public void newUser() {

        file.writeFile(userData); // Create a new file to store user data.

        System.out.println("---Welcome to water Tracker---");

        System.out.print("Enter Username: ");
        userData.setUserName(scanner.nextLine());

        System.out.print("Enter weight: ");
        double weight = scanner.nextDouble();
        userData.setWeight(weight);

        int recommendedIntake = operations.calculate(weight);
        userData.setRecommendedIntake(recommendedIntake);

        System.out.println("Recommended Water Intake: " + recommendedIntake + " ml");

        System.out.print("Need to set custom goal? (y/n): ");
        String choice = scanner.next();
        if (choice.equals("y")) {
            System.out.print("Enter your goal(ml): ");
            int customIntake = scanner.nextInt();
            userData.setCustomIntake(customIntake);
        }
        else {
            userData.setCustomIntake(userData.getRecommendedIntake());
        }

        file.writeFile(userData); // Update user-data file

        welcomeScreen();
    }

    public void welcomeScreen() {
        userData = file.readFile(); // Load user data to userData object.
        System.out.println("Welcome back, " + userData.getUserName());
        while(true) {
            System.out.println("» Current Intake: " + userData.getCurrentIntake() +" / " + userData.getCustomIntake() + " ml");

            System.out.println("1. Log water\n0. Exit");
            System.out.print("Choice: ");
            int userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    System.out.print("Enter Amount: ");
                    userData.setCurrentIntake(scanner.nextInt());
                    break;
                case 0:
                    exit(0);
            }

            file.writeFile(userData);
        }


    }
}
