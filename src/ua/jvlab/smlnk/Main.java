package ua.jvlab.smlnk;

/*Returns the maximum number from an array of integers*/

/* @version 1.0.0;
 * @date 2018-01-18;
 * @author "$.m.lnk";
 */

public class Main {


    public static void main(String[] args) {

        int [] f = {3,15,10,2};
        maxNabr(f);
    }

    public static void maxNabr (int []f){
        int max = f[0];

        for (int i=0; i<f.length; i++) {

            if (max < f[1]) {
                max = f[1];
            }
            if (max < f[2]) {
                max = f[2];
            }
            if (max < f[3]) {
                max = f[3];
            }
            System.out.println("Max number in the array = "+ max);
        }

    }
}
