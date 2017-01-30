/**
 * Copyright (c) 2016 Jens Deters http://www.jensd.de
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 *
 */
package de.jensd.fx.glyphs.examples;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import de.jensd.fx.glyphs.icons525.Icons525;
import de.jensd.fx.glyphs.icons525.Icons525View;
import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIcon;
import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIconView;
import de.jensd.fx.glyphs.materialicons.MaterialIcon;
import de.jensd.fx.glyphs.materialicons.MaterialIconView;
import de.jensd.fx.glyphs.octicons.OctIcon;
import de.jensd.fx.glyphs.octicons.OctIconView;
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
public class BasicGlyphsApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox root = new VBox();
        root.setSpacing(10.0);
        root.setAlignment(Pos.CENTER);

        FontAwesomeIconView fontAwesomeIconView = 
                new FontAwesomeIconView(FontAwesomeIcon.ANGELLIST);
        root.getChildren().add(fontAwesomeIconView);

        MaterialDesignIconView materialDesignIconView = 
                new MaterialDesignIconView(MaterialDesignIcon.CHECK_ALL);
        root.getChildren().add(materialDesignIconView);

        MaterialIconView materialIconView = 
                new MaterialIconView(MaterialIcon.THUMB_UP);
        materialIconView.setSize("4em");
        root.getChildren().add(materialIconView);

        Icons525View icons525View = 
                new Icons525View(Icons525.ANGELLIST);
        icons525View.setSize("4em");
        root.getChildren().add(icons525View);

        OctIconView octIconView = 
                new OctIconView(OctIcon.OCTOFACE);
        octIconView.setSize("4em");
        root.getChildren().add(octIconView);

        WeatherIconView weatherIcon = 
                new WeatherIconView(WeatherIcon.CLOUDY);
        weatherIcon.setSize("4em");
        root.getChildren().add(weatherIcon);

        Scene scene = new Scene(root, 500, 500);
        scene.getStylesheets().addAll("styles/basic.css");
        primaryStage.setScene(scene);
        primaryStage.setTitle("FontAwesomeFX Basic Demo");
        primaryStage.show();
    }

    public static void main(String[] args) {
        System.setProperty("prism.lcdtext", "false");
        launch(args);
    }

}
