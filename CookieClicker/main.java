package com.company.CookieClicker;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class main extends Application {
    //game variables
    public long money = 0L;

    //owned shop utilities
    public int Grandmother = 0;
    public int Bakery = 0;
    public int Sweatshop = 0;
    public int Factory = 0;
    public int Cookie_Corporation = 0;
    public int Cookie_Materialization_Machine = 0;
    public int Particle_Accelerator = 0;
    public int Cookie_Quantum_Entangler = 0;
    public int Dimensional_Materializing_Machine = 0;
    public int Time_Manipulator = 0;
    public int Multiversial_Cookie_Attraction_Vortex = 0;
    public int Cookie_Materializing_White_Hole = 0;

    //runtime label updater
    public Label moneyCounter = new Label("Money: " + money);

    //runtime game utilities counter
    public Label GrandmotherC = new Label(Integer.toString(Grandmother));
    public Label BakeryC = new Label(Integer.toString(Bakery));
    public Label SweatshopC = new Label(Integer.toString(Sweatshop));
    public Label FactoryC = new Label(Integer.toString(Factory));
    public Label Cookie_CorporationC = new Label(Integer.toString(Cookie_Corporation));
    public Label Cookie_Materialization_MachineC = new Label(Integer.toString(Cookie_Materialization_Machine));
    public Label Particle_AcceleratorC = new Label(Integer.toString(Particle_Accelerator));
    public Label Cookie_Quantum_EntanglerC = new Label(Integer.toString(Cookie_Quantum_Entangler));
    public Label Dimensional_Materializing_MachineC = new Label(Integer.toString(Dimensional_Materializing_Machine));
    public Label Time_ManipulatorC = new Label(Integer.toString(Time_Manipulator));
    public Label Multiversial_Cookie_Attraction_VortexC = new Label(Integer.toString(Multiversial_Cookie_Attraction_Vortex));
    public Label Cookie_Materializing_White_HoleC = new Label(Integer.toString(Cookie_Materializing_White_Hole));


    @Override
    public void start(Stage stage) throws Exception {
        //top g
        Group g = new Group();

        //image of cookie
        Image img = new Image("com/company/CookieClicker/assets/cookie_PNG13656.png");
        ImageView view = new ImageView(img);
        view.setFitHeight(300);
        view.setPreserveRatio(true);

        //cookie button creation
        Button b1 = new Button();
        b1.setGraphic(view);

        //cookie button settings
        b1.setLayoutX(300);
        b1.setLayoutY(100);
        b1.setPrefSize(400, 300);

        //Buyable items in store
        Button button1 = new Button("Grandmother");
        Button button2 = new Button("Bakery");
        Button button3 = new Button("Sweatshop");
        Button button4 = new Button("Factory");
        Button button5 = new Button("Cookie Corporation");
        Button button6 = new Button("Cookie Materialization Machine");
        Button button7 = new Button("Particle Accelerator");
        Button button8 = new Button("Cookie Quantum Entangler");
        Button button9 = new Button("Dimensional Materializing Machine");
        Button button10 = new Button("Time Manipulator");
        Button button11 = new Button("Multiversial Cookie Attraction Vortex");
        Button button12 = new Button("Cookie Materializing White Hole");


        GridPane gridPane = new GridPane();
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setAlignment(Pos.CENTER_LEFT);
        gridPane.setPrefSize(400,475);


        gridPane.add(button1, 0, 0, 1, 1);
        gridPane.add(button2, 0, 1, 1, 1);
        gridPane.add(button3, 0, 2, 1, 1);
        gridPane.add(button4, 0, 3, 1, 1);
        gridPane.add(button5, 0, 4, 1, 1);
        gridPane.add(button6, 0, 5, 1, 1);
        gridPane.add(button7, 0, 6, 1, 1);
        gridPane.add(button8, 0, 7, 1, 1);
        gridPane.add(button9, 0, 8, 1, 1);
        gridPane.add(button10, 0, 9, 1, 1);
        gridPane.add(button11, 0, 10, 1, 1);
        gridPane.add(button12, 0, 11, 1, 1);

        gridPane.add(GrandmotherC,1,0);
        gridPane.add(BakeryC,1,1);
        gridPane.add(SweatshopC,1,2);
        gridPane.add(FactoryC,1,3);
        gridPane.add(Cookie_CorporationC,1,4);
        gridPane.add(Cookie_Materialization_MachineC,1,5);
        gridPane.add(Particle_AcceleratorC,1,6);
        gridPane.add(Cookie_Quantum_EntanglerC,1,7);
        gridPane.add(Dimensional_Materializing_MachineC,1,8);
        gridPane.add(Time_ManipulatorC,1,9);
        gridPane.add(Multiversial_Cookie_Attraction_VortexC,1,10);
        gridPane.add(Cookie_Materializing_White_HoleC,1,11);

        //label
        moneyCounter.setFont(new Font("Arial", 24));
        moneyCounter.setLayoutX(350);
        moneyCounter.setLayoutY(50);

        //append button to thingy
        g.getChildren().addAll(b1, moneyCounter, gridPane);


        //scene initialization
        Scene scene = new Scene(g, 800, 500);
        stage.setScene(scene);
        stage.setTitle("Cookie Clicker");
        stage.setAlwaysOnTop(true);
        stage.setResizable(false);
        stage.show();

        //button action (make monies)?
        b1.setOnAction(this::handleCookieClick);
        button1.setOnAction(this::handleGrandmother);
        button2.setOnAction(this::handleBakery);
        button3.setOnAction(this::handleSweatshop);
        button4.setOnAction(this::handleFactory);
        button5.setOnAction(this::handleCookie_Corporation);
        button6.setOnAction(this::handleCookie_Materialization_Machine);
        button7.setOnAction(this::handleParticle_Accelerator);
        button8.setOnAction(this::handleCookie_Quantum_Entangler);
        button9.setOnAction(this::handleDimensional_Materializing_Machine);
        button10.setOnAction(this::handleTime_Manipulator);
        button11.setOnAction(this::handleMultiversial_Cookie_Attraction_Vortex);
        button12.setOnAction(this::handleCookie_Materializing_White_Hole);

    }
    private void handleCookieClick(javafx.event.ActionEvent actionEvent) {
        money++;
        money += Grandmother;
        money += 3 * Bakery;
        money += 5 * Sweatshop;
        money += 10 * Factory;
        money += 15 * Cookie_Corporation;
        money += 20 * Cookie_Materialization_Machine;
        money += 22 * Particle_Accelerator;
        money += 30 * Cookie_Quantum_Entangler;
        money += 35 * Dimensional_Materializing_Machine;
        money += 42 * Time_Manipulator;
        money += 55 * Multiversial_Cookie_Attraction_Vortex;
        money += 200 * Cookie_Materializing_White_Hole;
        moneyCounter.setText("Money: "+ money);
    }
    private void handleGrandmother(javafx.event.ActionEvent actionEvent) {
        if (money >= 30) {
            money -= 30;
            Grandmother++;
            GrandmotherC.setText(Integer.toString(Grandmother));
        }
    }
    private void handleBakery(javafx.event.ActionEvent actionEvent) {
        if (money >= 600) {
            money -= 600;
            Bakery++;
            BakeryC.setText(Integer.toString(Bakery));
        }
    }
    private void handleSweatshop(javafx.event.ActionEvent actionEvent) {
        if (money >= 20000) {
            money -= 20000;
            Sweatshop++;
            SweatshopC.setText(Integer.toString(Sweatshop));
        }
    }
    private void handleFactory(javafx.event.ActionEvent actionEvent) {
        if (money >= 500000) {
            money -= 500000;
            Factory++;
            FactoryC.setText(Integer.toString(Factory));
        }
    }
    private void handleCookie_Corporation(javafx.event.ActionEvent actionEvent) {
        if (money >= 1000000) {
            money -= 1000000;
            Cookie_Corporation++;
            Cookie_CorporationC.setText(Integer.toString(Cookie_Corporation));
        }
    }
    private void handleCookie_Materialization_Machine(javafx.event.ActionEvent actionEvent) {
        if (money >= 20000000) {
            money -= 20000000;
            Cookie_Materialization_Machine++;
            Cookie_Materialization_MachineC.setText(Integer.toString(Cookie_Materialization_Machine));
        }
    }
    private void handleParticle_Accelerator(javafx.event.ActionEvent actionEvent) {
        if (money >= 80000000) {
            money -= 80000000;
            Particle_Accelerator++;
            Particle_AcceleratorC.setText(Integer.toString(Particle_Accelerator));
        }
    }
    private void handleCookie_Quantum_Entangler(javafx.event.ActionEvent actionEvent) {
        if (money >= 800000000) {
            money -= 800000000;
            Cookie_Quantum_Entangler++;
            Cookie_Quantum_EntanglerC.setText(Integer.toString(Cookie_Quantum_Entangler));
        }
    }
    private void handleDimensional_Materializing_Machine(javafx.event.ActionEvent actionEvent) {
        if (money >= 1200000000) {
            money -= 1200000000;
            Dimensional_Materializing_Machine++;
            Dimensional_Materializing_MachineC.setText(Integer.toString(Dimensional_Materializing_Machine));
        }
    }
    private void handleTime_Manipulator(javafx.event.ActionEvent actionEvent) {
        if (money >= 2000000000) {
            money -= 2000000000;
            Time_Manipulator++;
            Time_ManipulatorC.setText(Integer.toString(Time_Manipulator));
        }
    }
    private void handleMultiversial_Cookie_Attraction_Vortex(javafx.event.ActionEvent actionEvent) {
        if (money >= 5000000000L) {
            money -= 5000000000L;
            Multiversial_Cookie_Attraction_Vortex++;
            Multiversial_Cookie_Attraction_VortexC.setText(Integer.toString(Multiversial_Cookie_Attraction_Vortex));
        }
    }
    private void handleCookie_Materializing_White_Hole(javafx.event.ActionEvent actionEvent) {
        if (money >= 100000000000L) {
            money -= 100000000000L;
            Cookie_Materializing_White_Hole++;
            Cookie_Materializing_White_HoleC.setText(Integer.toString(Cookie_Materializing_White_Hole));
        }
    }


    public static void main(String[] args) {
        Application.launch(args);

    }
}
