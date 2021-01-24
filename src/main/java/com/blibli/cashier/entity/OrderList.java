package com.blibli.cashier.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;


@Data
@Builder
public class OrderList {
  private int id;
  private int totalPrice;
  private Customer customer;
  private ArrayList<OrderItem> orders;
}
