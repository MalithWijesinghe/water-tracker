import java.util.Scanner;

public class UI {

    FileHandle file = new FileHandle();
    Scanner scanner = new Scanner(System.in);

    UserData userData = new UserData(); // New UserData object to store data temporarily

    public void welcomeScreen() {
        if(!file.checkFile()) {
            file.writeFile(userData); // Create a new file to store user data.

            System.out.print("Enter Username: ");
            userData.setUserName(scanner.nextLine());

            System.out.print("Enter weight: ");
            userData.setWeight(scanner.nextInt());

            file.writeFile(userData); // Update user-data file
        }
        else {
            userData = file.readFile(); // Load user data to userData object.
        }
    }
}
