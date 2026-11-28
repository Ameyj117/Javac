public class evenandodd {
    public static void main(String[] args){
    System.out.println("Odd numbers from 1 to 1000 are:");
    for(int i=1; i<=1000; i++){
        if(i%2==0){
            System.out.println("Even number: " + i);
        } else {
            System.out.println("Odd number: " + i);
        }
    }
    }
}

