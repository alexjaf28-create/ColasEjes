package com.mycompany.cola_sin_libreria;

 
public class Cola_sin_libreria {

    public static void main(String[] args) {
        
        simple();
        Circular();
        Prioridad();
        doble();
       
    }
    
    static void simple(){
        System.out.println("1. Cola simple: primero en llegar , primero en salir(FIFO)");
        encolarSimple("Sara");
        encolarSimple("Maria");
        encolarSimple("Abgelica");
        
                
        
    }
    
    static void Circular(){
        
    }
    
    static void Prioridad(){
        
    }
    
    static void doble(){
        
    }
    //Operaciones propias : arreglos, indices u ciclos; sin clases ni librerias.
    
    private static final String[] datosSimple = new String[5];
    private static int cantidadSimple = 0;
    static void encolarSimple(String nombre){
        if (cantidadSimple == datosSimple.length)throw new IllegalStateException("cola llena");
                datosSimple[cantidadSimple++]=nombre;        
    }
    
    static String desencolarSimple(String nombre){
        if (cantidadSimple == 0)return null; 
            
        String primero = datosSimple[0];
        for(int i = 0; i<cantidadSimple -1; i ++)
            datosSimple[i]=datosSimple[i + 1];
        
        datosSimple[--cantidadSimple]= null;
        return primero;
    }
    
    static void agregarInicioSimple(String nombre){
        if (cantidadSimple == datosSimple.length)throw new IllegalStateException("cola llena");
        for(int i = 0; i < cantidadSimple -1; i++) datosSimple[i]=datosSimple[i + 1];
        datosSimple[0]=nombre;
        cantidadSimple++;
               
    }
    
    static String retirarFinalSimple(){
        if(cantidadSimple == 0)return null;
        String ultimo = datosSimple[--cantidadSimple];
        datosSimple[cantidadSimple]=null;
        return ultimo;
    }
    
    private static final String []datosCircular= new String[3];
    private static int frenteCircular = 0;
    private static int finCircular = 0;
    private static int cantidadCircular = 0;
    
    
    static void EncolarCircular(String nombre){
   if (cantidadCircular == datosCircular.length)throw new IllegalStateException("cola llena");
      datosCircular[finCircular++]=nombre;
      finCircular=(finCircular + 1) % datosCircular.length;     
        
    }
    
    static String desencolarCircular(){
        if (cantidadCircular == 0)return null;
        
        String primero = datosCircular[frenteCircular];
        datosCircular[frenteCircular] = null;
        frenteCircular= (frenteCircular + 1)% datosCircular.length;
        cantidadCircular --;
        return primero;
    }
    
    private static final Integer[]datosprioridad = new Integer[5];
    
    private static int cantidadprioridad = 0;
    static void Encolarprioridad(int prioridad){
        if(cantidadprioridad == datosprioridad.length) throw new IllegalStateException("cola llena");
        datosprioridad[cantidadprioridad++]= prioridad;
        
    }
    
    static Integer DesencolarPrioridad(){
        if(cantidadprioridad==0) return null;
        int mejor=0;
        
        for(int i= 1; i<cantidadprioridad; i++){
            
            if(datosprioridad[i]<datosprioridad[mejor]) mejor =i;
            
        }
        Integer resultado = datosprioridad[mejor];
        for(int i=mejor; i<cantidadprioridad - 1; i++)datosprioridad[i]=datosprioridad[i + 1];
        datosprioridad[--cantidadprioridad]= null;
        return resultado;
        
        } 
    }