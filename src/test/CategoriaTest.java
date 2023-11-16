package test;

import datos.impl.PropiedadDaoImpl;
import dominio.Propiedad;
import datos.PropiedadDao;

public class CategoriaTest {

    public static void main(String[] args) {
        insertar();
    }
    private static void insertar(){
        PropiedadDao datos = new PropiedadDaoImpl();
        Propiedad obj = new Propiedad();
        obj.setNombre("Escolares");
        System.out.println(datos.insertar(obj));
    }
}
