package newpackage;
public class Animal {
    private String nombre;
    private String nombreCientifico;
    private String habitat;
    private int nExtremidades;
    private String desplazamiento;
    

    // constructor
    public Animal(String nombre, String nombreCientifico, String habitat, int nExtremidades, String desplazamiento) {
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.habitat = habitat;
        this.nExtremidades = nExtremidades;
        this.desplazamiento = desplazamiento;
    }

    // setters y getters
    public int getnExtremidades() {return nExtremidades;}
    public String getNombre() {return nombre;}
    public String getNombreCientifico() {return nombreCientifico;}
    public String gethabitat() {return habitat;}
    public String getDesplazamiento() {return desplazamiento;}
    public void setNombreCientifico(String nombreCientifico) {this.nombreCientifico = nombreCientifico;}
    public void sethabitat(String habitat) {this.habitat = habitat;}
    public void setnExtremidades(int nExtremidades) {this.nExtremidades = nExtremidades;}
    public void setDesplazamiento(String desplazamiento) {this.desplazamiento = desplazamiento;}    
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String comer(Animal a1){
        return "Soy un " + this.getNombre() + " y estoy comiendo un: " + a1.getNombreCientifico() ;
    }

    public String comer(){
        return "";
    }

    @Override
    public String toString() {
        return "Soy un " + nombre + "'" + nombreCientifico +"'', mi habitat es " + habitat + ", me desplazo por "+ desplazamiento +" y tengo " + nExtremidades + " extremidades.";
    }

    
}