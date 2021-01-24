package com.blibli.cashier.controller.model.request;

import com.blibli.cashier.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InsertOrderRequest {
    private Customer customer;
    private ArrayList<OrderItemRequest> orders;
}
