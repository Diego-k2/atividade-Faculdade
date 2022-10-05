/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loteria1;

import sun.applet.Main;

public class Sorteio {
    public int numsort1;
    public int numsort2;
    public int numsort3;
    public int numsort4;
    
    public Sorteio(int numsort1, int numsort2, int numsort3, int numsort4){
        this.numsort1 = numsort1;
        this.numsort2 = numsort2;
        this.numsort3 = numsort3;
        this.numsort4 = numsort4;
    }
    
    public int verificaAcertos(int numsort1, int numsort2, int numsort3
            , int numsort4){
        
        int contador = 0;
        
        
        if(this.numsort1 == numsort1 || this.numsort2 == numsort1 || this.numsort3 == numsort1
                || this.numsort4 == numsort1) {
            contador++;
        }
        
        if(this.numsort1 == numsort2 || this.numsort2 == numsort2 || this.numsort3 == numsort2
                || this.numsort4 == numsort2) {
            contador++;
        }
        
        if(this.numsort1 == numsort3 || this.numsort2 == numsort3 || this.numsort3 == numsort3
                || this.numsort4 == numsort3) {
            contador++;
        }
        
        if(this.numsort1 == numsort4 || this.numsort2 == numsort4 || this.numsort3 == numsort4
                || this.numsort4 == numsort4) {
            contador++;
        }
       
        return contador;
    }
    
    
    public double verificaPremiacao(int numAcertos){
        switch(numAcertos){
            
            case 4: 
                return 10000;
            case 3:
                return 5000;
            case 2: 
                return 1000;
            case 1:
                return 100;
            default:
                return 0;
        }
    }
   
    
    
    
}
