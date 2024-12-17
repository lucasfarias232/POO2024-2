package personagem.npc.lucas;
import java.util.List;

public interface NpcInterface {

    public abstract void cadastrarNpc(Npc npc);

    public abstract Npc pesquisarNpc(String nome);

    public abstract List<Npc> getNpc();

    public abstract String falar(String falas);
}
