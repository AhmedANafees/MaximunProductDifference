
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nafea8846
 */
public class MaximumProductDifference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numArray = new int[5];
        //holds value of assigned int;
        int holderInt;
        int largestInt = 0;
        int smallestInt = 0;
        //get Input for each index in numArray 
        for (int i = 0; i < numArray.length; i++) {
            System.out.println("Enter in a Number");
            numArray[i] = input.nextInt();
        }
        
        //goes through numArray
        for (int i = 0; i < numArray.length; i++) {
            
            //prints current value of numArray indexes
            for (int j = 0; j < numArray.length; j++) {
                System.out.print(numArray[j]);
            }
            
            System.out.println("");
            
            //goes through numArray
            for (int j = i + 1; j < numArray.length; j++) {
                if (numArray[i] > numArray[j]) {

                    //swaps values of two indexes in numArray
                    holderInt = numArray[i];
                    numArray[i] = numArray[j];
                    numArray[j] = holderInt;
                }
            }
        }
        if (numArray[0] < 0 && numArray[0]*-1 >= numArray[4]){
            largestInt = numArray[2]*numArray[3];
            smallestInt = numArray[0]*numArray[4];
        }
        else if (numArray[0] > 0){
            largestInt = numArray[4]*numArray[3];
            smallestInt = numArray[0]*numArray[1];
        }
        else {
            largestInt = numArray[4]*numArray[3];
            smallestInt = numArray[0]*numArray[2];
        }
        if(numArray[0] < 0 && numArray[1]< 0 && numArray[2] < 0 && numArray[3] < 0 && numArray[4] < 0){
            largestInt = numArray[0]*numArray[1];
            smallestInt = numArray[4]*numArray[3];
        }
        System.out.println(largestInt);
        System.out.println(smallestInt);
        int difference = largestInt - smallestInt;
        System.out.println(difference);
    }

}
