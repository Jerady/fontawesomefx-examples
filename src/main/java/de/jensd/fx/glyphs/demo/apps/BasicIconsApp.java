/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.jensd.fx.glyphs.demo.apps;

import de.jensd.fx.glyphs.GlyphsStyle;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIcon;
import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIconView;
import de.jensd.fx.glyphs.weathericons.WeatherIcon;
import de.jensd.fx.glyphs.weathericons.WeatherIconView;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Jens Deters
 */
public class BasicIconsApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox root = new VBox();
        root.setSpacing(10.0);
        root.setAlignment(Pos.CENTER);

        FontAwesomeIconView fontAwesomeIconView = new FontAwesomeIconView(FontAwesomeIcon.ANGELLIST);
        fontAwesomeIconView.setSize("4em");
        root.getChildren().add(fontAwesomeIconView);

        MaterialDesignIconView materialDesignIconView = new MaterialDesignIconView(MaterialDesignIcon.THUMB_UP);
        materialDesignIconView.setSize("4em");
        root.getChildren().add(materialDesignIconView);

        FontAwesomeIconView thumbsUpIcon = new FontAwesomeIconView();
        thumbsUpIcon.setStyleClass("thumbs-up-icon");
        root.getChildren().add(thumbsUpIcon);

        FontAwesomeIconView thumbsDownIcon = new FontAwesomeIconView();
        thumbsDownIcon.setStyleClass("thumbs-down-icon");
        root.getChildren().add(thumbsDownIcon);

        WeatherIconView weatherIcon = new WeatherIconView(WeatherIcon.CLOUDY);
        weatherIcon.setStyleClass("bluesky-icon");
        weatherIcon.setSize("4em");
        root.getChildren().add(weatherIcon);

        Scene scene = new Scene(root, 500, 500);
        scene.getStylesheets().addAll(GlyphsStyle.DEFAULT.getStylePath());
        primaryStage.setScene(scene);
        primaryStage.setTitle("FontAwesomeFX Basic Demo");
        primaryStage.show();
    }

    public static void main(String[] args) {
        System.setProperty("prism.lcdtext", "false");
        launch(args);
    }

}
