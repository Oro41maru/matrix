public class main {
    public static void main(String[] args) {
        matrix mc = new matrix(2, 2);
        matrix mc2 = new matrix(2, 2);
        matrix mc3 = new matrix(2,2);
        matrix mc4 = new matrix(2,2);
        matrix mc5 = new matrix(2,2);
        mc.vivod();
        System.out.println();
        mc2.vivod();
        System.out.println();
        mc3 = mc.sloz(mc2);
        mc3.vivod();
        System.out.println();
        mc4 = mc.unch(2);
        mc4.vivod();
        System.out.println();
        mc5 = mc.umMat(mc2);
        mc5.vivod();
    }
}
