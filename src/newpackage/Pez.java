package newpackage;
public class Pez extends Vertebrados{
    private String colorEscamas;
    private boolean cuerpoAlargado;
    private String clasificacion; //* Oseo, cartilaginoso
    

    // constructor
    public Pez(String nombre, String nombreCientifico, String habitat, int nExtremidades, String desplazamiento,
            int nHuesos, String colorEscamas, boolean cuerpoAlargado, String clasificacion) {
        super(nombre, nombreCientifico, habitat, nExtremidades, desplazamiento, nHuesos);
        this.colorEscamas = colorEscamas;
        this.cuerpoAlargado = cuerpoAlargado;
        this.clasificacion = clasificacion;
    }
    
    // setters y getter
    public String getColorEscamas() {return colorEscamas;}
    public void setColorEscamas(String colorEscamas) {this.colorEscamas = colorEscamas;}
    public boolean isCuerpoAlargado() {return cuerpoAlargado;}
    public void setCuerpoAlargado(boolean cuerpoAlargado) {this.cuerpoAlargado = cuerpoAlargado;}
    public String getClasificacion() {return clasificacion;}
    public void setClasificacion(String clasificacion) {this.clasificacion = clasificacion;}
    
    @Override
    public String comer(Animal a1){
        return "Soy un pez '"+this.getNombreCientifico()+"' y estoy comiendo un: "+a1.getNombre();
    }

    @Override
    public String toString() {

        String cad;
        if (this.isCuerpoAlargado()){
            cad = "Mi cuerpo es alargado";
        } else {
            cad = "Mi cuerpo NO es alargado";
        }

        String esCartilaginoso;
        if(this.getClasificacion() == "cartilaginoso"){
            esCartilaginoso = "no tengo huesos por que soy cartilaginoso";
        } else {
            esCartilaginoso = " tengo " + this.getnHuesos() + " huesos. ";
        }

        return "Soy un(a) "+ this.getNombre() +" '" + this.getNombreCientifico() +"' "+
               cad +
               " y mi habitat es " + this.gethabitat() + ", me desplazo via "+ this.getDesplazamiento() +
               " y tengo " + this.getnExtremidades() + " extremidades." + "\n" + 
               "Tambien el color de mis escamas es " + this.getColorEscamas() + " y " + esCartilaginoso;
    }
}
