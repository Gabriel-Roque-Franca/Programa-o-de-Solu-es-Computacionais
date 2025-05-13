
package atividade.carmino;

public class SimularVoo {
    public static void main(String[] args) {
        Piloto p1 = new Piloto("Abreu");
        Piloto p2 = new Piloto("Julio");
        Aviao a1 = new Aviao();
        
        a1.fazVoo(40, p1);
        a1.fazVoo(100, p2);
        a1.fazVoo(170, p2);
        a1.fazVoo(30, p1);
        
        a1.fazRevisao();
        a1.fazVoo(20, p1);
        
        p1.imprime();
        p2.imprime();
        a1.impime();
    }
    
}
