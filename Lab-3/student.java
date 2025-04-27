import java.util.Scanner;
public class student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter no. of students:");
        n=sc.nextInt();
        int[] roll=new int[n];
        String[] name=new String[n];
        float[] cgpa=new float[n];
        int i;
        for(i=0;i<n;i++)
        {
            System.out.print("Enter Roll No. of student "+(i+1)+": ");
            roll[i]=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name of student "+(i+1)+": ");
            name[i]=sc.nextLine();
            System.out.print("Enter CGPA of student "+(i+1)+": ");
            cgpa[i]=sc.nextFloat();
        }
        int flag=0;
        float min=cgpa[0];
        for(i=0;i<n;i++){
            if(min>cgpa[i]){
                min=cgpa[i];
                flag=i;
            }
        }
        System.out.println("Name\t\tRoll No.\tCGPA");
        for(i=0;i<n;i++)
        {
            System.out.println(name[i]+"\t"+roll[i]+"\t\t"+cgpa[i]);
        }
        System.out.println("The lowest CGPA: "+min+" is of Student: "+name[flag]);
        sc.close();
    }
}
