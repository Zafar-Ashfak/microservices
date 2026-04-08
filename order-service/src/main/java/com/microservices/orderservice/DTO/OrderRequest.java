package com.microservices.orderservice.DTO;

import com.microservices.orderservice.model.OrderLineItems;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderRequest {
    private List<OrderLineItemsDto> orderLineItemsDtoList;
}
