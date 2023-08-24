import java.io.*;
import java.util.*;

public class StringLexicographical {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int c=A.length();
        int d=B.length();
        int k=c+d;
        System.out.println(k);
        int i=0,j=0;
        if(c==d){
            System.out.println("No");
        }
        if(c!=d){
            while(i<A.length() && j<B.length())
            {
                if(A.charAt(i)>B.charAt(j)){
                    System.out.println("Yes");break;
                }
                else if(A.charAt(i)<B.charAt(j)){
                    System.out.println("No");break;
                }
                
                else{
                    i++;j++;
                }
            }
            if((A.length()==i && j<B.length())||(i<A.length()&&j==B.length()))
                System.out.println("No");
        }
       
        String output=A.substring(0, 1).toUpperCase() +A.substring(1);
        String output2=B.substring(0, 1).toUpperCase() +B.substring(1);
        System.out.println(output+" "+output2); 
    }
}



