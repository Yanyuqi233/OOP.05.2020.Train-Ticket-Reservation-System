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
public class admin_{
    private String A_id;
    private String A_password;
    public admin_()
    {
     super();   
    }
    
    public String GetA_id(){
        return A_id;
    }
    public void setA_id(String A_id)
    {
        this.A_id=A_id;
    }
    
    public String GetA_password(){
        return A_password;
    }
    public void setA_password(String A_password)
    {
        this.A_password=A_password;
    }
}
