/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spellinglearningsystem;

import db.DBDriver;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class TeacherDBOP {
    public boolean isInfoInserted(String name,String mobileno,String emailid,String employeeid,String username,String password){
        //name, mobileno, emailid, employeeid, username, password
        boolean flag=false;
        try{
            DBDriver db=new DBDriver();
            Statement st=db.getStatement();
            String query="Insert into teacher_data_info values('"+name+"','"+mobileno+"','"+emailid+"','"+employeeid+"','"+username+"','"+password+"')";
            System.out.println("Query : "+query);
            if(st.executeUpdate(query)>0){
                flag=true;
                db.st.close();
                db.con.close();
            }
            
        }catch(Exception e){
            flag=false;
            System.out.println("Exception is occured in TeacherDBOP in method isInfoInserted()"+e);
        }
        return flag;
    }
    public static boolean isTeacherExisted(String username,String password){
        boolean flag=false;
        try{
            DBDriver db = new DBDriver();
        Statement st = db.getStatement();
        String query = "SELECT * FROM teacher_data_info WHERE username='" + username + "' AND Password='" + password + "'";
        
        System.out.println("Query is: " + query);

        ResultSet rs = st.executeQuery(query);
        if (rs.next()) {
            flag = true; 
        }
        }catch(Exception e){
            flag=false;
            System.out.println("Exception is occured in TacherDBOP in isTeacherExisted()"+e);
        }
        return flag;
    }
    public ArrayList<String> getClientdata(String clientname) {
        ArrayList<String> data = new ArrayList<>();
        try {
            DBDriver db = new DBDriver();
            Statement st = db.getStatement();
            String query = "SELECT * FROM teacher_data_info WHERE username='" + clientname + "'";
            System.out.println("Query is: " + query);
            ResultSet rs = st.executeQuery(query);
            //name, mobileno, emailid, employeeid, username, password
            if (rs.next()) { 
                data.add(rs.getString("name"));   // 1
                data.add(rs.getString("mobileno"));       // 2
                data.add(rs.getString("emailid"));        // 3
                data.add(rs.getString("employeeid"));     // 4
                data.add(rs.getString("username"));      // 5
                data.add(rs.getString("password"));   // 6
            }
            rs.close();
            st.close();
            db.con.close();
        } catch (Exception e) {
            System.out.println("Exception occurred in TeacherDBOP in method getClientdata() : " + e);
        }
        return data;
    }
     public boolean isEdited(String name,String mobileno,String emailid,String employeeid,String username,String password){
            boolean flag=false;
            //name, mobileno, emailid, employeeid, username, password
            
            try{
                DBDriver db = new DBDriver();
            Statement st = db.getStatement();
            
          String query = "UPDATE teacher_data_info SET " +
                "name = '" + name + "', " +
                "mobileno = '" + mobileno + "', " +
                "emailid = '" + emailid + "', " +
                "employeeid = '" + employeeid + "', " +
                "password = '" + password + "' " +
                "WHERE username = '" + username + "'";
            
           int x=st.executeUpdate(query);
           if(x>0){
               flag=true;
               st.close();
               db.con.close();
               db.st.close();
           }
            }
            catch(Exception e){
                System.out.println("Exception occuried !!! \n  in isEdited method"+e);
            }
            return flag;
        }
}    