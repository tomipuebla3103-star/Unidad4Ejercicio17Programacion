public class EmpleadoVentas extends TrabajadorCorporativo{
    public EmpleadoVentas(String nombre, double sueldoBase) {
        super(nombre, sueldoBase);
    }

    @Override
    public double calcularBonoAnual() {

        return sueldoBase * 0.20;
    }
}
