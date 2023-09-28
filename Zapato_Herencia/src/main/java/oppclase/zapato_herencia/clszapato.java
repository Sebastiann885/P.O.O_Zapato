package oppclase.zapato_herencia;
public class clszapato {
    private String color;
    private int talla;
    private String material;
    private char genero;
    
    //Constructores
    clszapato() {
        color = "Negro";
        talla = 50;
        material = "Cuero";
        genero = 'F';
    }
    
    clszapato(String Col) {
        setColor(Col);
        talla = 50;
        material = "Cuero";
        genero = 'F';
    }
    clszapato(String Col, int Tal) {
        setColor(Col);
        setTalla(Tal);
        material = "Cuero";
        genero = 'F';
    }
    clszapato(String Col, int Tal, String Mat) {
        setColor(Col);
        setTalla(Tal);
        setMaterial(Mat);
        genero = 'F';
    }
    clszapato(String Col, int Tal, String Mat, char Gen) {
        setColor(Col);
        setTalla(Tal);
        setMaterial(Mat);
        setGenero(Gen);
    }
    //Metodos sett
    public void setColor (String Col) {
        color = Col.toUpperCase();
    }
    public void setTalla (int Tal) {
        if ((Tal >= 0) && (Tal <= 56)){
            talla = Tal;
        }
        else talla = 34;
        {
            }
    }
    public void setMaterial (String Mat) {
        material = Mat.toUpperCase();
    }
    public void setGenero (char Gen) {
        Gen = Character.toUpperCase(Gen);
        if ((Gen == 'F') || (Gen == 'M')) {
            genero = Gen;
        }
        else {
            genero = 'M';
        }
    }
    //Metodo Get
    public String getColor() {
        return color;
    }
    public int getTalla() {
        return talla;
    }
    public String getMateria() {
        return material;
    }
    public char getGenero() {
        return genero;
    }
}


