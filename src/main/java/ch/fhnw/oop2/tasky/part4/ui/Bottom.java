package ch.fhnw.oop2.tasky.part4.ui;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public class Bottom extends HBox {
    private Button buttonNew, buttonRefresh;

    public Bottom() {
        initializeControls();
        layoutControls();
    }

    private void initializeControls() {
        buttonNew = new Button("New");
        buttonRefresh = new Button("Refresh");
    }

    private void layoutControls() {
        getChildren().addAll(buttonNew, buttonRefresh);
        buttonNew.setFont(new Font(13));
        buttonRefresh.setFont(new Font(13));
        setSpacing(10);
        setMargin(buttonNew, new Insets(0, 0, 10, 20));
    }
}
