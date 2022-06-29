module net.grasscode {
    requires javafx.controls;
    requires javafx.fxml;

    opens net.grasscode to javafx.fxml;
    exports net.grasscode;
}
