/*
بسم الله الرحمن الرحيم
 */

/*A simple java programe 
to calculate the higest profit 
as a dynamic solution
using fractional knapsak*/

/*Time Complexity O(M*N)
M -> Max Time 
N -> Number of Projects
*/

/*Author : Ayah Sa'fin*/
package project1;

import java.util.Arrays;

/**
 *
 * @author ayah
 */
public class Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int max = 6;
        int[] weight = {4, 28, 32, 25};
        int[] time = {2, 2, 2, 5};
        int n = weight.length;
        res(weight, time, max);

    }//end of main class\

    /*the res method is to calculate the final profit*/
    public static void res(int[] weight, int time[], int max) {
        int i = 0, j = 0;//loop's vars
        int array[][] = new int[weight.length][max];//2D array 
        int oneHourWeight[] = new int[weight.length];
        int[] currentTime = new int[max];
        for (i = 0; i < weight.length; i++) {//a loppt to fill oneHourWeight -> oneHourWeihght = weight for each project / the time to get the full time 
            oneHourWeight[i] = weight[i] / time[i];
        }//end of for loop
        for (i = 1; i < max; i++) {//a loop to fill the current Time array
            currentTime[i] = i;
        }//end of foor loop 
        for (i = 0; i < weight.length; i++) {//fills the fisrt col
            for (j = 1; j < max && time[0] >= j; j++) {
                array[0][j] = oneHourWeight[0] * currentTime[j];
            }//end of inner loop
        }//end of outer loop 

        for (i = 1; i < weight.length; i++) {//a nested loop is to fill the array from column 2

            for (j = 0; j < max && time[i] >= j; j++) {
                if (array[i - 1][j] == 0) {//cases which the time of previous column is less than thu current
                    array[i][j] = currentTime[j] * oneHourWeight[i];//no need to compare becuase the data in i-1,j is zero 
                } else {//cases which the previous column data not equal to zero 
                    array[i][j] = Math.max(currentTime[j] * oneHourWeight[i], array[i-1][j]);
                }//end of else statement
            }//end of inner for loop 
        }//inner of outer loop 

        System.out.println(Arrays.deepToString(array));//prints the 2D array 

    }//end of method 

}//end of class 
