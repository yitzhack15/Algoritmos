
package GUI;

import Logic.LogIn;
import Logic.LogInAction;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javax.swing.JOptionPane;

/**
 *
 * @author Yitzhack
 */
public class QuickGUI {
    String name;
    String password;
    
    
    LogInAction la = new LogInAction();
    
    public GridPane gp (){
        
        GridPane gp = new GridPane();
        gp.setVgap(10);
        gp.setHgap(10);
        gp.setAlignment(Pos.TOP_CENTER);
        gp.setStyle("-fx-background-color:Black ;");
   
        Label LWelcome = new Label("Bienvenido");
        gp.add(LWelcome, 1, 0);//x y
        LWelcome.setFont(Font.font ("Cambria", 25));
        LWelcome.setTextFill(Color.WHITE);
        
        Button btnLogIn = new Button("        Ingresar      ");
        gp.add(btnLogIn, 1, 1);
        btnLogIn.setStyle("-fx-background-color: GREY;");
        btnLogIn.setFont(Font.font ("Cambria", 15));
        
        
        
        btnLogIn.setOnAction(event4->{
            gp.getChildren().clear();
            
            Label l2 = new Label("Ingrese su usuario");
            l2.setTextFill(Color.WHITE);
            l2.setFont(new Font("Cambria",15));
            gp.add(l2, 1, 1);

            Label l3 = new Label("Ingrese su contraseña");
            l3.setTextFill(Color.WHITE);
            l3.setFont(new Font("Cambria",15));
            gp.add(l3, 1, 2);

            TextField tf = new TextField();
            gp.add(tf, 2, 1);

            PasswordField tf2 = new PasswordField();
            gp.add(tf2, 2, 2);

            Button btn3 = new Button("Iniciar sesion");
            gp.add(btn3, 1, 3);
            btn3.setStyle("-fx-background-color: GREY;");
            
            Button btn5 = new Button("Regresar al inicio");
            btn5.setStyle("-fx-background-color: GREY;");
                    gp.add(btn5, 1, 5);
                    btn5.setOnAction(event3->{    
                        gp.getChildren().clear();
                        gp.setVgap(10);
                        gp.setHgap(10);
                        gp.setAlignment(Pos.TOP_CENTER);
                        gp.add(LWelcome, 1, 0);
                        gp.add(btnLogIn, 1, 1);
                        
                        });//end event3
                    
            btn3.setOnAction(event5->{
            
                name = tf.getText();
                password = tf2.getText();
                    LogIn lg = new LogIn(name, password);   
                lg.setUsername(name);
                lg.setPassword(password);
             
                try {
                    if(la.isLoggedIn(name, password) == true){
                            gp.getChildren().clear();
                            if(la.isAdmin(name, password) == true){
                            gp.setAlignment(Pos.TOP_LEFT);
                            JOptionPane.showMessageDialog(null, "El usuario ha sido encontrado y es administrador");
                            
                            MenuBar mb = new  MenuBar();
                            Menu m = new Menu("Opciones de administrador");
                            MenuItem m_add = new MenuItem("Agregar");
                            m_add.setOnAction(ev->{
                            Button btnAdd = new Button("Agregar Empleado");
                                gp.add(btnAdd, 1, 2);
                                btnAdd.setStyle("-fx-background-color: GREY;");
                                btnAdd.setFont(Font.font("Cambria", 15));

                                //Actions
                                btnAdd.setOnAction(event -> {
                                    gp.getChildren().clear();

                                    Label lbAddU = new Label("Ingrese su ID");
                                    lbAddU.setTextFill(Color.WHITE);
                                    lbAddU.setFont(new Font("Cambria", 15));
                                    gp.add(lbAddU, 1, 1);

                                    Label lbAddP = new Label("Ingrese Nombre");
                                    lbAddP.setTextFill(Color.WHITE);
                                    lbAddP.setFont(new Font("Cambria", 15));
                                    gp.add(lbAddP, 1, 2);
                                    
                                    Label lb3 = new Label("Ingrese Apellido");
                                    lb3.setTextFill(Color.WHITE);
                                    lb3.setFont(new Font("Cambria", 15));
                                    gp.add(lb3, 1, 3);
                                    
                                    Label lb4 = new Label("Ingrese el puesto");
                                    lb4.setTextFill(Color.WHITE);
                                    lb4.setFont(new Font("Cambria", 15));
                                    gp.add(lb4, 1, 4);
                                    
                                    Label lb5 = new Label("Ingrese genero");
                                    lb5.setTextFill(Color.WHITE);
                                    lb5.setFont(new Font("Cambria", 15));
                                    gp.add(lb5, 1, 5);
                                    
                                    Label lb6 = new Label("Ingrese numero telefonico");
                                    lb6.setTextFill(Color.WHITE);
                                    lb6.setFont(new Font("Cambria", 15));
                                    gp.add(lb6, 1, 6);
                                    
                                    Label lb7 = new Label("Ingrese su direccion");
                                    lb7.setTextFill(Color.WHITE);
                                    lb7.setFont(new Font("Cambria", 15));
                                    gp.add(lb7, 1, 7);
                                    
                                    Label lb8 = new Label("Ingrese fecha de nacimiento");
                                    lb8.setTextFill(Color.WHITE);
                                    lb8.setFont(new Font("Cambria", 15));
                                    gp.add(lb8, 1, 8);
                                    
                                    Label lb9 = new Label("Ingrese fecha en\n la que comenzo a trabajar");
                                    lb9.setTextFill(Color.WHITE);
                                    lb9.setFont(new Font("Cambria", 15));
                                    gp.add(lb9, 1, 9);
                                    
                                    Label lb10 = new Label("Ingrese fecha en\n la termina el contrato");
                                    lb10.setTextFill(Color.WHITE);
                                    lb10.setFont(new Font("Cambria", 15));
                                    gp.add(lb10, 1, 10);
                                    
                                    Label l4 = new Label();
                                    l4.setTextFill(Color.WHITE);
                                    l4.setFont(new Font("Cambria", 15));
                                    gp.add(l4, 2, 4);
                                    
                                    TextField t = new TextField();
                                    gp.add(t, 2, 1);
                                    
                                    TextField t2 = new TextField();
                                    gp.add(t2, 2, 2);
                                    
                                    TextField t3 = new TextField();
                                    gp.add(t3, 2, 3);
                                    
                                    TextField t4 = new TextField();
                                    gp.add(t4, 2, 4);
                                    
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
                                    
                                    Button b3 = new Button("Agregar empleado");
                                    gp.add(b3, 1,11);
                                    btn3.setStyle("-fx-background-color: GREY;");

                                    Button btnBack = new Button("Regresar al inicio");
                                    gp.add(btnBack, 1, 12);
                                    btnBack.setStyle("-fx-background-color: GREY;");

                                    btnBack.setOnAction(event3 -> {

                                        gp.getChildren().clear();
                                        gp.add(btnAdd, 1, 2);
                                        gp.add(mb, 1, 0);
                                        gp.add(btnBack, 0, 0);

                                    });
                                    //ACA MAU
                                    b3.setOnAction(ev4 -> {
                                        if (!t.getText().equals("") && !t2.getText().equals("") && !t3.getText().equals("") && !t4.getText().equals("")
                                                && !t5.getText().equals("") && !t6.getText().equals("") && !t7.getText().equals("") && !d1.getValue().equals("")
                                                && !d2.getValue().equals("") && !d3.getValue().equals("")) {
                                            try {
                                                if (la.createUser(t.getText(), t2.getText(), t3.getText(), t4.getText(), t5.getText(), 
                                                    t6.getText(), t7.getText(), d1.getValue(), d2.getValue(), d3.getValue()) == true) {
                                                    t.clear();
                                                    t2.clear();
                                                    t3.clear();
                                                    t4.clear();
                                                    t5.clear();
                                                    t6.clear();
                                                    t7.clear();
                                                    d1.setValue(null);
                                                    d2.setValue(null);
                                                    d3.setValue(null);
                                                    l4.setText("Usuario creado");
                                                    gp.add(l4, 1, 13);
                                                }//end if
                                                else {
                                                    t.clear();
                                                    t2.clear();
                                                    t3.clear();
                                                    t4.clear();
                                                    t5.clear();
                                                    t6.clear();
                                                    t7.clear();
                                                    d1.setValue(null);
                                                    d2.setValue(null);
                                                    d3.setValue(null);
                                                    l4.setText("El usuario ya existe");
                                                    gp.add(l4, 1, 13);
                                                }//end else

                                            } catch (FileNotFoundException ex) {
                                                Logger.getLogger(QuickGUI.class.getName()).log(Level.SEVERE, null, ex);
                                            } catch (IOException ex) {
                                                Logger.getLogger(QuickGUI.class.getName()).log(Level.SEVERE, null, ex);
                                            }//end catch
                                        }//end if
                                        else {
                                            l4.setText("Los campos no pueden estar vacios");

                                        }//end else 
                                    });//end event2
                                });//end event AddUser
                            
                            });
                            
                            
                            MenuItem m_delete = new MenuItem("Eliminar");
                            MenuItem m_modify = new MenuItem("Modificar");
                            Button btnBack=new Button("Regresar al inicio");
                            m.getItems().addAll(m_add, m_delete, m_modify);
                            mb.getMenus().add(m);
                            mb.setStyle("-fx-background-color: GREY;");
                            
                            gp.add(mb, 1,0);
                            gp.add(btnBack,0,0);
                            btnBack.setOnAction(event3->{
                        
                            gp.getChildren().clear();
                            gp.setVgap(10);
                            gp.setHgap(10);
                            gp.setAlignment(Pos.TOP_CENTER);
                            gp.add(LWelcome, 1, 0);
                            gp.add(btnLogIn, 1, 1);
                            
                        
                    });
                            }else {
                            gp.setAlignment(Pos.TOP_LEFT);
                            JOptionPane.showMessageDialog(null, "El usuario ha sido encontrado y es cliente");
                            Button b2 = new Button ("Ver informacion:");
                            Button btnBack=new Button("Regresar al inicio");
                            gp.add(b2, 1, 0);
                            gp.add(btnBack,0,0);
                             btnBack.setOnAction(event3->{
                        
                            gp.getChildren().clear();
                            gp.setAlignment(Pos.TOP_CENTER);
                            gp.setVgap(10);
                            gp.setHgap(10);
                            gp.add(LWelcome, 1, 0);
                            gp.add(btnLogIn, 1, 1);
                        
                    });
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "No se encontró este usuario");
                    }
                } catch (IOException ex) {
                    Logger.getLogger(QuickGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            });
        });//End Action LogIn
        
        
    return gp;
    }
    
}
