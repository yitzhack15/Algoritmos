
package GUI;

import Logic.ListException;
import Logic.LogIn;
import Logic.LogInAction;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javax.swing.JOptionPane;


public class QuickGUI {
    String name;
    String password;
    LogInAction la = new LogInAction();
    
    public GridPane gp (){
       //GP Creation
       GridPane gp = new GridPane();
       gp.setVgap(10);
       gp.setHgap(10);
       gp.setGridLinesVisible(false);//Solo para ver las lineas del grid
       gp.setAlignment(Pos.CENTER);
       //End GP Creation
        
       //BackgroundImage
       try{
            
         FileInputStream input = new FileInputStream("C:\\Users\\Yitzhack\\Documents\\UCR\\Algoritmos\\TareaAlgoritmos\\src\\images\\background.jpg"); 
         Image image = new Image(input);
         BackgroundImage backgroundimage = new BackgroundImage(image,  
                                               BackgroundRepeat.NO_REPEAT,  
                                               BackgroundRepeat.NO_REPEAT,  
                                               BackgroundPosition.DEFAULT,  
                                               BackgroundSize.DEFAULT); 
         Background background = new Background(backgroundimage); 
         gp.setBackground(background); 
        }catch(Exception e){
          System.out.println("Error");
        }
       //End BackgroundImage
       
       
       
        //LogIn Menu
        Label LWelcome = new Label("B I E N V E N I D O");
        LWelcome.setFont(Font.font ("Courier New", 50));
        LWelcome.setTextFill(Color.BLACK);
        gp.add(LWelcome, 1, 0);
        
        Label lb_User = new Label("U S U A R I O");
        lb_User.setTextFill(Color.BLACK);
        lb_User.setFont(new Font("Courrier New",20));
        gp.add(lb_User, 1, 1);

        Label lb_Password = new Label("C O N T R A S E Ñ A");
        lb_Password.setTextFill(Color.BLACK);
        lb_Password.setFont(new Font("Courrier New",20));
        gp.add(lb_Password, 1, 3);

        TextField tf_User = new TextField();
        gp.add(tf_User, 1, 2);

        PasswordField tf_Password = new PasswordField();
        gp.add(tf_Password, 1, 4);

        Button btn_LogIn = new Button("I N G R E S A R");
        btn_LogIn.setStyle("-fx-background-color: WHITE;");
        btn_LogIn.setFont(new Font("Courrier New",20));
        gp.add(btn_LogIn, 1, 6);
        //End LogIn Menu
              
        
        btn_LogIn.setOnAction(eventLogIn->{
            
         name = tf_User.getText();
         password = tf_Password.getText();
         LogIn lg = new LogIn(name, password);   
         lg.setUsername(name);
         lg.setPassword(password);
             
         try {
          if(la.isLoggedIn(name, password) == true){
             gp.getChildren().clear();
             if(la.isAdmin(name, password) == true){
                gp.setAlignment(Pos.CENTER);
                //JOptionPane.showMessageDialog(null, "El usuario ha sido encontrado y es administrador");
                            
                MenuBar mb = new  MenuBar();
                Menu m = new Menu("O P C I O N E S   D E   A D M I N I S T R A D O R");
                
                MenuItem m_add = new MenuItem("A G R E G A R  T R A B A J A D O R");
                m_add.setOnAction(eventAdd->{
                    
                    gp.getChildren().clear();

                    Label lbAddU = new Label("I D");
                    lbAddU.setTextFill(Color.BLACK);
                    lbAddU.setFont(new Font("Courrier New", 20));
                    gp.add(lbAddU, 1, 1);

                    Label lbAddP = new Label("N O M B R E :");
                    lbAddP.setTextFill(Color.BLACK);
                    lbAddP.setFont(new Font("Courrier New", 20));
                    gp.add(lbAddP, 1, 2);
                                    
                    Label lb3 = new Label("A P E L L I D O :");
                    lb3.setTextFill(Color.BLACK);
                    lb3.setFont(new Font("Courrier New", 20));
                    gp.add(lb3, 1, 3);
                                    
                    Label lb4 = new Label("P U E S T O :");
                    lb4.setTextFill(Color.BLACK);
                    lb4.setFont(new Font("Courrier New", 20));
                    gp.add(lb4, 1, 4);
                                    
                    Label lb5 = new Label("G É N E R O");
                    lb5.setTextFill(Color.BLACK);
                    lb5.setFont(new Font("Courrier New", 20));
                    gp.add(lb5, 1, 5);
                                    
                    Label lb6 = new Label("T E L E F O N O");
                    lb6.setTextFill(Color.BLACK);
                    lb6.setFont(new Font("Courrier New", 20));
                    gp.add(lb6, 1, 6);
                                    
                    Label lb7 = new Label("D I R E C C I Ó N");
                    lb7.setTextFill(Color.BLACK);
                    lb7.setFont(new Font("Courrier New", 20));
                    gp.add(lb7, 1, 7);
                                    
                    Label lb8 = new Label("C U M P L E A Ñ O S");
                    lb8.setTextFill(Color.BLACK);
                    lb8.setFont(new Font("Courrier New", 20));
                    gp.add(lb8, 1, 8);
                                    
                    Label lb9 = new Label("F E C H A   D E   I N I C I O"+"\n"+"D E   C O N T R A T O");
                    lb9.setTextFill(Color.BLACK);
                    lb9.setFont(new Font("Courrier New", 20));
                    gp.add(lb9, 1, 9);
                                    
                    Label lb10 = new Label("F E C H A   E N\n L A   Q U E   T E R M I N A   E L   C O N T R A T O");
                    lb10.setTextFill(Color.BLACK);
                    lb10.setFont(new Font("Courrier New", 20));
                    gp.add(lb10, 1, 10);
                                    
                    Label l4 = new Label(); //Para el setText
                    l4.setTextFill(Color.BLACK);
                    l4.setFont(new Font("Courrier New", 20));
                                    
                                    
                    TextField t = new TextField();
                    gp.add(t, 2, 1);
                                    
                    TextField t2 = new TextField();
                    gp.add(t2, 2, 2);
                                    
                    TextField t3 = new TextField();
                    gp.add(t3, 2, 3);
                                    
//                    TextField t4 = new TextField();
//                    gp.add(t4, 2, 4);
                    
                    ComboBox cb = new ComboBox();
                    gp.add(cb, 2, 4);
                    File f = new File("puestos.txt");
                    FileInputStream fis;
                    try {
                        fis = new FileInputStream(f);
                    InputStreamReader isr = new InputStreamReader(fis);
                    BufferedReader br = new BufferedReader(isr);
                    String line = "";
                        while((line = br.readLine())!= null){
                            cb.getItems().add(line);
                        }
                    
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(QuickGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                     catch (IOException ex) {
                        Logger.getLogger(QuickGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    TextField t5 = new TextField();
                    gp.add(t5, 2, 5);
                                    
                    TextField t6 = new TextField();
                    gp.add(t6, 2, 6);
                                    
                    TextField t7 = new TextField();
                    gp.add(t7, 2, 7);
                                    
                    DatePicker d1 = new DatePicker();
                    gp.add(d1, 2, 8);
                                    
                    DatePicker d2 = new DatePicker();
                    gp.add(d2, 2, 9);
                                    
                    DatePicker d3 = new DatePicker();
                    gp.add(d3, 2, 10);
                                    
                    Button b3 = new Button("A G R E G A R");
                    gp.add(b3, 1,11);
                    b3.setStyle("-fx-background-color: WHITE;");

                    Button btn_Back = new Button("                                  A T R A S                                  ");
                    btn_Back.setStyle("-fx-background-color: WHITE;");
                    gp.add(btn_Back, 1, 12);

                    btn_Back.setOnAction(event3 -> {

                        gp.getChildren().clear();
                        gp.add(mb, 1, 0);
                        gp.add(btn_Back, 1, 2);
                        
                        btn_Back.setOnAction(eventBack -> {

                          gp.getChildren().clear();
                          gp.setVgap(10);
                          gp.setHgap(10);
                          gp.setAlignment(Pos.CENTER);
                          
                          gp.add(LWelcome, 1, 0);
                          gp.add(lb_User, 1, 1);
                          gp.add(lb_Password, 1, 3);
                          gp.add(tf_User, 1, 2);
                          tf_User.clear();
                          gp.add(tf_Password, 1, 4);
                          tf_Password.clear();
                          gp.add(btn_LogIn, 1, 6);
                        });
                    });
                                    
                                    
                    b3.setOnAction(eventAddUser -> {
                        
                      if (!t.getText().equals("") && !t2.getText().equals("") && !t3.getText().equals("") && !cb.getValue().toString().equals("")
                          && !t5.getText().equals("") && !t6.getText().equals("") && !t7.getText().equals("") && !d1.getValue().equals("")
                          && !d2.getValue().equals("") && !d3.getValue().equals("")) {
                      try {
                         if (la.createUser(t.getText(), t2.getText(), t3.getText(), cb.getValue().toString(), t5.getText(), 
                             t6.getText(), t7.getText(), d1.getValue(), d2.getValue(), d3.getValue()) == true) {
                             t.setDisable(true);
                             t2.setDisable(true);
                             t3.setDisable(true);
                             cb.setDisable(true);
                             t5.setDisable(true);
                             t6.setDisable(true);
                             t7.setDisable(true);
                             d1.setDisable(true);
                             d2.setDisable(true);
                             d3.setDisable(true);
                             l4.setText("U S U A R I O   A G R E G A D O");
                             gp.add(l4, 1, 13);
                         }else {
                             t.setDisable(true);
                             t2.setDisable(true);
                             t3.setDisable(true);
                             cb.setDisable(true);
                             t5.setDisable(true);
                             t6.setDisable(true);
                             t7.setDisable(true);
                             d1.setDisable(true);
                             d2.setDisable(true);
                             d3.setDisable(true);
                             l4.setText("U S U A R I O   C R E A D O");
                             gp.add(l4, 1, 13);
                          }//end else

           } catch (FileNotFoundException ex) {
             System.out.println("Error");
           }
        }else{
         l4.setText("Los campos no pueden estar vacios");
        }//end else 
    });//end event
    });
       
       MenuItem m_delete = new MenuItem("E L I M I N I A R");
       m_delete.setOnAction(ev5->{
           gp.getChildren().clear();
           Label l3 = new Label("Ingrese el ID del trabajador\nque desea eliminar");
           l3.setTextFill(Color.BLACK);
           l3.setFont(new Font("Courrier New", 20));
           gp.add(l3, 1, 1);
           
           TextField tf3 = new TextField();
           gp.add(tf3, 2, 1);
           
           Button bt1 = new Button("Eliminar");
           gp.add(bt1, 3, 1);
           bt1.setOnAction(ev6->{
               try {
                   TextArea ta = new TextArea();
                   ta.setEditable(false);
                   ta.setMinHeight(300);
                   ta.setMinWidth(650);
                   gp.setRowSpan(ta, 3);
                   gp.setColumnSpan(ta, 3);
                   la.removeItem(tf3.getText());
                   ta.setText((la.saveItems().toString()));
                   gp.add(ta, 1, 2);
                   
                    Button btn_Back= new Button("                                  A T R A S                                  ");
                    btn_Back.setStyle("-fx-background-color: WHITE;");
                    gp.add(btn_Back, 1, 6);

                    btn_Back.setOnAction(event3 -> {

                        gp.getChildren().clear();
                        gp.add(mb, 1, 0);
                        gp.add(btn_Back, 1, 2);
                        
                        btn_Back.setOnAction(eventBack -> {

                          gp.getChildren().clear();
                          gp.setVgap(10);
                          gp.setHgap(10);
                          gp.setAlignment(Pos.CENTER);
                          
                          gp.add(LWelcome, 1, 0);
                          gp.add(lb_User, 1, 1);
                          gp.add(lb_Password, 1, 3);
                          gp.add(tf_User, 1, 2);
                          tf_User.clear();
                          gp.add(tf_Password, 1, 4);
                          tf_Password.clear();
                          gp.add(btn_LogIn, 1, 6);
                        });
                    });
               } catch (IOException ex) {
                   Logger.getLogger(QuickGUI.class.getName()).log(Level.SEVERE, null, ex);
               } catch (ListException ex) {
                   Logger.getLogger(QuickGUI.class.getName()).log(Level.SEVERE, null, ex);
               }
           });
           
                     Button Goback = new Button("Regresar al inicio");
                     gp.add(Goback, 1, 3);
                     Goback.setOnAction(ev8 -> {
                         gp.getChildren().clear();
                         gp.add(mb, 1, 0);
                         gp.add(Goback, 1, 2);

                         Goback.setOnAction(eventBack -> {
                             gp.getChildren().clear();
                             gp.setVgap(10);
                             gp.setHgap(10);
                             gp.setAlignment(Pos.CENTER);

                             gp.add(LWelcome, 1, 0);
                             gp.add(lb_User, 1, 1);
                             gp.add(lb_Password, 1, 3);
                             gp.add(tf_User, 1, 2);
                             tf_User.clear();
                             gp.add(tf_Password, 1, 4);
                             tf_Password.clear();
                             gp.add(btn_LogIn, 1, 6);
                         });
                     });

                 });
       
       MenuItem m_show = new MenuItem("M O S T R A R");
       
       m_show.setOnAction(event8->{
          gp.getChildren().clear();
          Label l5 = new Label("Los trabajadores de la empresa son: ");
          l5.setTextFill(Color.BLACK);
          l5.setFont(new Font("Courrier New", 20));
          gp.add(l5, 1, 1);
                                
          TextArea ta = new TextArea();
          ta.setEditable(false);
          ta.setMinHeight(300);
          ta.setMinWidth(650);
          
          Button btn_Back= new Button("                                  A T R A S                                  ");
          btn_Back.setStyle("-fx-background-color: WHITE;");
          gp.add(btn_Back, 1, 12);

                    btn_Back.setOnAction(event3 -> {

                        gp.getChildren().clear();
                        gp.add(mb, 1, 0);
                        gp.add(btn_Back, 1, 2);
                        
                        btn_Back.setOnAction(eventBack -> {

                          gp.getChildren().clear();
                          gp.setVgap(10);
                          gp.setHgap(10);
                          gp.setAlignment(Pos.CENTER);
                          
                          gp.add(LWelcome, 1, 0);
                          gp.add(lb_User, 1, 1);
                          gp.add(lb_Password, 1, 3);
                          gp.add(tf_User, 1, 2);
                          tf_User.clear();
                          gp.add(tf_Password, 1, 4);
                          tf_Password.clear();
                          gp.add(btn_LogIn, 1, 6);
                        });
                    });
                     
        try {
         ta.setText(la.saveItems().toString());
        } catch (IOException ex) {
         Logger.getLogger(QuickGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ListException ex) {
         Logger.getLogger(QuickGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
         gp.add(ta, 1, 2);                    
        });
           
         MenuItem m_modify = new MenuItem("M O D I F I C A R");
         m_modify.setOnAction(ev5->{
             gp.getChildren().clear();
             
         });
         
         MenuItem m_addT = new MenuItem("A G R E G A R  P U E S T O");
         m_addT.setOnAction(ev6->{
             gp.getChildren().clear();
             Label lbAdd = new Label("Agregue un puesto:");
                    lbAdd.setTextFill(Color.BLACK);
                    lbAdd.setFont(new Font("Courrier New", 20));
                    gp.add(lbAdd, 1, 1);
                    
                    TextField t = new TextField();
                    gp.add(t, 2, 1);
                    
                    Button btnAdd = new Button("Agregar");
                    btnAdd.setStyle("-fx-background-color: WHITE;");
                    gp.add(btnAdd, 1, 3);
                    
                    btnAdd.setOnAction(ev9->{
                 try {
                     if(la.createTitle(t.getText()) ==  true){
                         Label show = new Label("El puesto ha sido agregado");
                         show.setFont(new Font("Courrier New", 20));
                         gp.add(show, 1, 4);
                     } else{   
                        Label show = new Label("No puede estar en blanco");
                         show.setFont(new Font("Courrier New", 20));
                         gp.add(show, 1, 4);
                     }
                     
                 } catch (FileNotFoundException ex) {
                     Logger.getLogger(QuickGUI.class.getName()).log(Level.SEVERE, null, ex);
                 }
                        
                    });
                    
                    Button btn_Back= new Button("                                  A T R A S                                  ");
                    btn_Back.setStyle("-fx-background-color: WHITE;");
                    gp.add(btn_Back, 1, 6);

                    btn_Back.setOnAction(event3 -> {

                        gp.getChildren().clear();
                        gp.add(mb, 1, 0);
                        gp.add(btn_Back, 1, 2);
                        
                        btn_Back.setOnAction(eventBack -> {

                          gp.getChildren().clear();
                          gp.setVgap(10);
                          gp.setHgap(10);
                          gp.setAlignment(Pos.CENTER);
                          
                          gp.add(LWelcome, 1, 0);
                          gp.add(lb_User, 1, 1);
                          gp.add(lb_Password, 1, 3);
                          gp.add(tf_User, 1, 2);
                          tf_User.clear();
                          gp.add(tf_Password, 1, 4);
                          tf_Password.clear();
                          gp.add(btn_LogIn, 1, 6);
                        });
                    });
                });
         MenuItem m_delT = new MenuItem("E L I M I N A R  P U E S T O");
         m_delT.setOnAction(ev7->{
             gp.getChildren().clear();
           Label l3 = new Label("Ingrese el puesto de trabajo\nque desea eliminar");
           l3.setTextFill(Color.BLACK);
           l3.setFont(new Font("Courrier New", 20));
           gp.add(l3, 1, 1);
           
           TextField t3 = new TextField();
           gp.add(t3, 2, 1);
           
           Button bt1 = new Button("Eliminar");
           gp.add(bt1, 3, 1);

             Button Goback = new Button("Regresar al inicio");
             gp.add(Goback, 1, 3);
             Goback.setOnAction(ev8 -> {
                 gp.getChildren().clear();
                 gp.add(mb, 1, 0);
                 gp.add(Goback, 1, 2);
                 Goback.setOnAction(eventBack -> {
                     gp.getChildren().clear();
                     gp.setVgap(10);
                     gp.setHgap(10);
                     gp.setAlignment(Pos.CENTER);

                     gp.add(LWelcome, 1, 0);
                     gp.add(lb_User, 1, 1);
                     gp.add(lb_Password, 1, 3);
                     gp.add(tf_User, 1, 2);
                     tf_User.clear();
                     gp.add(tf_Password, 1, 4);
                     tf_Password.clear();
                     gp.add(btn_LogIn, 1, 6);
                 });
             });
           
           bt1.setOnAction(ev6->{
               try {
                   TextArea ta = new TextArea();
                   ta.setEditable(false);
                   ta.setMinHeight(300);
                   ta.setMinWidth(650);
                   gp.setRowSpan(ta, 3);
                   gp.setColumnSpan(ta, 3);
                   la.removeTitle(t3.getText());
                   ta.setText(la.saveItemsC().toString());
                   gp.add(ta, 1, 2);
               } catch (IOException ex) {
                   Logger.getLogger(QuickGUI.class.getName()).log(Level.SEVERE, null, ex);
               } catch (ListException ex) {
                   Logger.getLogger(QuickGUI.class.getName()).log(Level.SEVERE, null, ex);
               }
               Button btn_Back = new Button("                                  A T R A S                                  ");
               btn_Back.setStyle("-fx-background-color: WHITE;");
               gp.add(btn_Back, 1, 6);

               btn_Back.setOnAction(event3 -> {

                   gp.getChildren().clear();
                   gp.add(mb, 1, 0);
                   gp.add(btn_Back, 1, 2);

                   btn_Back.setOnAction(eventBack -> {

                       gp.getChildren().clear();
                       gp.setVgap(10);
                       gp.setHgap(10);
                       gp.setAlignment(Pos.CENTER);

                       gp.add(LWelcome, 1, 0);
                       gp.add(lb_User, 1, 1);
                       gp.add(lb_Password, 1, 3);
                       gp.add(tf_User, 1, 2);
                       tf_User.clear();
                       gp.add(tf_Password, 1, 4);
                       tf_Password.clear();
                       gp.add(btn_LogIn, 1, 6);
                   });
               });
           });
        });
         
        MenuItem m_modT = new MenuItem("E D I T A R  P U E S T O");
        m_modT.setOnAction(ev8->{
             gp.getChildren().clear(); 
         });
         
        MenuItem m_showT = new MenuItem("M O S T R A R  P U E S T O S");
        m_showT.setOnAction(ev9->{   
          gp.getChildren().clear();
          Label l5 = new Label("Los trabajadores de la empresa son: ");
          l5.setTextFill(Color.BLACK);
          l5.setFont(new Font("Courrier New", 20));
          gp.add(l5, 1, 1);
                                
          TextArea ta = new TextArea();
          ta.setEditable(false);
          ta.setMinHeight(300);
          ta.setMinWidth(650);
          gp.setRowSpan(ta, 3);
          gp.setColumnSpan(ta, 3);
          gp.add(ta, 1, 3);
             try {
                 ta.setText(la.saveItemsC().toString());
             } catch (IOException ex) {
                 Logger.getLogger(QuickGUI.class.getName()).log(Level.SEVERE, null, ex);
             } catch (ListException ex) {
                 Logger.getLogger(QuickGUI.class.getName()).log(Level.SEVERE, null, ex);
             }
          Button btn_Back= new Button("                                  A T R A S                                  ");
          btn_Back.setStyle("-fx-background-color: WHITE;");
          gp.add(btn_Back, 1, 12);
          
                    btn_Back.setOnAction(event3 -> {

                        gp.getChildren().clear();
                        gp.add(mb, 1, 0);
                        gp.add(btn_Back, 1, 2);
                        
                        btn_Back.setOnAction(eventBack -> {

                          gp.getChildren().clear();
                          gp.setVgap(10);
                          gp.setHgap(10);
                          gp.setAlignment(Pos.CENTER);
                          
                          gp.add(LWelcome, 1, 0);
                          gp.add(lb_User, 1, 1);
                          gp.add(lb_Password, 1, 3);
                          gp.add(tf_User, 1, 2);
                          tf_User.clear();
                          gp.add(tf_Password, 1, 4);
                          tf_Password.clear();
                          gp.add(btn_LogIn, 1, 6);
                        });
                    });
         });
         
         mb.getMenus().add(m);
         m.getItems().addAll(m_add, m_delete, m_modify, m_show, m_addT, m_delT, m_modT, m_showT);
         mb.setStyle("-fx-background-color: WHITE;");
         
         Button btn_Back3=new Button("                                  A T R A S                                  ");
         btn_Back3.setStyle("-fx-background-color: WHITE;");
         
                
         gp.add(mb, 1,0);
         
         gp.add(btn_Back3,1,2);
                
        btn_Back3.setOnAction(event3->{
                        
          gp.getChildren().clear();
          gp.setVgap(10);
          gp.setHgap(10);
          gp.setAlignment(Pos.CENTER);
          
        
        gp.add(LWelcome, 1, 0);
        gp.add(lb_User, 1, 1);
        gp.add(lb_Password, 1, 3);
        gp.add(tf_User, 1, 2);
        tf_User.clear();
        gp.add(tf_Password, 1, 4);
        tf_Password.clear();
        gp.add(btn_LogIn, 1, 6);
        });
                            
        }else{
          gp.setAlignment(Pos.TOP_LEFT);
          //JOptionPane.showMessageDialog(null, "El usuario ha sido encontrado y es cliente");
          Button b2 = new Button ("I N F O R M A C I Ó N");
          b2.setOnAction(ev3->{
          gp.getChildren().clear();
          
          Label l5 = new Label("Los trabajadores de la empresa son: ");
          l5.setTextFill(Color.BLACK);
          l5.setFont(new Font("Courrier New", 20));
          gp.add(l5, 1, 1); 
          TextArea ta = new TextArea();
          ta.setMinHeight(300);
          ta.setMinWidth(500);
          
          try {
            ta.setText(la.saveItems().toString());
          } catch (IOException ex) {
             Logger.getLogger(QuickGUI.class.getName()).log(Level.SEVERE, null, ex);
          } catch (ListException ex) {
             Logger.getLogger(QuickGUI.class.getName()).log(Level.SEVERE, null, ex);
          }
             gp.add(ta, 1, 2);
          });
                            
            Button btnBack=new Button("                                 A T R A S                                  "); //Inicio del menu principal
            gp.add(b2, 1, 0);
            gp.add(btnBack,1,2);
            
            btnBack.setOnAction(event3->{            
              gp.getChildren().clear();
              gp.setAlignment(Pos.CENTER);
              gp.setVgap(10);
              gp.setHgap(10);
              gp.add(LWelcome, 1, 0);
            });
           }
             
           }else{
             JOptionPane.showMessageDialog(null, "No se encontró este usuario");
           }
          } catch (IOException ex) {
            Logger.getLogger(QuickGUI.class.getName()).log(Level.SEVERE, null, ex);
          }
         });
        
        
    return gp;
    }
    
}
