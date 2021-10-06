/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobb;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.JDBCType;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
/**
 *
 * @author VIRAJ
 */
public class javaconnect {
    int bale_no,PARTY_INVO_NO,tot_bill_rupee;
    int tot_pis,D_NO,lotno;
    boolean Mtr5,Mtr55;
    double fresh,damage,TOT_VAL_SUPPLY,LESS_DISCOUNT_TKA,LESS_DISCOUNT_INR,CGST_TKA,SGST_TKA,IGST_TKA,CGST_INR,IGST_INR,SGST_INR,PARTY_TOT_BILL_RUPEE;
    double PARTY_REC_MTR,PARTY_USED_MTR;
    String party_name,party_add,party_gstin,party_dt;
    String LADIES,M_NO,FOLD;

    public double getPARTY_REC_MTR() {
        return PARTY_REC_MTR;
    }

    public void setPARTY_REC_MTR(double PARTY_REC_MTR) {
        this.PARTY_REC_MTR = PARTY_REC_MTR;
    }

    public double getPARTY_USED_MTR() {
        return PARTY_USED_MTR;
    }

    public void setPARTY_USED_MTR(double PARTY_USED_MTR) {
        this.PARTY_USED_MTR = PARTY_USED_MTR;
    }
    
    public double getTOT_VAL_SUPPLY() {
        return TOT_VAL_SUPPLY;
    }

    public void setTOT_VAL_SUPPLY(double TOT_VAL_SUPPLY) {
        this.TOT_VAL_SUPPLY = TOT_VAL_SUPPLY;
    }

    public double getLESS_DISCOUNT_TKA() {
        return LESS_DISCOUNT_TKA;
    }

    public void setLESS_DISCOUNT_TKA(double LESS_DISCOUNT_TKA) {
        this.LESS_DISCOUNT_TKA = LESS_DISCOUNT_TKA;
    }

    public double getLESS_DISCOUNT_INR() {
        return LESS_DISCOUNT_INR;
    }

    public void setLESS_DISCOUNT_INR(double LESS_DISCOUNT_INR) {
        this.LESS_DISCOUNT_INR = LESS_DISCOUNT_INR;
    }

    public double getCGST_TKA() {
        return CGST_TKA;
    }

    public void setCGST_TKA(double CGST_TKA) {
        this.CGST_TKA = CGST_TKA;
    }

    public double getCGST_INR() {
        return CGST_INR;
    }

    public void setCGST_INR(double CGST_INR) {
        this.CGST_INR = CGST_INR;
    }

    public double getIGST_TKA() {
        return IGST_TKA;
    }

    public void setIGST_TKA(double IGST_TKA) {
        this.IGST_TKA = IGST_TKA;
    }

    public double getIGST_INR() {
        return IGST_INR;
    }

    public void setIGST_INR(double IGST_INR) {
        this.IGST_INR = IGST_INR;
    }

    public double getSGST_TKA() {
        return SGST_TKA;
    }

    public void setSGST_TKA(double SGST_TKA) {
        this.SGST_TKA = SGST_TKA;
    }

    public double getSGST_INR() {
        return SGST_INR;
    }

    public void setSGST_INR(double SGST_INR) {
        this.SGST_INR = SGST_INR;
    }

    public double getPARTY_TOT_BILL_RUPEE() {
        return PARTY_TOT_BILL_RUPEE;
    }

    public void setPARTY_TOT_BILL_RUPEE(double PARTY_TOT_BILL_RUPEE) {
        this.PARTY_TOT_BILL_RUPEE = PARTY_TOT_BILL_RUPEE;
    }
    
    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getFresh() {
        return fresh;
    }

    public void setFresh(double fresh) {
        this.fresh = fresh;
    }
   
    public int getLotno() {
        return lotno;
    }

    public void setLotno(int lotno) {
        this.lotno = lotno;
    }
    
    public int getBale_no() {
        return bale_no;
    }

    public void setBale_no(int bale_no) {
        this.bale_no = bale_no;
    }

    public int getPARTY_INVO_NO() {
        return PARTY_INVO_NO;
    }

    public void setPARTY_INVO_NO(int PARTY_INVO_NO) {
        this.PARTY_INVO_NO = PARTY_INVO_NO;
    }

    
    public String getParty_name() {
        return party_name;
    }

    public void setParty_name(String party_name) {
        this.party_name = party_name;
    }

    public String getParty_add() {
        return party_add;
    }

    public void setParty_add(String party_add) {
        this.party_add = party_add;
    }

    public String getParty_gstin() {
        return party_gstin;
    }

    public void setParty_gstin(String party_gstin) {
        this.party_gstin = party_gstin;
    }

 

    public int getTot_bill_rupee() {
        return tot_bill_rupee;
    }

