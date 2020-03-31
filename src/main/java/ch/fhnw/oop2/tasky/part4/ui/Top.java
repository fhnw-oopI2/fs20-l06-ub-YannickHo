package ch.fhnw.oop2.tasky.part4.ui;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class Top extends HBox {

    Area areaTodo, areaDoing, areaDone;
    Label labelTodo, labelDoing, labelDone;

    public Top() {
        initializeControls();
        layoutControls();
    }

    private void initializeControls() {
        labelTodo = new Label("Todo");
        labelDoing = new Label("Doing");
        labelDone = new Label("Done");

    }

    private void layoutControls() {
        getChildren().add(labelTodo);
        getChildren().add(labelDoing);
        getChildren().add(labelDone);
        setMargin(labelTodo, new Insets(7, 0, 0, 20));
        setMargin(labelDoing, new Insets(7, 0, 0, 40));
        setMargin(labelDone, new Insets(7, 0, 0, 40));

    }
}
