-- ===============================
-- 支付模块（pay_）
-- ===============================

-- 1. 支付渠道表
CREATE TABLE pay_channel (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    name VARCHAR(50) NOT NULL COMMENT '渠道名称',
    code VARCHAR(50) NOT NULL COMMENT '渠道编码',
    merchant_id VARCHAR(100) DEFAULT NULL COMMENT '商户号',
    app_id VARCHAR(100) DEFAULT NULL COMMENT '应用ID',
    app_secret VARCHAR(100) DEFAULT NULL COMMENT '应用密钥',
    public_key TEXT DEFAULT NULL COMMENT '公钥',
    private_key TEXT DEFAULT NULL COMMENT '私钥',
    notify_url VARCHAR(255) DEFAULT NULL COMMENT '回调地址',
    return_url VARCHAR(255) DEFAULT NULL COMMENT '返回地址',
    status TINYINT DEFAULT 1 COMMENT '状态(1:正常,0:禁用)',
    remark VARCHAR(200) DEFAULT NULL COMMENT '备注',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='支付渠道表';

-- 2. 支付订单表
CREATE TABLE pay_order (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    pay_no VARCHAR(50) NOT NULL COMMENT '支付单号',
    order_id BIGINT NOT NULL COMMENT '订单ID',
    order_no VARCHAR(50) NOT NULL COMMENT '订单编号',
    member_id BIGINT NOT NULL COMMENT '会员ID',
    channel_id BIGINT NOT NULL COMMENT '支付渠道ID',
    amount DECIMAL(10,2) NOT NULL COMMENT '支付金额',
    status VARCHAR(20) DEFAULT '待支付' COMMENT '支付状态(待支付/支付中/支付成功/支付失败/已关闭/已退款)',
    trade_no VARCHAR(100) DEFAULT NULL COMMENT '交易号',
    trade_status VARCHAR(100) DEFAULT NULL COMMENT '交易状态',
    pay_time DATETIME DEFAULT NULL COMMENT '支付时间',
    expire_time DATETIME DEFAULT NULL COMMENT '过期时间',
    success_time DATETIME DEFAULT NULL COMMENT '支付成功时间',
    close_time DATETIME DEFAULT NULL COMMENT '关闭时间',
    close_reason VARCHAR(200) DEFAULT NULL COMMENT '关闭原因',
    notify_time DATETIME DEFAULT NULL COMMENT '通知时间',
    notify_status TINYINT DEFAULT 0 COMMENT '通知状态(0:未通知,1:通知成功,2:通知失败)',
    notify_count INT DEFAULT 0 COMMENT '通知次数',
    last_notify_time DATETIME DEFAULT NULL COMMENT '最后通知时间',
    client_ip VARCHAR(50) DEFAULT NULL COMMENT '客户端IP',
    device_type VARCHAR(20) DEFAULT NULL COMMENT '设备类型',
    remark VARCHAR(200) DEFAULT NULL COMMENT '备注',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='支付订单表';

-- 3. 退款订单表
CREATE TABLE pay_refund (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    refund_no VARCHAR(50) NOT NULL COMMENT '退款单号',
    pay_order_id BIGINT NOT NULL COMMENT '支付订单ID',
    pay_no VARCHAR(50) NOT NULL COMMENT '支付单号',
    order_id BIGINT NOT NULL COMMENT '订单ID',
    order_no VARCHAR(50) NOT NULL COMMENT '订单编号',
    member_id BIGINT NOT NULL COMMENT '会员ID',
    channel_id BIGINT NOT NULL COMMENT '支付渠道ID',
    amount DECIMAL(10,2) NOT NULL COMMENT '退款金额',
    reason VARCHAR(200) DEFAULT NULL COMMENT '退款原因',
    status VARCHAR(20) DEFAULT '待退款' COMMENT '退款状态(待退款/退款中/退款成功/退款失败)',
    trade_no VARCHAR(100) DEFAULT NULL COMMENT '交易号',
    trade_status VARCHAR(100) DEFAULT NULL COMMENT '交易状态',
    success_time DATETIME DEFAULT NULL COMMENT '退款成功时间',
    notify_time DATETIME DEFAULT NULL COMMENT '通知时间',
    notify_status TINYINT DEFAULT 0 COMMENT '通知状态(0:未通知,1:通知成功,2:通知失败)',
    notify_count INT DEFAULT 0 COMMENT '通知次数',
    last_notify_time DATETIME DEFAULT NULL COMMENT '最后通知时间',
    remark VARCHAR(200) DEFAULT NULL COMMENT '备注',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='退款订单表';

-- 4. 支付通知记录表
CREATE TABLE pay_notify_log (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    pay_order_id BIGINT DEFAULT NULL COMMENT '支付订单ID',
    refund_order_id BIGINT DEFAULT NULL COMMENT '退款订单ID',
    type VARCHAR(20) NOT NULL COMMENT '通知类型(支付/退款)',
    request_params TEXT DEFAULT NULL COMMENT '请求参数',
    response_params TEXT DEFAULT NULL COMMENT '响应参数',
    execute_status TINYINT DEFAULT 0 COMMENT '执行状态(0:失败,1:成功)',
    execute_msg VARCHAR(500) DEFAULT NULL COMMENT '执行消息',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='支付通知记录表'; 