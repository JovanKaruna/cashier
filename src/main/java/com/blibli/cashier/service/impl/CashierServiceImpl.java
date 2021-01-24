package com.blibli.cashier.service.impl;

import com.blibli.cashier.controller.model.request.InsertOrderRequest;
import com.blibli.cashier.controller.model.request.OrderItemRequest;
import com.blibli.cashier.entity.OrderItem;
import com.blibli.cashier.entity.OrderList;
import com.blibli.cashier.service.CashierService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CashierServiceImpl implements CashierService {

  private int idOrder = 0;
  private ArrayList<OrderList> listOfOrder= new ArrayList<OrderList>();

  @Override
  public OrderList getOrderById(int id) {
    OrderList order = null;
    try{
      order = listOfOrder.get(id);
    }catch(Exception e){
    }
    return order;
  }

  @Override
  public ArrayList<OrderList> getAllOrder() {
    return listOfOrder;
  }

  @Override
  public boolean insertOrder(InsertOrderRequest orderRequest) {
    ArrayList<OrderItem> listOfOrderItem= new ArrayList<OrderItem>();
    int itemId=0;
    try{
      for (OrderItemRequest order: orderRequest.getOrders()) {
          OrderItem newOrderItem = OrderItem.builder().namaProduk(order.getNamaProduk()).hargaProduk(order.getHargaProduk()).jumlahProduk(order.getJumlahProduk()).orderItemId(itemId++).build();
          listOfOrderItem.add(newOrderItem);
      }
      OrderList order = OrderList.builder().id(idOrder++).customer(orderRequest.getCustomer()).totalPrice(getTotalPrice(listOfOrderItem)).orders(listOfOrderItem).build();
      listOfOrder.add(order);
      return true;
    }catch (Exception e){
      return false;
    }
  }

  public int getTotalPrice(ArrayList<OrderItem> orders) {
    int total=0;
    for (OrderItem order: orders) {
      total += order.getHargaProduk() * order.getJumlahProduk();
    }
    return total;
  }
}
