package OptionalTHUCHANH2;

public class MyStack {
    private int arr[];
    private int size;
    private int index;

    public MyStack(int size) {
        this.size = size;
        arr = new int[this.size];
    }
    public void push(int element){
        if (isFull()){
            System.out.println("ko the them vao");
        } else {
            arr[index] = element;
            index++;
        }
    }

    public int pop(){
        if (isEmpty()){
            throw new StackOverflowError("Stack is full");
        }
            return arr[--index];
    }
     public int size(){
        return  this.size;
     }
      public boolean isEmpty(){
        if (index == 0){
            return true;
        }
        return false;
      }

      public boolean isFull(){
         if (index == size){
             return true;
         }
         return false;
      }
}
