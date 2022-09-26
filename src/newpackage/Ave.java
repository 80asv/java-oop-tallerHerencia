package newpackage;
public class Ave extends Vertebrados{
    private boolean volar;
    private String colorPlumas;
    private String tipoPico;

    //constructor
    public Ave(String nombre, String nombreCientifico, String habitat, int nExtremidades, String desplazamiento,
            int nHuesos, boolean volar, String colorPlumas, String tipoPico) {
        super(nombre, nombreCientifico, habitat, nExtremidades, desplazamiento, nHuesos);
        this.volar = volar;
        this.colorPlumas = colorPlumas;
        this.tipoPico = tipoPico;
    }
    
    
    // getters y setters
    public boolean isVolar() {return volar;}
    public String getColorPlumas() {return colorPlumas;}
    public String getTipoPico() {return tipoPico;}
    public void setTipoPico(String tipoPico) {this.tipoPico = tipoPico;}
    public void setColorPlumas(String colorPlumas) {this.colorPlumas = colorPlumas;}
    public void setVolar(boolean volar) {this.volar = volar;}

    
    public String comer(Animal a1){
        return "soy un ave de tipo '"+this.getNombreCientifico()+"' y estoy comiendo un : "+a1.getNombre();
    }

    @Override
    public String toString() {

        String cad;
        if (this.isVolar()){
            cad = " pero NO puedo volar";
        } else {
            cad = ". SI puedo volar";
        }

        return "Soy un(a) "+ this.getNombre()+ " '" + this.getNombreCientifico() +"'"+
               cad +
               " y mi habitat es " + this.gethabitat() + ", me desplazo via "+ this.getDesplazamiento() +
               " y tengo " + this.getnExtremidades() + " extremidades." + "\n" + 
               "Tambien el color de mis plumas son " + this.getColorPlumas() + " y tengo " + this.getnHuesos() + " Huesos.";
    }
    
}
