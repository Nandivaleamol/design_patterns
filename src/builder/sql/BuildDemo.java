package builder.sql;

public class BuildDemo {
    public static void main(String[] args) {
        SQLQuery query1 = new SQLQueryBuilder()
                .select("*")
                .from("employees")
                .where("salary > 50000")
                .build();

        System.out.println(query1);

        SQLQuery query2 = new SQLQueryBuilder()
                .select("name")
                .from("employees")
                .where("experience > 2")
                .build();
        System.out.println(query2);
    }
}
