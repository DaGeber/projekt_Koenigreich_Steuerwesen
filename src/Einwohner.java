public abstract class Einwohner {
    private String name;
    private int einkommen;
    public Einwohner(String name, int einkommen) {
        this.name = name;
        this.einkommen = einkommen;
    }
    
    public int zuVersteuern() {
        return getEinkommen();
    }

    private int getEinkommen() {
        return this.einkommen;
    }

    public int steuer() {
        zuVersteuern();
        return 0;
    }
}
