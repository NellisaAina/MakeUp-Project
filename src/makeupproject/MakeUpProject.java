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
public class MakeUpProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TypeOfMakeup t = new TypeOfMakeup("Lipstick", "Eyeshadow", "Mascara", "Blusher");
        Branding b = new Branding("Fenty Beauty", "Maybelline", "MAC", "Revlon");

        System.out.println("Type of Makeup: " + t.getLipstick());
        System.out.println("Brand that this type have: ");
        System.out.println(b.getBrand1());
        System.out.println(b.getBrand2());
        System.out.println(b.getBrand3());
        System.out.println(b.getBrand4());
        System.out.println("");
        
        System.out.println("Type of Makeup: " + t.getEyeshadow());
        System.out.println("Brand that this type have: ");
        System.out.println(b.getBrand1());
        System.out.println(b.getBrand2());
        System.out.println(b.getBrand3());
        System.out.println(b.getBrand4());
        System.out.println("");
        
        System.out.println("Type of Makeup: " + t.getMascara());
        System.out.println("Brand that this type have: ");
        System.out.println(b.getBrand1());
        System.out.println(b.getBrand2());
        System.out.println(b.getBrand3());
        System.out.println(b.getBrand4());
        System.out.println("");
        
        System.out.println("Type of Makeup: " + t.getBlusher());
        System.out.println("Brand that this type have: ");
        System.out.println(b.getBrand1());
        System.out.println(b.getBrand2());
        System.out.println(b.getBrand3());
        System.out.println(b.getBrand4());
        System.out.println("");
        
        
        
    }
    
}
