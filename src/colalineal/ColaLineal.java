package colalineal;

/**
 *
 * @author maryse
 * 
 * Cola - Array
 */

public class ColaLineal {

    private static final int MAXTAMQ = 39;
    protected int frente;
    protected int fin;
    protected String[] listaCola;

    public ColaLineal() {
        frente = 0;
        fin = -1;
        listaCola = new String[MAXTAMQ];
    }
    
    // operaciones de modificación de la cola
    public void insertar(String elemento) throws Exception {
        if (!colaLlena()) {
            listaCola[++fin] = elemento;
        } else {
            throw new Exception("Overflow en la cola");
        }
    }

    public String quitar() throws Exception {
        if (!colaVacia()) {
            return listaCola[frente++];
        } else {
            throw new Exception("Cola vacia ");
        }
    }
    
    //vacía la cola
    public void borrarCola() {
        frente = 0;
        fin = -1;
    }
    
    // acceso a la cola
    public String frenteCola() throws Exception {
        if (!colaVacia()) {
            return listaCola[frente];
        } else {
            throw new Exception("Cola vacia ");
        }
    }
    
    // métodos de verificación del estado de la cola
    public boolean colaVacia() {
        return frente > fin;
    }

    public boolean colaLlena() {
        return fin == MAXTAMQ - 1;
    }
}
