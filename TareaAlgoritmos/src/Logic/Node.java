
package Logic;

public class Node {
    public Object data; //objeto almacenado
    public Node next; //apuntador al sgte nodo
    public Node prev; //apuntador al nodo anterior
    
    //Constructor
    public Node(Object data){
        this.data = data;
        this.next = this.prev = null;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    
}
