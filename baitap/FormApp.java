import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FormApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Form Đang ky");

        // Tạo layout
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setHgap(10);
        grid.setVgap(10);

        // Label và Input
        Label nameLabel = new Label("Ho va ten:");
        TextField nameInput = new TextField();
        Label emailLabel = new Label("Email:");
        TextField emailInput = new TextField();

        Button saveButton = new Button("Lưu");
        saveButton.setOnAction(e -> Database.saveData(nameInput.getText(), emailInput.getText()));

        // Thêm vào layout
        grid.add(nameLabel, 0, 0);
        grid.add(nameInput, 1, 0);
        grid.add(emailLabel, 0, 1);
        grid.add(emailInput, 1, 1);
        grid.add(saveButton, 1, 2);

        // Cấu hình Scene
        Scene scene = new Scene(grid, 400, 200);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
