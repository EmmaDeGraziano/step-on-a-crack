package edu.sdccd.cisc191.template;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.application.Application;
/** GOAL:
 * every time it clicks, a two-frame animation plays, and a ticker goes up.
 CURRENTLY:
 * blank screen appears, but it runs!
 NEXT:
 * get images to appear, ad load them onto a file for convienece.*/

public class Main extends Application {
    private Stage stageHold;
    private Scene scene;
    private BorderPane root;
    public Main(){
        System.out.print("main access works.");
    }
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage stage) {
        JumpingScene access = new JumpingScene();
        stageHold =stage;
        root = new BorderPane();
        root.setPrefSize(200,200);
        scene = new Scene(root, 100, 200);
        access.screenSetup();
        stageHold.setScene(scene);
        stageHold.show();
    }
    Stage getStageHold(){
        return stageHold;
    }
    BorderPane getMainRoot(){
        return root;
    }
    Scene getScene(){
        return scene;
    }
}


