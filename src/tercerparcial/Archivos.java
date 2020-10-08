package tercerparcial;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Archivos {

    public static void escribirEnTexto(ArrayList<Producto> lista) {
        FileWriter archivo;
        PrintWriter escritor = null;
        try {
            archivo = new FileWriter("D:/planoparcial.txt");
            escritor = new PrintWriter(archivo);
            for (Producto p : lista) {
                escritor.println(p.getCodigo() + "&&" + p.getNombre() + "&&" + p.getTipo() + "&&" + p.getCosto() + "&&" + p.getPrecio() + "&&" + String.valueOf(p.getCantidad()));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la accion" + "   (Excepcion: " + e.getMessage() + ")");
        } finally {
            escritor.close();
        }
    }

    public static ArrayList<Producto> leerEnTexto() {
        ArrayList<Producto> lista = new ArrayList<>();
        File archivo;
        FileReader lector;
        BufferedReader lectorComodo;
        Producto producto;
        try {
            archivo = new File("D:/planoparcial.txt");
            lector = new FileReader(archivo);
            lectorComodo = new BufferedReader(lector);
            String linea;
            while ((linea = lectorComodo.readLine()) != null) {
                String datos[] = linea.split("&&");
                producto = new Producto();
                producto.setCodigo(datos[0]);
                producto.setNombre(datos[1]);
                producto.setTipo(String.valueOf(datos[2]));
                producto.setCosto(Long.valueOf(datos[3]));
                producto.setPrecio(Long.valueOf(datos[4]));
                producto.setCantidad(Integer.valueOf(datos[(4 + 1)]));
                lista.add(producto);
            }
            lectorComodo.close();
            lector.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar " + e.getMessage());
        }
        return lista;
    }

    public static void escribirOrden(ArrayList<Orden> lista) {
        try {
            ObjectOutputStream escritor;
            escritor = new ObjectOutputStream(new FileOutputStream("D:/listaOrdenes.kev"));
            escritor.writeObject(lista);
            escritor.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar esta operacion " + "(" + e.getMessage() + ")");
        }
    }

    public static ArrayList<Orden> leerOrden() {
        ArrayList<Orden> lista = new ArrayList<>();
        try {
            ObjectInputStream lector;
            lector = new ObjectInputStream(new FileInputStream("D:/listaOrdenes.kev"));
            lista = (ArrayList<Orden>) lector.readObject();
            lector.close();
        } catch (Exception e) {
        }

        return lista;
    }

    public static void escribirCliente(ArrayList<Cliente> lista) {
        try {
            ObjectOutputStream escritor;
            escritor = new ObjectOutputStream(new FileOutputStream("D:/listaClientes.kev"));
            escritor.writeObject(lista);
            escritor.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar esta operacion " + "(" + e.getMessage() + ")");
        }
    }

    public static ArrayList<Cliente> leerCliente() {
        ArrayList<Cliente> lista = new ArrayList<>();
        try {
            ObjectInputStream lector;
            lector = new ObjectInputStream(new FileInputStream("D:/listaClientes.kev"));
            lista = (ArrayList<Cliente>) lector.readObject();
            lector.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar esta operacion " + "(" + e.getMessage() + ")");
        }

        return lista;
    }
}

/*  public static void escribirTextoaBinario(ArrayList<Persona> persona, String direccionArchivodeTextoALeer, String direccionArchivoBinarioAEscribir, String corte) {
        File archivo;
        FileReader lector;
        BufferedReader lectorComodo;
        Persona personaObjeto;
        try {
            archivo = new File(direccionArchivodeTextoALeer);
            lector = new FileReader(archivo);
            lectorComodo = new BufferedReader(lector);
            String linea;
            while ((linea = lectorComodo.readLine()) != null) {
                String[] datos = linea.split(corte);
                personaObjeto = new Persona();
                personaObjeto.setIdentificacion(datos[0]);
                personaObjeto.setNombre(datos[1]);
                personaObjeto.setEdad(Integer.valueOf(datos[2]));
                personaObjeto.setTelefono(Integer.valueOf(datos[3]));
                persona.add(personaObjeto);
            }
            lectorComodo.close();
            lector.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar esta accion texto" + "(Excepción:    " + e.getMessage() + ")");
        }
        ObjectOutputStream escritor;
        try {
            escritor = new ObjectOutputStream(new FileOutputStream(direccionArchivoBinarioAEscribir));
            escritor.writeObject(persona);
            escritor.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar esta accion binaria" + "(Excepción: " + e.getMessage() + ")");
        }
    }

    public static ArrayList<Persona> leerBinario() {
        ArrayList<Persona> lista = new ArrayList<>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream("D:/Keiinerp/Personas.kev"));
            lista = (ArrayList<Persona>) lector.readObject();
            lector.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la operacion" + "(Excepción: " + e.getMessage() + ")");
        }
        return lista;
    }

    public static void escribirBinario(ArrayList<Persona> lista) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream("D:/Keiinerp/Personas.kev"));
            escritor.writeObject(lista);
            escritor.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la operacion" + "(Excepción: " + e.getMessage() + ")");
        }
    }

    public static void escribirTexto(ArrayList<Persona> lista) {
        FileWriter ever;
        PrintWriter escritor = null;
        try {
            ever = new FileWriter("D:/ever.txt");
            escritor = new PrintWriter(ever);
            for (Persona persona : lista) {
                escritor.println(persona.getNombre() + "," + persona.getIdentificacion() + "," + persona.getEdad() + "," + persona.getTelefono());
                escritor.close();
            }
        } catch (Exception e) {
        }
    }

    public static ArrayList<Persona> leerTexto() {
        ArrayList<Persona> lista = new ArrayList<>();
        File ever;
        FileReader leer;
        BufferedReader leercomodo;
        Persona perso;
        try {
            ever = new File("D:/ever.txt");
            leer = new FileReader(ever);
            leercomodo = new BufferedReader(leer);
            String line;
            while ((line = leercomodo.readLine()) != null) {
                String datos[] = line.split(",");
                perso = new Persona();
                perso.setNombre(datos[0]);
                perso.setIdentificacion(datos[1]);
                perso.setEdad(Integer.valueOf(datos[2]));
                perso.setTelefono(Integer.valueOf(datos[3]));
                lista.add(perso);
            }
            leercomodo.close();
            leer.close();
        } catch (Exception e) {
        }
        return lista;
    }

}
 */
