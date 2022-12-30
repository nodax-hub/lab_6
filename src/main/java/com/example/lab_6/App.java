package com.example.lab_6;

import com.example.lab_6.controllers.FunctionParametersController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.example.lab_6.ui.TabulatedFunctionDoc;

import java.io.IOException;

public class App extends Application {

    public static final TabulatedFunctionDoc tabFDoc = new TabulatedFunctionDoc(
            FunctionParametersController.DEFAULT_LEFT_BORDER,
            FunctionParametersController.DEFAULT_RIGHT_BORDER,
            FunctionParametersController.DEFAULT_SIZE);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(App.class.getResource("FXMLMainForm.fxml"));
        Parent root = loader.load();
        mainController controller = loader.getController();
        controller.setStage(stage);

        Scene scene = new Scene(root);
        stage.setTitle("Табулированные функции");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }
}
