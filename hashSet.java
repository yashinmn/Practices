import java.util.HashSet;

class hashSet
{
    public static void main(String[] args) 
	{
        HashSet<Integer> Number = new HashSet<>();

        Number.add(2);
        Number.add(4);
        Number.add(6);
        System.out.println("HashSet: " + Number);

        HashSet<Integer> numbers = new HashSet<>();
        
        numbers.addAll(Number);
        numbers.add(5);
        System.out.println("New HashSet: " + numbers);
        }
}