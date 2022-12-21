package net.agilelogik.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    protected void onSaveStateClick() {

        // using memeto pattern , create mementos of the TextField Data here.
    }
    @FXML
    protected void onUndoClick() {
        //perform Undo Action here

    }
    @FXML
    protected void onRedoClick() {

        //perform Redo Action here
    }
}