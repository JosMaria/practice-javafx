package com.genesiscode.practicejavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Window extends Application {

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Button("Hello!"), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}