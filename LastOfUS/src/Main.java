public class Main {
    public static void main(String[] args) {

        Joel joel= new Joel("Joel","Sking de Joel","Alto","Franco Tirador","Muy Alto", "Altisimo");
        Ellie ellie = new Ellie("Ellie", "Skin de Ellie", "Alto", "Cuchillo", "Muy alto",25);
        Runner runner = new Runner("Runner", "sking de runner","Alto","Garras","Muy Veloz");
        Stalker stalker = new Stalker("Stalker", "Skin de stalker", "Alto", "Garras", 200);
        Clicker clicker = new Clicker("Clicker", "Skin de Clicker", "Alto", "Garras","Muy alta");
        Bloaster bloaster = new Bloaster("Bloaster", "skin de Bloaster", "Muy alto", "Puños",100);

        Muro muro= new Muro(150,150,100);
        Plataforma plataforma=new Plataforma(100,15,"Concreto","Tablas");

        Juego juego=new Juego();

        juego.agregarPlayer(joel);
        juego.agregarPlayer(ellie);
        juego.agregarPlayer(runner);
        juego.agregarPlayer(stalker);
        juego.agregarPlayer(clicker);
        juego.agregarPlayer(bloaster);
        juego.agregarObjeto(muro);
        juego.agregarObjeto(plataforma);
        System.out.println("Mostando Los objetos del juego");
        juego.mostrarObjetos();

        System.out.println("Mostrando los personajes:");
        juego.mostrarPersonajes();
        joel.atacar();
        ellie.morir();
    }
}