/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.awt.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class control {
    public database database;
    public passenger thepassenegr[];
    public admin_ theadmin_[];
    public train thetrain[];
    public hsrailway thehsrailway[];
    public hsorder thehsorder[];
    public passenger thepassenger[];
    public hsrailway_price thehsrailway_price[];
    public torder thetorder[];
    public train_price thetrain_price[];
    public message themessage[];
    public FormObject theFormObject[];
    Connection con = null;
    
    public control()
    {
        
    }
    public int passengerAdd(Connection con,passenger passenger)throws Exception {
    String sql="insert into sinfo values(?,?,?,?,?,?)";
		PreparedStatement  pstmt=con.prepareStatement(sql);
		pstmt.setString(1,passenger.GetP_name());
		pstmt.setString(2,passenger.GetP_phone());
		pstmt.setString(3,passenger.GetP_address());
                pstmt.setString(4,passenger.GetP_id());
                pstmt.setString(5,passenger.GetP_password());
                pstmt.setString(6,passenger.GetP_email());
		return pstmt.executeUpdate();
}
    public int psssengerModify(Connection con, passenger passenger)throws Exception{
		String sql="update sinfo set P_name = ? ,P_phone = ?, P_address = ?, P_password = ?,P_email = ? where P_id = ?";
		PreparedStatement  pstmt=con.prepareStatement(sql);
		pstmt.setString(1,passenger.GetP_name());
		pstmt.setString(2,passenger.GetP_phone());
		pstmt.setString(3,passenger.GetP_address());
                pstmt.setString(4,passenger.GetP_id());
                pstmt.setString(5,passenger.GetP_password());
                pstmt.setString(6,passenger.GetP_email());
		return pstmt.executeUpdate();
	}
    public int passengerDelete(Connection con, String P_id) throws SQLException {
       //To change body of generated methods, choose Tools | Templates.
        String sql = "delete from passenger where P_id=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, P_id);
        return pstmt.executeUpdate();
    }
    public int trainAdd(Connection con,train train)throws Exception {
    String sql="insert into train values(?,?,?,?,?,?,?)";
		PreparedStatement  pstmt=con.prepareStatement(sql);
		pstmt.setString(1,train.GetT_id());
		pstmt.setString(2,train.GetT_name());
		pstmt.setTime(3,train.GetT_leavetime());
                pstmt.setTime(4,train.GetT_arrivetime());
                pstmt.setString(5,train.GetT_departure());
                pstmt.setString(6,train.GetT_destination());
                pstmt.setString(7,train.GetT_date());
                //这个T_number应该做一个递减的功能（还没做）
		return pstmt.executeUpdate();
}
    public int trainModify(Connection con, train train)throws Exception{
		String sql="update train set T_name = ? ,T_leavetime = ?, T_arrivetime = ?, T_departure = ?,T_destination = ?，T_seattype = ?,T_price = ?,T_number = ? where T_id = ?";
		PreparedStatement  pstmt=con.prepareStatement(sql);
		pstmt.setString(2,train.GetT_name());
		pstmt.setTime(3,train.GetT_leavetime());
                pstmt.setTime(4,train.GetT_arrivetime());
                pstmt.setString(5,train.GetT_departure());
                pstmt.setString(6,train.GetT_destination());
                pstmt.setString(7,train.GetT_seattype());
                pstmt.setString(8,train.GetT_price());
                pstmt.setString(9,train.GetT_number());
		return pstmt.executeUpdate();
	}
    public int trainDelete(Connection con,String T_id, String T_date,String T_name) throws SQLException {
       //To change body of generated methods, choose Tools | Templates.
        String sql = "delete from train where T_id=? and T_date=? and T_name=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, T_id);
        pstmt.setString(2, T_date);
        pstmt.setString(3, T_name);
        return pstmt.executeUpdate();
    }
    //我不确定能不能根据火车名字直接删除三行信息。
   public int hsrailwayAdd(Connection con,hsrailway hsrailway)throws Exception {
    String sql="insert into hsrailway values(?,?,?,?,?,?,?)";
		PreparedStatement  pstmt=con.prepareStatement(sql);
		pstmt.setString(1,hsrailway.GetH_id());
		pstmt.setString(2,hsrailway.GetH_name());
		pstmt.setTime(3,hsrailway.GetH_leavetime());
                pstmt.setTime(4,hsrailway.GetH_arrivetime());
                pstmt.setString(5,hsrailway.GetH_departure());
                pstmt.setString(6,hsrailway.GetH_destination());
                pstmt.setString(7,hsrailway.GetH_date());
               return pstmt.executeUpdate();
		
}
    public int hsrailwayModify(Connection con, hsrailway hsrailway)throws Exception{
		String sql="update train set H_name = ? ,H_leavetime = ?, H_arrivetime = ?, H_departure = ?,H_destination = ?,H_seattype = ?,H_price = ?,H_number = ? where H_id = ?";
		PreparedStatement  pstmt=con.prepareStatement(sql);
		pstmt.setString(2,hsrailway.GetH_name());
		pstmt.setTime(3,hsrailway.GetH_leavetime());
                pstmt.setTime(4,hsrailway.GetH_arrivetime());
                pstmt.setString(5,hsrailway.GetH_departure());
                pstmt.setString(6,hsrailway.GetH_destination());
                pstmt.setString(7,hsrailway.GetH_seattype());
                pstmt.setString(8,hsrailway.GetH_price());
                pstmt.setString(9,hsrailway.GetH_number());
		return pstmt.executeUpdate();
	}
     public int hsrailwayDelete(Connection con, String H_id,String H_date,String H_name) throws SQLException {
       //To change body of generated methods, choose Tools | Templates.
        String sql = "delete from hsrailway where H_id=? and H_date=? and H_name=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, H_id);
        pstmt.setString(2, H_date);
        pstmt.setString(3, H_name);
        return pstmt.executeUpdate();
    }

    //我不确定能不能根据高铁名字直接删除三行信息。
    public int messageAdd(Connection con,message message)throws Exception {
    String sql="insert into message values(?)";
		PreparedStatement pstmt=con.prepareStatement(sql);
                pstmt.setString(1,message.GetM_message());
                return pstmt.executeUpdate();
    }
                
     public int messageDelete(Connection con, String M_message) throws SQLException {
       //To change body of generated methods, choose Tools | Templates.
        String sql = "delete from message where M_message=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, M_message);
        return pstmt.executeUpdate();
    }
     public passenger Verifypassenger(Connection con,passenger passenger) throws Exception{
        passenger resultpas=null;
	String sql="select * from passenger where P_id=? and P_password=?";/*既可以用姓名登录也可以用身份证号？*/
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,passenger.GetP_id());
        pstmt.setString(2, passenger.GetP_password());
        ResultSet rs=pstmt.executeQuery();
        if(rs.next()){
           
            resultpas=new passenger();
            resultpas.setP_id(rs.getString("P_id"));
            resultpas.setP_password(rs.getString("P_password"));     
        }
      
       return resultpas;
        }
     
