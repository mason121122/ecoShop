package com.ecoShop.api.fallback;

import com.ecoShop.api.SecurityServiceClient;
import com.ecoshop.common.enums.ResultEnum;
import com.ecoshop.support.ReturnResult;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestParam;

public class SecurityServiceFallback implements SecurityServiceClient {
    @Override
    public ReturnResult<?> verifyPermission(@ApiParam(value = "token", required = false) @RequestParam(value = "token", required = false) String token,
                                            @ApiParam(value = "url", required = false) @RequestParam(value = "url", required = false) String url) {
        return new ReturnResult<>(ResultEnum.SYS_ERROR.getCode(),ResultEnum.SYS_ERROR.getDesc());
    }
}
