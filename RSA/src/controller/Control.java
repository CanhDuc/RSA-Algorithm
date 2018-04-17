/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.security.PrivateKey;
import java.security.PublicKey;
import model.CreateKey;
import model.Decrypt;
import model.Encrypt;

/**
 *
 * @author Duc Canh HNA
 */
public class Control {

    public static CreateKey createkey = new CreateKey();
    public static Encrypt encrypt = new Encrypt();
    public static Decrypt dencrypt = new Decrypt();

    public void Size(int size) {
        createkey.createKey(size);
    }

    public PublicKey createPublicKey() {
        return encrypt.createPublicKey();
    }

    public PrivateKey createPrivateKey() {
        return dencrypt.creatPrivateKey();
    }

    public String Encrypt(String input) {
        return encrypt.Encrypt(input);
    }
    
    public String Dencrypt(String input){
        return dencrypt.Decrypt(input);
    }
}
