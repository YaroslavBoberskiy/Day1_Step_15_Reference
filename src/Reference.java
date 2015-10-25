/**
 * Created by YB on 25.10.2015.
 */
public class Reference {

    private String name;
    private Reference reference;

    public Reference(String name) {
        this.name = name;
    }

    public void setRef(Reference reference) {
        this.reference = reference;
    }

    public String getName() {
        return name;
    }

    public void printReference() {
        System.out.println(name + "-->" + reference.getName());
    }

}
