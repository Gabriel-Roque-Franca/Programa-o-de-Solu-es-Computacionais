package atividade.carmino;

public class Piloto {

    private String nome;
    private int horasVoo;

    public Piloto(String nome) {
        this.nome = nome;
        this.horasVoo = 0;
    }

    public String getNome(String nome) {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarHoras(int horas) {
        this.horasVoo += horas;
    }

    public void imprime() {
        System.out.println("Nome do Piloto: " + nome);
        System.out.println("Total de Horas de Voo: " + horasVoo);
        System.out.println("Tipo de Piloto: ");
        if (horasVoo <= 200) {
            System.out.println("Co-piloto");
        } else {
            System.out.println("Comandante");
        }
    }
}
