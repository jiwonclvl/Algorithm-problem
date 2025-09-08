import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        double[] grades = new double[n];
        int maxGrade = 0;
        double sum = 0.0;
        
        for(int i = 0; i < n; i++) {
            int grade = sc.nextInt();
            
            if (grade > maxGrade) {
                maxGrade= grade;    
            }
             
            grades[i] = (double) grade;
        }
        
        for (double grade : grades) {
            double newGrade = grade / maxGrade * 100;
            sum += newGrade;
        }
        
        System.out.printf("%.2f", sum / n);
        
    }
}