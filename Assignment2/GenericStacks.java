import java.lang.reflect.Array;

public class GenericStacks<E> {
    private int size;
    public static final int defaultIntialCapacity = 10;
    private Array[] array;

    public GenericStacks(){
        this(defaultIntialCapacity);
    }

    public GenericStacks(int initialCapacity){
        if (initialCapacity <= 0){
            throw new IllegalArgumentException("The initial input must be greater than 0.");
        }
        array = new Array[initialCapacity];
        size = 0;
    }
    
    public int getSize(){
        return size;
    }

    public E peek(){
        if (isEmpty()){
            throw new IllegalArgumentException("This stack is empty.");
        }
        return (E) array[size - 1];
    }

    public void push(E o){
        capacity();
        array[size++] = (java.lang.reflect.Array) o;
    }

    public E pop(){
        if (isEmpty()){
            throw new IllegalStateException("This stack is empty.");
        }
        E o = (E) array[--size];
        array[size] = null;
        return o;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public String toString(){
        StringBuilder buildsString = new StringBuilder("Stack start up: [");
            for (int i = 0; i < size; i++){
                buildsString.append(array[i]);
                if (i < size -1){
                    buildsString.append(", ");
                }
            }
        buildsString.append("]");
        return buildsString.toString();
    }

    private void capacity(){
        if (size == array.length){
            int newCapacity = array.length * 2;
            array = Array(array, newCapacity);
        }
    }

    private Array[] Array(Array[] array2, int newCapacity) {
        return null;
    }
}
