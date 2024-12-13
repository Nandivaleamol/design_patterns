package builder.sql;

public class SQLQuery {
    private String select;
    private String from;
    private String where;

    public void setSelect(String select) {this.select = select;}
    public void setFrom(String from) {this.from = from;}
    public void setWhere(String where){this.where = where;}

    @Override
    public String toString(){
        return "SELECT " + select + " FROM " + from + (where != null ? " WHERE " + where : "");
    }
}
