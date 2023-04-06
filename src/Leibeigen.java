public class Leibeigen extends Bauer{
    public Leibeigen(String name, int einkommen) {
        super(name, einkommen);
    }

    @Override
    public int zuVersteuern() {
        if (super.zuVersteuern() < 120) {
            return 0;
        }else {
            return  super.zuVersteuern() - 120;
        }
    }
}
