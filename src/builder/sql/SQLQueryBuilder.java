package builder.sql;

public class SQLQueryBuilder {
    private SQLQuery query;
    public SQLQueryBuilder() {
        query = new SQLQuery();
    }

    public SQLQueryBuilder select(String columns){
        query.setSelect(columns);
        return this;
    }
    public SQLQueryBuilder from(String table){
        query.setFrom(table);
        return this;
    }

    public SQLQueryBuilder where(String condition){
        query.setWhere(condition);
        return this;
    }

    public SQLQuery build(){
        return query;
    }
}