public admin_ Verifyadmin_(Connection con, admin_ admin_) throws Exception{
        admin_ resultad=null;       
	String sql="select * from admin_ where A_id=? and A_password=?";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,admin_.GetA_id());
        pstmt.setString(2, admin_.GetA_password());
        ResultSet rs=pstmt.executeQuery();
        if(rs.next()){
            resultad=new admin_();
            resultad.setA_id(rs.getString("A_id"));
            resultad.setA_password(rs.getString("A_password"));
        }
       return resultad;
        }
 
public String QueryPassword(Connection con,passenger passenger) throws SQLException
    {
        String sql ="select P_password from passenger where P_id = ? ";
        System.out.println(passenger.GetP_id());
        PreparedStatement pstmt=con.prepareStatement(sql);
       
        pstmt.setString(1,passenger.GetP_id());
        ResultSet rs=pstmt.executeQuery();
        if (rs.next()){
             return rs.getString("P_password");
        }
             else
            {
            return "";
            }    
    }
    public int ModifyPassword(Connection con,passenger passenger)throws Exception{
		String sql="update passenger set P_password = ? where P_id = ?";
		PreparedStatement  pstmt=con.prepareStatement(sql);
		
		pstmt.setString(1,passenger.GetP_password());
		pstmt.setString(2,passenger.GetP_id());
                
		return pstmt.executeUpdate();

	}

