public class EmpleadoRRHH extends TrabajadorCorporativo{
    public EmpleadoRRHH(String nombre, double sueldoBase) {
        super(nombre, sueldoBase);
    }

    @Override
    public double calcularBonoAnual() {

        return sueldoBase * 0.10;
    }
}
