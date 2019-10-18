package laboratorio2_guillermo_espinal;



import java.util.Date;

/*
         Nombre, Nombre de Rector, 
        Sucursal (Lugar), Año de Creación, 
        Numero de Maestros, Numero de Estudiantes, Costo Mensual y Nivel. 
 */


public class Universidad {

    String nombre;
    String recnombre;
    String sucursal;
    Date creacion;
    int nummaestro;
    int numestu;
    int costo;
    String nivel;

    public Universidad() {

    }

    public Universidad(String nombre, String sucursal,String nivel, String recnombre,Date creacion, int nummaestro, int numestu, int costo) {
        this.nombre = nombre;
        this.recnombre = recnombre;
        this.sucursal = sucursal;
        this.creacion = creacion;
        this.nummaestro = nummaestro;
        this.numestu = numestu;
        this.costo = costo;
    }

    // mutadores

    public String getNombre() {
        return nombre;
    }

    public String getRecnombre() {
        return recnombre;
    }

    public String getSucursal() {
        return sucursal;
    }

    public Date getCreacion() {
        return creacion;
    }

    public int getNummaestro() {
        return nummaestro;
    }

    public int getNumestu() {
        return numestu;
    }

    public int getCosto() {
        return costo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRecnombre(String recnombre) {
        this.recnombre = recnombre;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }

    public void setNummaestro(int nummaestro) {
        this.nummaestro = nummaestro;
    }

    public void setNumestu(int numestu) {
        this.numestu = numestu;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    

}
