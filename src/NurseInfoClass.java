
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
public class NurseInfoClass {
    String fileName;
     String listofNurse="";
     
     
     //assng file name
         public NurseInfoClass(String fileName){
         this.fileName=fileName;
     }
     
     //read list from file
      public void readList(){
       try {
      File doctorFile = new File(fileName);
      Scanner readDoctors= new Scanner(doctorFile);
      listofNurse="";
      while (readDoctors.hasNext()) {
         listofNurse  += readDoctors.nextLine()+"\n";
        
      }
     System.out.println("Successfully read the list");
     // readDoctors.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");}
      
    }
      
      public String getList(){
          return listofNurse;
      }
}
