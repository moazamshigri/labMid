package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiscountServiceTest {

    @Test
    public void validCouponShouldGiveTenPercentDiscount() {

        Order order = new Order(1000);
        Coupon coupon = new Coupon("SAVE10");

        DiscountService service = new DiscountService();

        double discount =
                service.applyCoupon(order, coupon);

        assertEquals(100, discount);
    }

    @Test
    public void invalidCouponShouldGiveZeroDiscount() {

        Order order = new Order(1000);
        Coupon coupon = new Coupon("ABC");

        DiscountService service = new DiscountService();

        double discount =
                service.applyCoupon(order, coupon);

        assertEquals(0, discount);
    }
}