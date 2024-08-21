package testar;

import java.util.Scanner;

import atv02.Data;
import atv02.Tempo;
import atv02.Horario;

public class TestaTempo {
	
	public static void dadosTempo(Tempo oTempo) {
        if (oTempo == null) {
            System.out.println("Tipo inexistente.");
        } else {
            System.out.println("Tempo formatado: " + oTempo.toString());
            System.out.println("Tempo em segundos: " + oTempo.quantidade());
        }
	}

		
	public static void main(String[] arg) {
		
		Scanner sc= new Scanner(System.in);
		
		Tempo oTempo = null;
		
		int opc = 1;
		
		while(opc!=0) {
			
			System.out.println("Digite 1 para opção: Tempo\nDigite 2 para opção: Horário\nDigite 3 para opção: Data\nPara parar digite 0");
			opc = sc.nextInt();
			
			switch (opc){
			case 1:
				oTempo = new Tempo();
				break;
			case 2:
				System.out.println("Digite hora:\n");
				Integer h = sc.nextInt();
				System.out.println("Digite minutos:\n");
				Integer m = sc.nextInt();
				System.out.println("Digite segundos:\n");
				Integer s = sc.nextInt();
				oTempo = new Horario(h,m,s);
				break;
			case 3:
				System.out.println("Digite dia:\n");
				Integer dia = sc.nextInt();
				System.out.println("Digite mes:\n");
				Integer mes = sc.nextInt();
				System.out.println("Digite ano:\n");
				Integer ano = sc.nextInt();
				oTempo = new Data(dia,mes,ano);
				break;
		}
			
			dadosTempo(oTempo);
		}
	}
}
