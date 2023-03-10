package com.ssg.sausagecartsharecalculationapi.cartsharecal.dto.response;

import com.ssg.sausagecartsharecalculationapi.cartsharecal.entity.CalOptCd;
import com.ssg.sausagecartsharecalculationapi.cartsharecal.entity.CartShareCal;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;
import lombok.*;

@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(access = AccessLevel.PRIVATE)
public class CartShareCalFindResponse {

    @Schema(description = "공유장바구니 정산 ID")
    private Long cartShareCalId;

    @Schema(description = "공유장바구니 주문 ID")
    private Long cartShareOrdId;

    @Schema(description = "마스터여부")
    private boolean mastrYn;

    @Schema(description = "정산 시작 여부")
    private boolean calStYn;

    @Schema(description = "정산 옵션 코드")
    private CalOptCd calOptCd;

    @Schema(description = "정산 나머지")
    private int calRmd;

    @Schema(description = "정산 금액")
    private int calAmt;

    @Schema(description = "결제 금액")
    private int ttlPaymtAmt;

    private List<CartShareCalDtlFindInfo> cartShareCalDtlList;

    public static CartShareCalFindResponse of(CartShareCal cartShareCal,
            List<CartShareCalDtlFindInfo> cartShareCalDtList, Long mbrId) {
        return CartShareCalFindResponse.builder()
                .cartShareCalId(cartShareCal.getCartShareCalId())
                .cartShareOrdId(cartShareCal.getCartShareOrdId())
                .mastrYn(mbrId.equals(cartShareCal.getMastrMbrId()))
                .calStYn(cartShareCal.isCalStYn())
                .calOptCd(cartShareCal.getCalOptCd())
                .calRmd(cartShareCal.getCalRmd())
                .calAmt(cartShareCal.getCalAmt())
                .ttlPaymtAmt(cartShareCal.getTtlPaymtAmt())
                .cartShareCalDtlList(cartShareCalDtList)
                .build();
    }
}
