import java.sql.*;

public class JDBC_CURD
{
    public static void main(String A[])
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/PPA54","root","");
            
            Statement smt=con.createStatement();
            
            //C opreation
            smt.executeUpdate("Insert into student values(6,'Shubham','PUNE',90)");

            //R opreation
            ResultSet rs=smt.executeQuery("select*from student");

            
           
           


           
            while(rs.next())
            {
                System.out.println("Rollno:"+rs.getInt("Rollno"));
                System.out.println("Name:"+rs.getString("name"));
                System.out.println("Marks:"+rs.getInt("marks"));;

                System.out.println("--------------------------------------------");

            }
           
           //U opreation
            smt.executeUpdate("Update student set marks=10 where rollno=1");

            //D opreation
            smt.executeUpdate("Delete from student where rollno=2");
            
            rs.close();
            smt.close();
            con.close();
           

    }
    catch(Exception e)
    {
         System.out.println("Excepetion occoured"+e);



    }
}}