package AtividadesVetorMatriz;

import java.util.Scanner;

public class VetorMatriz {

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

		int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
		int linha,coluna,somaNumero=0;

		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
       System.out.println(mat[linha][coluna]+"");
   }
} 
		System.out.println("\nDiagonal Principal:");
			for(linha=0;linha<3;linha++)
				System.out.println(mat[linha][linha]+"");
					System.out.println("\nDiagonal Secundaria:");
						for(linha=0;linha<3;linha++)
							System.out.println(mat[linha][3-1-linha]+"");
								System.out.println("\nSoma dos elementos Diagonal Principal:");
									for(linha=0;linha<2;linha++);
										System.out.println(mat[0][0]+mat[1][1]+mat[2][2]);
											System.out.println("\nSoma dos elementos Diagonal Segundaria:");
												for(linha=0;linha<2;linha++);
													System.out.println(mat[2][0]+mat[1][1]+mat[0][2]);

}

}
