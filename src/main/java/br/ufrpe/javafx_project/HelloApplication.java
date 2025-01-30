package br.ufrpe.javafx_project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public void startPuro(Stage stage) throws IOException {
        Label meuLabel = new Label("Minha mensagem legal");
        meuLabel.setLayoutX(10);
        meuLabel.setLayoutY(200);

        Font mFonte = Font.font("Verdana", FontWeight.BOLD, 70);
        meuLabel.setFont(mFonte);

        Pane pane = new Pane();
        pane.setPrefSize(400, 600);

        pane.getChildren().add(meuLabel);

        Scene scene = new Scene(pane);

        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("formulario.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 300);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}