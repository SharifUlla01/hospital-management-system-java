
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class PaitentClass {
      String fileName;
     String listofPaitent="";
     
     
     //assng file name
         public PaitentClass(String fileName){
         this.fileName=fileName;
     }
     
     //read list from file
      public void readList(){
       try {
      File paitentFile = new File(fileName);
      Scanner readDoctors= new Scanner(paitentFile);
      listofPaitent="";
      while (readDoctors.hasNext()) {
         listofPaitent  += readDoctors.nextLine()+"\n";
        
      }
     System.out.println("Successfully read the list");
     // readDoctors.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");}
      
    }
      
      public String getList(){
          return listofPaitent;
      }
}
