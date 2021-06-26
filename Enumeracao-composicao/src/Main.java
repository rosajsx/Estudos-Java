import entities.Order;
import entities.OrderStatus;

import java.util.Date;

public class Main {
    public static void main(String[] args){

        // Por padrão no java, ele vai manter o nome da ENUM na string.
        Order order = new Order(1, new Date(), OrderStatus.PENDING_PAYMENT );

        System.out.println(order);

        // Conversão de string para ENUM
        OrderStatus os1 = OrderStatus.DELIVERED;

        // Ele encontra o tipo a partir da string
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);

    }
}
