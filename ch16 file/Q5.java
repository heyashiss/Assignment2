import java.io.File;
import java.util.Stack;

public class Q5 {
    public static void main(String[] args) {
        String mainDir = "G:/300324/csw2/Assignment_6/";
        File file = new File(mainDir);
        Stack<File> stack = new Stack<>();
        stack.push(file);
        System.out.println("Text files in directory " + mainDir + ":");
        while (!stack.isEmpty()) {
            File tmpFile = stack.pop();
            if (tmpFile.isFile() && tmpFile.getName().endsWith(".txt")) {
                System.out.println(tmpFile.getName());
            } else if (tmpFile.isDirectory()) {
                File[] files = tmpFile.listFiles();
                if (files != null) {
                    for (File fileInDir : files) {
                        stack.push(fileInDir);
                    }
                }
            }
        }
    }
}
