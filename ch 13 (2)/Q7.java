import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        TreeMap<String, Address> addressesMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter names and addresses for 2 people:");
        for (int i = 0; i < 2; i++) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Plot No: ");
            int plotNumber = Integer.parseInt(scanner.nextLine());
            System.out.print("Area: ");
            String area = scanner.nextLine();
            System.out.print("Post Office: ");
            String postOffice = scanner.nextLine();
            Address address = new Address(plotNumber, area, postOffice);
            addressesMap.put(name, address);
        }
        System.out.println("\nPerson Name\tAddress");
        Set<Map.Entry<String, Address>> entrySet = addressesMap.entrySet();
        for (Map.Entry<String, Address> entry : entrySet) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }
}

class Address {
    private int plotNumber;
    private String area;
    private String postOffice;

    public Address(int plotNumber, String area, String postOffice) {
        this.plotNumber = plotNumber;
        this.area = area;
        this.postOffice = postOffice;
    }

    public String toString() {
        return "Plot No: " + plotNumber + ", Area: " + area + ", Post Office: " + postOffice;
    }
}
