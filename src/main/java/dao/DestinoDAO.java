package dao;

import domain.Destino;

public class DestinoDAO extends dao.DAO<Destino> {


    @Override
    protected String getSqlString() {
        return "select d from Destino d";
    }

    @Override
    protected Class getClassName() {
        return Destino.class;
    }
}