public class MyJavaExample {
    public static void main(String[] args) {
        int loops = 100;
        System.out.print(getTotal(loops));
    }

    // infinite loop issue
    private static int getTotal(int loops) {
        int total = 0;
        while (loops > 0) {
            total += loops;
        }
        return total;
    }

    private static void testGetTotal() {
        int total = getTotal(1);
    }
    
    
    public static class QueryClauses {
        public String fromClause;
        public String whereClause;
        public String havingClause;


        public QueryClauses(String fromClause, String whereClause, String havingClause) {
            this.fromClause = fromClause;
            this.whereClause = whereClause;
            this.havingClause = havingClause;
        }
    }
}
