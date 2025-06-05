package com.ecoshop.common.exception;

import com.ecoshop.common.enums.ResultEnum;

public class BsRuntimeException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public BsRuntimeException(String msg) {
        super(msg);
    }
    public BsRuntimeException(String f, Object... msg) {
        super(String.format(f, msg));
    }
    public BsRuntimeException(ResultEnum error) {
        super(error.getMessage());
    }

    public BsRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}
