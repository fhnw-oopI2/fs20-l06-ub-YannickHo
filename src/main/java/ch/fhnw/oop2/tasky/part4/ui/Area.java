package ch.fhnw.oop2.tasky.part4.ui;
import javafx.geometry.Insets;
import javafx.scene.layout.Region;

/**
 * Diese Klasse erzeugt eine Fl�che in Form einer Region f�r 
 * alle Beispiele Layouts.
 */
public final class Area {

    public static Region createRegion(String color) {
        final Region region = new Region();
        region.setPadding(new Insets(30));
        region.setStyle("-fx-background-color: #" +color + ";");
        return region;
    }
}