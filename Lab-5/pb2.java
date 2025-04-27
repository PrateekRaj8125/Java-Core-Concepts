interface Motor{
    int capacity=100;
    void run();
    void consume();
}
class WashingMachine implements Motor{
    public void run(){
        System.out.println("Motor is running...");
    }
    public void consume(){
        System.out.println("Motor is Consuming Power...");
    }
    void display(){
        System.out.println("Capacity of Motor is "+capacity+" watts");
    }
}
public class pb2 {
   public static void main(String[] args) {
       WashingMachine wm=new WashingMachine();
       wm.run();
       wm.consume();
       wm.display();
   }
}
