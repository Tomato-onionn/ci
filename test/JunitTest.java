import static org.junit.Assert.assertEquals;
import org.junit.Test;

import taxcalculate.TaxCalculator;

public class JunitTest {

    // Constructor công khai mặc định
    public JunitTest() {
        // Có thể để trống hoặc thêm mã khởi tạo nếu cần
    }



    @Test
    public void UTC01() {
        assertEquals(12000000, TaxCalculator.fncPersonalIncomeTax(100000000,10000000, 2),0.00001f);
    }
    @Test
    public void UTC02() {
        assertEquals(4750000, TaxCalculator.fncPersonalIncomeTax(100000000,40000000, 4),0.00001f);
    }
//    @Test
//    public void UTC03() {
//        assertEquals(15850000, TaxCalculator.fncPersonalIncomeTax(150000000,10000000, 6),0.1f);
//    }
//    @Test
//    public void UTC04() {
//        assertEquals(1200000, TaxCalculator.fncPersonalIncomeTax(50000000,20000000, 2),0.1f);
//    }
    @Test
    public void UTC05() {
        assertEquals(550000, TaxCalculator.fncPersonalIncomeTax(30000000,5000000, 2),0.00001f);
    }
    @Test
    public void UTC06() {
        assertEquals(200000, TaxCalculator.fncPersonalIncomeTax(20000000,3000000, 1),0.00001f);
    }
    @Test
    public void UTC07() {
        assertEquals(0, TaxCalculator.fncPersonalIncomeTax(10000000,2000000, 5),0.00001f);
    }
    @Test
    public void UTC08() {
        assertEquals(-1, TaxCalculator.fncPersonalIncomeTax(8000000,1000000, -1),0.00001f);
    }
    @Test
    public void UTC09() {
        assertEquals(-1, TaxCalculator.fncPersonalIncomeTax(50000000,-1, 0),0.00001f);
    }@Test
    public void UTC010() {
        assertEquals(-1, TaxCalculator.fncPersonalIncomeTax(-1,0, 0),0.00001f);
    }
}
