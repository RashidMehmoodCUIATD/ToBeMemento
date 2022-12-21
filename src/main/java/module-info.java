module net.agilelogik.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens net.agilelogik.demo to javafx.fxml;
    exports net.agilelogik.demo;
}