module com.example.csd_214_mahib_test1 {
    requires javafx.controls;
    requires javafx.fxml;
            
                                requires com.almasb.fxgl.all;
    
    opens com.example.csd_214_mahib_test1 to javafx.fxml;
    exports com.example.csd_214_mahib_test1;
}