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
public class Receiver {

    private String input;
    private String decrypt;

    public Receiver() {

    }

    public Receiver(String output, String decrypt) {
        this.input = output;
        this.decrypt = decrypt;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getDecrypt() {
        return decrypt;
    }

    public void setDecrypt(String decrypt) {
        this.decrypt = decrypt;
    }

}
