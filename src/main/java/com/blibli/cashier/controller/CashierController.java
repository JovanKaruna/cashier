package com.blibli.cashier.controller;

import com.blibli.cashier.controller.model.request.InsertOrderRequest;
import com.blibli.cashier.controller.model.response.SubmitResponse;
import com.blibli.cashier.entity.OrderList;
import com.blibli.cashier.service.impl.CashierServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CashierController {

  @Autowired
  private CashierServiceImpl cashierService;

  @GetMapping(value = "/orders/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
  public OrderList getOrderById (@PathVariable int id) {
    return cashierService.getOrderById(id);
  }

  @GetMapping(value = "/orders", produces = MediaType.APPLICATION_JSON_VALUE)
  public ArrayList<OrderList> getAllOrder () {
    return cashierService.getAllOrder();
  }

  @PostMapping(value = "/orders")
  public SubmitResponse submitOrder (
          @RequestBody InsertOrderRequest orderRequest) {
    boolean isSuccess = cashierService.insertOrder(orderRequest);
    return SubmitResponse.builder().success(isSuccess).build();
  }
}
