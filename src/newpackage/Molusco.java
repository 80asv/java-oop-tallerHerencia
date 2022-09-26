package newpackage;
public class Molusco extends Invertebrados{
    private String tipoMolusco; //* bivaldos, cafalópodos, gaterópodos
    private boolean concha;
    private String metodoAlimenticio;

    // constructor
    public Molusco(String nombre, String nombreCientifico, String habitat, int nExtremidades, String desplazamiento,
    boolean patasArticuladas, String tipoMolusco, boolean concha, String metodoAlimenticio) {
        super(nombre, nombreCientifico, habitat, nExtremidades, desplazamiento, patasArticuladas);
        this.tipoMolusco = tipoMolusco;
        this.concha = concha;
        this.metodoAlimenticio = metodoAlimenticio;
    }
    
    // getters y setters
    public boolean isConcha() {return concha;}
    public String getTipoMolusco() {return tipoMolusco;}
    public String getmetodoAlimenticio() {return metodoAlimenticio;}
    public void setConcha(boolean concha) {this.concha = concha;}
    public void setmetodoAlimenticio(String metodoAlimenticio) {this.metodoAlimenticio = metodoAlimenticio;}
    public void setTipoMolusco(String tipoMolusco) {this.tipoMolusco = tipoMolusco;}
    

    @Override
    public String comer(Animal a1){
        String res;
        if(this.getmetodoAlimenticio() == "filtrador"){
            res = "Soy un(a) " + this.getNombre() + " y me alimento de otros moluscos y microorganismos como " + a1.getNombre();
        } else {
            res =  "Soy un(a) " + this.getNombre() + " y me alimento de microorganismos que quedan en las rocas, hojas y vegetales";
        }

        return res;
    }

    @Override
    public String toString() {
        
        String isPatas = this.isPatasArticuladas() ? "SI tengo patas articuladas." : "NO tengo patas articulas.";
        String isConcha = this.isConcha() ? "NO poseo una concha" : "SI poseo una concha";
        String isExtremidades = this.getnExtremidades() == 0 ? "NO tengo" : "tengo" + this.getnExtremidades();

        return "Soy un "+ this.getNombre() +" invertebrado '" + this.getNombreCientifico() + "'. " + isPatas +
               " Mi habitat es " + this.gethabitat() + ", me desplazo via "+ this.getDesplazamiento() +
               " y " + isExtremidades + " extremidades." + "\n" + 
               "Otro dato es que " + isConcha + ", y soy un molusco de clase " + this.getTipoMolusco() + ".";
    }

}
