package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/sample.fxml"));
     /*   Group root = new Group();
        Text txt = new Text("Hiya there!");
        txt.setFont(new Font("Papyrus", 30));
        Label label = new Label("Name: ");
        TextField nameFld = new TextField();
        GridPane grid = new GridPane();
        grid.add(label, 0, 0);
        grid.add(nameFld, 1, 0);
        grid.setHgap(15);
        Button btn = new Button();
        grid.add(btn, 1, 1);
        //grid.setGridLinesVisible(true);
        btn.setText("Why hello there!");
        btn.setOnAction(evt -> System.out.printf("Hello, %s!%n",
                nameFld.getText()));
        txt.setY(50);
        VBox vbox = new VBox();
        vbox.getChildren().addAll(txt, grid);
        root.getChildren().add(vbox); */
        primaryStage.setTitle("Hello");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {

        launch(args);
    }
}
