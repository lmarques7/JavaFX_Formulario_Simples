module br.ufrpe.javafx_project {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens br.ufrpe.javafx_project to javafx.fxml;
    exports br.ufrpe.javafx_project;
}