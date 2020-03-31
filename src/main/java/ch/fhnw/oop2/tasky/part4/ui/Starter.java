package ch.fhnw.oop2.tasky.part4.ui;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Starter extends Application {
    

    @Override
    public void start(Stage primaryStage) {
        Parent rootPanel = new ApplicationUI();
        Scene myScene = new Scene(rootPanel);
        primaryStage.setScene(myScene);
        primaryStage.setTitle("Tasky App");
        primaryStage.setWidth(1000);
        primaryStage.setHeight(500);
        primaryStage.show();
    }
    
    
    
    public static void main(String[] args) {
        Application.launch();
    }

}
