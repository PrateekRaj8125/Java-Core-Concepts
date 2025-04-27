import java.util.*;
public class caculateCost extends dimensions{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        dimensions d=new dimensions();
        System.out.println("Shapes\tRate:");
        System.out.println("1.Sheet\t₹40");
        System.out.println("2.Box\t₹60");
        System.out.print("Enter your choice:");
        n=sc.nextInt();
        if(n==1)
        {
            System.out.print("Enter length:");
            l=sc.nextInt();
            System.out.print("Enter breadth:");
            b=sc.nextInt();
            System.out.println("Price of Sheet:"+d.sheet(l,b));
        }
        else if(n==2)
        {
            System.out.print("Enter length:");
            l=sc.nextInt();
            System.out.print("Enter breadth:");
            b=sc.nextInt();
            System.out.print("Enter height:");
            h=sc.nextInt();
            System.out.println("Price of Box:"+d.box(l,b,h));
        }
        else
            System.out.println("Wrong choice entered");
    }
}
class dimensions {
    static int l,b,h;
    public int sheet(int length, int breadth)
    {
        int cost=40*length*breadth;
        return cost;
    }
    public int box(int length, int breadth, int height)
    {
        int cost=60*length*breadth*height;
        return cost;
    }
}
