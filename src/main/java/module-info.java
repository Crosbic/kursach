module com.crosbic.kursach {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.crosbic.kursach to javafx.fxml;
    exports com.crosbic.kursach;
}