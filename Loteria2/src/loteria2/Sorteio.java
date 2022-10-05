/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loteria2;
public class Sorteio {
    
    private int numsort1;
    private int numsort2;
    private int numsort3;
    private int numsort4;
    
    public int numUsuario1;
    public int numUsuario2;
    public int numUsuario3;
    public int numUsuario4;

    
    
    public void sortearNumeros(){
        this.numsort1 = (int) Math.round(Math.random() * 20);
        this.numsort2 = (int) Math.round(Math.random() * 20);
        this.numsort3 = (int) Math.round(Math.random() * 20);
        this.numsort4 = (int) Math.round(Math.random() * 20);
  
        if(this.numsort1 == this.numsort2 || this.numsort1 == this.numsort3 ||
                this.numsort1 == this.numsort4) {
            sortearNumeros();
        }
        
        if(this.numsort1 == this.numsort2 || this.numsort2 == this.numsort3 ||
                this.numsort2 == this.numsort4) {
            sortearNumeros();
        }
        
        if(this.numsort3 == this.numsort1 || this.numsort2 == this.numsort3 ||
                this.numsort3 == this.numsort4) {
            sortearNumeros();
        }
        
    }

    public int getNumsort1() {
        return numsort1;
    }

    public int getNumsort2() {
        return numsort2;
    }

    public int getNumsort3() {
        return numsort3;
    }

    public int getNumsort4() {
        return numsort4;
    }
    
    public int verificaAcertos(){
        
        int contador = 0;
        
        
        if(this.numsort1 == this.numUsuario1 || this.numsort2 == this.numUsuario1 || this.numsort3 == this.numUsuario1
                || this.numsort4 == this.numUsuario1) {
            contador++;
        }
        
        if(this.numsort1 == this.numUsuario2|| this.numsort2 == this.numUsuario2 || this.numsort3 == this.numUsuario2
                || this.numsort4 == this.numUsuario2) {
            contador++;
        }
        
        if(this.numsort1 == this.numUsuario3 || this.numsort2 == this.numUsuario3 || this.numsort3 == this.numUsuario3
                || this.numsort4 == this.numUsuario3) {
            contador++;
        }
        
        if(this.numsort1 == this.numUsuario4 || this.numsort2 == this.numUsuario4 || this.numsort3 == this.numUsuario4
                || this.numsort4 == this.numUsuario4) {
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
