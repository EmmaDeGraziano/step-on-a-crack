package edu.sdccd.cisc191.template;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.util.Scanner;

/** THIS IS CONTROL SEGMENT, INTERFACE IS JUMPINGSCENE*/
public class JumpingControl{

    private int counter;
    private Label ticker;


    public JumpingControl(){
        counter = 0;
        ticker = new Label("Clicks:" + counter);
        ticker.setPrefSize(40, 20);
       HBox hbox = new HBox();

    }
    Label getTicker(){
        return ticker;
    }
    public void increaseTicker(){
        counter = counter + 1;
    }

    //for transporting images: do later
    /**private String loadImages() throws IOException, FileNotFoundException{//need to fix exceptions.
        File file = new File("Saver.csv");
        FileReader reader = new FileReader(file);
        if (!file.exists()) {

        }
        else if(reader.read()==-1){//or, if the file is empty.
            FileWriter writer = new FileWriter(file);
            writer.write("file://jump downframe.png\n");
            writer.write("file://jump upframe.png");
            writer.close();
        }//ad then read from the file. there will only ever be two lines.
            Scanner scanner = new Scanner(file);
            String temp1= scanner.nextLine();
            String temp2 = scanner.nextLine();
            return temp1 + " SPACE " temp2;//will delimeter it back in SCENE
        }*/
}
