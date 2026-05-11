import java.io.*;
import java.net.*;

class ChatServer
{
    public static void main (String a[]) throws Exception
    {
        System.out.println("Server Application is running");

        ServerSocket ssobj=new ServerSocket(2100);

        System.out.println("Server is Wating at Port 2100");

        Socket sobj=ssobj.accept();

        System.out.println("Client Request Gets accepted Sucessfully");

        PrintStream pobj= new PrintStream(sobj.getOutputStream());

        BufferedReader bobj1= new BufferedReader(new InputStreamReader(sobj.getInputStream()));

        BufferedReader bobj2=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("----------------------------------");
        System.out.println("------Marvallous Chat Server------");
        System.out.println("----------------------------------");

        String str1=null;
        String  str2=null;

        while((str1=bobj1.readLine())!=null)
        {
            System.out.println("Server says:"+ str1);
            System.out.println("Enter Massage for client:");
            str2=bobj2.readLine();
            pobj.println(str2);

           
        }




    }
}