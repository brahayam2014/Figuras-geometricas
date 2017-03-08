/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas2;

/**
 *
 * @author BRAHAYAM && FELIPE 
 */
public class Circulo {
     /*
     * Atributo que contiene la cordenada x1 y1
     */
   private   Punto punto1;
   
    /**
     * guarda el radio del circulo
     */
   private double radio;
   /**
     * guarda el perimetro del circulo
     */
   private double perimetro;
   
   /**
     *define pi globalmente
     */
   private final double pi=3.1416;
   
   
   
   
   /**
     * Constuctor de la clse que inicializa las variables
     
     * @param radio
     **/ 
    public Circulo(Punto punto, double radio) {
       this.punto1 = punto;
        this.radio = radio;
    }
    
        
   
    

    public void daResultados(){
    
    if(isCirculo()) {
    System.out.println("Perimetro: " + darPerimetro());
    System.out.println("Area: " + darArea());
      } else {
            System.out.println("No es un circulo");
        }    
    }
    /**
     * 
     * Metodo que retorna el perimetro del CIRCULO
     * @return Perimetro
     */
    private double darPerimetro() {  
        
        this.perimetro =2*radio+pi;
        return this.perimetro;
    }
    
    
    /**
     * Metodo que retorna el area de un trianguo
     * @return  Area
     */
    private double darArea() {
        double  area=pi*Math.pow(radio, 2);;
        return area;
       
    }
    /**
     * Retorna verdadero si es un circulo Falso contrario
     * @return 
     */
    private boolean isCirculo() {
     
        return true;
    } 
    
   
    
    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
       
    
   
   
}

    
