/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crucigrama;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

/**
 *
 * @author 1daw
 */
public class FXMLDocumentController implements Initializable {
    AlmacenInformacion almacenInformacion;
    RellenadoGrid RellenadoGrid;
    private Label label;
    @FXML
    private ListView<String> listviewOrizontal;
    @FXML
    private ListView<String> listviewVertical;
    @FXML
    private Label labelOrizontal;
    @FXML
    private Label labelVertical;
    @FXML
    private Button buttonEnviar;
    @FXML
    private Button buttonAbrir;
    @FXML
    private Button buttonDescargar;
    @FXML
    private Label labelTitulo;
    @FXML
    private Label labelAutor;
    @FXML
    private Label labelCopirrig;
    @FXML
    private GridPane GridPanelCruzi;
    @FXML
    private Label labelPistaSelecionada;
    

    
    private static final Logger LOG = Logger.getLogger(FXMLDocumentController.class.getName());
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        RellenadoGrid = new RellenadoGrid();
        almacenInformacion = new AlmacenInformacion();
        almacenInformacion.informacion();
        RellenadoGrid.RellenarCruzi(GridPanelCruzi, almacenInformacion);
        RellenadoGrid.casillasNegras(GridPanelCruzi, almacenInformacion);
        ObservableList <String> items = FXCollections.observableArrayList (
        "Individual", "Doble", "Suite", "Aplicación familiar");
        listviewOrizontal.setItems (items);
        ObservableList <String> items2 = FXCollections.observableArrayList (
         "la prueba es ", "la casilla numero 5", "El numero es", "Aplicación familiar");
        listviewVertical.setItems (items2);
        labelTitulo.setText(almacenInformacion.titulo);
        labelAutor.setText(almacenInformacion.autor);
        labelCopirrig.setText(almacenInformacion.copyright);
        
    }    

    @FXML
    private void MouseClickerOrizontal(MouseEvent event) {
        String pistaSeleccionada = listviewOrizontal.getSelectionModel().getSelectedItem();
        labelPistaSelecionada.setText("Orizontal: " + pistaSeleccionada);
        LOG.info(pistaSeleccionada);
    }

    @FXML
    private void MouseClickerVertical(MouseEvent event) {
        String pistaSeleccionada1 = listviewVertical.getSelectionModel().getSelectedItem();
        labelPistaSelecionada.setText("Vertical: " + pistaSeleccionada1);
        LOG.info(pistaSeleccionada1);
    }

    @FXML
    private void teclearOrizontal(KeyEvent event) {
        String pistaSeleccionada2 = listviewOrizontal.getSelectionModel().getSelectedItem();
        labelPistaSelecionada.setText("Orizontal: " + pistaSeleccionada2);
        LOG.info(pistaSeleccionada2);
    }

    @FXML
    private void teclearVertical(KeyEvent event) {
        String pistaSeleccionada3 = listviewVertical.getSelectionModel().getSelectedItem();
        labelPistaSelecionada.setText("Vertical: " + pistaSeleccionada3);
        LOG.info(pistaSeleccionada3);
    }
    //@SuppressWarnings("empty-statement")
    /*public boolean orizontalEnumerada(int cordOrizon, int cordVertical){
        for(int fila=0; fila<almacenInformacion.alto; fila++) /*
        for(int columna=0; columna<almacenInformacion.ancho; columna++) {
            String texto = RellenadoGrid.cruzigramaLabel [fila][columna].getText();
            if (texto.equals(".") && (0 == RellenadoGrid.cruzigramaLabel [fila][columna] || !".".equals(RellenadoGrid.cruzigramaLabel [fila][columna -1].getText())) && RellenadoGrid.cruzigramaLabel [fila][columna + 1] && 
                    (columna +1) < almacenInformacion.ancho) {
            } else {
            }
;}
        return false;
}*/
    /*public boolean VerticalEnumerada(int cordOrizon, int cordVertical){
        return false;
    }
    
}*/
    }
