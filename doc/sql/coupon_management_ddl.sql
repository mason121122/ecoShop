-- 1. 优惠券模板表
CREATE TABLE coupon_template (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    name VARCHAR(100) NOT NULL COMMENT '优惠券名称',
    code VARCHAR(50) NOT NULL COMMENT '优惠券编码',
    description VARCHAR(500) DEFAULT NULL COMMENT '优惠券描述',
    type VARCHAR(20) NOT NULL COMMENT '优惠券类型(满减/折扣/无门槛)',
    value DECIMAL(10,2) NOT NULL COMMENT '优惠金额/折扣',
    min_point DECIMAL(10,2) DEFAULT 0 COMMENT '使用门槛(满多少可用)',
    max_discount DECIMAL(10,2) DEFAULT NULL COMMENT '最高优惠金额(折扣券可用)',
    total INT DEFAULT NULL COMMENT '发行数量',
    limit_per_user INT DEFAULT 1 COMMENT '每人限领数量',
    product_range VARCHAR(20) DEFAULT '全场通用' COMMENT '适用范围(全场通用/指定分类/指定商品)',
    product_ids TEXT DEFAULT NULL COMMENT '指定商品ID列表',
    category_ids TEXT DEFAULT NULL COMMENT '指定分类ID列表',
    valid_days INT DEFAULT NULL COMMENT '有效天数',
    start_time DATETIME DEFAULT NULL COMMENT '固定开始时间',
    end_time DATETIME DEFAULT NULL COMMENT '固定结束时间',
    status TINYINT DEFAULT 1 COMMENT '状态(1:启用,0:禁用)',
    remark VARCHAR(200) DEFAULT NULL COMMENT '备注',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='优惠券模板表';

-- 2. 优惠券批次表
CREATE TABLE coupon_batch (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    template_id BIGINT NOT NULL COMMENT '优惠券模板ID',
    batch_no VARCHAR(50) NOT NULL COMMENT '批次编号',
    name VARCHAR(100) NOT NULL COMMENT '批次名称',
    description VARCHAR(500) DEFAULT NULL COMMENT '批次描述',
    total INT NOT NULL COMMENT '发行数量',
    used INT DEFAULT 0 COMMENT '已使用数量',
    received INT DEFAULT 0 COMMENT '已领取数量',
    start_time DATETIME NOT NULL COMMENT '开始时间',
    end_time DATETIME NOT NULL COMMENT '结束时间',
    status TINYINT DEFAULT 1 COMMENT '状态(1:启用,0:禁用)',
    remark VARCHAR(200) DEFAULT NULL COMMENT '备注',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='优惠券批次表';

-- 3. 优惠券活动表
CREATE TABLE coupon_activity (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    name VARCHAR(100) NOT NULL COMMENT '活动名称',
    code VARCHAR(50) NOT NULL COMMENT '活动编码',
    description VARCHAR(500) DEFAULT NULL COMMENT '活动描述',
    type VARCHAR(20) NOT NULL COMMENT '活动类型(注册赠券/满额送券/定向发券/新人专享)',
    start_time DATETIME NOT NULL COMMENT '开始时间',
    end_time DATETIME NOT NULL COMMENT '结束时间',
    status TINYINT DEFAULT 1 COMMENT '状态(1:启用,0:禁用)',
    rule_config TEXT DEFAULT NULL COMMENT '规则配置(JSON格式)',
    remark VARCHAR(200) DEFAULT NULL COMMENT '备注',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='优惠券活动表';

-- 4. 活动-优惠券关联表
CREATE TABLE activity_coupon (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    activity_id BIGINT NOT NULL COMMENT '活动ID',
    batch_id BIGINT NOT NULL COMMENT '优惠券批次ID',
    quantity INT NOT NULL DEFAULT 1 COMMENT '每人可领数量',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='活动与优惠券关联表';

-- 5. 优惠券领取记录表
CREATE TABLE coupon_receive_log (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    user_id BIGINT NOT NULL COMMENT '用户ID',
    username VARCHAR(50) NOT NULL COMMENT '用户名',
    batch_id BIGINT NOT NULL COMMENT '优惠券批次ID',
    activity_id BIGINT DEFAULT NULL COMMENT '关联活动ID',
    receive_type VARCHAR(20) NOT NULL COMMENT '领取方式(主动领取/活动赠送/系统发放)',
    receive_time DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '领取时间',
    ip VARCHAR(50) DEFAULT NULL COMMENT '领取IP',
    user_agent VARCHAR(255) DEFAULT NULL COMMENT 'User-Agent',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='优惠券领取记录表';

-- 6. 优惠码表
CREATE TABLE promo_code (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    code VARCHAR(50) NOT NULL COMMENT '优惠码',
    name VARCHAR(100) NOT NULL COMMENT '优惠码名称',
    description VARCHAR(500) DEFAULT NULL COMMENT '优惠码描述',
    type VARCHAR(20) NOT NULL COMMENT '优惠类型(满减/折扣/无门槛)',
    value DECIMAL(10,2) NOT NULL COMMENT '优惠金额/折扣',
    min_point DECIMAL(10,2) DEFAULT 0 COMMENT '使用门槛(满多少可用)',
    max_discount DECIMAL(10,2) DEFAULT NULL COMMENT '最高优惠金额',
    product_range VARCHAR(20) DEFAULT '全场通用' COMMENT '适用范围(全场通用/指定分类/指定商品)',
    product_ids TEXT DEFAULT NULL COMMENT '指定商品ID列表',
    category_ids TEXT DEFAULT NULL COMMENT '指定分类ID列表',
    start_time DATETIME NOT NULL COMMENT '开始时间',
    end_time DATETIME NOT NULL COMMENT '结束时间',
    total_count INT DEFAULT NULL COMMENT '可使用次数',
    used_count INT DEFAULT 0 COMMENT '已使用次数',
    per_limit INT DEFAULT 1 COMMENT '每人可用次数',
    status TINYINT DEFAULT 1 COMMENT '状态(1:启用,0:禁用)',
    remark VARCHAR(200) DEFAULT NULL COMMENT '备注',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='优惠码表';

-- 7. 优惠码使用记录表
CREATE TABLE promo_code_use_log (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    code_id BIGINT NOT NULL COMMENT '优惠码ID',
    code VARCHAR(50) NOT NULL COMMENT '优惠码',
    user_id BIGINT NOT NULL COMMENT '用户ID',
    username VARCHAR(50) NOT NULL COMMENT '用户名',
    order_id BIGINT NOT NULL COMMENT '订单ID',
    order_no VARCHAR(50) NOT NULL COMMENT '订单编号',
    discount_amount DECIMAL(10,2) NOT NULL COMMENT '优惠金额',
    use_time DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '使用时间',
    ip VARCHAR(50) DEFAULT NULL COMMENT '使用IP',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='优惠码使用记录表';

-- 8. 满减活动表
CREATE TABLE full_reduction (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    name VARCHAR(100) NOT NULL COMMENT '活动名称',
    description VARCHAR(500) DEFAULT NULL COMMENT '活动描述',
    start_time DATETIME NOT NULL COMMENT '开始时间',
    end_time DATETIME NOT NULL COMMENT '结束时间',
    product_range VARCHAR(20) DEFAULT '全场通用' COMMENT '适用范围(全场通用/指定分类/指定商品)',
    product_ids TEXT DEFAULT NULL COMMENT '指定商品ID列表',
    category_ids TEXT DEFAULT NULL COMMENT '指定分类ID列表',
    status TINYINT DEFAULT 1 COMMENT '状态(1:启用,0:禁用)',
    remark VARCHAR(200) DEFAULT NULL COMMENT '备注',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='满减活动表';

-- 9. 满减规则表
CREATE TABLE full_reduction_rule (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    full_reduction_id BIGINT NOT NULL COMMENT '满减活动ID',
    threshold DECIMAL(10,2) NOT NULL COMMENT '满足金额',
    discount DECIMAL(10,2) NOT NULL COMMENT '优惠金额',
    gift_product_id BIGINT DEFAULT NULL COMMENT '赠品ID',
    gift_quantity INT DEFAULT NULL COMMENT '赠品数量',
    sort INT DEFAULT 0 COMMENT '排序号',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='满减规则表';

-- 10. 秒杀活动表
CREATE TABLE seckill_activity (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    name VARCHAR(100) NOT NULL COMMENT '活动名称',
    description VARCHAR(500) DEFAULT NULL COMMENT '活动描述',
    start_time DATETIME NOT NULL COMMENT '开始时间',
    end_time DATETIME NOT NULL COMMENT '结束时间',
    status TINYINT DEFAULT 1 COMMENT '状态(1:启用,0:禁用)',
    remark VARCHAR(200) DEFAULT NULL COMMENT '备注',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='秒杀活动表';

-- 11. 秒杀商品表
CREATE TABLE seckill_product (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    activity_id BIGINT NOT NULL COMMENT '秒杀活动ID',
    product_id BIGINT NOT NULL COMMENT '商品ID',
    product_name VARCHAR(200) NOT NULL COMMENT '商品名称',
    sku_id BIGINT DEFAULT NULL COMMENT 'SKU ID',
    sku_code VARCHAR(50) DEFAULT NULL COMMENT 'SKU编码',
    original_price DECIMAL(10,2) NOT NULL COMMENT '原价',
    seckill_price DECIMAL(10,2) NOT NULL COMMENT '秒杀价',
    stock INT NOT NULL COMMENT '秒杀库存',
    limit_per_user INT DEFAULT 1 COMMENT '每人限购数量',
    sales INT DEFAULT 0 COMMENT '销量',
    sort INT DEFAULT 0 COMMENT '排序号',
    status TINYINT DEFAULT 1 COMMENT '状态(1:启用,0:禁用)',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='秒杀商品表'; 