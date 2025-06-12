package com.ecoShop.api;

import com.ecoShop.api.fallback.SecurityServiceFallback;
import com.ecoshop.support.ReturnResult;
import io.swagger.annotations.ApiParam;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "security-service", fallback = SecurityServiceFallback.class)
public interface SecurityServiceClient {
    @GetMapping("/security/verify-permission/{token}/{url}")
    ReturnResult<?> verifyPermission(@ApiParam(value = "token", required = false) @RequestParam(value = "token", required = false) String token,
                                     @ApiParam(value = "url", required = false) @RequestParam(value = "url", required = false) String url);
}
