package com.example.demodinamic;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import static java.lang.Thread.sleep;

public class HelloController {
   @FXML
   VBox boxForLabels;
   @FXML
   HBox hboxForButtons;
   @FXML
    public void onAddLabelClick(){
       boxForLabels.getChildren().add(new Label("надпись"));
   }
   @FXML
   public void onAddButtonClick(){
      Button button = new Button("!");
      hboxForButtons.getChildren().add(button);
      button.setOnAction(event -> onNewButtonClick());
   }

   public void onNewButtonClick(){
      System.out.println("нажата кнопка с !");
   }

   public void initialize(){
      System.out.println("автоматически запустился метод initialize");
      Button button = new Button("*");
      hboxForButtons.getChildren().add(button);
      button.setOnAction(a->{
         System.out.println("***");
      });
//      try{
//         sleep(7000);
//      }
//      catch (Exception e){
//         e.printStackTrace();
//      }
   }
}