/*

*/
package Entidades;
public class Huesped {
    
    private int idHuesped;
    private String nombre, domicilio, correo;
    private int dni, celular;
    private boolean estado;

    public Huesped() {
    }

    public Huesped(String nombre, String domicilio, String correo, int dni, int celular, boolean estado) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.correo = correo;
        this.dni = dni;
        this.celular = celular;
        this.estado = estado;
    }

    public Huesped(int idHuesped, String nombre, String domicilio, String correo, int dni, int celular, boolean estado) {
        this.idHuesped = idHuesped;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.correo = correo;
        this.dni = dni;
        this.celular = celular;
        this.estado = estado;
    }

    public int getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(int idHuesped) {
        this.idHuesped = idHuesped;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
    
    
    
            
    
}