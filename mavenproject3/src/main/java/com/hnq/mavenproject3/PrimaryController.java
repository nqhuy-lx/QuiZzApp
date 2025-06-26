package com.hnq.mavenproject3;

import com.hnq.utils.MyAlert;
import com.hnq.utils.MyStage;
import java.io.IOException;
import javafx.event.ActionEvent;


public class PrimaryController {
    public void handleQuestionManage(ActionEvent event) throws IOException{
        MyStage.getIntances().showStage("question.fxml");
    }
    public void handlePractice(ActionEvent event){
        MyAlert.getIntances().show("Coming soon...");
    }
    public void handleExam(ActionEvent event){
        MyAlert.getIntances().show("Coming soon...");
    }
    public void handleSignUp(ActionEvent event){
        MyAlert.getIntances().show("Soon man...");
    }
    public void handleSignIn(ActionEvent event){
        MyAlert.getIntances().show("Soon bro...");
    }
}
