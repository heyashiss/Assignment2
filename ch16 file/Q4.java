import java.io.File;
import java.util.Stack;

public class Q4 {
    public static void main(String[] args) {
        String mainDir = "G:/300324/csw2/Assignment_6/";
        File file = new File(mainDir);
        Stack<File> stack = new Stack<>();
        stack.push(file);
        System.out.println("Content of Directory " + mainDir + " is:");

        while (!stack.isEmpty()) {
            File tmpFile = stack.pop();
            if (tmpFile.isFile()) {
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
