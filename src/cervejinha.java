import java.util.Scanner;

public class cervejinha {
	public static void main(String[] args){

		int cervejas = 99;
		int opcao = 0;
		int quantidade = 0;
		Scanner leitor = new Scanner(System.in);

		while (cervejas > 0){

			System.out.println(cervejas + "cervejas no freezer. ");
			System.out.println("pego uma garrafa e passo pra frente");
			cervejas = cervejas - 1;
			System.out.println("agora restam  "  + cervejas +  " no freezer");
				if (cervejas == 1){
					System.out.println("xiii acabou... quer beber mais ?");
					System.out.println("digite 1 - para SIM");
					System.out.println("digite 2 - para NAO");
					opcao = leitor.nextInt();
						if (opcao == 1){
							System.out.println("informe o n° de cervejas");
							quantidade = leitor.nextInt();
							cervejas = quantidade;
							System.out.println("cervejas reabastecida");
						}else{
							System.out.println("Ta acabando ...");
					}
			}
		}
	}
}