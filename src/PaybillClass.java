
import java.io.FileWriter;
import java.io.IOException;


public class PaybillClass {
     private String method;
   private String accountnumber;
   private String amount;
  
    

 public void setValue(String method,String accountnumber,String amount){
        this.method=method;
        this.accountnumber=accountnumber;
        this.amount=amount;
       
   }
   
   

 public void dataWriteinFile(){
        try {
      FileWriter myWriter = new FileWriter("paybil.txt",true);
      myWriter.write("\nMethod:"+method);
      myWriter.write("\r\nAccount No:"+accountnumber);
      myWriter.write("\r\nAmount:"+amount);
      myWriter.close();
      System.out.println("Successfully paid amount");
    } catch (IOException e) {
      System.out.println("A Error found");
    }
   }
    
}
