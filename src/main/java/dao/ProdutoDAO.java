package dao;

import domain.Produto;

public class ProdutoDAO extends dao.DAO<Produto> {


    @Override
    protected String getSqlString() {
        return "select p from Produto p";
    }

    @Override
    protected Class getClassName() {
        return Produto.class;
    }
}
