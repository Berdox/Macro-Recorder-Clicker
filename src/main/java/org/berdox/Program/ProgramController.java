package org.berdox.Program;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import org.berdox.Clicker.Clicker;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

import static java.awt.event.InputEvent.*;

public class ProgramController implements Initializable {
    @FXML
    public TextField numberOfClicks;
    @FXML
    public TextField secondsInput;
    @FXML
    private ComboBox<String> mouseButtons;

    private int mouseButton;

    private int x;
    private int y;
    private final Clicker click;

    public ProgramController() {
        click = new Clicker();
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.numberOfClicks.setText("10");
        this.secondsInput.setText("1");
        //this.mouseButtons.setValue("Left");
        this.x = -1;
        this.y = -1;
        mouseButtons.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> {
                    if(newValue.equals("Right")) {
                        this.mouseButton = BUTTON3_DOWN_MASK;
                    } else if(newValue.equals("Middle")) {
                        this.mouseButton = BUTTON2_DOWN_MASK;
                    } else {
                        this.mouseButton = BUTTON1_DOWN_MASK;
                    }
                }
        );
    }

    @FXML
    protected void onStartClick() throws AWTException {
        int numClicks = Integer.parseInt(numberOfClicks.getText());
        int seconds = Integer.parseInt(secondsInput.getText());
        click.ClickerStart(numClicks, seconds, mouseButton, x, y);
    }

}