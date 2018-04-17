/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.security.*;

/**
 *
 * @author Duc Canh HNA
 */
public class Key {
    private int size;
    private String publickey;
    private String privatekey;
    public Key(){
        
    }

    public Key(int size, String publickey, String privatekey) {
        this.size = size;
        this.publickey = publickey;
        this.privatekey = privatekey;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getPublickey() {
        return publickey;
    }

    public void setPublickey(String publickey) {
        this.publickey = publickey;
    }

    public String getPrivatekey() {
        return privatekey;
    }

    public void setPrivatekey(String privatekey) {
        this.privatekey = privatekey;
    }

    
    public void ResetPublicKey(){
        this.publickey = null;
    }
    
    public void ResetPrivateKey(){
        this.privatekey = null;
    }
    
}
