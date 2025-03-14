public class Main {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Juan",101,5,245,1400000 );
        empleado1.mostarInfo();
        System.out.println(empleado1.verificarAntiguedad());
        empleado1.aumentarSalario();
        empleado1.pagoHorasExtra();
        System.out.println();
        Empleado empleado2 = new Empleado("Marcos",102,2,230,1400000 );
        empleado2.mostarInfo();
        System.out.println(empleado2.verificarAntiguedad());
        empleado2.aumentarSalario();
        empleado2.pagoHorasExtra();
        System.out.println();
        Empleado empleado3 = new Empleado("Antonia",103,4,237.5,1400000 );
        empleado3.mostarInfo();
        System.out.println(empleado3.verificarAntiguedad());
        empleado3.aumentarSalario();
        empleado3.pagoHorasExtra();
        System.out.println();
        Empleado empleado4 = new Empleado();
        empleado4.setNombre("Andrea");
        empleado4.setId(104);
        empleado4.setAnios(11);
        empleado4.setHorasTrabajadas(250);
        empleado4.setSalario(1400000);
        empleado4.mostarInfo();
        System.out.println(empleado4.verificarAntiguedad());
        empleado4.aumentarSalario();
        empleado4.pagoHorasExtra();

    }
}