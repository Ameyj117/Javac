public class twodarrayaccess {
    public static void main(String[] args){
        int[][] arr = {{10, 20, 30,40,50}, {70,80,90,100,110}};
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
