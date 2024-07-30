/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Administrator
 */
import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class FormObject {
    public control thecontrol;
    public train thetrain[];
    public hsrailway thehsrailway[];
    
    public FormObject()
    {
        
    }
    
    public void ShowInfo(Component com,String strinfo)
    {
        JOptionPane.showMessageDialog(com, strinfo);    
    }
    public void ShowSuccessInfo(Component com,String strinfo)
    {
        JOptionPane.showMessageDialog(com, strinfo);    
    }
   
    
}


