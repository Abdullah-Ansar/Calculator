package com.example.selfjavafxapp;

import javafx.application.Application;
//import javafx.application.Platform;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
//import javafx.scene.control.*;
//import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//import java.util.Optional;

public class Main extends Application {
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new
                FXMLLoader(getClass().getResource("applayout.fxml"));
        VBox rootNode = loader.load();

//        MenuBar menuBar = creatMenu();
//        rootNode.getChildren().add(0,menuBar);
        Scene scene = new Scene(rootNode) ;

        primaryStage.setScene(scene);
        primaryStage.setTitle("My Java App");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
//    private MenuBar creatMenu(){
//        Menu fileMenu = new Menu("File");
//        MenuItem newMenuItem = new MenuItem("New");
//        newMenuItem.setOnAction(actionEvent -> System.out.println("New Menu Item Clicked"));
//        SeparatorMenuItem separatorMenuItem = new SeparatorMenuItem();
//        MenuItem secMenuItem = new MenuItem("Quit");
//        secMenuItem.setOnAction(actionEvent -> {
//            Platform.exit();
//            System.exit(0);
//        });
//        fileMenu.getItems().addAll(newMenuItem,separatorMenuItem,secMenuItem);
//        // Help Menu
//        Menu helpMenu = new Menu("Help");
//        MenuItem aboutApp = new MenuItem("About");
//        aboutApp.setOnAction(actionEvent -> aboutApp());
//        helpMenu.getItems().addAll(aboutApp);
//        // Menu Bar
//        MenuBar menuBar = new MenuBar();
//        menuBar.getMenus().addAll(fileMenu,helpMenu);
//        return menuBar;
//    }

//    private void aboutApp() {
//        Alert alert = new Alert(Alert.AlertType.INFORMATION);
//        alert.setTitle("First JavaFX App");
//        alert.setHeaderText("JavaFx App");
//        alert.setContentText("Hello, This is my first JavaFX App that i have built from scratch." +
//                "Please Rate the App in Rate Section");
//        //Button
//        ButtonType yesBtn = new ButtonType("Yes");
//        ButtonType noBtn = new ButtonType("No");
//        alert.getButtonTypes().setAll(yesBtn,noBtn);
//
//        Optional<ButtonType> clickedBtn = alert.showAndWait();
//        if(clickedBtn.isPresent() && clickedBtn.get() == yesBtn){
//            System.out.println("Yes Btn is Clicked");
//        }else {
//            System.out.println("No Btn is clicked");
//        }
//    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }
}
