// Single line statements where if condition is true then arg1 is excecuted

package operators;

public class TernaryOperators {
    public static void main(String[] args) {
        int x = 10;

        int z = (x<20)?(x+1):(x-1);
        System.out.println(z);

        String y = (x<20)?"Hello":"Hi";
        System.out.println(y);
    }
}
