package com.ssg.sausagecartsharecalculationapi.cartsharecal.dto.request;


import com.ssg.sausagecartsharecalculationapi.common.kafka.dto.CartShareCalRetryDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Set;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class CartShareCalSaveRequest {

    @Schema(description = "공유장바구니 주문 ID")
    private Long cartShareOrdId;

    @Schema(description = "공유장바구니 ID")
    private Long cartShareId;

    @Schema(description = "마스터멤버 ID")
    private Long mastrMbrId;

    @Schema(description = "공유장바구니 이름")
    private String cartShareNm;

    @Schema(description = "공유장바구니 주문 번호")
    private String cartShareOrdNo;

    @Schema(description = "공유장바구니멤버 ID")
    private Set<Long> mbrIdList;

    @Schema(description = "전체결제금액")
    private int ttlPaymtAmt;

    public static CartShareCalSaveRequest of(CartShareCalRetryDto cartShareCalRetryDto){
        return CartShareCalSaveRequest.builder()
                .cartShareOrdId(cartShareCalRetryDto.getCartShareOrdId())
                .cartShareId(cartShareCalRetryDto.getCartShareId())
                .mastrMbrId(cartShareCalRetryDto.getMastrMbrId())
                .cartShareNm(cartShareCalRetryDto.getCartShareNm())
                .cartShareOrdNo(cartShareCalRetryDto.getCartShareOrdNo())
                .mbrIdList(cartShareCalRetryDto.getMbrIdList())
                .ttlPaymtAmt(cartShareCalRetryDto.getTtlPaymtAmt())
                .build();
    }

}
