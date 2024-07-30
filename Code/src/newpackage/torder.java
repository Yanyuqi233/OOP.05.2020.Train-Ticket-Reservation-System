/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
/**
 *
 * @author Administrator
 */
public class torder extends train {
    
private String T_name;
private String P_id;
private String T_seattype;
private Timestamp Nowtime;
private String T_date;
private String softype;
private String hardtype;

    
    public torder(){
        super();
    }
    
    
    public String GetP_id(){
        return P_id;
    }
    public void setP_id(String P_id)
    {
        this.P_id=P_id;
    }
    public String GetT_seattype(){
        return T_seattype;
    }
    public void setT_seattype(String T_seattype)
    {
        this.T_seattype=T_seattype;
    }
    
    public String GetT_name(){
        return T_name;
    }
    public void setT_name(String T_name)
    {
        this.T_name=T_name;
    }
    public Timestamp GetNowtime(){
        return Nowtime;
    }
    public void setNowtime(Timestamp Nowtime)
    {
        this.Nowtime=Nowtime;
    } 

 public String GetT_date(){
        return T_date;
    }
    public void setT_date(String T_date)
    {
        this.T_date=T_date;
    }    
    public String Getsoftype(){
        return softype;
    }
    public void setsoftype(String softype)
    {
        this.softype=softype;
    }    
     public String Gethardtype(){
        return hardtype;
    }
    public void sethardtype(String hardtype)
    {
        this.hardtype=hardtype;
    }    
    


public ResultSet PassengerList(Connection con, passenger passenger) throws SQLException {
        StringBuffer sb = new StringBuffer("select train.T_name,train.T_departure,train.T_destination,train.T_leavetime,train.T_arrivetime,torder.T_seattype,train_price.T_price,torder.T_date,train_price.T_date from train_price,train,torder where train.T_name=torder.T_name and train.T_id=train_price.T_id and train_price.T_seattype=torder.T_seattype and train_price.T_date=torder.T_date");
        /**if (student.getSno() != "") {
            sb.append(" and Sno=" + student.getSno());
        }*/
        if (StringUtil.isNotEmpty(passenger.GetP_id())) {
            sb.append(" and P_id = '" + passenger.GetP_id() + "'");
        }
        System.out.println(sb.toString());
        PreparedStatement pstmt = con.prepareStatement(sb.toString());
        return pstmt.executeQuery();
    }


public int SelectionCancel(Connection con)throws Exception{
	String sql="delete from torder where T_name=? and T_date=?";
	PreparedStatement pstmt=con.prepareStatement(sql);
	
	pstmt.setString(1, T_name);
        pstmt.setString(2, T_date);
	return pstmt.executeUpdate();
	}
public int NumSelectedMinus(Connection con)throws Exception{
	String sql="update torder set numSelected = numSelected - 1 where T_name=?";
	PreparedStatement  pstmt=con.prepareStatement(sql);
	pstmt.setString(1, T_name);
	return pstmt.executeUpdate();
	}

public int T_numberMinus(Connection con,String T_name,String T_seattype,String T_date)throws Exception{
	String sql="update train_price set T_number = T_number - 1 where T_name=? and T_seattype=? and T_date=?";
	PreparedStatement  pstmt=con.prepareStatement(sql);
	pstmt.setString(1, T_name);
        pstmt.setString(2, T_seattype);
        pstmt.setString(3, T_date);
	return pstmt.executeUpdate();
	}

public  ResultSet isExisted(Connection con) throws SQLException{   

        String sql = "select * from torder where P_id=? and T_name=? ";
        PreparedStatement pstmt = con.prepareStatement(sql);
	pstmt.setString(1, P_id);
        pstmt.setString(2, T_name);
        return pstmt.executeQuery();
}
public int SelectionAdd(Connection con)throws Exception{
		String sql="insert into torder (T_name,P_id,T_seattype,Nowtime,T_date,softype,hardtype) values(?,?,?,?,?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(sql);
	        
                pstmt.setString(1,T_name);
                pstmt.setString(2,P_id);
                pstmt.setString(3,T_seattype);
               pstmt.setTimestamp(4,Nowtime);
               pstmt.setString(5,T_date);
                pstmt.setString(6,softype);
                 pstmt.setString(7,hardtype);
		return pstmt.executeUpdate();
	}
		
public int T_numberAdd(Connection con,String T_name,String T_seattype,String T_date)throws Exception{
		String sql="update train_price set T_number = T_number  + 1 where T_name=? and T_seattype=? and T_date=?";
		PreparedStatement  pstmt=con.prepareStatement(sql);
		pstmt.setString(1, T_name);
                pstmt.setString(2, T_seattype);
                pstmt.setString(3, T_date);
		return pstmt.executeUpdate();
	}


}
