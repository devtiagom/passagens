package dao;

import domain.ProdutoDestino;

public class ProdutoDestinoDAO extends dao.DAO<ProdutoDestino> {


    @Override
    protected String getSqlString() {
        return "select pd from ProdutoDestino pd";
    }

    @Override
    protected Class getClassName() {
        return ProdutoDestino.class;
    }
}
