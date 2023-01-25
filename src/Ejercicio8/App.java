package Ejercicio8;

public class App {

	public static void main(String[] args) {
		ReverseString reverse = (texto) -> {
            StringBuilder sb = new StringBuilder(texto);
            return sb.reverse().toString();
        };
        System.out.println("La frase invertida es: " + reverse.reverse("Hola, hola, caracola"));
	}

}
