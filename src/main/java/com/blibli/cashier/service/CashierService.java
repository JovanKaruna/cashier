package com.blibli.cashier.service;

import com.blibli.cashier.controller.model.request.InsertOrderRequest;
import com.blibli.cashier.entity.OrderList;

import java.util.ArrayList;

public interface CashierService {
  public OrderList getOrderById(int id);
  public ArrayList<OrderList> getAllOrder();
  public boolean insertOrder(InsertOrderRequest orderRequest);
}
