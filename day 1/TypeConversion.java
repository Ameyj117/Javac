public class TypeConversion {
    public static void main(String[] args) {
        int number = 100;
        double number2 = number;
        double amount = 9999.75;
        int amount2 = (byte) amount;
        //Narrowing
        System.out.println("Narrowing");
        System.out.println(amount);
        System.out.println(amount2);
        //Widening
        System.out.println("Widening");
        System.out.println(number);
        System.out.println(number2);
    }

}