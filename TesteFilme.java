public class TesteFilme {
    public static void main(String[] args) {
        Filme f=new Filme();
        f.setCodigo(1);
        f.setNome("Avatar 1");
        f.setValor(5);
        
        System.out.println("Codigo:"+f.getCodigo()+" Filme:" +f.getNome()+" Valor:"+f.getValor()+" Reais");  

        f.setCodigo(2);
        f.setNome("X-men");
        f.setValor(2.50);
        System.out.println("Codigo:"+f.getCodigo()+" Filme:" +f.getNome()+" Valor:"+f.getValor()+" Reais");

        
    }
}
       
