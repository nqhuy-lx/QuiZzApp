/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hnq.utils;

import com.hnq.mavenproject3.App;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author admin
 */
public class MyStage {
    private static MyStage intances;
    private final Stage stage;
    private static Scene scene;

    private MyStage() {
        stage =  new Stage();
        stage.setTitle("Quizz App");
    }
    
    public static MyStage getIntances(){
        if(intances == null)
            intances =  new MyStage();
        return intances;
    }
    
    public void showStage(String fxml) throws IOException{
        if(!stage.isShowing()){
            if(scene == null){
                scene = new Scene(new FXMLLoader(App.class.getResource(fxml)).load());
            } else{
                scene.setRoot(new FXMLLoader(App.class.getResource(fxml)).load());
            }
            stage.setScene(scene);
            stage.show();
        }
    }
}
