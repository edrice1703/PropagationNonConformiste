

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class PropagationNonConformiste{
    public static double p(double p0){
        return p0 + 1.998001e-3 *( 1.0 + p0);
    }
    public static void main(String[] args) {
        // avec : p(t + h) = p(t) + hp'(t) + (h2/2)p"(t) + (h3/6)p"'(t)
        /*
            double b = 0.02;
            double r = 0.1;
            double coeff = r*b;
            double dp1 = coeff*(1-p0);  -- derivée 1
            double dp2 = coeff*(-dp1);  -- derivée 2
            double dp3 = coeff*(-dp2);  -- derivée 3

            comme h = 1 ; on a eu p = p0 + 1.998001e-3 *( 1.0 + p0);
        * */
        int h = 1; // pour 1 an
        double p0 = 0.01;
        double p;

        while (h < 80){
            p = p(p0);
            h++;
            // on affiche les resultats  50 et 80
            if (h == 50 || h == 80){
                System.out.printf("\nt = %d  | p = %.6f | erreur : %.6f",h,p , Math.abs(p0 - p));
            }
            p0 = p;
        }

    }
}
