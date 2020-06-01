public class Equipo {
 String nombreEquipo;
 int NumeroJugadores;
 
 String nombreJu;
 String apellido; 
 String posicion;
int edad;

    
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getNumeroJugadores() {
        return NumeroJugadores;
    }
    
    public void setNumeroJugadores(int NumeroJugadores) {
        this.NumeroJugadores = NumeroJugadores;
    }


    public String getNombreJu() {
        return nombreJu;
    }

    public void setNombreJu(String nombreJu) {
        this.nombreJu = nombreJu;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
       
//metodo constructor 
    public Equipo(String nombreEquipo,int NumeroJugadores){
        this.nombreEquipo=nombreEquipo;
        this.NumeroJugadores=NumeroJugadores;
 }
    public Equipo(String nombreJu,String apellido,String posicion,int edad){
        this.nombreJu=nombreJu;
        this.apellido=apellido; 
        this.posicion=posicion;
        this.edad=edad;
    }
    public void mostrarDatosEquipo(){
       
    }
}
