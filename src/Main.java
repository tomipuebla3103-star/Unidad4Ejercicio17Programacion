//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    EmpleadoVentas ventas = new EmpleadoVentas("Juan Perez", 500000);

    EmpleadoSistemas sistemas = new EmpleadoSistemas("Maria Gomez", 700000);

    EmpleadoRRHH rrhh = new EmpleadoRRHH("Carlos Lopez", 600000);

    LiquidadorSueldo liquidador = new LiquidadorSueldo();

    System.out.println("LIQUIDACION DE BONOS ANUALES");
    System.out.println("----------------------");

    liquidador.procesarLiquidacion(ventas);

    liquidador.procesarLiquidacion(sistemas);

    liquidador.procesarLiquidacion(rrhh);
}
