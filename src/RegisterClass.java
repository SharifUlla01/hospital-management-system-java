
import java.io.FileWriter;
import java.io.IOException;


public class RegisterClass {
   private String name;
   private String phoneNo;
   private String email;
   private String password;
    

 public void setValue(String name,String phoneNo,String email,String password){
        this.name=name;
        this.phoneNo=phoneNo;
        this.email=email;
        this.password=password;
   }
   
   

 public void dataWriteinFile(){
        try {
      FileWriter myWriter = new FileWriter("registeruser.txt",true);
      myWriter.write("\nName:"+name);
      myWriter.write("\r\nPhone:"+phoneNo);
      myWriter.write("\r\nEmail:"+email);
      myWriter.close();
      System.out.println("Successfully Register");
    } catch (IOException e) {
      System.out.println("A Error found");
    }
   }
}
