package evf.javadoc.original;
//Jose Antonio Sanchez Collantes

//Comentario linea 3 bajado a linea 2
public class Artista {
    String nombreArtista;
    public Artista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nombreArtista='" + nombreArtista + '\'' +
                '}';
    }

    public String getNombreArtista() {
        return nombreArtista;
	//Prueba fetch
	//Prueba fetch 2
    }
  
}

