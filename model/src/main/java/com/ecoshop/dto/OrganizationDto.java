package com.ecoshop.dto;

import com.ecoshop.vo.sys.request.OrganizationReqVo;
import com.ecoshop.vo.sys.request.PositionReqVo;
import lombok.Data;

@Data
public class OrganizationDto {
    private OrganizationReqVo organizationReqVo;
    private PositionReqVo positionReqVo;

}
