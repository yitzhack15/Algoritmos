
package domain;

import GUI.QuickGUI;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Yitzhack
 */
public class main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        
        QuickGUI qg = new QuickGUI();
        
        Scene scene = new Scene(qg.gp(), 700, 500);
        primaryStage.setResizable(true);
        primaryStage.setTitle("Tarea");
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
