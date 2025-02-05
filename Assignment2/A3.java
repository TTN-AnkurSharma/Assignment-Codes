
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A3 {
    public A3() {
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter File name:");
        String filename = "Assignment2/src/" + br.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(filename));
        System.out.println("Enter word to check:");
        String word_toCheck = br.readLine();
        int count = 0;

        while(fileReader.ready()) {
            String[] word = fileReader.readLine().split(" ");

            for(String wd : word) {
                if (wd.equals(word_toCheck)) {
                    ++count;
                }
            }
        }

        System.out.print("The word " + word_toCheck + " appears " + count + " times");
    }
}