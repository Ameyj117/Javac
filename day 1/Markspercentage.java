public class Markspercentage {
    public static void main(String[] args) {
        int marksmath = 85;
        int marksenglish = 90;
        int marksscience = 80;
        int markshindi = 75;
        int total = 400;
        int totalMarks = marksmath + marksenglish + marksscience + markshindi;
        float percentage = (float)(totalMarks) / (float)(total) * 100;
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Total Marks: " + totalMarks);
    }
}