/* Week 10 : Programming Assignment 2

QN : Write the JDBC codes needed to create a Connection interface using the DriverManager
class and the variable DB_URL.  Check whether the connection is successful using 'isAlive(timeout)' 
method to generate the output, which is either 'true' or 'false'.

...............................................................................*/
import java.sql.*;
import java.lang.*;
import java.util.Scanner;
public class Question102 {
    public static void main(String args[]) {
        try {
              Connection conn = null;
              Statement stmt = null;
              String DB_URL = "jdbc:sqlite:/tempfs/db";
              System.setProperty("org.sqlite.tmpdir", "/tempfs");
          
 /*                     Answer is given below for --+ NPTEL +--
...............................................................................*/
            conn = DriverManager.getConnection(DB_URL);
            System.out.print(conn.isValid(1));
//...............................................................................
          // Private test case 
                Scanner sc = new Scanner(System.in);
                int s=sc.nextInt();
                if(s==7){
                    conn.close();
                    System.out.print(conn.isValid(1));
                }

 }
       catch(Exception e){ System.out.println(e);}  
    }
}
