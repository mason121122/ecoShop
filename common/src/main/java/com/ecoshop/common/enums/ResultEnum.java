package com.ecoshop.common.enums;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author Vance
 * @date 2021/9/30
 */
public enum ResultEnum {

    SUCCESS(200, "SUCCESS", "成功"),
    LOGIN_ERR(401, "LOGIN_ERR", "登入失败"),
    PATH_NOT_FOUND(404, "PATH_NOT_FOUND", "请求地址不存在"),

    UNKNOWN(-1, "UNKNOWN", "未定义错误"),

    /**
     * 业务错误5xxx
     */
    SYS_ERROR(5000, "SYS_ERROR", "[系统异常]"),
    NOT_FOUND(5001, "NOT_FOUND", "数据未找到"),
    ADD_FAIL(5002, "ADD_FAIL", "数据添加失败"),
    SYSTEM_IS_BUSY(5003, "SYSTEM_IS_BUSY", "亲您操作的太快了，请稍后再试"),
    SYSTEM_DB_VERSION_ERROR(5004, "SYSTEM_DB_VERSION_ERROR", "系统繁忙，请稍后再试"),
    EMAIL_ERROR(5005,"EMAIL_ERROR","邮箱格式不正确"),
    STATUS_IS_NOTNULL_ERROR(5005,"STATUS_IS_NOTNULL_ERROR","状态不能为空"),
    PHONE_ERROR(5006,"PHONE_ERROR","手机号格式不正确"),

    USERNAME_IS_NOTNULL(5007,"USERNAME_IS_NOTNULL","用户名不能为空"),

    USERNAME_LENGTH_ERROR(5008,"USERNAME_LENGTH_ERROR","用户名长度不能超过50"),

    PASSWORD_LENGTH_ERROR(5009,"PASSWORD_LENGTH_ERROR","密码长度不能超过18"),
    REAL_NAME_IS_NOTNULL(5010,"REAL_NAME_IS_NOTNULL","姓名不能为空"),

    REAL_NAME_LENGTH_ERROR(5011,"REAL_NAME_LENGTH_ERROR","姓名长度不能超过50"),

    TENANT_NAME_IS_NOTNULL(5012,"TENANT_NAME_IS_NOTNULL","租户名不能为空"),

    TENANT_NAME_LENGTH_ERROR(5013,"TENANT_NAME_LENGTH_ERROR","租户名长度不能超过50"),

    CONTACT_NAME_IS_NOTNULL(5014,"CONTACT_NAME_IS_NOTNULL","联系人不能为空"),

    PHONE_IS_NOTNULL(5015,"PHONE_IS_NOTNULL","手机号格式不正确"),

    USERNAME_REPETITION(5016,"USERNAME_REPETITION","用户名已存在"),


    ;

    private int code;
    private String message;
    private String desc;
    ResultEnum(int code, String message, String desc) {
        this.code = code;
        this.message = message;
        this.desc = desc;
    }

    public static ResultEnum valueOf(int code) {
        ResultEnum[] enums = values();
        if (enums.length == 0) {
            return UNKNOWN;
        }
        for (ResultEnum e : enums) {
            if (e.getCode() == code) {
                return e;
            }
        }
        return UNKNOWN;
    }

    public static ResultEnum getByMsg(String message) {
        ResultEnum[] enums = values();
        for (ResultEnum e : enums) {
            if (StringUtils.equals(e.getMessage(), message)) {
                return e;
            }
        }
        return UNKNOWN;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        try {
            return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                    .append("code", code)
                    .append("message", message)
                    .append("desc", desc)
                    .toString();
        } catch (Exception e) {
            // NOTICE: 这样做的目的是避免由于toString()的异常导致系统异常终止
            // 大部分情况下，toString()用在日志输出等调试场景
            return super.toString();
        }
    }
}
