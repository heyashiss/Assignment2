import java.util.*;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        String[] words = inputString.split(" ");
        Hashtable<String, Integer> wordCountMap = new Hashtable<>();
        int maxCount = 0;
        ArrayList<String> wordsWithMaxCount = new ArrayList<>();

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            int currentCount = wordCountMap.get(word);
            if (currentCount > maxCount) {
                maxCount = currentCount;
                wordsWithMaxCount.clear();
            }
            if (currentCount == maxCount) {
                wordsWithMaxCount.add(word);
            }
        }
        System.out.println("Words appearing the maximum number of times: " + wordsWithMaxCount);
    }
}
