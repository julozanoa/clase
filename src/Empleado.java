/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private String genero;
    private int fechadenacimiento;
    //private imagen
    private int fechadeingreso;

    public Empleado(String nombre, String apellido, String genero, int fechadenacimiento, int fechadeingreso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fechadenacimiento = fechadenacimiento;
        this.fechadeingreso = fechadeingreso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getGenero() {
        return genero;
    }

    public int getFechadenacimiento() {
        return fechadenacimiento;
    }

    public int getFechadeingreso() {
        return fechadeingreso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setFechadenacimiento(int fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }

    public void setFechadeingreso(int fechadeingreso) {
        this.fechadeingreso = fechadeingreso;
    }
    
    
    
}