public String QueryPassword_(Connection con,admin_ admin_) throws SQLException
    {
        String sql ="select A_password from admin_ where A_id = ? ";
        System.out.println(admin_.GetA_id());
        PreparedStatement pstmt=con.prepareStatement(sql);
       
        pstmt.setString(1,admin_.GetA_id());
        ResultSet rs=pstmt.executeQuery();
        if (rs.next()){
             return rs.getString("A_password");
        }
             else
            {
            return "";
            }    
    }
    public int ModifyPassword_(Connection con,admin_ admin_)throws Exception{
		String sql="update admin_ set A_password = ?  where A_id = ?";
		PreparedStatement  pstmt=con.prepareStatement(sql);
		
		pstmt.setString(1,admin_.GetA_password());
		pstmt.setString(2,admin_.GetA_password());
                
		return pstmt.executeUpdate();

	}
    public Boolean CanpassengerAdd(Connection con,String tablename,String columnname,String P_id) throws SQLException
    {
        
	String sql="select * from " + tablename + " where " + columnname  + " = ? ";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,P_id);
        ResultSet rs=pstmt.executeQuery();
        if (rs.next()){
             return false;
        }
             else
             {
            return true;
            }
        }
       
    public Boolean CanpassengerModify(Connection con,String tablename,String columnname,String P_id) throws SQLException
    {
        String sql="select * from " + tablename + " where " + columnname  + " = ? ";
       
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,P_id);
        ResultSet rs=pstmt.executeQuery();       
        if (rs.next()){
             return true;
        }
             else
             {
            return false;
            }
    }

    public Boolean CantrainAdd(Connection con,String tablename,String columnname,String T_id) throws SQLException
    {
        
	String sql="select * from " + tablename + " where " + columnname  + " = ? ";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,T_id);
        ResultSet rs=pstmt.executeQuery();
        if (rs.next()){
             return false;
        }
             else
             {
            return true;
            }
        }
       
    public Boolean CantrainModify(Connection con,String tablename,String columnname,String T_id) throws SQLException
    {
        String sql="select * from " + tablename + " where " + columnname  + " = ? ";
       
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,T_id);
        ResultSet rs=pstmt.executeQuery();       
        if (rs.next()){
             return true;
        }
             else
             {
            return false;
            }
    }

 public Boolean CanhsrailwayAdd(Connection con,String tablename,String columnname,String H_id) throws SQLException
    {
        
	String sql="select * from " + tablename + " where " + columnname  + " = ? ";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,H_id);
        ResultSet rs=pstmt.executeQuery();
        if (rs.next()){
             return false;
        }
             else
             {
            return true;
            }
        }
       
    public Boolean CanhsrailwayModify(Connection con,String tablename,String columnname,String H_id) throws SQLException
    {
        String sql="select * from " + tablename + " where " + columnname  + " = ? ";
       
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,H_id);
        ResultSet rs=pstmt.executeQuery();       
        if (rs.next()){
             return true;
        }
             else
             {
            return false;
            }
    }


    public Boolean CanmessageAdd(Connection con,String tablename,String columnname,String M_number) throws SQLException
    {
        
	String sql="select * from " + tablename + " where " + columnname  + " = ? ";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,M_number);
        ResultSet rs=pstmt.executeQuery();
        if (rs.next()){
             return false;
        }
             else
             {
            return true;
            }
        }
       
    public Boolean CanmessageModify(Connection con,String tablename,String columnname,String M_number) throws SQLException
    {
        String sql="select * from " + tablename + " where " + columnname  + " = ? ";
       
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,M_number);
        ResultSet rs=pstmt.executeQuery();       
        if (rs.next()){
             return true;
        }
             else
             {
            return false;
            }
    }
    public ResultSet QueryList(Connection con,String tablename,String columnname,String pno) throws SQLException
    {
        String sql="";
        
    if (pno.isEmpty()){
        sql="select * from " + tablename;
       
        PreparedStatement pstmt=con.prepareStatement(sql);
        return pstmt.executeQuery();
    }
        else 
    {
        sql="select * from " + tablename + " where " + columnname  + " = ? "; 
       
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,pno);
        return pstmt.executeQuery();
    }             
           
    }
    public  ResultSet Querytrain(Connection con,String T_departure,String T_destination,String T_date) throws SQLException
    {
      
      
        String sql = "select train.T_name,T_leavetime,T_arrivetime,T_departure,T_destination,train.T_date,train_price.T_seattype,T_price,T_number  from train,train_price where train.T_id=train_price.T_id and train.T_departure=? and train.T_destination=? and train.T_date=?";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,T_departure);
        pstmt.setString(2,T_destination);
        pstmt.setString(3,T_date);
     

        System.out.println(pstmt.toString());
        return pstmt.executeQuery();
    }

