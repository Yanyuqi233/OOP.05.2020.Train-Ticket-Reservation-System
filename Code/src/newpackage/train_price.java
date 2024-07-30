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
public class train_price {
    private String T_id;
    private String T_name;
    private String T_seattype;
    private String T_price;
    private String T_number;
    private String T_date;

    
    public train_price()
    {
        
    }
    public train_price(String T_id,String T_name,String T_seattype)
    {   T_id=T_id;
        T_name=T_name;    
        T_seattype=T_seattype;
    }
    
    public String GetT_name()
    {
        return T_name;
    }
    public void setT_name(String T_name)
    {
        this.T_name=T_name;
    }
    public String GetT_seattype()
    {
        return T_seattype;
    }
    public void setT_seattype(String T_seattype)
    {
        this.T_seattype=T_seattype;
    }
    public String GetT_id()
    {
        return T_id;
    }
    public void setT_id(String T_id)
    {
        this.T_id=T_id;
    }
    public String GetT_price()
    {
        return T_price;
    }
    public void setT_price(String T_price)
    {
        this.T_price=T_price;
    }
     public String GetT_number()
    {
        return T_number;
    }
    public void setT_number(String T_number)
    {
        this.T_number=T_number;
    }
    public String GetT_date(){
        return T_date;
    }
    public void setT_date(String T_date)
    {
        this.T_date=T_date;
    }   
   



}
