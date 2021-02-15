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
    private final String id;
    private final String cd1;
    private final String cd2;  
    private final String fname;
    private final String lname;
    private final String datd;
    private final String univ;
    
    
    public codes(String MAT, String Firstname ,String Lastname,String Mat,String codei,String Birthdate,String ass){
     this.id=MAT; this.cd1=Firstname; this.cd2=Lastname;  this.fname=Mat;this.lname=codei;this.datd=Birthdate; this.univ=ass;
    }
    
   public String getMAT(){return id;}
     public String getFname(){return fname;}
     public String getLname(){return lname;}
     public String getc1(){return cd1;} 
     public String getc2(){return cd2;} 
     public String getdate(){return datd;}
     public String getass(){return univ;} 
    
}
