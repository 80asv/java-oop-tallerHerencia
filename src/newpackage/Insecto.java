package newpackage;

public class Insecto extends Invertebrados{
    private int nOjos;
    private String clasificacion; //* Apteros Pterigotos


    // constructor
    public Insecto(String nombre, String nombreCientifico, String habitat, int nExtremidades, String desplazamiento,
            boolean patasArticuladas, int nOjos, String clasificacion) {
        super(nombre, nombreCientifico, habitat, nExtremidades, desplazamiento, patasArticuladas);
        this.nOjos = nOjos;
        this.clasificacion = clasificacion;
    }
    
    // getters y setters
    public int getNOjos() {return nOjos;}
    public String getClasificacion() {return clasificacion;}
    public void setnOjos(int nOjos) {this.nOjos = nOjos;}
    public void setClasificacion(String clasificacion) {this.clasificacion = clasificacion;}

    @Override
    public String comer(Animal a1){
        return "Soy un insecto y me alimento de hierbas y hojas pero ahora como un animal en descompocicion llamado " + a1.getNombre();
    }

    @Override
    public String toString() {
        String isPatas = this.isPatasArticuladas() ? "SI tengo patas articuladas." : "NO tengo patas articulas.";

        return "Soy un(a) "+ this.getNombre() +" invertebrado '" + this.getNombreCientifico() + "'. " + isPatas +
               " Mi habitat es " + this.gethabitat() + ", me desplazo via "+ this.getDesplazamiento() +
               " y tengo " + this.getnExtremidades() + " extremidades." + "\n" + 
               "Tambien tengo " + this.getNOjos() + " ojos, mi clasificacion es " + this.getClasificacion() + ".";
    }
}
