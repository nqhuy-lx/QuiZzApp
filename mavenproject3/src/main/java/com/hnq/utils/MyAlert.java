/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hnq.utils;

import javafx.scene.control.Alert;

/**
 *
 * @author admin
 */
public class MyAlert {
    private static MyAlert intances;
    private final Alert alert;
    private MyAlert(){
        alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Quizz App");
        alert.setHeaderText("Quizz App");
    }
    
    public static MyAlert getIntances(){
        if(intances == null)
            intances = new MyAlert();
        return intances;
    }
    public void show(String content){
        alert.setContentText(content);
        alert.showAndWait();
    }
}
