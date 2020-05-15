
package util;

import Logic.SinglyLinkedList;

import java.text.DecimalFormat;

public class Utility {
    
    public static int random(){
        return 1+(int) Math.floor(Math.random()*99); 
    }
    
    public static int random(int bound){
        //return 1+random.nextInt(bound);
        return 1+(int) Math.floor(Math.random()*bound); 
    }
    
    public static String format(double value){
        return new DecimalFormat("###,###,###,###.##")
                .format(value);
    }
    
    public static String $format(double value){
        return new DecimalFormat("$###,###,###,###.##")
                .format(value);
    }
     public static String perFormat(double value){
         //#,##0.00 '%'
        return new DecimalFormat("#,##0.00'%'")
                .format(value);
    }
    
    public static String hhmmss(long start, long end){
        long milisegundos = end - start;
        long hora = milisegundos/3600000;
        long restohora = milisegundos%3600000;
        long minuto = restohora/60000;
        long restominuto = restohora%60000;
        long segundo = restominuto/1000;
        long restosegundo = restominuto%1000;
        
        return hora + ":" + minuto + ":" + segundo + "." + restosegundo;
    }
    
    public static String instanceOf(Object a, Object b){
        if(a instanceof Integer&&b instanceof Integer) return "integer";
        if(a instanceof String&&b instanceof String) return "string";
        if(a instanceof Character&&b instanceof Character) return "character";
        if(a instanceof SinglyLinkedList&&b instanceof SinglyLinkedList) return "singlyLinkedList";
        //if(a instanceof Student&&b instanceof Student) return "student";
        return "unknown"; //desconocido
    }
    
    public static String instanceOf(Object a){
        if(a instanceof Integer) return "integer";
        if(a instanceof String) return "string";
        return "unknown"; //desconocido
    }
    
    public static boolean equals(Object a, Object b){
        switch(instanceOf(a, b)){
            case "integer":
                Integer x=(Integer) a; Integer y=(Integer) b;
                return x==y;
            case "string":
                String v=(String) a; String w=(String) b;
                return v.compareToIgnoreCase(w)==0;
            case "character":
                Character c=(Character) a; Character d=(Character) b;
                return c.compareTo(d)==0;
            case "singlyLinkedList":
                SinglyLinkedList s=(SinglyLinkedList)a; 
                SinglyLinkedList t=(SinglyLinkedList)b;
                return s.equals(t);
//            case "student":
//                Student p=(Student)a; Student q=(Student)b;
//                return p.equals(q);
        }
        return false; //en cualquier otro caso
    }
    
    //less than (menorQ)
    public static boolean lessT(Object a, Object b){
        switch(instanceOf(a, b)){
            case "integer":
                Integer x=(Integer) a; Integer y=(Integer) b;
                return x<y;
            case "string":
                String v=(String) a; String w=(String) b;
                return v.compareToIgnoreCase(w)<0;
        }
        return false; //en cualquier otro caso
    }
    
    //greater than (mayorQ)
    public static boolean greaterT(Object a, Object b){
        switch(instanceOf(a, b)){
            case "entero":
                Integer x=(Integer) a; Integer y=(Integer) b;
                return x>y;
            case "string":
                String v=(String) a; String w=(String) b;
                return v.compareToIgnoreCase(w)>0;
        }
        return false; //en cualquier otro caso
    }
    
    public static char randomAlphabet(){
        char alfabeto[] = new char[26] ;
        int cont=0;
        for(char i='a';i<='z';i++)
             alfabeto[cont++] = i; 
        return alfabeto[random(25)-1];
    }
    
    public static char randomCharacter(){
        return (char)(random(91) + 65);
    }
}
