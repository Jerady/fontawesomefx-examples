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
import de.jensd.fx.glyphs.fontawesome.utils.FontAwesomeIconFactory;
import de.jensd.fx.glyphs.icons525.Icons525;
import de.jensd.fx.glyphs.icons525.utils.Icon525Factory;
import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIcon;
import de.jensd.fx.glyphs.materialdesignicons.utils.MaterialDesignIconFactory;
import de.jensd.fx.glyphs.materialicons.MaterialIcon;
import de.jensd.fx.glyphs.materialicons.utils.MaterialIconFactory;
import de.jensd.fx.glyphs.octicons.OctIcon;
import de.jensd.fx.glyphs.octicons.utils.OctIconFactory;
import de.jensd.fx.glyphs.weathericons.WeatherIcon;
import de.jensd.fx.glyphs.weathericons.utils.WeatherIconFactory;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Jens Deters
 */
public class BasicGlyphsFactoryApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox root = new VBox();
        root.setSpacing(10.0);
        root.setAlignment(Pos.CENTER);

        Text fontAwesomeIcon = 
                FontAwesomeIconFactory.get().createIcon(FontAwesomeIcon.ANGELLIST);
        root.getChildren().add(fontAwesomeIcon);

        Text materialDesignIcon = 
                MaterialDesignIconFactory.get().createIcon(MaterialDesignIcon.CHECK_ALL, "4em");
        root.getChildren().add(materialDesignIcon);

        Text materialIcon = 
                MaterialIconFactory.get().createIcon(MaterialIcon.THUMB_UP, "4em");
        root.getChildren().add(materialIcon);

        Text icons525 = 
                Icon525Factory.get().createIcon(Icons525.ANGELLIST, "4em");
        root.getChildren().add(icons525);

        Text octIcon = 
                OctIconFactory.get().createIcon(OctIcon.OCTOFACE, "4em");
        root.getChildren().add(octIcon);

        Text weatherIcon = 
                WeatherIconFactory.get().createIcon(WeatherIcon.CLOUDY, "4em");
        root.getChildren().add(weatherIcon);

        Scene scene = new Scene(root, 500, 500);
        scene.getStylesheets().addAll("styles/basic.css");
        primaryStage.setScene(scene);
        primaryStage.setTitle("FontAwesomeFX Basic Factories Demo");
        primaryStage.show();
    }

    public static void main(String[] args) {
        System.setProperty("prism.lcdtext", "false");
        launch(args);
    }

}
