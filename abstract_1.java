class PAN {
    private static PAN p = null;

    private PAN() {

    }

    public static PAN getPAN() {
        if (p == null)
            p = new PAN();
        return p;
    }
}
public class abstract_1 {
    public static void main(String[] args) {
        PAN p1=PAN.getPAN();
        PAN p2=PAN.getPAN();
        System.out.println(p1==p2);
    }
}

