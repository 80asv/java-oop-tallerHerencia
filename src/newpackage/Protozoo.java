package newpackage;

public class Protozoo extends Invertebrados{
    private String forma; //* amorfos, ovalados, alargados
    private String tipoProtozoo; //* Esporozoos, Ciliados, Flagelados


    // constructor 
    public Protozoo(String nombre, String nombreCientifico, String habitat, int nExtremidades, String desplazamiento,
            boolean patasArticuladas, String forma, String tipoProtozoo) {
        super(nombre, nombreCientifico, habitat, nExtremidades, desplazamiento, patasArticuladas);
        this.forma = forma;
        this.tipoProtozoo = tipoProtozoo;
    }
    
    // getters y setters
    public String getForma(){return forma;}
    public void setForma(String forma){this.forma = forma;}
    public String getTipoProtozoo(){return tipoProtozoo;}
    public void setTipoProtozoo(String tipoProtozoo){this.tipoProtozoo = tipoProtozoo;}

    @Override
    public String comer(){
        return "Yo solo me alimento de bacterias...";
    }

    
    @Override
    public String toString() {
        
        String isExtremidades = this.getnExtremidades() == 0 ? "NO tengo" : "tengo" + this.getnExtremidades();

        return "Soy un(a) " + this.getNombre() + " '" + this.getNombreCientifico() + "'. " +
               " Mi habitat es " + this.gethabitat() + ", me desplazo via "+ this.getDesplazamiento() +
               " y " + isExtremidades + " extremidades." + "\n" + 
               "Otro dato es que soy " + this.getForma() + ", y soy un protozoario de clase " + this.getTipoProtozoo() + ".";
    }
    
}
