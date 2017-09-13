/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidor;

/**
 *
 * @author Sosa Estrada Ma. Fernanda
 */
class Conver {
    int num, resultado;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    
 String Result() {
        
     resultado= num%19;
     return resultado + "";
        
    }   
}
