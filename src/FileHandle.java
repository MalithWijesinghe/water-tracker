import java.io.*;

public class FileHandle {

    public Boolean checkFile() {
        File file = new File("user-data.txt");
        return file.exists();
    }

    public void writeFile(Object userData) {
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user-data.txt"))) {
            out.writeObject(userData);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public UserData readFile() {
        try(ObjectInputStream input = new ObjectInputStream(new FileInputStream("user-data.txt"))){
            return (UserData) input.readObject();
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
