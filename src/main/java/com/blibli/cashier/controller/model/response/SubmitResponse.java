package com.blibli.cashier.controller.model.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SubmitResponse {
  private boolean success;
}
