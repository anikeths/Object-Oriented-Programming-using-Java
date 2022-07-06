import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class SatyanarayanaAnikethA7 extends Application {
    Button bt0;
    Button bt1;
    Button bt2;
    Button bt3;
    Button bt4;
    Button bt5;
    Button bt6;
    Button bt7;
    Button bt8;
    Button bt9;
    Button btdot;
    Button btlessthan;
    Button btmod;
    Button btequals;
    Button btminus;
    Button btplus;
    Button btmul;
    Button btdiv;
    Button btclear;
    Button btmodulo;

    RadioButton on;
    RadioButton off;

     String tfvalue;
   static TextField tf;
    public static void main(String[] args) {
        launch(args);
    }

    public void init() {
        System.out.println("Inside init block");
    }

    public void stop() {
        System.out.println("Inside stop block.");
    }
    public void start(Stage myStage) {
        myStage.setTitle("Calculator");
        bt0 = new Button("0");
        bt1 = new Button("1");
        bt2 = new Button("2");
        bt3 = new Button("3");
        bt4 = new Button("4");
        bt5 = new Button("5");
        bt6 = new Button("6");
        bt7 = new Button("7");
        bt8 = new Button("8");
        bt9 = new Button("9");
        btlessthan = new Button("<");
        btequals = new Button("=");
        btmod = new Button("%");
        btclear = new Button("AC");
        btdiv = new Button("/");
        btmul = new Button("*");
        btplus = new Button("+");
        btminus = new Button("-");
        btdot = new Button(".");
        btmodulo = new Button("%");
        on = new RadioButton("On");
        off = new RadioButton("Off");
        tf = new TextField();
        tf.setPrefSize(250, 75);

        ToggleGroup group1 = new ToggleGroup();
        on.setToggleGroup(group1);
        off.setToggleGroup(group1);

        GridPane pane = new GridPane();
        VBox pane2 = new VBox(10, tf,pane);

        pane.setAlignment(Pos.TOP_LEFT);
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setMaxSize(450, 400); //Setting the padding
        pane.setPadding(new Insets(10, 10, 10, 10));

        Scene myScene = new Scene(pane2, 450, 500);
        myStage.setScene(myScene);

        EventHandler<ActionEvent> zerodisplay = actionEvent -> tf.setText(tf.getText() + "0");
        EventHandler<ActionEvent> onedisplay = actionEvent -> tf.setText(tf.getText() + "1");
        EventHandler<ActionEvent> twodisplay = actionEvent -> tf.setText(tf.getText() + "2");
        EventHandler<ActionEvent> threedisplay = actionEvent -> tf.setText(tf.getText() + "3");
        EventHandler<ActionEvent> fourdisplay = actionEvent -> tf.setText(tf.getText() + "4");
        EventHandler<ActionEvent> fivedisplay = actionEvent -> tf.setText(tf.getText() + "5");
        EventHandler<ActionEvent> sixdisplay = actionEvent -> tf.setText(tf.getText() + "6");
        EventHandler<ActionEvent> sevendisplay = actionEvent -> tf.setText(tf.getText() + "7");
        EventHandler<ActionEvent> eightdisplay = actionEvent -> tf.setText(tf.getText() + "8");
        EventHandler<ActionEvent> ninedisplay = actionEvent -> tf.setText(tf.getText() + "9");
        EventHandler<ActionEvent> plusdisplay = actionEvent -> tf.setText(tf.getText() + "+");
        EventHandler<ActionEvent> minusdisplay = actionEvent -> tf.setText(tf.getText() + "-");
        EventHandler<ActionEvent> muldisplay = actionEvent -> tf.setText(tf.getText() + "*");
        EventHandler<ActionEvent> divdisplay = actionEvent -> tf.setText(tf.getText() + "/");
        EventHandler<ActionEvent> moddisplay = actionEvent -> tf.setText(tf.getText() + "%");
        EventHandler<ActionEvent> dotdisplay = actionEvent -> tf.setText(tf.getText() + ".");
        EventHandler<ActionEvent> lessthandisplay = actionEvent ->
        {
            tf.setText(tf.getText().substring(0, tf.getText().length() - 1));
        };
        EventHandler<ActionEvent> cleardisplay = actionEvent -> tf.setText("");
        EventHandler<ActionEvent> equalsdisplay = actionEvent ->
        {
            String[] splitvalue = new String[2];
            if (tf.getText().contains("+")) {
                if((tf.getText().charAt(0)=='%')||(tf.getText().charAt(0)=='*') ||(tf.getText().charAt(0)=='/'))
                    splitvalue = tf.getText().substring(1).split("\\+");
                    else splitvalue=tf.getText().split("\\+");
                    double n1 = Double.parseDouble(splitvalue[0]);
                    double n2 = Double.parseDouble(splitvalue[1]);
                    tf.setText(String.valueOf(n1 + n2));
                }
            if(tf.getText().contains("-") &&(tf.getText().charAt(0)!='-')){
             splitvalue = tf.getText().split("\\-");
                double n1 = Double.parseDouble(splitvalue[0]);
                double n2 = Double.parseDouble(splitvalue[1]);
                tf.setText(String.valueOf(n1 - n2));
            }
            if (tf.getText().contains("*")) {
                if((tf.getText().charAt(0)=='%')||(tf.getText().charAt(0)=='*') ||(tf.getText().charAt(0)=='/'))
                splitvalue = tf.getText().substring(1).split("\\*");
                else splitvalue=tf.getText().split("\\*");
                double n1 = Double.parseDouble(splitvalue[0]);
                double n2 = Double.parseDouble(splitvalue[1]);
                tf.setText(String.valueOf(n1 * n2));
            }
            if (tf.getText().contains("/")) {
                if((tf.getText().charAt(0)=='%')||(tf.getText().charAt(0)=='*') ||(tf.getText().charAt(0)=='/'))
                    splitvalue = tf.getText().substring(1).split("\\/");
                else splitvalue = tf.getText().split("\\/");
                double n1 = Double.parseDouble(splitvalue[0]);
                double n2 = Double.parseDouble(splitvalue[1]);
               // if(n2==0) tf.setText("Can't divide by 0"); else
                tf.setText(String.valueOf(n1 / n2));
            }
            if (tf.getText().contains("%")) {
                if((tf.getText().charAt(0)=='%')||(tf.getText().charAt(0)=='*') ||(tf.getText().charAt(0)=='/'))
                    splitvalue = tf.getText().substring(1).split("\\%");
               else splitvalue = tf.getText().split("\\%");
                double n1 = Double.parseDouble(splitvalue[0]);
                double n2 = Double.parseDouble(splitvalue[1]);
                tf.setText(String.valueOf(n1 % n2));
            }
        };

            EventHandler<ActionEvent> pressoff = actionEvent -> {
                bt0.setDisable(true);
                bt1.setDisable(true);
                bt2.setDisable(true);
                bt3.setDisable(true);
                bt4.setDisable(true);
                bt5.setDisable(true);
                bt6.setDisable(true);
                bt7.setDisable(true);
                bt8.setDisable(true);
                bt9.setDisable(true);
                btclear.setDisable(true);
                btlessthan.setDisable(true);
                btequals.setDisable(true);
                btmul.setDisable(true);
                btdiv.setDisable(true);
                btplus.setDisable(true);
                btminus.setDisable(true);
                btdot.setDisable(true);
                btmodulo.setDisable(true);
                tf.setText("");
            };
            EventHandler<ActionEvent> presson = actionEvent -> {
                bt0.setDisable(false);
                bt1.setDisable(false);
                bt2.setDisable(false);
                bt3.setDisable(false);
                bt4.setDisable(false);
                bt5.setDisable(false);
                bt6.setDisable(false);
                bt7.setDisable(false);
                bt8.setDisable(false);
                bt9.setDisable(false);
                btclear.setDisable(false);
                btlessthan.setDisable(false);
                btequals.setDisable(false);
                btmul.setDisable(false);
                btdiv.setDisable(false);
                btplus.setDisable(false);
                btminus.setDisable(false);
                btmodulo.setDisable(false);
                btdot.setDisable(false);
            };
            bt0.setOnAction(zerodisplay);
            bt1.setOnAction(onedisplay);
            bt2.setOnAction(twodisplay);
            bt3.setOnAction(threedisplay);
            bt4.setOnAction(fourdisplay);
            bt5.setOnAction(fivedisplay);
            bt6.setOnAction(sixdisplay);
            bt7.setOnAction(sevendisplay);
            bt8.setOnAction(eightdisplay);
            bt9.setOnAction(ninedisplay);
            btequals.setOnAction(equalsdisplay);
            btmod.setOnAction(moddisplay);
            btlessthan.setOnAction(lessthandisplay);
            btplus.setOnAction(plusdisplay);
            btminus.setOnAction(minusdisplay);
            btdiv.setOnAction(divdisplay);
            btmul.setOnAction(muldisplay);
            btclear.setOnAction(cleardisplay);
            btdot.setOnAction(dotdisplay);
            btmodulo.setOnAction(moddisplay);
            off.setOnAction(pressoff);
            on.setOnAction(presson);

            btlessthan.setPrefSize(75, 40);
            btplus.setPrefSize(75,40);
            btminus.setPrefSize(75,40);
            btmodulo.setPrefSize(75,40);
            btmul.setPrefSize(75,40);
            btdiv.setPrefSize(75,40);
            bt0.setPrefSize(75,40);
             bt7.setPrefSize(75, 40);
            bt6.setPrefSize(75,40);
            bt5.setPrefSize(75,40);
            bt4.setPrefSize(75,40);
            bt3.setPrefSize(75,40);
            bt2.setPrefSize(75,40);
            bt1.setPrefSize(75,40);
            bt8.setPrefSize(75, 40);
            bt9.setPrefSize(75,40);
            btclear.setPrefSize(75,40);
            btequals.setPrefSize(75,40);
            btdot.setPrefSize(75,40);

       pane.add(on,0,1);
        pane.add(off,0,2);
        pane.add(btlessthan,1,1);
        pane.add(btclear,2,1);
        pane.add(btmodulo,3,1);
        pane.add(btdiv,3,3);
        pane.add(btminus,3,4);
        pane.add(btmul,3,5);
        pane.add(bt9,2,3);
        pane.add(bt8,1,3);
        pane.add(bt7,0,3);
        pane.add(bt4,0,4);
        pane.add(bt5,1,4);
        pane.add(bt6,2,4);
        pane.add(bt1,0,5);
        pane.add(bt2,1,5);
        pane.add(bt3,2,5);
        pane.add(btdot,0,6);
        pane.add(bt0,1,6);
        pane.add(btplus,2,6);
        pane.add(btequals,3,6);

            myStage.show();
        }
    }





