package com.dongpl;

import com.dongpl.config.FXMain;
import com.dongpl.views.BaseSceneView;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OpenServApplication {

    public static void main(String[] args) {
//        SpringApplication.run(OpenServApplication.class, args);
        AbstractJavaFxApplicationSupport.launch(OpenServApplication.class, FXMain.class, BaseSceneView.class, args);
    }

}
