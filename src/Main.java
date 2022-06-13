import gui.Pane;
import connection.SQLConnection;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Main extends Application{

	public static void main(String[] args){
		// TODO Auto-generated method stub
		launch();
		SQLConnection.getConnection();
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = new Pane();
		Scene scene = new Scene(pane);		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
