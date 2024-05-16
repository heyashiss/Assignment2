import java.util.HashMap;

public class Q8 {
    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "DBAC";
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        populateHashMap(str1, map1);
        populateHashMap(str2, map2);

        Q8 ob = new Q8();
        System.out.println("Are the strings anagrams? " + ob.areAnagrams(map1, map2));
    }

    private static void populateHashMap(String str, HashMap<Character, Integer> map) {
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
    }

    public boolean areAnagrams(HashMap<Character, Integer> map1, HashMap<Character, Integer> map2) {
        if (map1.size() != map2.size()) return false;

        for (char ch : map1.keySet()) {
            if (!map2.containsKey(ch) || !map2.get(ch).equals(map1.get(ch))) {
                return false;
            }
        }
        return true;
    }
}
