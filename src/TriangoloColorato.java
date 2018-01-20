
public class TriangoloColorato extends Triangolo {

    public String coloreBordo;
    public String coloreSfondo;

    public TriangoloColorato(String coloreBordo, String coloreSfondo, Segmento cateto1, Segmento cateto2) {
        super(cateto1, cateto2);
        this.coloreBordo = coloreBordo;
        this.coloreSfondo = coloreSfondo;
    }

}
