package AtividadesVetorMatriz;

import java.util.Scanner;

public class ArrayVetor {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
        
        int numeros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        int numero;
        
        System.out.printf("Digite o número que você deseja encontrar: ");
        numero = reader.nextInt();
        
        for(int x = 0; x < numeros.length; x++) {
            if(numeros[x] == numero)
                System.out.printf("O número %d está localizado na posição: %d", numeros[x], x);
            else if(x == numeros.length - 1)
                System.out.printf("\nO número %d não foi encontrado!", numero);
        }

	}

}
