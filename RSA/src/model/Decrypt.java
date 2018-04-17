/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.FileInputStream;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;

import javax.crypto.Cipher;

/**
 *
 * @author Duc Canh HNA
 */
public class Decrypt {

    public PrivateKey creatPrivateKey() {
        PrivateKey priKey = null;
        try {
            // Đọc file chứa private key
            FileInputStream fis = new FileInputStream("./savekey/privateKey.rsa");
            byte[] b = new byte[fis.available()];
            fis.read(b);
            fis.close();

            // Tạo private key
            PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(b);
            KeyFactory factory = KeyFactory.getInstance("RSA");
            priKey = factory.generatePrivate(spec);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return priKey;
    }

    public String Decrypt(String input) {
        String decryptResult = null;
        try {
            // Giải mã dữ liệu
            Cipher c = Cipher.getInstance("RSA");
            c.init(Cipher.DECRYPT_MODE, creatPrivateKey());
            byte decryptOut[] = c.doFinal(Base64.getDecoder().decode(input));

            decryptResult = new String(decryptOut);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return decryptResult;
    }
}
