package com.company.department.business.order.domain.repository;

import com.company.department.business.order.domain.model.Order;

/**
 * 订单资源库
 *
 * @author only
 * @since 2020-05-22
 */
public interface OrderRepository {
    void create(Order order);

    boolean enable(Order order);
}
