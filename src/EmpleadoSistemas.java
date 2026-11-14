public class EmpleadoSistemas extends TrabajadorCorporativo{
    public EmpleadoSistemas(String nombre, double sueldoBase) {
        super(nombre, sueldoBase);
    }

    @Override
    public double calcularBonoAnual() {

        return sueldoBase * 0.15;
    }
}
