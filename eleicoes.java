package exerciciossala;

import java.util.Scanner;

public class d0205e002 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);//puxando impressora
        int i=0, voto=0, pt=0, pdt=0, pl=0, psdb=0, nulo=0, branco=0;//criando variaveis
        
        for(i=0; i<10; i++){ //Essa linha esta criando uma estrutura de repetição para que haja 50 possibilidades de votos
            System.out.printf("\n\n====== ELEIÇÕES 2022 ======\n VOTE 1 - PT\n VOTE 2 - PDT\n VOTE 3 - PL\n VOTE 4 - PSDB\n VOTE 5 - NULO\n VOTE 6 - VOTO EM BRANCO\n\n Digite seu voto: ");
            voto = ler.nextInt();//lendo o voto
            switch (voto) {//criando condição para o tipo de valor que a variavel voto recebeu, dependendo do valor, o voto vai ser atribuido para algum candidato
                case 1://caso1
                    pt++;
                    break;//saida do caso
                case 2://caso2
                    pdt++;
                    break;
                case 3://caso3
                    pl++;
                    break;
                case 4://caso4
                    psdb++;
                    break;
                case 5://caso5
                    nulo++;
                    break;
                case 6://caso6
                    branco++;
                    break;
                default://quando nao existe o caso solicitado
                    System.out.printf("Não existe esse candidato!");
                    break;
            }
        }
        System.out.println("RESULTADO DA VOTAÇÃO:");//imprimindo resultado final
        System.out.printf("\n\npt: %d votos!\n", pt);
        System.out.printf("pdt: %d votos!\n", pdt);
        System.out.printf("pl: %d votos!\n", pl);
        System.out.printf("psdb: %d votos!\n", psdb);
        System.out.printf("nulo: %d votos!\n", nulo);
        System.out.printf("em branco: %d votos!\n", branco);   
    }
    
}
