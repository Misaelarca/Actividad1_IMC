//*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author misael
 */
public class Persona {
    //atributos
    private double peso;
    private double estatura;
    
    //Propiedades get y set
    public double getPeso(){
        return peso;
    }
    public void setPeso(double p){
   this.peso = p;
    }
    
    public double getEstatura(){
        return estatura;
    }
    
    public void setEstatura(double e){
        this.estatura = e;
    }
    
    public double calcularIMC(){
    double imc = this.getPeso()/Math.pow(this.getEstatura(),2);
    return imc;
    }
    
    
}
    
        
        
        
        
        
        
        
        
        
        
        
    }
    
}