public  ResultSet Queryhsrailway(Connection con,String H_departure,String H_destination,String H_date) throws SQLException
    {
   
        String sql="";
      
        sql = "select hsrailway.H_name,H_leavetime,H_arrivetime,H_departure,H_destination,hsrailway.H_date,hsrailway_price.H_seattype,H_price,H_number  from hsrailway,hsrailway_price where hsrailway.H_id=hsrailway_price.H_id and hsrailway.H_departure=? and hsrailway.H_destination=? and hsrailway.H_date=?" ;
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,H_departure);
        pstmt.setString(2,H_destination);
        pstmt.setString(3,H_date);
        System.out.println(pstmt.toString());
        return pstmt.executeQuery();
    }
public  ResultSet Queryallhsrailway(Connection con) throws SQLException
    {
   
        String sql="";
      
        sql = "select hsrailway.H_name,H_leavetime,H_arrivetime,H_departure,H_destination,hsrailway.H_date,hsrailway_price.H_seattype,H_price,H_number  from hsrailway,hsrailway_price where hsrailway.H_id=hsrailway_price.H_id";
        PreparedStatement pstmt=con.prepareStatement(sql);
        System.out.println(pstmt.toString());
        return pstmt.executeQuery();
    }

public  ResultSet Queryalltrain(Connection con) throws SQLException
    {
   
        String sql="";
      
        sql = "select train.T_name,T_leavetime,T_arrivetime,T_departure,T_destination,train.T_date,train_price.T_seattype,T_price,T_number  from train,train_price where train.T_id=train_price.T_id" ;
        PreparedStatement pstmt=con.prepareStatement(sql);
        System.out.println(pstmt.toString());
        return pstmt.executeQuery();
    }

