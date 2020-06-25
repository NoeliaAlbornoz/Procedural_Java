package app;

public class App {
    public static void main(String[] args) throws Exception {

        Olimpiada olimpiadaCoronaEdition = new Olimpiada();

        Maratonista maratonista1 = new Maratonista();

        maratonista1.nombre = "Sonic";
        maratonista1.procedencia = "Alemania";
        maratonista1.pasaporte = "AL43412344";
        maratonista1.edad = 35;
        maratonista1.energia = 100;

        boolean corrio;
        maratonista1.participar(olimpiadaCoronaEdition);

        System.out.println("Soy " + maratonista1.nombre);
        maratonista1.entrenar();

        while (maratonista1.energia > 0) {
            corrio = maratonista1.correr();
            /*
             * if (corrio) { System.out.println("Pefecto, ha corrido " +
             * maratonista1.nombre); } else {
             * System.out.println("No pudo correr, está lesionado"); }
             */
            if (maratonista1.energia <= 0) {

                System.out.println("Se quedó sin energía " + maratonista1.energia);

            }

        }

        Basquebolista basquebolista1 = new Basquebolista();

        basquebolista1.nombre = "Manu";
        basquebolista1.edad = 34;

        System.out.println("Soy " + basquebolista1.nombre);
        basquebolista1.entrenar();

        olimpiadaCoronaEdition.inscribir(basquebolista1);

        int cantidadDeParticipantes;

        cantidadDeParticipantes = olimpiadaCoronaEdition.participantes.size(); //tamaño de la lista

        System.out.println("Cantidad de participantes: " + cantidadDeParticipantes);

    }
}