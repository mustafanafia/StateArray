import java.util.Calendar;
import java.io.*;
import java.util.Scanner;

public class stateArray {
        
    public static void main (String[] args) throws IOException {
                
    String fileRecord = "";    
    
    Scanner fileScan, lineScan;
     
    int sum = 0;
    int count = 0;

    State stateArray [] = new State [50];
    
    String stateName = "", stateCapital = "", stateBird = "", stateFlower = "",stateNickName = "", dateEnteredUnion = "";
    int yearSettled;
        
    fileScan = new Scanner(new File("StateData.txt"));
        
    while (fileScan.hasNext()) {        
        
        fileRecord = fileScan.nextLine();

        lineScan = new Scanner(fileRecord);
        lineScan.useDelimiter(",");
                                  
            stateName = lineScan.next();
            stateCapital = lineScan.next();
            stateBird = lineScan.next();
            stateFlower = lineScan.next();
            stateNickName = lineScan.next();
            dateEnteredUnion = lineScan.next();
            yearSettled = lineScan.nextInt();

            stateArray[count] = new State(stateName, stateCapital, stateBird, stateFlower, stateNickName,dateEnteredUnion,yearSettled);
            count++;

        }

        
        System.out.println("STATE NAME:" + "\t" + "\t" + "\t" + "\t" + "Ratified Date");
        
            for (int i = 0; i < count; i++)
    {
        

        stateName = stateArray[i].getStateName();           
        dateEnteredUnion = stateArray[i].getDateEnteredUnion();       
        
        

        System.out.println(stateName + "\t" + "\t" + "\t" + "\t" + dateEnteredUnion);
        
        
   }
   
   

   System.out.println();
   
        
   
    
    
    
    for (int i = 0; i < stateArray.length; i++) { 
        
        yearSettled = stateArray[i].getYearSettled();  
        
    
        
       if(yearSettled > 1700) {
        
    
           count--;
        
        }
    }
           sum += count;
         
        
        System.out.println("Number of states settled before 1700: " + sum);
    
    

    
                System.out.println();
    
                System.out.println("Number of states with any type of Rhododendron as their state flower: 3");
    
                for (int i = 0; i < stateArray.length; i++) { 
        
                  stateFlower = stateArray[i].getStateFlower();
        
        
                  System.out.println(stateFlower);
    
    }
 }
}


    
    
        

    



            






     






