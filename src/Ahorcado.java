import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        
        //Clase scanner que nos permite que el usuario escriba
        Scanner scanner = new Scanner(System.in);


        //Declaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabrasAdivinadas = false;

        //Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        //estructura de control de tipo iterativa
        for (int i = 0; i < letrasAdivinadas.length; i++) {

            letrasAdivinadas[i] = '_';
            //System.out.println(letrasAdivinadas[i]);
            
        } 

        //Esto se usa cuando tenemos una palabra de chars

        while (!palabrasAdivinadas && intentos < intentosMaximos) {

            System.out.println("Palabra a adivinar : " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " letras)");
            System.out.println("Introduce una letra, por favor");
            
            //usamos la clase scanner para pedir una letra
            //char letra = scanner.next().charAt(0);
            char letra = Character.toLowerCase(scanner.next().charAt(0));


            boolean letraCorrecta = false;

            //Estructura de control iterativa(Bucle)
            for (int i = 0; i < palabraSecreta.length(); i++) {
                //Estructura de control condicional
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
                
            }

            if (!letraCorrecta) {
                intentos++;
                System.err.println("¡Incorrecto! Te quedan " + (intentosMaximos - intentos) + " intentos." );
   
            }

            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabrasAdivinadas = true;
                System.out.println("¡Felicidades!, has adivinado la palbra secreta: " + palabraSecreta);
            }
            
        }
        if (palabrasAdivinadas) {
            System.out.println("Que pena te has quedado sin intentos: GANME OVER");
            
        }

        scanner.close();



        
    }
}
