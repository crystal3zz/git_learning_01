import java.util.Collection;
import java.util.Map;

public class ArrayDelete {
    public static int[] delete(int[] a){
        int i=0;
        if(a.length==0)return a;
        for(int j=1;j<a.length;j++){
            if(a[j]!=a[i]){
                i++;
                a[i]=a[j];
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,3,4,4,5,5,6,6};
        a=delete(a);
        for(int n:a){
            System.out.println(n);
        }
    }
}
