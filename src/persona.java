public class persona {

//Atributos    
 String nombre;
 String direccion;
 String ine;

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getIne() {
        return ine;
    }

    public void setIne(String ine) {
        this.ine = ine;
    }
   
    
//metodo constructor
    public persona(String nombre,String direccion,String ine){
        this.nombre=nombre;
        this.direccion=direccion;
        this.ine=ine;
        
    }
    //metodo para acceder desde otra clase
    public void datos(){
System.out.println(nombre+" "+"tu direccion es"+" "+direccion+" "+"tu INE es"+" "+ine);
    }
}
