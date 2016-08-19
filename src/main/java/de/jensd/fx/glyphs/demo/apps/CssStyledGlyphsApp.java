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
package de.jensd.fx.glyphs.demo.apps;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import de.jensd.fx.glyphs.weathericons.WeatherIconView;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Jens Deters
 */
public class CssStyledGlyphsApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox root = new VBox();
        root.setSpacing(10.0);
        root.setAlignment(Pos.CENTER);
        
        Label infoLabel = new Label("Hover and click on icons:");
        root.getChildren().add(infoLabel);
        
        FontAwesomeIconView thumbsUpIcon = new FontAwesomeIconView();
        thumbsUpIcon.setStyleClass("thumbs-up-icon");
        root.getChildren().add(thumbsUpIcon);

        FontAwesomeIconView thumbsDownIcon = new FontAwesomeIconView();
        thumbsDownIcon.setStyleClass("thumbs-down-icon");
        root.getChildren().add(thumbsDownIcon);

        WeatherIconView blueskyIcon = new WeatherIconView();
        blueskyIcon.setStyleClass("bluesky-icon");
        root.getChildren().add(blueskyIcon);

        Scene scene = new Scene(root, 500, 500);
        scene.getStylesheets().addAll("styles/glyphs.css");
        primaryStage.setScene(scene);
        primaryStage.setTitle("FontAwesomeFX Basic Demo");
        primaryStage.show();
    }

    public static void main(String[] args) {
        System.setProperty("prism.lcdtext", "false");
        launch(args);
    }

}
