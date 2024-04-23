package edu.sdccd.cisc191.template;

import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import javax.swing.*;
/** FOR THINGS LIKE THE CLICKING FEATURE...GO TO JUMPING CONTROL. THIS IS THE grpahics.*/
public class JumpingScene{
    private Stage stageHolder;
    private final JumpingControl ACCESS = new JumpingControl();
    private Scene cracks;
    private BorderPane root;
    private ImageView downFrame;
    private ImageView upFrame;
    private Button downButton;
    private Button upButton;
    public JumpingScene(){//button is good.
        Main mainAccess = new Main();
        stageHolder = mainAccess.getStageHold();
        root = mainAccess.getMainRoot();
        cracks = mainAccess.getScene();
        //now all the scenes and stage and roots are the same. no excuse from that. but theyre empty.

       /** String temp = ACCESS.loadImages();(this is for later...)*/
       Image temp = new Image("jump downframe.png");
       //aparently these arent real urls. debugger doesnt like.
        downFrame = new ImageView(temp);
         temp = new Image("jump upframe.png");
        upFrame = new ImageView(temp);
        downButton = new Button("tester");
        downButton.setGraphic(downFrame);
        downButton.setPrefSize(100,100);
        upButton = new Button("tester");
        upButton.setPrefSize(100, 100);
        System.out.print("jumper constructor got done.");

    }
    public void screenSetup(){
        Label ticker = ACCESS.getTicker();
        root.getChildren().addAll(downButton, upButton, ticker);
        root.setCenter(downButton);
        root.setCenter(upButton);
        root.setBottom(ticker);
       upButton.isDisabled();
        downButton.setDisable(false);
        //when down is clicked, it'll swap screens for a sec.
        downButton.setOnAction(event -> {
            downButton.isDisabled();
            upButton.setDisable(false);
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {//timer handler.
                    System.out.print("your timer's malfunctioning.");
            }
            ACCESS.increaseTicker();
            downButton.setDisable(false);
            upButton.isDisabled();
        });
        System.out.println("Jumper setup got done");
        //and that should set it up.

    }

    BorderPane getRoot(){
        return root;
    }
}