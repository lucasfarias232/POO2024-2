package personagem.npc.lucas;

import java.util.ArrayList;
import java.util.List;

public class NpcLista implements NpcInterface {

    private List<Npc> npcs = new ArrayList<>();

    @Override
    public void cadastrarNpc(Npc npc) {
        npcs.add(npc);

    }
    public Npc pesquisarNpc(String nome ) {
        for (Npc npc : npcs) {
            if (npc.getNome().equalsIgnoreCase(nome)) {
                System.out.println(npc.toString());
                return npc;
            }
        }
        return null;
    }
    @Override
    public List<Npc> getNpc() {
        return npcs;
    }
    public String falar(String falas){
        return " FALAS " +falas;
    }

}
