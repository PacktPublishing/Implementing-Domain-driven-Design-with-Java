package com.premonition.lc.issuance.ui.events;

import javafx.stage.Stage;
import org.springframework.context.ApplicationEvent;

public class LaunchLCDetailsViewEvent extends ApplicationEvent {
    private final String name;

    public LaunchLCDetailsViewEvent(Stage stage, String name) {
        super(stage);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Stage getStage() {
        return (Stage) getSource();
    }
}
