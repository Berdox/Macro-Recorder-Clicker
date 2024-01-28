module org.berdox.macro_recorder_and_clicker {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens org.berdox.Program to javafx.fxml;
    exports org.berdox.Program;
}