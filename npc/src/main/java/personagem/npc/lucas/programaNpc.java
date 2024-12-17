package personagem.npc.lucas;
import java.util.Scanner;
public class programaNpc {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        NpcLista npcLista = new NpcLista();

        int  escolha = Integer.parseInt(ent.nextLine());

        System.out.println("CADASTRO DE NPC \n "
                           + "[1] [CADASTRO] \n"
                           + "[2] [PESQUISAR NPC] \n "
                           + " [3] [NPCS CADASTRADOS] \n "
                           + "[4] [FALAS DE NPC ] ");

        switch(escolha) {
            case 1:
                String usuario = "SIM";
                while (usuario.equalsIgnoreCase("SIM")) {
                    System.out.println("nome do npc?");
                    String nome = ent.nextLine();
                    System.out.println("idade");
                    String idade = ent.nextLine();

                    int nivel = 0;
                    int saude = 0;

                    try {
                        System.out.println("nivel");
                        nivel = Integer.parseInt(ent.nextLine());
                        System.out.println("saude");
                        saude = Integer.parseInt(ent.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("entrada invalida! digite um numero.");
                        return;
                    }
                    System.out.println("biografia ");
                    String biografia = ent.nextLine();
                    System.out.println("classe ");
                    String classe = ent.nextLine();
                    System.out.println("falas ");
                    String falas = ent.nextLine();

                    Npc npc1 = new Npc(nome, idade, nivel, saude, biografia, classe, falas);
                    npcLista.cadastrarNpc(npc1);

                    System.out.println("se quiser continur cadastrando digite sim/ senão digite menu");
                    usuario = ent.nextLine();
                    if (usuario.equalsIgnoreCase("menu"))
                        npc1.me

                break;
            case 2:
                System.out.println("PESQUISAR NPC [NOME] ");
                String nome = ent.nextLine();
                npcLista.pesquisarNpc(nome);
                break;
            case 3:
                System.out.println(" NPCS CADASTRADOS ");
                System.out.println(npcLista.getNpc());
                break;
            case 4:
                System.out.println("DIGITE O NOME DO NPC PARA VER SUAS FALAS:");
                nome = ent.nextLine();
                Npc npcEscolhido = npcLista.pesquisarNpc(nome);
                if (npcEscolhido != null) {
                    System.out.println("Falas do NPC: " + npcEscolhido.falar());
                } else {
                    System.out.println("NPC não encontrado.");
                }
                break;

            default:
                System.out.println(" ERROR ");
        }

        ent.close();

    }
}

