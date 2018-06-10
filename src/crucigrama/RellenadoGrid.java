package crucigrama;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class RellenadoGrid {
Label[][] cruzigramaLabel  = new Label[15][15];

public void RellenarCruzi (GridPane gridPane, AlmacenInformacion almacenInformacion) {
    System.out.println("Entrada metodo");
    System.out.println("almacenInformacion.ancho"+ almacenInformacion.ancho);
for(int fila=0; fila<almacenInformacion.alto; fila++) {
    for(int columna=0; columna<almacenInformacion.ancho; columna++) {
        cruzigramaLabel [fila][columna] = new Label(String.valueOf(almacenInformacion.cruzi [fila][columna]));
        cruzigramaLabel [fila][columna].getStyleClass().add("LabelCruzigrama"); 
       gridPane.add(cruzigramaLabel [fila][columna],fila, columna );
   
    }
}
}
public void casillasNegras (GridPane gridPane, AlmacenInformacion almacenInformacion) {
    for(int fila=0; fila<almacenInformacion.alto; fila++) {
        for(int columna=0; columna<almacenInformacion.ancho; columna++) {
            String texto = cruzigramaLabel [fila][columna].getText();
            if (texto.equals(".")){
                cruzigramaLabel [fila][columna].getStyleClass().add("casillanegra"); 
            }
        }}
}
}