
package atividade.carmino;

public class Aviao {
    private int horasAtividade;
    
    public Aviao() {
        this.horasAtividade = 0;
    }
    
    public void fazVoo(int horas, Piloto piloto) {
        if (horasAtividade + horas <= 200) {
            this.horasAtividade += horas;
            piloto.adicionarHoras(horas);
        } else {
            System.out.println("Voo não realizado. Avião precisa de revisão");
        }
    }
    
    public void fazRevisao() {
        this.horasAtividade = 0;
    }
    
    public void impime() {
        System.out.println("Horas de Atividade do Avião: " + horasAtividade);
        if (horasAtividade < 200) {
            System.out.println("Avião não precisa de revisão.");
        } else {
            System.out.println("Avião precisa de revisão");
        }
    }
}
