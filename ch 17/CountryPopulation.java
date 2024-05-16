import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CountryPopulation {
    Node root;
    static Scanner scanner = new Scanner(System.in);

    CountryPopulation(Node root) {
        this.root = root;
    }

    public static void main(String[] args) {
        CountryPopulation populationManager = new CountryPopulation(null);
        System.out.println("Enter the number of countries:");
        int numberOfCountries = scanner.nextInt();
        for (int i = 0; i < numberOfCountries; i++) {
            populationManager.root = populationManager.insert(populationManager.root, new Country(scanner.next(), scanner.nextInt()));
        }
        System.out.println("Level Order Traversal:");
        populationManager.levelOrder(populationManager.root);
        System.out.println("Inorder Traversal:");
        System.out.println("Country with maximum population: " + populationManager.findMax(populationManager.root));
        System.out.println("Country with minimum population: " + populationManager.findMin(populationManager.root));
    }

    public Node insert(Node root, Country country) {
        if (root == null) {
            return new Node(country);
        }
        if (root.info.compareTo(country) > 0) {
            root.left = insert(root.left, country);
        }
        if (root.info.compareTo(country) < 0) {
            root.right = insert(root.right, country);
        }
        return root;
    }

    public void levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            System.out.println(temp.info);
            if (temp.left != null) {
                queue.offer(temp.left);
            }
            if (temp.right != null) {
                queue.offer(temp.right);
            }
        }
    }

    public String findMax(Node root) {
        if (root.right == null) {
            return root.info.name;
        }
        return findMax(root.right);
    }

    public String findMin(Node root) {
        if (root.left == null) {
            return root.info.name;
        }
        return findMin(root.left);
    }
}

class Country implements Comparable<Country> {
    String name;
    int population;

    Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public int compareTo(Country otherCountry) {
        return this.population - otherCountry.population;
    }

    public String toString() {
        return name + " " + population;
    }
}

class Node {
    Country info;
    Node left;
    Node right;

    Node(Country info) {
        this.info = info;
        this.left = null;
        this.right = null;
    }
}
