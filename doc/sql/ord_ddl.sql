-- ===============================
-- 订单模块（ord_）
-- ===============================

-- 1. 订单表
CREATE TABLE ord_order (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    order_no VARCHAR(50) NOT NULL COMMENT '订单编号',
    member_id BIGINT NOT NULL COMMENT '会员ID',
    total_amount DECIMAL(10,2) NOT NULL COMMENT '订单总金额',
    pay_amount DECIMAL(10,2) NOT NULL COMMENT '实付金额',
    freight_amount DECIMAL(10,2) DEFAULT 0.00 COMMENT '运费',
    discount_amount DECIMAL(10,2) DEFAULT 0.00 COMMENT '优惠金额',
    coupon_amount DECIMAL(10,2) DEFAULT 0.00 COMMENT '优惠券抵扣金额',
    points_amount DECIMAL(10,2) DEFAULT 0.00 COMMENT '积分抵扣金额',
    payment_type VARCHAR(20) DEFAULT NULL COMMENT '支付方式(微信/支付宝/银行卡)',
    payment_time DATETIME DEFAULT NULL COMMENT '支付时间',
    payment_serial_no VARCHAR(100) DEFAULT NULL COMMENT '支付流水号',
    status VARCHAR(20) NOT NULL DEFAULT '待付款' COMMENT '订单状态(待付款/已付款/已发货/已完成/已取消/已退款)',
    shipping_name VARCHAR(50) DEFAULT NULL COMMENT '收货人姓名',
    shipping_phone VARCHAR(20) DEFAULT NULL COMMENT '收货人电话',
    shipping_address VARCHAR(255) DEFAULT NULL COMMENT '收货地址',
    shipping_code VARCHAR(20) DEFAULT NULL COMMENT '物流单号',
    shipping_company VARCHAR(50) DEFAULT NULL COMMENT '物流公司',
    shipping_time DATETIME DEFAULT NULL COMMENT '发货时间',
    receive_time DATETIME DEFAULT NULL COMMENT '收货时间',
    close_time DATETIME DEFAULT NULL COMMENT '关闭时间',
    close_reason VARCHAR(200) DEFAULT NULL COMMENT '关闭原因',
    remark VARCHAR(200) DEFAULT NULL COMMENT '订单备注',
    source VARCHAR(20) DEFAULT 'PC' COMMENT '订单来源(PC/APP/小程序/H5)',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='订单表';

-- 2. 订单项表
CREATE TABLE ord_order_item (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    order_id BIGINT NOT NULL COMMENT '订单ID',
    order_no VARCHAR(50) NOT NULL COMMENT '订单编号',
    spu_id BIGINT NOT NULL COMMENT '商品ID',
    spu_name VARCHAR(200) NOT NULL COMMENT '商品名称',
    spu_image VARCHAR(255) DEFAULT NULL COMMENT '商品图片',
    sku_id BIGINT DEFAULT NULL COMMENT 'SKU ID',
    sku_code VARCHAR(50) DEFAULT NULL COMMENT 'SKU编码',
    sku_spec VARCHAR(500) DEFAULT NULL COMMENT 'SKU规格(JSON格式)',
    price DECIMAL(10,2) NOT NULL COMMENT '商品单价',
    quantity INT NOT NULL COMMENT '购买数量',
    total_amount DECIMAL(10,2) NOT NULL COMMENT '总金额',
    review_status TINYINT DEFAULT 0 COMMENT '评价状态(0:未评价,1:已评价)',
    after_sale_status VARCHAR(20) DEFAULT NULL COMMENT '售后状态(无售后/退款中/已退款/换货中/已换货)',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='订单项表';

-- 3. 购物车表
CREATE TABLE ord_cart (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    member_id BIGINT NOT NULL COMMENT '会员ID',
    spu_id BIGINT NOT NULL COMMENT '商品ID',
    spu_name VARCHAR(200) NOT NULL COMMENT '商品名称',
    spu_image VARCHAR(255) DEFAULT NULL COMMENT '商品图片',
    sku_id BIGINT DEFAULT NULL COMMENT 'SKU ID',
    sku_code VARCHAR(50) DEFAULT NULL COMMENT 'SKU编码',
    sku_spec VARCHAR(500) DEFAULT NULL COMMENT 'SKU规格(JSON格式)',
    price DECIMAL(10,2) NOT NULL COMMENT '商品单价',
    quantity INT NOT NULL DEFAULT 1 COMMENT '购买数量',
    checked TINYINT DEFAULT 1 COMMENT '是否选中(1:是,0:否)',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='购物车表';

-- 4. 支付记录表
CREATE TABLE ord_payment (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    order_id BIGINT NOT NULL COMMENT '订单ID',
    order_no VARCHAR(50) NOT NULL COMMENT '订单编号',
    member_id BIGINT NOT NULL COMMENT '会员ID',
    payment_type VARCHAR(20) NOT NULL COMMENT '支付方式(微信/支付宝/银行卡)',
    payment_serial_no VARCHAR(100) DEFAULT NULL COMMENT '支付流水号',
    trade_no VARCHAR(100) DEFAULT NULL COMMENT '交易号',
    amount DECIMAL(10,2) NOT NULL COMMENT '支付金额',
    status VARCHAR(20) DEFAULT '待支付' COMMENT '支付状态(待支付/支付成功/支付失败/已退款)',
    payment_time DATETIME DEFAULT NULL COMMENT '支付时间',
    callback_time DATETIME DEFAULT NULL COMMENT '回调时间',
    callback_content TEXT DEFAULT NULL COMMENT '回调内容',
    remark VARCHAR(200) DEFAULT NULL COMMENT '备注',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='支付记录表';

-- 5. 退款记录表
CREATE TABLE ord_refund (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    order_id BIGINT NOT NULL COMMENT '订单ID',
    order_no VARCHAR(50) NOT NULL COMMENT '订单编号',
    member_id BIGINT NOT NULL COMMENT '会员ID',
    refund_no VARCHAR(50) NOT NULL COMMENT '退款编号',
    payment_id BIGINT DEFAULT NULL COMMENT '支付记录ID',
    refund_amount DECIMAL(10,2) NOT NULL COMMENT '退款金额',
    reason VARCHAR(200) DEFAULT NULL COMMENT '退款原因',
    refund_type VARCHAR(20) DEFAULT NULL COMMENT '退款方式(原路退回/退到余额)',
    status VARCHAR(20) DEFAULT '待处理' COMMENT '退款状态(待处理/处理中/已退款/已拒绝)',
    refuse_reason VARCHAR(200) DEFAULT NULL COMMENT '拒绝原因',
    operator_id BIGINT DEFAULT NULL COMMENT '处理人ID',
    operator_name VARCHAR(50) DEFAULT NULL COMMENT '处理人名称',
    handle_time DATETIME DEFAULT NULL COMMENT '处理时间',
    refund_time DATETIME DEFAULT NULL COMMENT '退款时间',
    remark VARCHAR(200) DEFAULT NULL COMMENT '备注',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='退款记录表';

-- 6. 售后表
CREATE TABLE ord_after_sale (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    after_sale_no VARCHAR(50) NOT NULL COMMENT '售后编号',
    order_id BIGINT NOT NULL COMMENT '订单ID',
    order_no VARCHAR(50) NOT NULL COMMENT '订单编号',
    order_item_id BIGINT NOT NULL COMMENT '订单项ID',
    member_id BIGINT NOT NULL COMMENT '会员ID',
    spu_id BIGINT NOT NULL COMMENT '商品ID',
    spu_name VARCHAR(200) NOT NULL COMMENT '商品名称',
    sku_id BIGINT DEFAULT NULL COMMENT 'SKU ID',
    sku_spec VARCHAR(500) DEFAULT NULL COMMENT 'SKU规格',
    quantity INT NOT NULL COMMENT '数量',
    type VARCHAR(20) NOT NULL COMMENT '售后类型(退款/退货退款/换货)',
    reason VARCHAR(200) NOT NULL COMMENT '售后原因',
    description TEXT DEFAULT NULL COMMENT '问题描述',
    evidence TEXT DEFAULT NULL COMMENT '凭证图片(JSON格式)',
    status VARCHAR(20) DEFAULT '待处理' COMMENT '售后状态(待处理/处理中/已完成/已拒绝/已取消)',
    refuse_reason VARCHAR(200) DEFAULT NULL COMMENT '拒绝原因',
    shipping_code VARCHAR(50) DEFAULT NULL COMMENT '退货物流单号',
    shipping_company VARCHAR(50) DEFAULT NULL COMMENT '退货物流公司',
    operator_id BIGINT DEFAULT NULL COMMENT '处理人ID',
    operator_name VARCHAR(50) DEFAULT NULL COMMENT '处理人名称',
    handle_time DATETIME DEFAULT NULL COMMENT '处理时间',
    complete_time DATETIME DEFAULT NULL COMMENT '完成时间',
    remark VARCHAR(200) DEFAULT NULL COMMENT '备注',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='售后表';

-- 7. 订单日志表
CREATE TABLE ord_log (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    order_id BIGINT NOT NULL COMMENT '订单ID',
    order_no VARCHAR(50) NOT NULL COMMENT '订单编号',
    action VARCHAR(50) NOT NULL COMMENT '操作类型',
    status_before VARCHAR(20) DEFAULT NULL COMMENT '操作前状态',
    status_after VARCHAR(20) DEFAULT NULL COMMENT '操作后状态',
    operator_id BIGINT DEFAULT NULL COMMENT '操作人ID',
    operator_name VARCHAR(50) DEFAULT NULL COMMENT '操作人名称',
    operator_role VARCHAR(50) DEFAULT NULL COMMENT '操作人角色(用户/管理员)',
    content VARCHAR(500) DEFAULT NULL COMMENT '操作内容',
    ip VARCHAR(50) DEFAULT NULL COMMENT '操作IP',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='订单日志表'; 