package ch.fhnw.oop2.tasky.part4.ui;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class ApplicationUI extends BorderPane {

    private Parent bottom;
    private Parent right;
    private Parent left;
    private Parent top;

    public ApplicationUI() {
        initializeControls();
        layoutControls();
    }

    private void initializeControls() {
        bottom = new Bottom();
        right = new Right();
        left = new Left();
        top = new Top();
    }

    private void layoutControls() {
        setRight(right);
        setBottom(bottom);
        setLeft(left);
        setMargin(left, new Insets(20));
        setTop(top);
    }

}
