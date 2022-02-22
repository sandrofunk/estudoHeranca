module com.example.estudoheranca {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.estudoheranca to javafx.fxml;
    exports com.example.estudoheranca;
}