public int noticeAdd(Connection con,notice notice)throws Exception {
    String sql="insert into notice values (?)";
		PreparedStatement  pstmt=con.prepareStatement(sql);
		pstmt.setString(1,notice.Getcontent());
                return pstmt.executeUpdate();
    }


    boolean CannoticeAdd(Connection con, String notice, String content) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public  ResultSet Querytrainorder(Connection con,passenger passenger) throws SQLException
    {
        StringBuffer sb = new StringBuffer("select train.T_name,torder.T_date,train.T_departure,train.T_destination,train.T_leavetime,train.T_arrivetime,torder.T_seattype,torder.hardtype,torder.softype,train_price.T_price,torder.Nowtime from train_price,train,torder where train.T_name=torder.T_name and train.T_id=train_price.T_id and train_price.T_seattype=torder.T_seattype and train_price.T_date=torder.T_date");
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
    public  ResultSet Querytrainorder1(Connection con,passenger passenger) throws SQLException
    {
        StringBuffer sb = new StringBuffer("select train.T_name,torder.T_date,train.T_departure,train.T_destination,train.T_leavetime,train.T_arrivetime,torder.T_seattype,train_price.T_price,torder.Nowtime from train_price,train,torder where train.T_name=torder.T_name and train.T_id=train_price.T_id and train_price.T_seattype=torder.T_seattype and train_price.T_date=torder.T_date");
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
    public  ResultSet Queryhsrailwayorder(Connection con,passenger passenger) throws SQLException
    {
        StringBuffer sb = new StringBuffer("select hsrailway.H_name,hsorder.H_date,hsrailway.H_departure,hsrailway.H_destination,hsrailway.H_leavetime,hsrailway.H_arrivetime,hsorder.H_seattype,hsrailway_price.H_price,hsorder.Nowtime from hsrailway_price,hsrailway,hsorder where hsrailway.H_name=hsorder.H_name and hsrailway.H_id=hsrailway_price.H_id and hsrailway_price.H_seattype=hsorder.H_seattype and hsrailway_price.H_date=hsorder.H_date");
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
     public  ResultSet Querynotice(Connection con) throws SQLException
    {
   
        String sql="";
      
        sql = "select* from notice";
        PreparedStatement pstmt=con.prepareStatement(sql);
        System.out.println(pstmt.toString());
        return pstmt.executeQuery();
    }
      public  ResultSet Queryallpassenger(Connection con) throws SQLException
    {
   
        String sql="";
      
        sql = "select P_name,P_phone,P_address,P_id,P_password,P_email,\n" +
"timestampdiff(year,str_to_date(substring(P_id,7,8),\"%Y%m%d\"),str_to_date(now(),\"%Y-%m-%d\"))as P_age,\n" +
"case if(length(P_id)=18, cast(substring(P_id,17,1) as UNSIGNED)%2, \n" +
"if(length(P_id)=15,cast(substring(P_id,15,1) as UNSIGNED)%2,3))\n" +
"when 1 then '男' \n" +
"when 0 then '女'\n" +
"else '未知'\n" +
"end as P_sex\n" +
"from passenger";
        PreparedStatement pstmt=con.prepareStatement(sql);
        System.out.println(pstmt.toString());
        return pstmt.executeQuery();
    }
      public  ResultSet Querypassenger(Connection con,String P_id) throws SQLException
    {
   
        String sql="";
      
        sql = "select P_name,P_phone,P_address,P_id,P_password,P_email,\n" +
"timestampdiff(year,str_to_date(substring(P_id,7,8),\"%Y%m%d\"),str_to_date(now(),\"%Y-%m-%d\"))as P_age,\n" +
"case if(length(P_id)=18, cast(substring(P_id,17,1) as UNSIGNED)%2, \n" +
"if(length(P_id)=15,cast(substring(P_id,15,1) as UNSIGNED)%2,3))\n" +
"when 1 then '男' \n" +
"when 0 then '女'\n" +
"else '未知'\n" +
"end as P_sex\n" +
"from passenger\n" +
"where P_id =?";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,P_id);
        System.out.println(pstmt.toString());
        return pstmt.executeQuery();
    }
     public String QueryoldPassword(Connection con,passenger passenger) throws SQLException
    {
        String sql ="select P_password from passenger where P_id = ? ";
        System.out.println(passenger.GetP_id());
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,passenger.GetP_id());
        ResultSet rs=pstmt.executeQuery();
        if (rs.next()){
             return rs.getString("P_password");
        }
             else
            {
            return "";
            }    
    }
    
    public int train_priceAdd(Connection con,train_price train_price)throws Exception {
    String sql="insert into train_price values(?,?,?,?,?,?)";
		PreparedStatement  pstmt=con.prepareStatement(sql);
		pstmt.setString(1,train_price.GetT_id());
		pstmt.setString(2,train_price.GetT_name());
		pstmt.setString(3,train_price.GetT_seattype());
                pstmt.setString(4,train_price.GetT_price());
                pstmt.setString(5,train_price.GetT_number());
                pstmt.setString(6,train_price.GetT_date());
                return pstmt.executeUpdate();
                
		
}
  
     public int hsrailway_priceAdd(Connection con,hsrailway_price hsrailway_price)throws Exception {
    String sql="insert into hsrailway_price values(?,?,?,?,?,?)";
		PreparedStatement  pstmt=con.prepareStatement(sql);
		pstmt.setString(1,hsrailway_price.GetH_id());
		pstmt.setString(2,hsrailway_price.GetH_name());
		 pstmt.setString(3,hsrailway_price.GetH_seattype());
                pstmt.setString(4,hsrailway_price.GetH_price());
                pstmt.setString(5,hsrailway_price.GetH_number());
                pstmt.setString(6,hsrailway_price.GetH_date());
		return pstmt.executeUpdate();
               
}

    public Boolean Cantrain_priceAdd(Connection con,String tablename,String columnname,String T_id) throws SQLException
    {
        
	String sql="select * from " + tablename + " where " + columnname  + " = ? ";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,T_id);
        ResultSet rs=pstmt.executeQuery();
        if (rs.next()){
             return false;
        }
             else
             {
            return true;
            }
        }
 
 public Boolean Canhsrailway_priceAdd(Connection con,String tablename,String columnname,String H_id) throws SQLException
    {
        
	String sql="select * from " + tablename + " where " + columnname  + " = ? ";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,H_id);
        ResultSet rs=pstmt.executeQuery();
        if (rs.next()){
             return false;
        }
             else
             {
            return true;
            }
        }
                
    public Boolean CannoticeAdd(Connection con,String tablename,String columnname,String content) throws SQLException
    {
        
	String sql="select * from " + tablename + " where " + columnname  + " = ? ";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,content);
        ResultSet rs=pstmt.executeQuery();
        if (rs.next()){
             return false;
        }
             else
             {
            return true;
            }
        }


    public ResultSet passengerList(Connection con, passenger passenger) throws SQLException {
        /**StringBuffer sb = new StringBuffer("select * from slogin ");
        if (student.getSno() != "") {
            sb.append("where Sno='" + student.getSno() + "'");
        }
        PreparedStatement pstmt = con.prepareStatement(sb.toString());*/
        StringBuilder sb = new StringBuilder("select * from passenger");
        /**if (student.getSno() != "") {
            sb.append(" and Sno=" + student.getSno());
        }*/
        if (StringUtil.isNotEmpty(passenger.GetP_id())) {
            sb.append(" and jTextField1 ='").append(passenger.GetP_id()).append("'");
        }
        PreparedStatement pstmt = con.prepareStatement(sb.toString().replaceFirst("and", "where"));
        return pstmt.executeQuery();

    }


    public int ModifyP_password(Connection con,passenger passenger)throws Exception{
		String sql="update passenger set spassword = ?  where P_id = ?";
		PreparedStatement  pstmt=con.prepareStatement(sql);
		
		pstmt.setString(1,passenger.GetP_password());
		pstmt.setString(2,passenger.GetP_id());
                
		return pstmt.executeUpdate();

	}



    public ResultSet messageList(Connection con, message message) throws SQLException {
        /**StringBuffer sb = new StringBuffer("select * from slogin ");
        if (student.getSno() != "") {
            sb.append("where Sno='" + student.getSno() + "'");
        }
        PreparedStatement pstmt = con.prepareStatement(sb.toString());*/
        StringBuilder sb = new StringBuilder("select * from message");
        /**if (student.getSno() != "") {
            sb.append(" and Sno=" + student.getSno());
        }*/
        if (StringUtil.isNotEmpty(message.GetM_message())) {
            sb.append(" and message ='").append(message.GetM_message()).append("'");
        }
        PreparedStatement pstmt = con.prepareStatement(sb.toString().replaceFirst("and", "where"));
        return pstmt.executeQuery();

    }
