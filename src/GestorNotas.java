import java.util.ArrayList;
import java.util.List;

public class GestorNotas {

    private List<Nota> notas;


    public GestorNotas() {
        this.notas = new ArrayList<>();
    }



    private int contadorId = 1;
    // TODO: implementar alta de notas
    public void crearNota(String titulo, String contenido, boolean importante) {
        Nota nota = new Nota(contadorId++, titulo, contenido, importante);
        notas.add(nota);
    }

    // TODO: implementar listado
    public void listarNotas() {
        for(Nota n: notas){
            System.out.println(n);
        }
    }

    // TODO: implementar filtro
    public void listarImportantes() {
        for(Nota n: notas){
            if(n.isImportante()){
                System.out.println(n);
            }
        }
    }
}