import java.util.regex.Pattern;
 

class Regex 
{
     public static void main(String args[])
    { 
        System.out.println(Pattern.matches("geeksforge*ks", "geeksforgeeks")); 
        System.out.println(Pattern.matches("g*geeks*", "geeksfor"));
    }
}