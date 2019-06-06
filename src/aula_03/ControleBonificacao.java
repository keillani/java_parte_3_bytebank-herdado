package aula_03;

public class ControleBonificacao {

    private double soma;

//    public void registra(Gerente g){
//        double boni = g.getBonificacao();
//        this.soma = this.soma + boni;
//    }

    //o uso de referências mais genéricas permite desacoplar sistemas.
    public void registra(Funcionario f){
        double boni = f.getBonificacao();
        this.soma = this.soma + boni;
    }

//    public void registra(EditorVideo ev){
//        double boni = ev.getBonificacao();
//        this.soma = this.soma + boni;
//    }

    public double getSoma(){
        return soma;
    }
}
