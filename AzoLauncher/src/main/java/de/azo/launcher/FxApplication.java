package de.azo.launcher;

import javafx.application.Application;
import javafx.stage.Stage;

public class FxApplication extends Application {
    @Override
    public void start(Stage stage)  {
             new AzoLauncher().init(stage);
    }
}
