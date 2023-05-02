import java.util.ArrayList;
import java.util.List;

public class Juego {

    private List<Personaje> personajes;
    private List<Objeto>objetos;


    public Juego(List<Personaje> personaje, List<Objeto> objetos) {
        this.personajes = personaje;
        this.objetos = objetos;
    }

    public Juego(){
        personajes = new ArrayList<>();
        objetos = new ArrayList<>();
    }

    public List<Personaje> getPersonaje() {
        return personajes;
    }

    public void setPersonaje(List<Personaje> personaje) {
        this.personajes = personaje;
    }

    public List<Objeto> getObjetos() {
        return objetos;
    }

    public void setObjetos(List<Objeto> objetos) {
        this.objetos = objetos;
    }

    @Override
    public String toString() {
        return "Juego{" +
                "personaje=" + personajes +
                ", objetos=" + objetos +
                '}';
    }

    public void agregarPlayer(Personaje personaje){
        personajes.add(personaje);
    }
    public void agregarObjeto(Objeto objeto){
        objetos.add(objeto);
    }

    public void mostrarPersonajes(){
        for(Personaje personajito : personajes){
            System.out.println("Nombre: " +personajito.getNombre()+ "\n" );
        }
    }
    public void mostrarObjetos(){
        for(Objeto objetitos : objetos){
            System.out.println(objetitos.toString());
        }
    }
}
