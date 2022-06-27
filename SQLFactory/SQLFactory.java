

public class SQLFactory{
    public static void main(String[] args){

        
        Produto produto = new Produto();
        produto.id=1;
        produto.descricao = "Hamburguer";
        produto.preco = 15.00;        
        
        /* Database.executarSQL(produto.insertSQL()); */

        boolean retorno = Database.executarSQLSelect("produtos", 1 );
        if (retorno) {
            
        } 
        else {
            System.out.println("Deu erro aqui ó");
        }
    }
    

}
