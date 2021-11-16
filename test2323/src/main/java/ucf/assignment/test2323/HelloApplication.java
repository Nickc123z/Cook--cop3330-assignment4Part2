/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Nick Cook
 */
package ucf.assignment.test2323;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.io.IOException;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),320, 240);
        BorderPane root = new BorderPane();
        stage.setTitle("Admin Panel");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }



    // application can hold up to 100 unique users.
    // to-do's should have both titles, dates and descriptions.


    // Screen will pop up and show multiple buttons with multiple actions


    public static class addremovebuttons {
        // if you'd like to add a to-do to the list, you'd click the "add " button
        // and a new screen will pop up for you to add a new to-do list.

        // if you'd like to remove a to-do on the list, you'd click the "remove" button
        // and a screen will pop up for you to remove a current to-do on the list.

        // if you'd like to edit a title on a to-do on the list, you'd click the "remove" button
        // and a screen will pop up for you to remove a current to-do on the list.
    }

    public static class  moredifficult{
        //if you'd like to add a new item to an existing to-do list, you'd click the
        //"edit" button and a screen will pop up for you to edit a current to-do
        // on the list.

        //if you'd like to remove an item on an existing to-do list, you'd click the
        //"edit" button and a screen will pop up for you to remove a current to-do
        // on the list.

        //if you'd like to edit a description of a to-do on the to-do list, you'd click
        // the "edit" button and a screen will pop up for you to edit a current to-do
        // on the list.
    }
    //if you'd like to edit a due date tof a to-do on the to-do list, you'd click
    // the "edit" button and a screen will pop up for you to edit the date of a
    // current to-do on the list.
    public class buttons3 {

        //if you'd like to mark a to-do on the list as complete, you would check the
        // "completed" button

        //if you'd like to display all the to-do's on the list, you would check the
        // "list all" button, and it would list all the to-do's not completed/or marked

        //if you'd like to display only the incomplete  to-do's on the list, you would
        // check the "list all incomplete" button, and it would list all the to-do's
        // not completed/or marked
    }

    public class buttons4 {

        //if you'd like to display only the complete  to-do's on the list, you would
        // check the "list all complete" button, and it would list all the to-do's
        // completed

        // if you'd like to save all the items in a to-do to an external storage, youd
        // click the "save button"
        // will have to save on the harddrive

        // if you'd like to save all the items on multiple to-do list to an external storage, youd
        // click the "save all button"

        // if you'd like to load an item on a to-do list, you'd
        // click the "open X" button

        // if you'd like to load multiple item on an to-do list, youd
        // click the "open All" button
    }



}