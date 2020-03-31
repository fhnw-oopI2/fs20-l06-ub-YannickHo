package ch.fhnw.oop2.tasky.part4.ui;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class Right extends VBox {

    private TextField textFieldID, textFieldTitle;
    private Label labelID, labelTitle, labelDesc, labelDue, labelState;
    private TextArea textAreaDesc;
    private DatePicker datePicker;
    private ComboBox comboBox;
    private Button buttonSave, buttonDelete;

    public Right() {
        initializeControls();
        layoutControls();
    }

    private void initializeControls() {
        labelID = new Label("Title:");
        textFieldID = new TextField();
        
        labelTitle = new Label("Title: ");
        textFieldTitle = new TextField();

        labelDesc = new Label("Description: ");
        textAreaDesc = new TextArea();

        labelDue = new Label("Date: ");
        datePicker = new DatePicker();

        labelState = new Label("State: ");
        comboBox = new ComboBox<>();

        buttonSave = new Button("Save");
        buttonDelete = new Button("Delete");
        

    }

    private void layoutControls() {
        getChildren().add(labelID);
        getChildren().add(textFieldID);
        getChildren().add(labelTitle);
        getChildren().add(textFieldTitle);
        getChildren().add(labelDesc);
        getChildren().add(textAreaDesc);
        getChildren().add(labelDue);
        getChildren().add(datePicker);
        getChildren().add(labelState);
        getChildren().add(comboBox);
        getChildren().add(buttonSave);
        getChildren().add(buttonDelete);
        
        
        setSpacing(10);

    }
}