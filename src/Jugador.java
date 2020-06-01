public class Jugador {
String puesto;

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
//Metodo constructor
    public Jugador (String puesto){
       this.puesto=puesto;
    }
    //metodo para mostrar datos
    public void mostrarDa(){
        System.out.println("El puesto que tienes es:"+puesto);
    }    
}
