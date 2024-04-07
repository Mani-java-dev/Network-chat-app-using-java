import java.net.*;
import java.io.*;
import java.util.Scanner;

class ServerApp{
      public static void main(String[] args){
         System.out.println("************************");
         System.out.println();
         System.out.println(".......Net..chat........");
         System.out.println();
         System.out.println("************************");
   
       try{ 
            InetAddress ip=InetAddress.getLocalHost();
            System.out.println("you ip address is "+ ip);
            System.out.println("wating for client.....");
          //create server
          ServerSocket ss=new ServerSocket(3434);
          Socket s=ss.accept();
          DataInputStream di=new DataInputStream(s.getInputStream());
          DataOutputStream dout=new DataOutputStream(s.getOutputStream());
          Scanner ob=new Scanner(System.in);
          System.out.println("Chat system is ready for client");
          
          String rec=" ";
          while(rec!="end"){
          
                 rec=di.readUTF();
                 System.out.println("recived msg "+ rec);
          
                 System.out.print("send msg:");
                 String send=ob.nextLine();
                 dout.writeUTF(send);
                 dout.flush();   
         } 
         di.close();
         dout.close();
         s.close();
         
     }catch(Exception e){
       
     }
                 
 }
}        
                 
          
          
          

