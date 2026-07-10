class DynamicArray {

    private int[] array;
    private int capacity;
    private int size;

    public DynamicArray(int capacity) {
        this.array = new int[capacity];
        this.capacity = capacity;
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
        array[i] = n;
    }

    public void pushback(int n) {
        if (size == capacity) {
            resize();
        }

        set(size, n);
        size++;
    }

    public int popback() {
        var value = array[size - 1];
        size--;
        return value;
    }

    private void resize() {
        capacity *= 2;
        var narray = new int[capacity];
        System.arraycopy(array, 0, narray, 0, size);
        array = narray;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