    public void setTot_bill_rupee(int tot_bill_rupee) {
        this.tot_bill_rupee = tot_bill_rupee;
    }

    public String getParty_dt() {
        return party_dt;
    }

    public void setParty_dt(String party_dt) {
        this.party_dt = party_dt;
    }

    public boolean isMtr5() {
        return Mtr5;
    }

    public void setMtr5(boolean Mtr5) {
        this.Mtr5 = Mtr5;
    }

    public boolean isMtr55() {
        return Mtr55;
    }

    public void setMtr55(boolean Mtr55) {
        this.Mtr55 = Mtr55;
    }

    
     
    public int getTot_pis() {
        return tot_pis;
    }

    public void setTot_pis(int tot_pis) {
        this.tot_pis = tot_pis;
    }

    public int getD_NO() {
        return D_NO;
    }

    public void setD_NO(int D_NO) {
        this.D_NO = D_NO;
    }

    public String getFOLD() {
        return FOLD;
    }

    public void setFOLD(String FOLD) {
        this.FOLD = FOLD;
    }

    public String getLADIES() {
        return LADIES;
    }

    public void setLADIES(String LADIES) {
        this.LADIES = LADIES;
    }

    public String getM_NO() {
        return M_NO;
    }

    public void setM_NO(String M_NO) {
        this.M_NO = M_NO;
    }
    
   
     
    public  Connection connect() throws Exception
    {  
        Connection con;
        con = null;
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        String url="jdbc:derby://localhost:1527/job_db";
        con = DriverManager.getConnection(url,"root","root");
        if(con!=null)
        {
            System.out.println("DB connected");
        }
        return con;
    }
    public void insert() throws Exception
    {
        Connection con=connect();
        PreparedStatement ps;
        String sql;
        sql="Select max(PARTY_INVO_NO) from PARTY_DETAIL";
        ps=con.prepareStatement(sql);
        System.out.println("1");
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            PARTY_INVO_NO=rs.getInt(1);
        }
        PARTY_INVO_NO++;
        System.out.println("12");
        
         long millis=System.currentTimeMillis();  
        java.sql.Date date=new java.sql.Date(millis);  

        sql="INSERT INTO PARTY_DETAIL VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        System.out.println("13");
        ps=con.prepareStatement(sql);
        ps.setString(1,party_name);
        ps.setString(2,party_add);
        ps.setString(3, party_gstin);
        ps.setInt(4, PARTY_INVO_NO);
        ps.setDate(5,date);
        /*System.out.println(date);
        System.out.println(PARTY_INVO_NO);
        System.out.println(party_add);
        System.out.println(party_gstin);
        System.out.println(party_name);*/
        ps.setDouble(6, TOT_VAL_SUPPLY);
        System.out.println(TOT_VAL_SUPPLY);
        ps.setDouble(7, LESS_DISCOUNT_TKA);
        ps.setDouble(8, CGST_TKA);
        ps.setDouble(9, LESS_DISCOUNT_INR);
        ps.setDouble(10, SGST_TKA);
        ps.setDouble(11, IGST_TKA);
        ps.setDouble(12, SGST_INR);        
        ps.setDouble(13, IGST_INR);
        ps.setDouble(14, PARTY_TOT_BILL_RUPEE);
        ps.setDouble(15, PARTY_REC_MTR);
         // System.out.println(PARTY_REC_MTR);
        ps.setDouble(16, PARTY_USED_MTR);
        ps.setDouble(17, CGST_INR);       
      //  System.out.println("15");
        ps.executeUpdate();
        System.out.println("DB VALUE SUCCESFULLY");
    }
    public void insertpkg() throws Exception
    {   
        Connection con=connect();
        PreparedStatement sp;
        String sql_pkg;
        sql_pkg="Select max(BALE_NO) from PKG_SLIP";
        sp=con.prepareStatement(sql_pkg);
        ResultSet sr=sp.executeQuery();
        while(sr.next())
        {
            bale_no=sr.getInt(1);
        }bale_no++;
        
        sql_pkg="INSERT INTO PKG_SLIP VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        sp=con.prepareStatement(sql_pkg);
        sp.setInt(1,bale_no);
        sp.setInt(2, tot_pis);
        sp.setBoolean(3, Mtr5);
        sp.setBoolean(4, Mtr55);
        sp.setInt(5, D_NO);
        sp.setString(6, LADIES);
        sp.setString(7, M_NO);
        sp.setString(8, FOLD);
        sp.setInt(9, lotno);
        sp.setDouble(10, fresh);
        sp.setDouble(11, damage);
        
       
        sp.executeUpdate();
        System.out.println("DB VALUE SUCCESFULLY");
    }
}
