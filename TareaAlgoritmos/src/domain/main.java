
package domain;

import GUI.QuickGUI;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class main extends Application {
    
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        
        
        QuickGUI qg = new QuickGUI();
        
        Scene scene = new Scene(qg.gp(), 800, 600);
        FileInputStream input = new FileInputStream("C:\\Users\\Yitzhack\\Documents\\UCR\\Algoritmos\\TareaAlgoritmos\\src\\images\\icon.png"); 
        Image icon = new Image(input);
        primaryStage.getIcons().add(icon);
        primaryStage.setResizable(false);
        primaryStage.setTitle("R E G I S T R O   D E   E M P L E A D O S");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
