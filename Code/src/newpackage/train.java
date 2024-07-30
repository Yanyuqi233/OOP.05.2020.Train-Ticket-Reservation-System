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
public class train extends train_price{
     static void update(String sql, String time) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String T_id;
    private String T_name;
    private Time T_leavetime;
    private Time T_arrivetime;
    private String T_departure;
    private String T_destination;
    private String T_date;
      
    public train()
    {
       super(); 
    }
    public train(String T_id)
    {
        super();
        T_id=T_id;
    }
    public train(String T_id,String T_name) {
        super();
        T_id=T_id;
        T_name=T_name;
    }
    
    public String GetT_id(){
        return T_id;
    }
    public void setT_id(String T_id)
    {
        this.T_id=T_id;
    }
    
    public String GetT_name(){
        return T_name;
    }
    public void setT_name(String T_name)
    {
        this.T_name=T_name;
    }
    public Time GetT_leavetime(){
        return T_leavetime;
    }
    public void setT_leavetime(Time T_leavetime)
    {
        this.T_leavetime=T_leavetime;
    }
    public Time GetT_arrivetime(){
        return T_arrivetime;
    }
    public void setT_arrivetime(Time T_arrivetime)
    {
        this.T_arrivetime=T_arrivetime;
    }
 public String GetT_departure(){
        return T_departure;
    }
    public void setT_departure(String T_departure)
    {
        this.T_departure=T_departure;
    }
 public String GetT_destination(){
        return T_destination;
    }
    public void setT_destination(String T_destination)
    {
        this.T_destination=T_destination;
    } 
    public String GetT_date(){
        return T_date;
    }
    public void setT_date(String T_date)
    {
        this.T_date=T_date;
    } 

  
    
    
    
}
