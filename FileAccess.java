/*
بسم الله الرحمن الرحيم
 */
package project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author ayah
 */

public class FileAccess {
    Knapsack p = new Knapsack();   
    String[]terms;
    String line;
    
    public Knapsack[] pass(){
        
        int n = numOfLines();
        int i = 0 ,j =0,b=0;
        Knapsack data[] = null; 
      
        File x= new File("data");
        if(x.exists()){
            
            Scanner input = null;//initilalize input scanner
            try {
                input = new Scanner(x); // Scanning

            } catch (FileNotFoundException ex) {
                System.out.println("noooooo data!!!!!!!!!!!");//handles the exception 
            }

            while (input.hasNext()) {//a loop until the has lines
            
                String line = input.nextLine(); //reads file line by line
               terms = line.split(" "); //split  each line on the space 
                
                i=Integer.parseInt(terms[0]); //weight
                p.setProfit(i);
                j=Integer.parseInt(terms[1]);//time
                p.setTime(j);
                p.setOneHourWeight(i/j);
            }//end of while loop
        }  //end of if statement 
        return data;
        
    }//end of data method
    
  
    public int numOfLines() {//calculates num of file's line
        int num = 0;//initialize num

        File x = new File("data"); //This is used to input the movies text

        if (x.exists()) {//checks of the file exist

            Scanner input = null;//initilalize input scanner
            try {
                input = new Scanner(x);             
            } catch (FileNotFoundException ex) {
            System.out.println("File is not exist");
            }

            while (input.hasNext()) {//checks if the file has nextLine
                line = input.nextLine(); // This is used to get to the next line
                if (line != null) {//checks if the file has data
                    num++;//increments number of lines
                }//end of if statement

            }//end of while loop
            input.close();
        }//end of if statement

        return num;//returns number of file's lines
    }//end of method


}//end of class
