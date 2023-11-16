package dominio;

public class Propiedad {
    //Atributos    
    private int id;
    private String nombre;
    private String direccion;
    private String caracteristicas;
    private String estado;
    private double precioalquiler;

    public Propiedad() {
    }

    public Propiedad(int id, String nombre,String direccion,String caracteristicas,String estado,double precioalquiler) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.caracteristicas = caracteristicas;
        this.estado = estado;
        this.precioalquiler=precioalquiler;
    }


    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the caracteristicas
     */
    public String getCaracteristicas() {
        return caracteristicas;
    }

    /**
     * @param caracteristicas the caracteristicas to set
     */
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the precioalquiler
     */
    public double getPrecioalquiler() {
        return precioalquiler;
    }

    /**
     * @param precioalquiler the precioalquiler to set
     */
    public void setPrecioalquiler(double precioalquiler) {
        this.precioalquiler = precioalquiler;
    }

 
 

    
}