public int DeleteM_message(Connection con, String M_message) throws SQLException
    {
        String sql = "delete from message where M_message=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1,M_message);
        return pstmt.executeUpdate();    
    }


    public Boolean Candelete(Connection con,String tablename,String columnname,String M_message) throws SQLException
    {
        
	String sql="select * from " + tablename + " where " + columnname  + " = ? ";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,M_message);
        ResultSet rs=pstmt.executeQuery();
        if (rs.next()){
             return false;
        }
             else
             {
            return true;
            }
        }

    
    public int ConfirmDelete(Component com,String str,String Sno)
    {
       int n= JOptionPane.showConfirmDialog(com, "确定要删除" + str + Sno +"吗？");  
       return n;
    }
    public Boolean CanModify(Connection con,String tablename,String columnname,String P_id) throws SQLException
    {
        String sql="select * from " + tablename + " where " + columnname  + " = ? ";
       
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,P_id);
        ResultSet rs=pstmt.executeQuery();       
        if (rs.next()){
             return true;
        }
             else
             {
            return false;
            }
    }
   
   public Boolean Modifyseattype1(Connection con,String P_id) throws SQLException
    {
        String sql="select* from torder where T_seattype = '硬卧'and P_id=?";
       
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,P_id);
        ResultSet rs=pstmt.executeQuery();       
        if (rs.next()){
             return true;
        }
             else
             {
            return false;
            }
    }
    public Boolean Modifyseattype2(Connection con,String P_id) throws SQLException
    {
        String sql="select* from torder where T_seattype = '软卧'and P_id=?";
       
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,P_id);
        ResultSet rs=pstmt.executeQuery();       
        if (rs.next()){
             return true;
        }
             else
             {
            return false;
            }
    }
    public int train_priceDelete(Connection con,String T_id, String T_date,String T_name) throws SQLException {
       //To change body of generated methods, choose Tools | Templates.
        String sql = "delete from train_price where T_id=? and T_date=? and T_name=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, T_id);
        pstmt.setString(2, T_date);
        pstmt.setString(3, T_name);
        return pstmt.executeUpdate();
    }


  public int hsrailway_priceDelete(Connection con, String H_id,String H_date,String H_name) throws SQLException {
       //To change body of generated methods, choose Tools | Templates.
        String sql = "delete from hsrailway_price where H_id=? and H_date=? and H_name=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, H_id);
        pstmt.setString(2, H_date);
        pstmt.setString(3, H_name);
        return pstmt.executeUpdate();
    }
}




