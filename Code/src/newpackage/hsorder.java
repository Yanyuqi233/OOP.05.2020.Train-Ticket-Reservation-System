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

public class hsorder extends hsrailway{

private String H_name;
private String H_seattype;
private String P_id;
private Timestamp Nowtime;
private String H_date;


public hsorder(){
    super();
}
public hsorder(String H_id,String H_name){

}


    public String GetP_id(){
        return P_id;
    }
    public void setP_id(String P_id)
    {
        this.P_id=P_id;
    }
    public String GetH_seattype(){
        return H_seattype;
    }
    public void setH_seattype(String H_seattype)
    {
        this.H_seattype=H_seattype;
    }
    
    public String GetH_name(){
        return H_name;
    }
    public void setH_name(String H_name)
    {
        this.H_name=H_name;
    }
    public Timestamp GetNowtime(){
        return Nowtime;
    }
    public void setNowtime(Timestamp Nowtime)
    {
        this.Nowtime=Nowtime;
    }
      public String GetH_date(){
        return H_date;
    }
    public void setH_date(String H_date)
    {
        this.H_date=H_date;
    }    
public ResultSet PassengerList(Connection con, passenger passenger) throws SQLException {
         StringBuffer sb = new StringBuffer("select hsrailway.H_name,hsrailway.H_departure,hsrailway.H_destination,hsrailway.H_leavetime,hsrailway.H_arrivetime,hsorder.H_seattype,hsrailway_price.H_price,hsorder.H_date,hsrailway_price.H_date from hsrailway_price,hsrailway,hsorder where hsrailway.H_name=hsorder.H_name and hsrailway.H_id=hsrailway_price.H_id and hsrailway_price.H_seattype=hsorder.H_seattype and hsrailway_price.H_date=hsorder.H_date");
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
	String sql="delete from hsorder where H_name=? and H_date=?";
	PreparedStatement pstmt=con.prepareStatement(sql);

	pstmt.setString(1, H_name);
       pstmt.setString(2, H_date);
	return pstmt.executeUpdate();
	}

public int NumSelectedMinus(Connection con)throws Exception{
	String sql="update hsorder set numSelected = numSelected - 1 where H_name=?";
	PreparedStatement  pstmt=con.prepareStatement(sql);
	pstmt.setString(1, H_name);
	return pstmt.executeUpdate();
	}

public int SelectionAdd(Connection con)throws Exception{
		String sql="insert into hsorder (H_name,P_id,H_seattype,Nowtime,H_date) values(?,?,?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(sql);
	       // pstmt.setString(1,H_id);
                pstmt.setString(1,H_name);
                pstmt.setString(2,P_id);
                pstmt.setString(3,H_seattype);
                pstmt.setTimestamp(4,Nowtime);
                pstmt.setString(5,H_date);
		return pstmt.executeUpdate();
	}
public int H_numberMinus(Connection con,String H_name,String H_seattype,String H_date)throws Exception{
	String sql="update hsrailway_price set H_number = H_number - 1 where H_name=? and H_seattype=? and H_date=?";
	PreparedStatement  pstmt=con.prepareStatement(sql);
	pstmt.setString(1, H_name);
        pstmt.setString(2, H_seattype);
        pstmt.setString(3, H_date);
	return pstmt.executeUpdate();
	}
public  ResultSet isExisted(Connection con) throws SQLException{   

        String sql = "select * from hsorder where P_id=? and H_name=? ";
        PreparedStatement pstmt = con.prepareStatement(sql);
	pstmt.setString(1, P_id);
        pstmt.setString(2, H_name);
        return pstmt.executeQuery();
}
public int H_numberAdd(Connection con,String H_name,String H_seattype,String H_date)throws Exception{
		String sql="update hsrailway_price set H_number = H_number  + 1 where H_name=? and H_seattype=? and H_date=?";
		PreparedStatement  pstmt=con.prepareStatement(sql);
		pstmt.setString(1, H_name);
                pstmt.setString(2, H_seattype);
                pstmt.setString(3, H_date);
		return pstmt.executeUpdate();
	}

}
