public class GenericStacks<E> {
    private int size;
    public static final int defaultIntialCapacity = 10;
    private Array[] array;

    public GenericStacks(){
        this(defaultIntialCapacity);
    }

    public GenericStacks(int initialCapacity){
        if (initialCapacity <= 0){
            throw new IllegalArgumentException("")
        }
    }
    

    public int getSize(){
        return size;
    }

    public E peek(){
        return list.get(getSize()-1);
    }

    public void push(E o){
        list.add(o);
    }

    public E pop(){
        E o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    @Override
    public String toString(){
        return "stack:" + list.toString();
    }
}
