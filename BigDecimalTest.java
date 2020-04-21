import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal b1=new BigDecimal("0.05");
        BigDecimal b2=new BigDecimal(0.05);
        BigDecimal b3=BigDecimal.valueOf(0.05);
        System.out.println(b1.add(b2));
        System.out.println(b1.add(b3).doubleValue());
        BigInteger bi=new BigInteger("1544564654654654646546546465");
    }
}
