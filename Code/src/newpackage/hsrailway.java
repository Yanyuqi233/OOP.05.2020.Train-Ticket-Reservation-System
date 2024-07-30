/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.sql.Time;


/**
 *
 * @author Administrator
 */
public class hsrailway extends hsrailway_price{
     static void update(String sql, String time) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String H_id;
    private String H_name;
    private Time H_leavetime;
    private Time H_arrivetime;
    private String H_departure;
    private String H_destination;
    private String H_date;  
    public hsrailway()
    {
       super(); 
    }
    public hsrailway(String H_id)
    {
        super();
        H_id=H_id;
    }
    public hsrailway(String H_id,String H_name) {
        super();
        H_id=H_id;
        H_name=H_name;
    }
    
    public String GetH_id(){
        return H_id;
    }
    
    public void setH_id(String H_id)
    {
        this.H_id=H_id;
    }
    
    public String GetH_name(){
        return H_name;
    }
    public void setH_name(String H_name)
    {
        this.H_name=H_name;
    }
    public Time GetH_leavetime(){
        return H_leavetime;
    }
    public void setH_leavetime(Time H_leavetime)
    {
        this.H_leavetime=H_leavetime;
    }
    public Time GetH_arrivetime(){
        return H_arrivetime;
    }
    public void setH_arrivetime(Time H_arrivetime)
    {
        this.H_arrivetime=H_arrivetime;
    }
 public String GetH_departure(){
        return H_departure;
    }
    public void setH_departure(String H_departure)
    {
        this.H_departure=H_departure;
    }
 public String GetH_destination(){
        return H_destination;
    }
    public void setH_destination(String H_destination)
    {
        this.H_destination=H_destination;
    }    
    public String GetH_date(){
        return H_date;
    }
    public void setH_date(String H_date)
    {
        this.H_date=H_date;
    } 
    
    
    
}
