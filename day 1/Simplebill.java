public class Simplebill {
    public static void main(String[] args){
        int quantity = 5;
        double price = 10.5;
        double subtotal = quantity * price;
        double taxRate = 0.18;
        double taxAmount = subtotal * taxRate;
        double total = subtotal + taxAmount;
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Total: " + total);
    }
    
}
