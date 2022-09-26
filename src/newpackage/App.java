package newpackage;
public class App {
    /** 
     *  @author Andres Sanabria
     *  Trabajo subido el dia 25/09/2022 -> https://github.com/80asv/java-oop-tallerHerencia.git
     *  
     * 
     *  * el programa imprime dos animales por cada clase creada, en caso de que no imprima todos los animales, volver a compilar
     *  * En mi caso no se porque la primera que compila en la consola no se muestran todos. Despues de la segunda imprime normal. tener esto en cuenta. 
    */
    public static void mostrarAnimales(Animal arr[]){
        String animalActual = "";
        int j = 0;
        String animalComiendo = "";
        for (int i = 0; i < arr.length; i++) {
            if(animalActual == ""){
                System.out.println("----------------------------------  " + arr[i].getClass().getSimpleName() + "  ----------------------------------");
                animalActual = arr[i].getClass().getSimpleName();
            }else if(!(animalActual.equals(arr[i].getClass().getSimpleName()))){
                animalActual = arr[i].getClass().getSimpleName();
                System.out.println("----------------------------------  " + arr[i].getClass().getSimpleName() + "  ----------------------------------");
                j = 0;
            }
            System.out.println();
            System.out.print((j+1) +" -> "+ arr[i].toString());
            System.out.println();
            switch(arr[i].getClass().getSimpleName()){
                case "Ave": animalComiendo = arr[i].comer(arr[3]);break;
                case "Pez": animalComiendo = arr[i].comer(arr[6]); break;
                case "Insecto": animalComiendo = arr[i].comer(arr[0]); break;
                case "Molusco": animalComiendo = arr[i].comer(arr[8]); break;
                case "Protozoo": animalComiendo = arr[i].comer();
            }
            System.out.println(animalComiendo);
            System.out.println();
            j++;
        }
    }

    public static void main(String[] args) {

        Animal animales[] = new Animal[10];

        //* Aves
        animales[0] = new Ave("gallina", "Gallimorfes", "el corral", 4, "terrestre", 104, false, "Blancas", "Corto");
        animales[1] = new Ave("pelicano","Pelecanus", "lago", 4, "aereo", 86, true, "Blancas", "largo");
        //* Peces
        animales[2] = new Pez("tiburón martillo", "Sphyrna zygaena", "Oceano", 2, "Agua", 34, "verde", true, "cartilaginoso");
        animales[3] = new Pez("pez globo", "Tetraodontidae", "aguas oceánicas", 2, "Agua", 34, "amarillas", false, "Oseo");
        //* Insectos
        animales[4] = new Insecto("hormiga", "Formicidae",  "clima cálido", 4, "terrestre", true, 2, "Odonata");
        animales[5] = new Insecto("libelula", "Anisoptera",  "lagos, charcos, ríos y tierras pantanosas", 10, "aereo", true, 2, "Pterigotos");
        //* Moluscos
        animales[6] = new Molusco("caracol", "Gastropoda", "agua dulce y terrestre", 0, "terrestre", false, "gaterópodo", true, "ramoneador");
        animales[7] = new Molusco("pulpo", "Octopoda", "agua salada", 8, "acuatico", false, "cefalópodos ", false, "filtrador");
        //* Protozoos
        animales[8] = new Protozoo("ameba", "Amoeba", "agua", 0, "acuatica", false, "amorfo", "tubulinea");
        animales[9] = new Protozoo("paramecio", "Paramecium", "estanques de agua dulce", 0, "acuatica", false, "ovalado", "ciliado");

        App.mostrarAnimales(animales);
    }

}
