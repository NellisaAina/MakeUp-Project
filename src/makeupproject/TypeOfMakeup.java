/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makeupproject;

/**
 *
 * @author user
 */
public class TypeOfMakeup {
    String lipstick, eyeshadow, mascara, blusher;
    
    public TypeOfMakeup(String lipstick, String eyeshadow, String mascara, String blusher){
        this.lipstick = lipstick;
        this.eyeshadow = eyeshadow;
        this.mascara = mascara;
        this.blusher = blusher;
    }
    
    public void setLipstick(String lipstick){
        this.lipstick = lipstick;
    }
    
    public void setEyeShadow(String eyeshadow){
        this.eyeshadow = eyeshadow;
    }
    
    public void setMascara(String mascara){
        this.mascara = mascara;
    }
    
    public void setBlusher(String blusher){
        this.blusher = blusher;
    }
    
    public String getLipstick(){
        return lipstick;
    }
    
    public String getEyeshadow(){
        return eyeshadow;
    }
    
    public String getMascara(){
        return mascara;
    }
    
    public String getBlusher(){
        return blusher;
    }
}
