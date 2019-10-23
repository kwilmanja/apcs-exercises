import javafx.application.*;
import javafx.stage.*;
import javafx.scene.Scene; //shape (includes circle)  + paint + layout + Scene
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.scene.layout.*;


 
public class Graphics extends Application
{
  public void start( Stage primaryStage )
  {
  	Circle circle = new Circle (100.0, 90.1, 50.5);
  	circle.setFill(Color.GREEN);
  	circle.setStrike(Color.BLACK);

  	Pane pane = new Pane(circle);
  	Scene scen = new Scene(pane, 300.0, 200.0, Color.LIGHTYELLOW);

  	primaryStage.setTitle("Circle");
  	primaryStage.setScene(scene);


    primaryStage.show();
  }
}