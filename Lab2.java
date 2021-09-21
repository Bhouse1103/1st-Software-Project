package lab2;

//***************************************
//Brooklyn House
//CS232_001
//Lab2.java
//The purpose of this program is to open a txt file, read the grades, and count the number of students having scores in each range below.
//0-24, 25-49, 50-74, 75-99, 100-124, 125-149, 150-174, and 175-200
//The output will show the score ranges and number of scores in each range.
//****************************************

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Lab2 {
    
    public static void main(String[] args) throws IOException {
        
        //variables
            int range1 = 0;
            int range2 = 0;
            int range3 = 0;
            int range4 = 0;
            int range5 = 0;
            int range6 = 0;
            int range7 = 0;
            int range8 = 0;
            
        //Get input.txt
        String line;
        Scanner in = new Scanner(Paths.get("Lab2_input.txt"), "UTF-8");
        while(in.hasNext()){
            int num = in.nextInt();
          
                if (num>=0 && num<=24)
                range1++;
                else if (num > 24 && num <= 49)
                range2++;
                else if (num > 49 && num <= 74)
                range3++;
                else if (num > 74 && num <= 99)
                range4++;
                else if (num > 99 && num <= 124)
                range5++;
                else if (num > 124 && num <= 149)
                range6++;
                else if (num > 149 && num <= 174)
                range7++;
                else if (num > 174 && num <= 200)
                range8++;
        }
                in.close();
                
                //output
                System.out.println("[0-24]: " + range1);
                System.out.println("[25-49]: " + range2);
                System.out.println("[50-74]: " + range3);
                System.out.println("[75-99]: " + range4);
                System.out.println("[100-124]: " + range5);
                System.out.println("[125-149]: " + range6);
                System.out.println("[150-174]: " + range7);
                System.out.println("[175-200]: " + range8);
            }    
    }
