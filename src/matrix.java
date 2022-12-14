import java.util.Random;

public class matrix {
    int a;
    int b;
    int[][] m;


    public matrix(int a, int b){
        Random rd = new Random();
        m = new int[a][b];
        for(int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                set(i,j, rd.nextInt(11));
            }
        }
        this.a = a;
        this.b = b;
    }
    public void set(int a, int b, int c){
        m[a][b] = c;
    }

    public int get(int a, int b){
        return m[a][b];
    }

    void vivod() {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(get(i, j) + " ");
            }
            System.out.println();
        }
    }

    matrix sloz(matrix m){
        matrix mc = new matrix(m.a, m.b);
        for(int i = 0; i < m.a; i++) {
            for (int j = 0; j < m.b; j++) {
                mc.set(i, j, get(i,j)+m.get(i,j));
            }
        }
        return mc;
    }

    matrix unch(int u){
        matrix mc = new matrix(a,b);
        for(int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                mc.set(i, j, get(i,j)*u);
            }
        }
        return mc;
    }
    matrix umMat(matrix m){
        matrix mc = new matrix(a,b);
        int r=0;
        for(int i = 0; i < mc.a; i++) {
            for (int j = 0; j < mc.b; j++) {
                if(mc.a < mc.b) {
                    for (int k = 0; k < mc.a; k++) {
                        r = r + (get(i,k) * m.get(k,j));
                    }
                }
                else {
                    for (int k = 0; k < mc.b; k++) {
                        r = r + (get(i,k) * m.get(k,j));
                    }
                }
                mc.set(i,j, r);
                r=0;
            }
        }
        return mc;
    }
}