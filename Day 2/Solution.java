import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        double c = scan.nextDouble();
        scan.nextLine();
        String r = scan.nextLine();
        scan.close();
        
        System.out.println(i+k);
        System.out.println(d+c);
        System.out.println(s+r);
        
    }
}
