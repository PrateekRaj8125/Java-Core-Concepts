import java.util.Scanner;
public class program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a random positive integer:");
        int num = sc.nextInt();
        int dn=num, rev=0;
        while(dn>0)
        {
            int rem=dn%10;
            rev=rev*10+rem;
            dn=dn/10;
        }
        if (rev==num)
            System.out.println("The number is a palindrome.");
        else
            System.out.println("The number is not a palindrome.");
    }
}
