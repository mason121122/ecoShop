package com.ecoshop.dao.po.result;

import lombok.Data;
import lombok.NoArgsConstructor;



/**
 * @author Mark Wang
 * @date 2021/10/01
 */
@NoArgsConstructor
@Data
public class ReturnResult<T> {

    

    private int status;
    private String message;
    private T data;

    public ReturnResult(int status) {
        this(status, null);
    }

    public ReturnResult(int status, String message) {
        this(status, message, null);
    }

    public ReturnResult(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

}
