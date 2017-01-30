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

import de.jensd.fx.glyphs.GlyphIcon;
import de.jensd.fx.glyphs.control.GlyphCheckBox;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Jens Deters
 */
public class ControlsApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox root = new VBox();
        root.setSpacing(10.0);
        root.setAlignment(Pos.CENTER);

        GlyphIcon<FontAwesomeIcon> selectedIcon1 = new FontAwesomeIconView(FontAwesomeIcon.TOGGLE_ON);
        selectedIcon1.setSize("1.5em");
        GlyphIcon<FontAwesomeIcon> notSelectedIcon1 = new FontAwesomeIconView(FontAwesomeIcon.TOGGLE_OFF);
        notSelectedIcon1.setSize("1.5em");

        GlyphIcon<FontAwesomeIcon> selectedIcon2 = new FontAwesomeIconView(FontAwesomeIcon.TOGGLE_ON);
        selectedIcon2.setSize("1.5em");
        GlyphIcon<FontAwesomeIcon> notSelectedIcon2 = new FontAwesomeIconView(FontAwesomeIcon.TOGGLE_OFF);
        notSelectedIcon2.setSize("1.5em");

        GlyphIcon<FontAwesomeIcon> selectedIcon3 = new FontAwesomeIconView(FontAwesomeIcon.TOGGLE_ON);
        selectedIcon3.setSize("1.5em");
        GlyphIcon<FontAwesomeIcon> notSelectedIcon3 = new FontAwesomeIconView(FontAwesomeIcon.TOGGLE_OFF);
        notSelectedIcon3.setSize("1.5em");

        GlyphIcon<FontAwesomeIcon> selectedIcon4 = new FontAwesomeIconView(FontAwesomeIcon.TOGGLE_ON);
        selectedIcon4.setSize("1.5em");
        GlyphIcon<FontAwesomeIcon> notSelectedIcon4 = new FontAwesomeIconView(FontAwesomeIcon.TOGGLE_OFF);
        notSelectedIcon4.setSize("1.5em");

        GlyphCheckBox checkBox1 = new GlyphCheckBox(notSelectedIcon1, selectedIcon1, "checkBox1");
        GlyphCheckBox checkBox2 = new GlyphCheckBox(notSelectedIcon2, selectedIcon2, "checkBox2");
        GlyphCheckBox checkBox3 = new GlyphCheckBox(notSelectedIcon3, selectedIcon3, "checkBox3");
        GlyphCheckBox checkBox4 = new GlyphCheckBox(notSelectedIcon4, selectedIcon4, "checkBox4");

        root.getChildren().addAll(checkBox1, checkBox2, checkBox3, checkBox4);

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
