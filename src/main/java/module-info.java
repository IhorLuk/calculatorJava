module javafx.calculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens javafx.calculator to javafx.fxml;
    exports javafx.calculator;
}