/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emperio;

/**
 *
 * @author ROSS
 */
import java.util.Date;
/**
 *
 * @author ROSS
 */
public class codes {
    private final int id;
    private final String fname;
    private final String lname;
    private final Date datd;
    private final String spec;
    private final String code;
    
    public codes(int MAT, String Firstname ,String Lastname,Date Birthdate,String Mat,String codei){
     this.id=MAT; this.fname=Firstname; this.lname=Lastname; this.datd=Birthdate; this.spec=Mat;this.code=codei;
    }
    
   public int getMAT(){return id;}
     public String getFirstname(){return fname;}
     public String getLastname(){return lname;}
     public String getMat(){return spec;}
     public Date getdate(){return datd;} 
     public String getcode(){return code;} 
    
}
