# FontAwesomeFX Demo Applications

## Basic Usage

```
FontAwesomeIconView fontAwesomeIconView = new FontAwesomeIconView(FontAwesomeIcon.ANGELLIST);
fontAwesomeIconView.setSize("4em");
```

```
MaterialDesignIconView materialDesignIconView = new MaterialDesignIconView(MaterialDesignIcon.THUMB_UP);
materialDesignIconView.setSize("4em");
```

```
FontAwesomeIconView thumbsUpIcon = new FontAwesomeIconView();
thumbsUpIcon.setStyleClass("thumbs-up-icon");
```

```
FontAwesomeIconView thumbsDownIcon = new FontAwesomeIconView();
thumbsDownIcon.setStyleClass("thumbs-down-icon");
```

```
WeatherIconView weatherIcon = new WeatherIconView(WeatherIcon.CLOUDY);
weatherIcon.setStyleClass("bluesky-icon");
weatherIcon.setSize("4em");
```
### run demo appp

`./gradlew -PmainClass=de.jensd.fx.glyphs.demo.apps.BasicGlyphsApp execute`


## Css Styled Glyphs

```
FontAwesomeIconView thumbsUpIcon = new FontAwesomeIconView();
thumbsUpIcon.setStyleClass("thumbs-up-icon");
```

```
FontAwesomeIconView thumbsDownIcon = new FontAwesomeIconView();
thumbsDownIcon.setStyleClass("thumbs-down-icon");
```

```
WeatherIconView weatherIcon = new WeatherIconView(WeatherIcon.CLOUDY);
weatherIcon.setStyleClass("bluesky-icon");
weatherIcon.setSize("4em");
```

styles/glyphs.css

```
.root{
    -icons-color: black;
}

.glyph-icon{
    -fx-text-fill: -icons-color;
    -fx-fill: -icons-color;
    -glyph-size: 48px;
}

.glyph-icon:hover{
    -fx-effect:  dropshadow(three-pass-box, rgba(0,0,0,0.2), 4, 0, 0, 0);
}

.bluesky-icon{
    -icons-color: blue;
    -fx-fill: linear-gradient(-icons-color 0%, derive(-icons-color, 100%) 30%, derive(blueviolet, 30%) 85%);
}

.bluesky-icon:hover{
    -fx-effect:  dropshadow(three-pass-box, rgba(156,115,241,0.6), 10, 0, 0, 0);
}

.bluesky-icon:pressed{
    -fx-effect:  dropshadow(three-pass-box, rgba(0,0,0,1.0), 10, 0, 0, 0);
}

.thumbs-up-icon{
    -glyph-name: "THUMBS_UP";
    -icons-color: yellowgreen;
}

.thumbs-up-icon:hover{
    -fx-effect:  dropshadow(three-pass-box, rgba(154,205,55,0.7), 10, 0, 0, 0);
}

.thumbs-up-icon:pressed{
    -fx-effect:  dropshadow(three-pass-box, rgba(0,0,0,1.0), 10, 0, 0, 0);
}

.thumbs-down-icon{
    -glyph-name: "THUMBS_DOWN";
    -icons-color: red;
}

.thumbs-down-icon:hover{
    -fx-effect:  dropshadow(three-pass-box, rgba(255,0,0,0.7), 10, 0, 0, 0);
}

.thumbs-down-icon:pressed{
    -fx-effect:  dropshadow(three-pass-box, rgba(0,0,0,1.0), 10, 0, 0, 0);
}
```


`./gradlew -PmainClass=de.jensd.fx.glyphs.demo.apps.CssStyledGlyphsApp execute`


