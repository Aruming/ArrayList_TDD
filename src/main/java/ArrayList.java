public class ArrayList {
    int size;
    int[] data;
    int lastIndex;

    public ArrayList(){
        size = 0;
        data = new int[2];
    }
    public int size() {
        return size;
    }

    public void add(int i) {
        sizeUpIfFull();
        
        data[size] = i;
        size++;
    }

    private void sizeUpIfFull() {
        if(isFull())
            sizeUP();
    }

    private void sizeUP() {
        int[] newData = new int[data.length*2];

        for(int i=0;i<data.length;i++){
            newData[i] = data[i];
        }
        data = newData;
    }

    private boolean isFull() {
        return data.length==size;
    }

    public int get(int index) {
        return data[index];
    }


    public void removeAt(int index) {
        data[index] = 0;
    }
}
