

public class SQLFactory{
    public static void main(String[] args){

        
        Produto produto = new Produto();
        produto.id=2;
        produto.descricao = "Hamburguer";
        produto.preco = 20.00;;        
        
        /* Database.executarSQL(produto.insertSQL()); */

        boolean retorno = Database.executarSQLInserir("produtos", 2 );
        if (retorno) {
            
        } 
        else {
            System.out.println("Deu erro aqui ó");
        }
    }
    

}
