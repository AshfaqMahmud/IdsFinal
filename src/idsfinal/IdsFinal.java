/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idsfinal;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;

/**
 *
 * @author ashms
 */
public class IdsFinal extends Application {

    public static void main(String[] args) {
        launch(args);
      

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        welcomescreen lg = new welcomescreen();
        lg.setVisible(true);
    }

    }
