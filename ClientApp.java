import java.net.*;
import java.io.*;
import java.util.Scanner;

class ClientApp{
      public static void main(String[] args){
         System.out.println("************************");
         System.out.println();
         System.out.println(".......Net..chat........");
         System.out.println();
         System.out.println("************************");
         Scanner o=new Scanner(System.in);
         System.out.println("Enter localhost server ip adresss >>>>");
         String lh=o.nextLine();
        
        try{
          
          Socket ss=new Socket(lh,3434);
          
          DataInputStream di=new DataInputStream(ss.getInputStream());
          DataOutputStream dout=new DataOutputStream(ss.getOutputStream());
          Scanner obj=new Scanner(System.in);
          System.out.println("Chat system is ready lets chat");
          String rec=" ";
          while(rec!="end"){
                
                 System.out.print("Client msg:");
                 String send=obj.nextLine();
                 dout.writeUTF(send);
                 dout.flush();
                 rec=di.readUTF();
                 System.out.println("server msg "+ rec);
         } 
         di.close();
         dout.close();
         ss.close();
         
     }catch(Exception e){

     }
                 
 }
}        
                 
          
          
          

