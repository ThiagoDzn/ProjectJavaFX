package projetojavafx1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {
   
    

    public static void main(String[] args) {
     launch(args);
}

	@Override
	public void start(Stage primaryStage) throws Exception {
     primaryStage.setTitle("Esse e o meu palco");
     Button button = new Button();
     button.setText("MEU BOTAO");
     StackPane stackPane = new StackPane();
     stackPane.getChildren().add(button);
     primaryStage.setScene(new Scene(stackPane,800,600));
     primaryStage.show();
	}
}
