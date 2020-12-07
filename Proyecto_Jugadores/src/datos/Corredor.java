package datos;


public class Corredor {
    
    private String nombre;
    private String dni;
    private String fechaNacimiento;
    private String direccion;
    private String telefonoContacto;

    public Corredor(String nombre, String dni, String fechaNacimiento, String direccion, String telefonoContacto) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefonoContacto = telefonoContacto;
    }

    public Corredor() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

     public String[] toArrayString() {
        
        String[] s = new String [5];
        s[0] = nombre;
        s[1] = dni;
        s[2] = fechaNacimiento;
        s[3] = direccion;
        s[4] = telefonoContacto;
    
        return s;
    
    }
    
}
