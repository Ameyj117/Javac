public class Swapnumbers {
    public static void main(String[] args){
    int a=10;
    int b=60;
    System.out.println("A before swapping: " + a);
    System.out.println("B before swapping: " + b);
    // int c;
    // c=b;
    // b=a;
    // a=c;
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("A after swapping: " + a);
    System.out.println("B after swapping: " + b);
    }
}
