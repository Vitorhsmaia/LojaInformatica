package model;

public class Computador {

    private int idComputador;
    private static String marca = "VitorMaia";
    private int hd;
    private String processador;

    public Computador() {
        // Construtor vazio
    }

    // Construtor com parametros
    public Computador(String marca, int hd, String processador) {
        this.hd = hd;
        this.processador = processador;
    }

    //Sobrecarga para alterar processador o hd e o processador
    public Computador(int idComputador, int hd, String processador) {
        this.idComputador = idComputador;
        this.hd = hd;
        this.processador = processador;
    }

    // Metodos acessores da classe "Computador"
    public int getIdComputador() {
        return idComputador;
    }

    public void setIdComputador(int idComputador) {
        this.idComputador = idComputador;
    }

    public static String getMarca() {
        return marca;
    }

    public static void setMarca(String marca) {
        Computador.marca = marca;
    }

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

} // Fim da classe "Computador"
