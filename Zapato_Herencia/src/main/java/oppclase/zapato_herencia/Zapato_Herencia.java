package oppclase.zapato_herencia;

import javax.swing.JOptionPane;

public class Zapato_Herencia {

    public static void main(String[] args) {
    String color = JOptionPane.showInputDialog("Digite el color del Zapato");
    String tallaStr = JOptionPane.showInputDialog("Digite la talla del Zapato");
    String material = JOptionPane.showInputDialog("Digite el material del Zapato");
    String generoStr = JOptionPane.showInputDialog("Digite el género del Zapato");
    String marca = JOptionPane.showInputDialog("Digite la marca del Zapato");
    String estilo = JOptionPane.showInputDialog("Digite el estilo del Zapato");

    int talla = Integer.parseInt(tallaStr);

    char genero = generoStr.charAt(0);

    //clszapato Zapato1 = new clszapato(color, talla, material, genero); 
    clsteni teni = new clsteni(color, talla, material, genero, marca, estilo);

    
    JOptionPane.showMessageDialog(null, "Color: " + teni.getColor() +
                                                    "\nTalla: " + teni.getTalla() + 
                                                    "\nMaterial: " + teni.getMateria() +
                                                    "\nGénero: " + teni.getGenero() + 
                                                    "\nMarca: " + teni.getMarca() + 
                                                    "\nEstilo: " + teni.getEstilo());
}

}
