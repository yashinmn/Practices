public class RemoveWhitespace {

    public static void main(String[] args)
 {
        String sentence = "Removing white space in java";        
        sentence = sentence.replaceAll("\\s", "");
        System.out.println(sentence);
    }
}