import java.util.Scanner;
public class principal {
   public static void main (String[]args){
       Scanner entrada=new Scanner(System.in);
       
    persona p1=new persona("Lupe","calle 34, MZ 67 COl los pinos","ERPL29304856L783");
       Jugador j=new Jugador("pivot");
    persona p2=new persona("Carlos","calle 73 sin numero","CDPRPC78290426C567");
    Jugador j2=new Jugador("escolta");
    persona p3=new persona("Ayaz","Calle 45 colonia Bonita","APEA783947294L964");
    Jugador j3=new Jugador(" alero");
    persona p4=new persona("Victor","Calle 72 MZ 56 COLONIA Carmen","APEV934845493V034");
    Jugador j4=new Jugador("ala-pivot");
    persona p5=new persona("Nicolas","Calle 45 23 sin numero","AETN27836489V145");
    Jugador j5=new Jugador("ala-pivot");
   p1.datos();
    j.mostrarDa();
   p2.datos();
    j2.mostrarDa();
   p3.datos();
    j3.mostrarDa();
   p4.datos();
    j4.mostrarDa();
   p5.datos();
    j5.mostrarDa();
        
   
 
       System.out.println("\n\nIngresa tu nombre");
       String nombre=entrada.nextLine();
       
       System.out.println("Ingresa tu Direccion");
       String direccion=entrada.nextLine();
       
       System.out.println("Ingresa tu INE");
       String ine=entrada.nextLine();
  
       System.out.println("Ingresa tu puesto");
        String puesto=entrada.nextLine();
       persona p=new persona(nombre,direccion,ine);
System.out.println("-------------------------------------------------------");   
        
         //objeto p le pasare el metodo datos
        p.datos();
        
      System.out.println("\nIngresa el nombre de tu Equipo");
      String nomEquipo=entrada.nextLine();
      System.out.println("Ingresa el numero de integrantes de tu equipo");
      int numIntegrantes=entrada.nextInt();
      
       Equipo arreglo[]=new Equipo[numIntegrantes];
    for(int i=0; i<arreglo.length;i++){
   
    System.out.println("Ingresa el nombre del jugador");
    String nombreJu=entrada.nextLine();
    entrada.nextLine();
    System.out.println("Ingresa el apellido del jugador");
    String apellido=entrada.nextLine();
    System.out.println("Ingresa la posicion donde juega el jugador");
    String posicion=entrada.nextLine();
    System.out.println("Ingresa la edad del jugador");
    int edad= entrada.nextInt();
System.out.println("-------------------------------------------------------");
     entrada.nextLine();
    
     arreglo[i]=new Equipo(nombreJu,apellido,posicion,edad);
    
  }
     for (Equipo arreglo1 : arreglo){
System.out.println("El nombre del jugador es"+arreglo1.getNombreJu()+" "+arreglo1.getApellido()+" "+"su edad es"+" "+arreglo1.getEdad()+" "+"juega en la posicion"+" "+arreglo1.getPosicion());
     }   
  
}    
   //metodo para mostrar los datos de una clase
   public void datos(){
       
   }
 public void mostrarDa(){
       
   }  
 public void mostrarDatosEquipo(){
     
 }

}
