package com.blibli.cashier.entity;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class OrderItem {
  private int hargaProduk;
  private int jumlahProduk;
  private String namaProduk;
  private int orderItemId;
}
