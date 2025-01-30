package br.ufrpe.javafx_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class FormularioController {

    @FXML
    TextField txtNome;

    @FXML
    DatePicker dtPickerDataNascimento;

    @FXML
    public void btnSubmeterPressionado(ActionEvent event) {
        System.out.println("Botão pressionado");

        String nome = txtNome.getText();
        LocalDate dataNascimento = dtPickerDataNascimento.getValue();

        Cliente c = new Cliente(nome, dataNascimento);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Cliente carregado");
        alert.setContentText(c.toString());
        alert.setHeaderText("Informações do cliente");

        alert.showAndWait();
    }
}
