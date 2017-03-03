/**
 * Copyright (c) 2013-2015 Jens Deters http://www.jensd.de
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

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;

/**
 *
 * @author Jens Deters
 */
public class GlyphsFXMLDemoPane extends VBox {

    public GlyphsFXMLDemoPane() {
        init();
    }

    private void init() {
        try {
            ResourceBundle resourceBundle = ResourceBundle.getBundle("i18n/messages");
            URL fxmlURL = getClass().getResource("/fxml/glyphs_fxml_demo.fxml");
            FXMLLoader fxmlLoader = new FXMLLoader(fxmlURL, resourceBundle);
            fxmlLoader.setRoot(this);
            fxmlLoader.setController(this);
            fxmlLoader.load();
        } catch (IOException ex) {
            Logger.getLogger(GlyphsFXMLDemoPane.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void initialize() {
    }
}
