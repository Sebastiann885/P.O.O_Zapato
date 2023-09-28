package oppclase.zapato_herencia;

public class clsteni extends clszapato {
    private String Marca;
    private String Estilo;
    
    //Constructores
    clsteni() {
        super();
        Marca = "Sin Marca Especifica.";
        Estilo = "Sin Estilo Especifico";
    }
    
    clsteni(String Col) {
        super(Col);
        Marca = "Sin Marca Especifica.";
        Estilo = "Sin Estilo Especifico";
    }
    clsteni(String Col, int Tal) {
        super(Col, Tal);
        Marca = "Sin Marca Especifica.";
        Estilo = "Sin Estilo Especifico";
    }
    clsteni(String Col, int Tal, String Mat) {
        super(Col, Tal, Mat);
        Marca = "Sin Marca Especifica.";
        Estilo = "Sin Estilo Especifico";
    }
    clsteni(String Col, int Tal, String Mat, char Gen) {
        super(Col, Tal, Mat, Gen);
        Marca = "Sin Marca Especifica.";
        Estilo = "Sin Estilo Especifico";
    }
    clsteni(String Col, int Tal, String Mat, char Gen, String Mar) {
        super(Col, Tal, Mat, Gen);
        setMarca(Mar);
        Estilo = "Sin Estilo Especifico";
    }
    clsteni(String Col, int Tal, String Mat, char Gen, String Mar, String Est) {
        super(Col, Tal, Mat, Gen);
        setMarca(Mar);
        setEstilo(Est);
    }
    //metodos set
    public void setMarca(String Mar) {
        Marca = Mar.toUpperCase();
    }
    public void setEstilo(String Est) {
        Estilo = Est.toUpperCase();
    }
    //metodos Get
    public String getMarca() {
        return Marca;
    }
    public String getEstilo() {
        return Estilo;
    }
}
