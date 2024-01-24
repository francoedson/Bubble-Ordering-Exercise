public class Alumno {
    public String nombre;
    public int notas[]=new int[5];

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public void ingresarCalificacion(int i,int calificacion){
        if (i >= 0 && i < notas.length) {
            notas[i] = calificacion;
        }
    }

    public float calcularPromedio(){
        float promedio=0;

        for (int i=0;i<notas.length;i++) {
            promedio = promedio + notas[i];
        }

        return promedio =promedio/ notas.length;

    }

}
