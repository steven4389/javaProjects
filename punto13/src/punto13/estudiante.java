/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto13;

/**
 *
 * @author estiv
 */
public class estudiante {
    
    private String Nombre;
    
    private double Nota1;
    
    private double Nota2;
    
    private double Nota3;
    
    private double Nota4;

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setNota1(double Nota1) {
        this.Nota1 = Nota1;
    }

    public void setNota2(double Nota2) {
        this.Nota2 = Nota2;
    }

    public void setNota3(double Nota3) {
        this.Nota3 = Nota3;
    }

    public void setNota4(double Nota4) {
        this.Nota4 = Nota4;
    }

    public String getNombre() {
        return Nombre;
    }

    public double getNota1() {
        return Nota1;
    }

    public double getNota2() {
        return Nota2;
    }

    public double getNota3() {
        return Nota3;
    }

    public double getNota4() {
        return Nota4;
    }
    
   public estudiante(String N, double n1, double n2, double n3, double n4){
       this.Nombre=N;
       this.Nota1=n1;
       this.Nota2=n2;
       this.Nota3=n3;
       this.Nota4=n4;
       
   }
   
    
}
