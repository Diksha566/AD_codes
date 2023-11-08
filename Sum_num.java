import java.util.Scanner;

public class Sum_num {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the numbers");
        int n = sc.nextInt();
        int result= n*(n+1)/2;
        System.out.println(result);
     

    }
}
