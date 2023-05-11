import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {
		
		//LEER 10 NUMEROS ENTEROS. DEBEMOS MOSTRARLOS EN EL SIGUIENTE ORDEN: EL PRIMERO, EL ÚLTIMO,
		//EL SEGUNDO, EL PENÚLTIMO, EL TERCERO ETC.
		
		int [] miArray = new int[10];
		
		Scanner keyboard = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			System.out.println("Introduce un número");
			miArray[i] = keyboard.nextInt();
		}
		
		System.out.println("El resultado es: ");
        for(int i=0;i<=4;i++) {
        
            System.out.println (miArray[i]); 
            
            System.out.println(miArray[9-i]);
	
	}
        if (miArray.length % 2 != 0) {
            System.out.print(miArray[miArray.length / 2]);
        }
	}
}
