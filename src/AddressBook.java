import java.util.*;
import java.io.*;

public class AddressBook {
    private HashMap<String, String> contacts = new HashMap<>();

    public void load() {
        try {
            File file = new File("contacts.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] contact = scanner.nextLine().split(",");
                contacts.put(contact[0], contact[1]);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void save() {
        try {
            FileWriter writer = new FileWriter("contacts.txt");
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                writer.write(entry.getKey() + "," + entry.getValue() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while trying to write to the file.");
            e.printStackTrace();
        }
    }

    public void list() {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public void create(String number, String name) {
        contacts.put(number, name);
    }

    public void delete(String number, String name) {
        contacts.remove(number);
    }

}
