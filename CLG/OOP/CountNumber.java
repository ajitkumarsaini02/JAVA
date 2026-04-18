// WAP to count number of string in a list that starts with a specefic lettwer using stream
import java.util.Arrays;
import java.util.List;
public class CountNumber {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "avocado", "grape", "apricot");
        char letter = 'a';
        long count = list.stream().filter(s -> s.startsWith(String.valueOf(letter))).count();
        System.out.println("Number of strings that start with " + letter + " : " + count);
    }
}
