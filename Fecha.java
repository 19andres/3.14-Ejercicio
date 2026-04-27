public class Fecha {
    private int mes;
    private int dia;
    private int anio;
    public Fecha(int mes, int dia, int anio) {
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }
    // SET
    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    // GET
    public int getMes() {
        return mes;
    }
    public int getDia() {
        return dia;
    }
    public int getAnio() {
        return anio;
    }
    // Mostrar fecha
    public String mostrarFecha() {
        return mes + "/" + dia + "/" + anio;
    }
}
