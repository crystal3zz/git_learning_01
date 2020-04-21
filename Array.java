public class Array {
    /**
     * 1) 数组的插入、删除、按照下标随机访问操作；
     * 2）数组中的数据是int类型的；
     * 3）作者：我
     */
    private int data[];
    private int n;
    private int count;

    public Array(int n){
        this.data=new int[n];
        this.n=n;
        this.count=0;
    }
    //根据下标访问元素
    public int find(int index){
        if(index<=n&&index>=0){
            return data[index];
        }
        return -1;
    }
    //在指定位置插入元素
    public boolean insert(int index,int num){
        if(count==n){
            System.out.println("数组已满，没有可插入位置");
            return false;
        }
        if(index<0||index>n){
            System.out.println("数组越界");
            return false;
        }
        for(int i=count;i>index;i--) {
            data[i]=data[i-1];
        }//插入操作时，把原本存在的元素向后移一位
        data[index]=num;
        ++count;
        return true;
    }
    //删除指定位置元素
    public boolean delete(int index){
        if(index<0||index>=count){
            return false;
        }
        for(int i=index+1;i<data.length;i++){
            data[i-1]=data[i];//把下标为index之后的每一个元素向前移一位
        }
        count--;
        return true;
    }
    //打印数组
    public void printAll(){
        for(int i=0;i<data.length;i++){
            System.out.println(data[i]+" ");

        }
    }

    public static void main(String[] args) {
        Array array=new Array(3);
        array.printAll();
        array.insert(0,1);
        array.insert(1,10);
        array.insert(2,20);
        array.printAll();
        array.delete(0);
        array.printAll();
    }
}

