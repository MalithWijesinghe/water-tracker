public class Main {
    public static void main(String[] args) {
        UI ui = new UI();
        FileHandle file = new FileHandle();

        // Check new user or an existing user
        if(!(file.checkFile())) {
            ui.newUser();
        }
        else {
            ui.welcomeScreen();
        }
    }
}
