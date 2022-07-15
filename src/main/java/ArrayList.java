public class ArrayList {
    int size;
    int[] data;

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
        for(int i=index;i<size;i++){
            data[i] = data[i+1];
        }
        size--;
    }

    public int getArrayLength() {
        return data.length;
    }

    public void showAllValues() {
        System.out.println("== 전체 데이터 출력 ==");

        for ( int i = 0; i < size; i++ ) {
            System.out.printf("%d : %d\n", i, data[i]);
        }
    }

    public void addAt(int index, int value) {
        sizeUpIfFull();

        for(int i=size-1; i>=index; i--){
            data[i+1] = data[i];
        }
        data[index] = value;
        size++;
    }
}
