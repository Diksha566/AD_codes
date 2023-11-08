import java.util.Scanner;

public class bubbleshort {
    public static void main(String[] args) {
       int arr[] ={4,12,0,9,5,3};
    for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]); //printing array
    }



    for(int j=0; j<arr.length-1; j++){
       

        for(int k =0; k<arr.length-1;k++){ //check 
           
            if(arr[k]> arr[k+1]){
               int  temp= arr[k]; // sawpping
                arr[k]=arr[k+1];
                arr[k+1]=temp;
                
               // System.out.println(temp); // print
            }
        }
        System.out.println("shorted array is");
        for(int l=0; l<arr.length;l++){
            
            System.out.print(arr[l]+ ",");
        }
        

    }

    }
}


