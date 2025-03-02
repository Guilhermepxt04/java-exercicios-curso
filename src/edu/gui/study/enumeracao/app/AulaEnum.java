package edu.gui.study.enumeracao.app;

import edu.gui.study.enumeracao.entities.Order;
import edu.gui.study.enumeracao.entities.OrderStatus;
import java.util.Date;

public class AulaEnum {

    public static void main(String [] args) {

        Order order = new Order(1000, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }

}
