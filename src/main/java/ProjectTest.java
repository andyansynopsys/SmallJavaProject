public class ProjectTest {
    public ProjectTest() {

    }

    public void test() {
        int loops = 100;
        int total = getTotal(loops);
        System.out.print(total);
    }

    private int getTotal(int loops) {
        int total = 0;
        if (loops > 0) {
            total += loops;
        }
        return total;
    }
}

