public abstract class TrabajadorCorporativo {
    protected String nombre;
    protected double sueldoBase;

    public TrabajadorCorporativo(String nombre, double sueldoBase) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    public abstract double calcularBonoAnual();
}
