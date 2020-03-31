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

public class Left extends HBox {

    Area areaTodo, areaDoing, areaDone;

    public Left() {
        initializeControls();
        layoutControls();
    }

    private void initializeControls() {
        areaTodo = new Area();
        areaDoing = new Area();
        areaDone = new Area();

    }

    private void layoutControls() {
        getChildren().add(areaTodo.createRegion("12d456"));
        getChildren().add(areaDoing.createRegion("32deee"));
        getChildren().add(areaDone.createRegion("22d111"));
        setSpacing(10);

    }
}
