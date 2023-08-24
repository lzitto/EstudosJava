public class Cronica {
    private String titulo;
    private String data;
    private String autor;
    private String texto;

    public Cronica(String titulo, String data, String autor, String texto) {
        this.titulo = titulo;
        this.data = data;
        this.autor = autor;
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Cronica{" +
                "titulo='" + titulo + '\'' +
                ", data='" + data + '\'' +
                ", autor='" + autor + '\'' +
                ", texto='" + texto + '\'' +
                '}';
    }
}
