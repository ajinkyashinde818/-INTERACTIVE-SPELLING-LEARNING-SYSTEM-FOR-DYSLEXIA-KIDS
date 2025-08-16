/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeacherOperations;

import db.DBDriver;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author HP
 */
public class WordPicker {
     public String pickWord(int option) {
        String word = null;
        try {
            DBDriver db = new DBDriver();
            Statement st = db.getStatement();

            
            String query = "SELECT * FROM word_info";
            ResultSet rs = st.executeQuery(query);
            ArrayList<String> words = new ArrayList<>();

            while (rs.next()) {
                
                if (option == 6) {
                    words.add(rs.getString(2)); // 2nd column
                } else if (option == 7) {
                    words.add(rs.getString(3)); // 3rd column
                } else if (option == 8) {
                    words.add(rs.getString(4)); // 4th column
                }
            }

            
            if (!words.isEmpty()) {
                Random rand = new Random();
                word = words.get(rand.nextInt(words.size()));
            }
            System.out.println("Word :"+word);

            rs.close();
            st.close();
        } catch (Exception e) {
            System.out.println("Exception in WordPicker.pickWord(): " + e);
        }
        return word;
    }
    
}
