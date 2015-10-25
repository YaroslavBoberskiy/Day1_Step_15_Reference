/**
 * Created by YB on 25.10.2015.
 */
public class Demo {

    public static void main(String[] args) {
        Reference refA = new Reference("refA");
        Reference refB = new Reference("refB");
        Reference refC = new Reference("refC");

        refA.setRef(refB);
        refB.setRef(refC);
        refC.setRef(refA);

        refA.printReference();
        refB.printReference();
        refC.printReference();
    }
}
