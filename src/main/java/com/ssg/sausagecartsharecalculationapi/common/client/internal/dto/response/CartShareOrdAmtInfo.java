package com.ssg.sausagecartsharecalculationapi.common.client.internal.dto.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class CartShareOrdAmtInfo {

    private Long mbrId;

    private int ordAmt;

}
