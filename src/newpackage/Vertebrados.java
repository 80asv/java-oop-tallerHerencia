package newpackage;

public class Vertebrados extends Animal {
    private int nHuesos;

    // constructor
    public Vertebrados(String nombre, String nombreCientifico, String habitat, int nExtremidades, String desplazamiento,
            int nHuesos) {
        super(nombre, nombreCientifico, habitat, nExtremidades, desplazamiento);
        this.nHuesos = nHuesos;
    }

    //getters y setters
    public int getnHuesos() {return nHuesos;}
    public void setnHuesos(int nHuesos) {this.nHuesos = nHuesos;}
    
    @Override
    public String comer(Animal a1){
        return "Soy vertebrado y estoy comiendo un: "+a1.getNombreCientifico();
    }
}
