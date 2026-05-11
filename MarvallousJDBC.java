import java.sql.*;

public class MarvallousJDBC
{
    public static void main(String A[])
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/PPA54","root","");
            
            Statement smt=con.createStatement();
            ResultSet rs=smt.executeQuery("SELECT*from student");
           
            while(rs.next())
            {
                System.out.println("Rollno:"+rs.getInt("Rollno"));
                System.out.println("Name:"+rs.getString("name"));
                System.out.println("Marks:"+rs.getInt("marks"));;

                System.out.println("--------------------------------------------");

            }
            rs.close();
            smt.close();
            con.close();
           

    }
    catch(Exception e)
    {
         System.out.println("Excepetion occoured"+e);



    }
}}