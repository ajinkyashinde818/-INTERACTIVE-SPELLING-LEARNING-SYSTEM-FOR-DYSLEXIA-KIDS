/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spellinglearningsystem;

import java.util.Random;

/**
 *
 * @author HP
 */
public class OTPGenerator {
     public static String generateNumericOTP(int length) {
        Random rand = new Random();
        StringBuilder otp = new StringBuilder();
        for (int i = 0; i < length; i++) {
            otp.append(rand.nextInt(10)); // 0-9 only
        }
        return otp.toString();
    }
}
