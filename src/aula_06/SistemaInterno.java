package aula_06;

public class SistemaInterno {

    private int senha = 2222;

    public void autentica (Autenticavel fa){
        boolean autenticou = fa.autentica(this.senha);
        if (autenticou) {
            System.out.println("Pode entrar no sistema!");
        } else{
            System.out.println("Não pode entrar no sistema");
        }
    }

//repetição não é uma boa prática!
//    public void autentica (Administrador adm){
//        boolean autenticou = adm.autentica(this.senha);
//        if (autenticou) {
//            System.out.println("Pode entrar no sistema!");
//        } else{
//            System.out.println("Não pode entrar no sistema");
//        }
//    }
}
