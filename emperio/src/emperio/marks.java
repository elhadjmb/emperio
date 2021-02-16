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
public class marks {
    private final String cd1;
    private final int mat1;
    private final int mat2;  
    private final int moy;
    
    
    
    public marks(String MAT, int m1 ,int m2,int mo){
     this.cd1=MAT; this.mat1=m1; this.mat2=m2;  this.moy=mo;
    }
    
     public String getMAT(){return cd1;}
     public int getm1(){return mat1;}
     public int getm2(){return mat2;}
     public int getmo(){return (mat1+mat2)/2;} 
    
    
}
