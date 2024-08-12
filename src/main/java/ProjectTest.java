public class ProjectTest {
    public ProjectTest() {

    }

    public void test() {
        int loops = 100;
        int total = getTotal(loops);
        System.out.print(total);
    }
    public void test01() {
        int loops = 100;
        int total = getTotal(loops);
        System.out.print(total);
    }




    private int getTotal(int loops) {
        int total1 = 0;
        if (loops > 0) {
            total1 += loops;
        }
        return total1;
    }
}

