/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 *
 * @author Duc Canh HNA
 */
public class Sender {

    private String input;
    private String encrypt;

    public Sender() {

    }

    public Sender(String input, String encrypt) {
        this.input = input;
        this.encrypt = encrypt;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(String encrypt) {
        this.encrypt = encrypt;
    }

}
