/**
 *
 * @author nmanolov
 */

public class LinkedList<T> implements ILinkedList<T> {
    
    private LinkedList<T> next;
    private T value;
    
    public LinkedList(){
        this.next = null;
        this.value = null;
    }
    
    public LinkedList(T value){
        this.next = null;
        this.value = value;
    }
    
    @Override
    public ILinkedList<T> next() {
        
            return next;
    }

    @Override
    public ILinkedList last() {
        LinkedList<T> temp = this;
        while (temp.next != null) {
            temp = temp.next;
        }//while
        return temp;
    }

    @Override
    public ILinkedList after(int n) {
        ILinkedList<T> tmp = this;
        if(tmp != null){
        for(int i = 0; i < n; i++){
            tmp = this.next();
        }
        
        }
        return tmp;
    }

    @Override
    public ILinkedList detach() {
        LinkedList<T> tmp1;
        LinkedList<T> tmp2;
        tmp1 = this;
        tmp2 = this.next;
        
        return tmp1;
    }
    
    /**
     * Gets the current value
     * @return the current value
     */
    @Override
    public T get(){ 
     return this.value;  
    }

     /**
     * Sets the value of this node
     * @param value the new value
     */
    @Override
    public void set(T value) {
        this.value = value;
    }
    
    /**
     * Sets the next element in the list
     * @param next the next element
	 *
	 * Example: (1->2->3).setNext(4) => 1->4
     */
    @Override
    public void setNext(ILinkedList next) {
        
        this.next = (LinkedList<T>) next; 
        
    }

    @Override
    public void append(ILinkedList next) {
        
     this.next = (LinkedList<T>) next;
        next.last();
     
    }
     /**
     * Adds the current list as the next of newFirst
     * @param newFirst the new head of the list
	 *
	 * Example: (1->2->3).insert(4) => 4->1->2->3
     */
    @Override
    public void insert(ILinkedList newFirst) {
        LinkedList<T> tmp = this;
        LinkedList<T> tmp2 = (LinkedList<T>) newFirst;
        
        tmp2.next = tmp;
        
    }
    
}//class
