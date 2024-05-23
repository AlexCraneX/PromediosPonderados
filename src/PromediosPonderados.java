public class PromediosPonderados {
    private String nombre;
    private int[] calificaciones;

    public PromediosPonderados(String nombre, int[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public double calcularPromedio() {
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / (double) calificaciones.length;
    }

    public char calfinal(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    public void salidaresult() {
        double promedio = calcularPromedio();
        char calificacionFinal = calfinal(promedio);

        System.out.println("Estudiante: " + nombre); //INSTRUCCIONES FINALES
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacionFinal);
    }

    public static void main(String[] args) {
        int[] calificaciones = {85, 90, 78, 92, 88};
        PromediosPonderados estudiante = new PromediosPonderados("Ramiro Paez G", calificaciones);
        estudiante.salidaresult();
    }
}
