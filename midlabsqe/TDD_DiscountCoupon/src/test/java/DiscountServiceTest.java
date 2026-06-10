import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiscountServiceTest {

    @Test
    public void validCouponShouldGiveTenPercentDiscount() {
        Coupon service = new Coupon();

        double discount = service.applyCoupon(1000, "SAVE10");

        assertEquals(100, discount);
    }

    @Test
    public void invalidCouponShouldGiveZeroDiscount() {
        Coupon service = new Coupon();

        double discount = service.applyCoupon(1000, "ABC");

        assertEquals(0, discount);
    }
}