package app;

public class Deportista extends Persona {

    public double altura;
    public double peso;
    public String deporte;
    public int numeracionDeportiva;

    public void participar(Olimpiada olimpiada){

        //olimpiada.participantes.add(this);

        olimpiada.inscribir(this);
    }

    public void entrenar(){
        System.out.println("Estoy entrenando");
    }

}