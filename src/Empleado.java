public class Empleado {
    private String nombre;
    private int id;
    private int anios;
    private double horasTrabajadas;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int id, int anios, double horasTrabajadas, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.anios = anios;
        this.horasTrabajadas = horasTrabajadas;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "Nombre='" + nombre + '\'' +
                ", id=" + id +
                ", anios=" + anios +
                ", horasTrabajadas=" + horasTrabajadas +
                ", salario=" + salario +
                '}';
    }

    public void mostarInfo () {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Identificacion: " + this.id);
        System.out.println("Años en la empresa: " + this.anios);
        System.out.println("Horas Trabajadas: " + this.horasTrabajadas);
        System.out.println("Salario: " + this.salario);
    }

    public void aumentarSalario (){
        double aumento = 0;
        double porcentaje = 0;

        if (anios >= 10) {
            porcentaje = 0.10;
        } else if (anios >= 5) {
            porcentaje = 0.07;
        } else if (anios >= 3) {
            porcentaje = 0.05;
        }

        aumento = salario * porcentaje;
        salario += aumento;

        if (porcentaje > 0) {
            System.out.println("Tu aumento de salario es del " + Math.round(porcentaje * 100) + "%: $" + Math.round(aumento));
            System.out.println("Nuevo salario: $" + (salario));
        } else {
            System.out.println("No tienes aumento de salario");
            System.out.println("Salario: $" + salario);
        }
    }

    public String verificarAntiguedad (){
        String exp;
        if (anios>=3){
            exp = "Empleado con Experiencia";
        } else {
            exp = "Empleado nuevo";
        }

        return exp;
    }

    public void pagoHorasExtra() {
        if (horasTrabajadas > 230) {
            double horasExtra = horasTrabajadas - 230;
            double pagoExtra = horasExtra * 8000;

            salario += pagoExtra;

            System.out.println("Has trabajado " + horasExtra + " horas extra.");
            System.out.println("Pago por horas extra: $" + pagoExtra);
            System.out.println("Nuevo salario con horas extra: $" + salario);
        } else {
            System.out.println("No tienes horas extra.");
        }
    }

}

