package newpackage;
public class Invertebrados extends Animal {
    private boolean patasArticuladas;

    // constructor
    public Invertebrados(String nombre, String nombreCientifico, String habitat, int nExtremidades,
    String desplazamiento, boolean patasArticuladas) {
        super(nombre, nombreCientifico, habitat, nExtremidades, desplazamiento);
        this.patasArticuladas = patasArticuladas;
    }
    
    // getter y setters
    public boolean isPatasArticuladas() {return patasArticuladas;}
    public void setPatasArticuladas(boolean patasArticuladas) {this.patasArticuladas = patasArticuladas;}
    
}
