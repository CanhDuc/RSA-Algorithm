/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.FileInputStream;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import javax.crypto.Cipher;

/**
 *
 * @author Duc Canh HNA
 */
public class Encrypt {

    public PublicKey createPublicKey() {
        PublicKey pubKey = null;
        try {
            // Đọc file chứa public key
            FileInputStream fis = new FileInputStream("./savekey/publicKey.rsa");
            byte[] b = new byte[fis.available()];
            fis.read(b);
            fis.close();

            // Tạo public key
            X509EncodedKeySpec spec = new X509EncodedKeySpec(b);
            KeyFactory factory = KeyFactory.getInstance("RSA");
            pubKey = factory.generatePublic(spec);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return pubKey;
    }

    public String Encrypt(String input) {
        String strEncrypt = null;
        try {
            // Mã hoá dữ liệu
            Cipher c = Cipher.getInstance("RSA");
            c.init(Cipher.ENCRYPT_MODE, createPublicKey());
            byte encryptOut[] = c.doFinal(input.getBytes());
            strEncrypt = Base64.getEncoder().encodeToString(encryptOut);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return strEncrypt;
    }
}
