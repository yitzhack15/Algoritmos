/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Yitzhack
 */
public class LogInAction {
    
    public boolean isAdmin (String user, String password) throws IOException{
        BufferedReader br = getBufferedReader();
        String Acounts = "";
        String AcFind = user + ":" + password;
        String admin1 = "Yitzhack:12345";
        String admin2 = "Mauricio:12345";
        String admin3 = "Kevin:12345";
        
        
        while (Acounts != null) {
            Acounts = br.readLine();
            if (Acounts == null) {
                return false;
            }
            if (admin1.equals(AcFind) || admin2.equals(AcFind) || admin3.equals(AcFind) ) {
                return true;
            }
        }//end while
        return true;
    }
    
    public boolean isLoggedIn (String user, String password) throws IOException{
        BufferedReader br= getBufferedReader();
        String Acounts="";
        String AcFind=user+":"+password;
        
        while (Acounts!=null) {
            Acounts= br.readLine();
            if(Acounts==null)
                return false;
            if(Acounts.equals(AcFind)){
                System.out.println(Acounts);
                return true;
                }
        }//end while
    
        return false;
    }
    
    public boolean createUser (String id, String name, String lastname, String title, String gender,
            String phone, String address, LocalDate dateB, LocalDate datecontD, LocalDate dateEnd) throws FileNotFoundException{
        
        Employee e = new Employee(id, name, lastname, title, gender, phone, address, dateB, datecontD, dateEnd);
        
        File f2 = new File ("empleados.txt");
        FileOutputStream fos= new FileOutputStream(f2, true);
        PrintStream ps=new PrintStream(fos);
        
        if(!e.getId().equals("") && !e.getFirstname().equals("") && !e.getLastname().equals("") && !e.getTitle().equals("")&& !e.getGender().equals("")
                && !e.getPhone().equals("") && !e.getAddress().equals("") && !e.getBirthday().equals("") && !e.getContractStartDate().equals("") 
                && !e.getContractEndDate().equals("")){
            ps.println(e.getId()+":"+e.getLastname()+":"+e.getFirstname()+":"+e.getTitle()+":"+e.getGender()+":"+e.getPhone()+":"+e.getAddress()
            +":"+e.getBirthday().toString()+":"+e.getContractStartDate().toString()+":"+e.getContractEndDate().toString());
        return true;
        }else
        return false;
        }
    
    public String reportAcounts() {

        BufferedReader br = getBufferedReader();
        String AcountList = "";

        try {
            String Acount = "";

            while (Acount != null) {
                Acount = br.readLine();
                if (Acount != null) {
                    AcountList += Acount.substring(0, Acount.indexOf(":") ) + "\n";
                }
            }//end while
        }//end try
        
        catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Problemas con el archivo" + ioe);
        }//end catch
        
        return AcountList;
    }// end  report acount()
    
    public BufferedReader getBufferedReader(){
        
         File f = new File("usuarios.txt");
         BufferedReader br = null;

         try {
             FileInputStream fis = new FileInputStream(f);
             InputStreamReader isr = new InputStreamReader(fis);
             br = new BufferedReader(isr);
         }//end try
         catch (FileNotFoundException fnfe) {
             JOptionPane.showMessageDialog(null, "Problemas con el archivo" + fnfe);
         }//catch
         
    return br;
    }
    
    public SinglyLinkedList saveItems() throws IOException{
        SinglyLinkedList list = new SinglyLinkedList();
        File f = new File("empleados.txt");
        try {
             FileInputStream fis = new FileInputStream(f);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr);
             String accounts = "";
             while(accounts != null){
                 accounts = br.readLine();
                 list.add(accounts);
             }
         }//end try
         catch (FileNotFoundException fnfe) {
             JOptionPane.showMessageDialog(null, "Problemas con el archivo" + fnfe);
         }
        return list;
    }
    
}
