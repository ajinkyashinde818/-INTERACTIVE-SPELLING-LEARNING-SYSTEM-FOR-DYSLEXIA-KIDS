/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeacherOperations;

import db.DBDriver;
import java.io.File;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

/**
 *
 * @author HP
 */
public class WordData {
    public boolean isDataStored(String filePath) {
        boolean flag = true;
        ArrayList<String> data = new ArrayList<>();

        try {
            DBDriver db = new DBDriver();
            Statement st = db.getStatement();

            File file = new File(filePath);
            Workbook wobj = Workbook.getWorkbook(file);
            Sheet sht = wobj.getSheet(0);

            int rows = sht.getRows();
            int columns = sht.getColumns();
            System.out.println("Rows = " + rows + " and Columns = " + columns);

            
            for (int j = 0; j < columns; j++) {
                Cell c1 = sht.getCell(j, 0);
                String content = c1.getContents();
                data.add(content);
            }

            
            for (int i = 1; i < rows; i++) {
                String srno = sht.getCell(0, i).getContents().trim();
                String six_character = sht.getCell(1, i).getContents().trim();
                String seven_character = sht.getCell(2, i).getContents().trim();
                String eight_character =sht.getCell(3,i).getContents().trim();

             

                String query = "INSERT INTO word_info (srno, sixchar, sevenchar,eightchar) VALUES (" +
                        srno + ", '" + six_character + "', '" + seven_character + "','"+eight_character+"')";

                System.out.println("Query: " + query);
                st.executeUpdate(query);
            }

            wobj.close();
            st.close();
            db.con.close();

        } catch (Exception e) {
            System.out.println("Exception is occurred in Chatdata in method isDataStored(): " + e);
            flag = false;
        }

        return flag;
    }
     public String[][] getTableData() {
    String[][] tabledata = null;

    try {
        DBDriver db = new DBDriver();

        Statement st1 = db.getStatement();
        Statement st2 = db.getStatement();

        String query = "SELECT * FROM word_info";

        ResultSet rs1 = st1.executeQuery(query);
        int rowcount = 0;
        while (rs1.next()) {
            rowcount++;
        }
        rs1.close();

        ResultSet rs2 = st2.executeQuery(query);
        ResultSetMetaData rsmd = rs2.getMetaData();
        int columncount = rsmd.getColumnCount();

        System.out.println("Row count: " + rowcount);
        System.out.println("Column count: " + columncount);

        
        if (rowcount > 0 && columncount > 0) {
            tabledata = new String[rowcount][columncount];

            int i = 0;
            while (rs2.next()) {
                for (int j = 0; j < columncount; j++) {
                    tabledata[i][j] = rs2.getString(j + 1);
                }
                i++;
            }
        } else {
            System.out.println("⚠️ No data to load from table.");
        }

        rs2.close();
        st1.close();
        st2.close();
        db.con.close();

    } catch (Exception e) {
        System.out.println("Exception is occured Chatdata in getTableData() :"+e);
    }

    return tabledata;
 }
}
