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
public class passenger{
    private String P_phone;
    private String P_address;
    private String P_id;
    private String P_password;
    private String P_email;
    private String P_name;
    private String P_age;
    private String P_sex;
    public passenger()
    {
       
    }
    public passenger(String P_name)
    {
        P_name=P_name;
    }
    public passenger(String P_name,String P_password) {
        super();
        P_name=P_name;
        P_password=P_password;
    }
    
    public String GetP_name(){
        return P_name;
    }
    public void setP_name(String P_name)
    {
        this.P_name=P_name;
    }
    public String GetP_password(){
        return P_password;
    }
    public void setP_password(String P_password)
    {
        this.P_password=P_password;
    }
    public String GetP_phone(){
        return P_phone;
    }
    public void setP_phone(String P_phone)
    {
        this.P_phone=P_phone;
    }
 public String GetP_address(){
        return P_address;
    }
    public void setP_address(String P_address)
    {
        this.P_address=P_address;
    }
 public String GetP_id(){
        return P_id;
    }
 public void setP_id(String P_id)
    {
        this.P_id=P_id;
    }
 public String GetP_email(){
        return P_email;
    }
    public void setP_email(String P_email){
        this.P_email=P_email;
    }
public String GetP_age(){
        return P_age;
    }
    public void setP_age(String P_age)
    {
        this.P_age=P_age;
    }
public String GetP_sex(){
        return P_sex;
    }
    public void setP_sex(String P_sex)
    {
        this.P_sex=P_sex;
    }

    void P_age(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
