import java.util.Scanner;

public class Calculador {

	public static void main(String []args){
		
		int valor,i;
		int[]nota ={100,50,20,10,5,2,1};
		int []notas= new int [7];
		Scanner ler = new Scanner(System.in);
		
		System.out.println("digite um valor");
		valor = ler.nextInt();
		
		for(i = 0;i<7;i++){
			for(int j =1;j<=valor;j++){
				if(j%nota[i] == 0){
					notas[i]++;
				}
			}
			valor= valor%nota[i];
			System.out.println("Notas de R$ "+ nota[i] +",00 = "+notas[i]);
			
		}
		
		
	}
}