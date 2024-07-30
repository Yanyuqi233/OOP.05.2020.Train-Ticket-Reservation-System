/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.sql.Date;


/**
 *
 * @author Administrator
 */
public class hsrailway_price {
    private String H_id;
    private String H_name;
    private String H_seattype;
    private String H_price;
    private String H_number;
    private String H_date;

  

    
    public hsrailway_price()
    {
        
    }
    public hsrailway_price(String H_id,String H_name,String H_seattype)
    {   H_id=H_id;
        H_name=H_name;    
        H_seattype=H_seattype;
    }
    
    public String GetH_name()
    {
        return H_name;
    }
    public void setH_name(String H_name)
    {
        this.H_name=H_name;
    }
    public String GetH_seattype()
    {
        return H_seattype;
    }
    public void setH_seattype(String H_seattype)
    {
        this.H_seattype=H_seattype;
    }
    public String GetH_id()
    {
        return H_id;
    }
    public void setH_id(String H_id)
    {
        this.H_id=H_id;
    }
    public String GetH_price()
    {
        return H_price;
    }
    public void setH_price(String H_price)
    {
        this.H_price=H_price;
    }
     public String GetH_number()
    {
        return H_number;
    }
    public void setH_number(String H_number)
    {
        this.H_number=H_number;
    }
    public String GetH_date(){
        return H_date;
    }
    public void setH_date(String H_date)
    {
        this.H_date=H_date;
    }    
   



}
