package datos;

import java.util.List;

public interface PropiedadDao<T> {
    public List<T> listar(String texto);     
    public boolean insertar(T obj);     
    public boolean actualizar(T obj);     
    public boolean eliminar(int id); 
}
