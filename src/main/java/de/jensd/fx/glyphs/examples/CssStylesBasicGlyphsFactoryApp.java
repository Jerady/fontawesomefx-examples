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
import de.jensd.fx.glyphs.weathericons.WeatherIconView;
import de.jensd.fx.glyphs.weathericons.utils.WeatherIconFactory;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Jens Deters
 */
public class CssStylesBasicGlyphsFactoryApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox root = new VBox();
        root.setSpacing(10.0);
        root.setAlignment(Pos.CENTER);

        Label infoLabel = new Label("Hover and click on icons:");
        root.getChildren().add(infoLabel);

        Text thumbsUpIcon = 
                FontAwesomeIconFactory.get().createIcon(FontAwesomeIcon.THUMBS_UP, "4em");
        thumbsUpIcon.getStyleClass().add("thumbs-up-icon");
        root.getChildren().add(thumbsUpIcon);

        Text thumbsDownIcon = FontAwesomeIconFactory.get().createIcon(FontAwesomeIcon.THUMBS_DOWN, "4em");
        thumbsDownIcon.getStyleClass().add("thumbs-down-icon");
        root.getChildren().add(thumbsDownIcon);

        Text blueskyIcon = WeatherIconFactory.get().createIcon(WeatherIcon.CLOUDY, "4em");
        blueskyIcon.getStyleClass().add("bluesky-icon");
        root.getChildren().add(blueskyIcon);

        Scene scene = new Scene(root, 500, 500);
        scene.getStylesheets().addAll("styles/glyphs.css");
        primaryStage.setScene(scene);
        primaryStage.setTitle("FontAwesomeFX Basic Factories Demo");
        primaryStage.show();
    }

    public static void main(String[] args) {
        System.setProperty("prism.lcdtext", "false");
        launch(args);
    }

}
