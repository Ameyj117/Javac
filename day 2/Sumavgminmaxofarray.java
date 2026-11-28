public class Sumavgminmaxofarray {
    public static void main(String[] args){
        int[] marks={15,19,29,10,200};
        int min =marks[0];
        int max = marks[0];
        int sum=marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
        double avg=sum/(double)marks.length;  
        System.out.println("Sum of array is: "+sum);
        System.out.println("Average of array is: "+avg);
        for (int i=0;i<marks.length;i++){
            if(marks[i]<min){
                min=marks[i];
            }
            if(marks[i]>max){
                max=marks[i];
            }
        }
        System.out.println("Minimum value in array is: "+min);
        System.out.println("Maximum value in array is: "+max);
    }}
    

