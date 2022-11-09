import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private static String fullName;
    private static String phoneNumber;

    public static Map<String, String> telephoneDirectory = new HashMap<>();

    public static void addTelephoneDirectory(String fullName, String phoneNumber) {
        telephoneDirectory.put(fullName, phoneNumber);
    }

    public static void printTelephoneDirectory() {
        System.out.println(telephoneDirectory.entrySet());
    }
}
