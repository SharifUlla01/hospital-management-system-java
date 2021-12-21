
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class DoctorInfoClass {
     String fileName;
     String listofDoctor="";
     
     
     //assng file name
         public DoctorInfoClass(String fileName){
         this.fileName=fileName;
     }
     
     //read list from file
      public void readList(){
       try {
      File doctorFile = new File(fileName);
      Scanner readDoctors= new Scanner(doctorFile);
      listofDoctor="";
      while (readDoctors.hasNext()) {
         listofDoctor  += readDoctors.nextLine()+"\n";
        
      }
     System.out.println("Successfully read the list");
     // readDoctors.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");}
      
    }
      
      public String getList(){
          return listofDoctor;
      }
}
