package hackerrank;
import java.util.*;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // create an input object
        int n = sc.nextInt();            
        String ans = "";
        if (n % 2 == 0 && n >= 2 && n <= 5 ) {
          ans = "Not Weird";
        }
        else if(n % 2 == 0 && n >= 6 && n <= 20) {
        	ans = "Weird";
        }
        else if(n % 2 == 0 && n > 20) {
        	ans = "Not Weird";
        }
        else{
            ans = "Weird";
            
        }
        System.out.println(ans);
        
    }
}

