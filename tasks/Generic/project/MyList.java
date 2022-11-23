package tasks.Generic.project;
@SuppressWarnings("unchecked")
public class MyList<T> {

    int len =0;
    int capacity;
    public T[] arr;

    public MyList(){
        this(10);
    }

    public MyList(int capacity){
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
    }

    public int size() {
        return len;
    }

    public int getCapacity(){
        return capacity;
    }

    public void add(T data){

        if (len+1 >= capacity) {
            if (capacity == 0) {capacity += 1;}
            else {capacity *= 2;}
        }

        arr[len] = data;
        len++;
    }

    public T get(int index){

        if (index>capacity || index<0){
            return null;
        }

        return arr[index];
    }

    public T remove(int index){

        if (index>capacity || index<0){
            return null;
        }
        T pre_value = arr[index];
        arr[index] = null;
        for (int i=index; i<len; i++) {
            arr[index] = arr[index+1];
        }
        len--;
        return pre_value;
    }

    public T set(int index, T data){

        if (index>capacity || index<0){
            return null;
        }

        arr[index] = data;

        return arr[index];

    }

    public String toString() {
        System.out.print("[");
        for (T x: arr) {
            if (x!=null && x!=arr[len-1]){System.out.print(x + ", ");}
            else if (x==arr[len-1]) {
                System.out.print(arr[len-1]);
            }
        }
        System.out.print("]");


        return "";
    }

    public int indexOf(T data){
        int ind=0;
        boolean control= false;
        for (int i=0; i<len; i++){
            if (data == arr[i]){ind = i; control=true;}
        }
        if (!control){return -1;}
        return ind;
    }

    public int lastIndexOf(T data) {
        int ind = 0;
        boolean control= false;
        for (int i=0; i<len; i++){
            if (arr[i] == arr[i+1]){ind = i+1;}
            if (data == arr[i]){control = true;}
        }
        if (!control){return -1;}
        return ind;
    }

    public boolean isEmty() {
        return len == 0;
    }

    public void clear(){
        for (T x: arr) {
            x = null;
        }
        len=0;
    }

    public boolean contains(T data) {
        for (T x: arr) {
            if (data == x){return true;}
        }
        return false;
    }

    public T[] toArray() {
        Object[] new_array = new Object[len];
        for (int i=0; i<len; i++){
            new_array[i] = this.arr[i];
        }
        return (T[]) new_array;
    }

    public MyList<T> sublist(int start,int finish){
        MyList<T> sub = new MyList<>(finish-start+1);
        for (int i=start; i<=finish; i++){
            sub.add(arr[i]);
        }
        return sub;
    }


}
