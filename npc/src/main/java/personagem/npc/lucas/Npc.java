package personagem.npc.lucas;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Npc {

    private String nome;
    private String idade;
    private int nivel;
    private int saude;
    private String biografia;
    private String classe;
    private List<String> falas;

    public Npc(String nome, String idade, int nivel, int saude, String biografia, String classe,String falas) {
        this.nome = nome;
        this.idade = idade;
        this.nivel = nivel;
        this.saude = saude;
        this.biografia = biografia;
        this.classe = classe;
        this.falas = new ArrayList<>();
        for(String fala : falas.split("")){
            this.falas.add(falas.trim());
        }

    }

    public Npc() {
        this("", "", 0, 0, "", "","");
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setIdade(String novaIdade) {
        this.idade = novaIdade;
    }

    public void setNivel(int novoNivel) {
        this.nivel = novoNivel;
    }

    public void setSaude(int saude1) {
        this.saude = saude1;
    }

    public void setBiografia(String novaBiografia) {
        this.biografia = novaBiografia;
    }

    public void setClasse(String novaClasse) {
        this.classe = novaClasse;
    }
    public void setFalas(String novafala){
        this.falas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getIdade() {
        return idade;
    }

    public int getNivel() {
        return nivel;
    }

    public int getSaude() {
        return saude;
    }

    public String getBiografia() {
        return biografia;
    }

    public String getClasse() {
        return classe;
    }
    public List<String> getFalas(){
        return falas;
    }
    public String falar() {
        if (!falas.isEmpty()){
            return falas.get((int)  (Math.random() * falas.size()));
        }
        return " esse npc não tem falas  cadastradas !";
    /*p um metodo que mostre frase do perssonagem algo caracteristico dele, comportamentos
     tipo falar, correr .*/
        /*hashcode e equals* para fazer */
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Npc npc = (Npc) o;
        return nivel == npc.nivel && saude == npc.saude && Objects.equals(nome, npc.nome) && Objects.equals(idade, npc.idade) && Objects.equals(biografia, npc.biografia) && Objects.equals(classe, npc.classe) && Objects.equals(falas, npc.falas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, nivel, saude, biografia, classe, falas);
    }

    @Override
    public String toString() {
        return "[ Personagem não jogável ] \n" +
                "  nome [" + nome + "] \n " +
                " idade [" + idade + "] \n " +
                " nivel [" + nivel + "]\n " +
                " saude [" + saude + " ]\n " +
                " História [" + biografia + "]\n " +
                " classe [" + classe + "]\n\n" +
                " falas [ " +falas+ " ] ";


    }
}



