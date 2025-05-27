-- ===============================
-- 营销模块（mkt_）
-- ===============================

-- 1. 优惠券表
CREATE TABLE mkt_coupon (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    name VARCHAR(100) NOT NULL COMMENT '优惠券名称',
    code VARCHAR(50) NOT NULL COMMENT '优惠券编码',
    type TINYINT NOT NULL COMMENT '优惠券类型(1:满减券,2:折扣券,3:无门槛券)',
    amount DECIMAL(10,2) DEFAULT NULL COMMENT '优惠金额',
    discount DECIMAL(3,2) DEFAULT NULL COMMENT '折扣率',
    min_amount DECIMAL(10,2) DEFAULT NULL COMMENT '最低消费金额',
    max_discount DECIMAL(10,2) DEFAULT NULL COMMENT '最高优惠金额',
    total INT NOT NULL COMMENT '发行总量',
    used INT DEFAULT 0 COMMENT '已使用数量',
    per_limit INT DEFAULT 1 COMMENT '每人限领张数',
    start_time DATETIME NOT NULL COMMENT '开始时间',
    end_time DATETIME NOT NULL COMMENT '结束时间',
    use_type TINYINT DEFAULT 1 COMMENT '使用类型(1:全场通用,2:指定分类,3:指定商品)',
    category_ids VARCHAR(500) DEFAULT NULL COMMENT '指定分类ID，多个用逗号分隔',
    spu_ids VARCHAR(500) DEFAULT NULL COMMENT '指定商品ID，多个用逗号分隔',
    status TINYINT DEFAULT 1 COMMENT '状态(1:正常,0:禁用)',
    remark VARCHAR(200) DEFAULT NULL COMMENT '备注',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='优惠券表';

-- 2. 会员优惠券表
CREATE TABLE mkt_member_coupon (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    member_id BIGINT NOT NULL COMMENT '会员ID',
    coupon_id BIGINT NOT NULL COMMENT '优惠券ID',
    coupon_code VARCHAR(50) NOT NULL COMMENT '优惠券码',
    status TINYINT DEFAULT 1 COMMENT '状态(1:未使用,2:已使用,3:已过期)',
    order_id BIGINT DEFAULT NULL COMMENT '使用订单ID',
    use_time DATETIME DEFAULT NULL COMMENT '使用时间',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='会员优惠券表';

-- 3. 满减活动表
CREATE TABLE mkt_full_reduction (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    name VARCHAR(100) NOT NULL COMMENT '活动名称',
    start_time DATETIME NOT NULL COMMENT '开始时间',
    end_time DATETIME NOT NULL COMMENT '结束时间',
    use_type TINYINT DEFAULT 1 COMMENT '使用类型(1:全场通用,2:指定分类,3:指定商品)',
    category_ids VARCHAR(500) DEFAULT NULL COMMENT '指定分类ID，多个用逗号分隔',
    spu_ids VARCHAR(500) DEFAULT NULL COMMENT '指定商品ID，多个用逗号分隔',
    status TINYINT DEFAULT 1 COMMENT '状态(1:正常,0:禁用)',
    remark VARCHAR(200) DEFAULT NULL COMMENT '备注',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='满减活动表';

-- 4. 满减规则表
CREATE TABLE mkt_full_reduction_rule (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    full_reduction_id BIGINT NOT NULL COMMENT '满减活动ID',
    full_amount DECIMAL(10,2) NOT NULL COMMENT '满足金额',
    reduction_amount DECIMAL(10,2) NOT NULL COMMENT '减少金额',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='满减规则表';

-- 5. 秒杀活动表
CREATE TABLE mkt_seckill (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    name VARCHAR(100) NOT NULL COMMENT '活动名称',
    start_time DATETIME NOT NULL COMMENT '开始时间',
    end_time DATETIME NOT NULL COMMENT '结束时间',
    status TINYINT DEFAULT 1 COMMENT '状态(1:正常,0:禁用)',
    remark VARCHAR(200) DEFAULT NULL COMMENT '备注',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='秒杀活动表';

-- 6. 秒杀商品表
CREATE TABLE mkt_seckill_spu (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    seckill_id BIGINT NOT NULL COMMENT '秒杀活动ID',
    spu_id BIGINT NOT NULL COMMENT '商品ID',
    seckill_price DECIMAL(10,2) NOT NULL COMMENT '秒杀价格',
    seckill_stock INT NOT NULL COMMENT '秒杀库存',
    seckill_limit INT DEFAULT 1 COMMENT '每人限购数量',
    sort INT DEFAULT 0 COMMENT '排序号',
    status TINYINT DEFAULT 1 COMMENT '状态(1:正常,0:禁用)',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='秒杀商品表';

-- 7. 拼团活动表
CREATE TABLE mkt_group (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    name VARCHAR(100) NOT NULL COMMENT '活动名称',
    start_time DATETIME NOT NULL COMMENT '开始时间',
    end_time DATETIME NOT NULL COMMENT '结束时间',
    status TINYINT DEFAULT 1 COMMENT '状态(1:正常,0:禁用)',
    remark VARCHAR(200) DEFAULT NULL COMMENT '备注',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='拼团活动表';

-- 8. 拼团商品表
CREATE TABLE mkt_group_spu (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    group_id BIGINT NOT NULL COMMENT '拼团活动ID',
    spu_id BIGINT NOT NULL COMMENT '商品ID',
    group_price DECIMAL(10,2) NOT NULL COMMENT '拼团价格',
    group_number INT DEFAULT 2 COMMENT '成团人数',
    group_limit INT DEFAULT 1 COMMENT '每人限购数量',
    sort INT DEFAULT 0 COMMENT '排序号',
    status TINYINT DEFAULT 1 COMMENT '状态(1:正常,0:禁用)',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='拼团商品表';

-- 9. 拼团记录表
CREATE TABLE mkt_group_record (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    group_id BIGINT NOT NULL COMMENT '拼团活动ID',
    group_spu_id BIGINT NOT NULL COMMENT '拼团商品ID',
    leader_id BIGINT NOT NULL COMMENT '团长ID',
    current_num INT DEFAULT 1 COMMENT '当前人数',
    status TINYINT DEFAULT 1 COMMENT '状态(1:进行中,2:已成功,3:已失败)',
    success_time DATETIME DEFAULT NULL COMMENT '成功时间',
    expire_time DATETIME NOT NULL COMMENT '过期时间',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='拼团记录表';

-- 10. 拼团成员表
CREATE TABLE mkt_group_member (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    group_record_id BIGINT NOT NULL COMMENT '拼团记录ID',
    member_id BIGINT NOT NULL COMMENT '会员ID',
    order_id BIGINT NOT NULL COMMENT '订单ID',
    is_leader TINYINT DEFAULT 0 COMMENT '是否团长(1:是,0:否)',
    status TINYINT DEFAULT 1 COMMENT '状态(1:待支付,2:已支付,3:已退款)',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='拼团成员表'; 