/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package penitipanhewann;

import static java.awt.image.ImageObserver.WIDTH;

/**
 *
 * @author Muhamad Wisnu Mubaro
 */
public class PenitipanHewann {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Login_ lg = new Login_();
        lg.setVisible(true);
        lg.pack();
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(WIDTH);        
    }
    
}
