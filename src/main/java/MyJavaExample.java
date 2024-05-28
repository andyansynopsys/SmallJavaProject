public class MyJavaExample {
    public static void main(String[] args) {
        int loops = 100;
        int total = getTotal(loops);
        System.out.print(total);

        // THIS needs to be refactored.
        getString();
        QueryClauses queryClauses = new QueryClauses("from", "where", "having");
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

    // Out-of-bounds Read
    private static void getString() {
        String [] array = new String[2];
        for (int i = 0; i <= array.length; i++) {
            System.out.println(array[i]);
        }
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
