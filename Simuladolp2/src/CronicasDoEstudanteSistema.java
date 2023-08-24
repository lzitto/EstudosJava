public class CronicasDoEstudanteSistema {
    private Cronica[] cronicas;
    private int contador;
    public CronicasDoEstudanteSistema() {
        this.cronicas = new Cronica[1000];
        this.contador = 0;
    }
    public void cadastrarCronica(String titulo, String texto, String data, String autor){
        Cronica novaCronica = new Cronica(titulo, texto, data, autor);
        cronicas[contador] = novaCronica;
        contador += 1;
    }
}

