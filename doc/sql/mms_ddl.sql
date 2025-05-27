-- ===============================
-- 会员管理模块（mms_）
-- ===============================

-- 1. 会员信息表
CREATE TABLE mms_member (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    customer_id BIGINT NOT NULL COMMENT 'C端用户ID',
    level_id BIGINT DEFAULT NULL COMMENT '等级ID',
    points INT DEFAULT 0 COMMENT '积分',
    consumption_amount DECIMAL(12,2) DEFAULT 0.00 COMMENT '消费金额',
    consumption_count INT DEFAULT 0 COMMENT '消费次数',
    last_consumption_time DATETIME DEFAULT NULL COMMENT '最后消费时间',
    status TINYINT DEFAULT 1 COMMENT '状态(1:正常,0:冻结)',
    remark VARCHAR(200) DEFAULT NULL COMMENT '备注',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='会员信息表';

-- 2. 会员等级表
CREATE TABLE mms_level (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    name VARCHAR(50) NOT NULL COMMENT '等级名称',
    code VARCHAR(50) NOT NULL COMMENT '等级编码',
    level INT NOT NULL COMMENT '等级值',
    min_point INT NOT NULL DEFAULT 0 COMMENT '最低积分',
    max_point INT DEFAULT NULL COMMENT '最高积分',
    discount DECIMAL(3,2) DEFAULT 1.00 COMMENT '折扣率',
    icon VARCHAR(255) DEFAULT NULL COMMENT '等级图标',
    description VARCHAR(500) DEFAULT NULL COMMENT '等级描述',
    privileges TEXT DEFAULT NULL COMMENT '等级特权(JSON格式)',
    status TINYINT DEFAULT 1 COMMENT '状态(1:启用,0:禁用)',
    remark VARCHAR(200) DEFAULT NULL COMMENT '备注',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='会员等级表';

-- 3. 会员标签表
CREATE TABLE mms_tag (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    name VARCHAR(50) NOT NULL COMMENT '标签名称',
    code VARCHAR(50) NOT NULL COMMENT '标签编码',
    description VARCHAR(200) DEFAULT NULL COMMENT '标签描述',
    type VARCHAR(20) DEFAULT '手动' COMMENT '标签类型(手动/自动)',
    rule TEXT DEFAULT NULL COMMENT '自动打标签规则(JSON格式)',
    status TINYINT DEFAULT 1 COMMENT '状态(1:启用,0:禁用)',
    remark VARCHAR(200) DEFAULT NULL COMMENT '备注',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='会员标签表';

-- 4. 会员-标签关联表
CREATE TABLE mms_member_tag (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    member_id BIGINT NOT NULL COMMENT '会员ID',
    tag_id BIGINT NOT NULL COMMENT '标签ID',
    type VARCHAR(20) DEFAULT '手动' COMMENT '打标类型(手动/自动)',
    operator_id BIGINT DEFAULT NULL COMMENT '操作人ID',
    operator_name VARCHAR(50) DEFAULT NULL COMMENT '操作人名称',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='会员与标签关联表';

-- 5. 积分记录表
CREATE TABLE mms_points_record (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    member_id BIGINT NOT NULL COMMENT '会员ID',
    type VARCHAR(20) NOT NULL COMMENT '类型(获取/消费/过期/调整)',
    points INT NOT NULL COMMENT '积分变动值',
    before_points INT NOT NULL COMMENT '变动前积分',
    after_points INT NOT NULL COMMENT '变动后积分',
    description VARCHAR(200) NOT NULL COMMENT '变动描述',
    source VARCHAR(50) DEFAULT NULL COMMENT '积分来源(订单/活动/签到/管理员)',
    source_id VARCHAR(50) DEFAULT NULL COMMENT '来源ID',
    expire_time DATETIME DEFAULT NULL COMMENT '过期时间',
    operator_id BIGINT DEFAULT NULL COMMENT '操作人ID',
    operator_name VARCHAR(50) DEFAULT NULL COMMENT '操作人名称',
    remark VARCHAR(200) DEFAULT NULL COMMENT '备注',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='积分记录表';

-- 6. 积分规则表
CREATE TABLE mms_points_rule (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    name VARCHAR(100) NOT NULL COMMENT '规则名称',
    code VARCHAR(50) NOT NULL COMMENT '规则编码',
    type VARCHAR(20) NOT NULL COMMENT '规则类型(注册/购物/签到/评价)',
    points INT NOT NULL COMMENT '积分值',
    max_points_per_day INT DEFAULT NULL COMMENT '每日最大积分',
    max_times_per_day INT DEFAULT NULL COMMENT '每日最大次数',
    description VARCHAR(500) DEFAULT NULL COMMENT '规则描述',
    status TINYINT DEFAULT 1 COMMENT '状态(1:启用,0:禁用)',
    remark VARCHAR(200) DEFAULT NULL COMMENT '备注',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='积分规则表';

-- 7. 会员签到表
CREATE TABLE mms_sign_in (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    member_id BIGINT NOT NULL COMMENT '会员ID',
    sign_date DATE NOT NULL COMMENT '签到日期',
    continuous_days INT DEFAULT 1 COMMENT '连续签到天数',
    points INT DEFAULT 0 COMMENT '获得积分',
    ip VARCHAR(50) DEFAULT NULL COMMENT '签到IP',
    device VARCHAR(50) DEFAULT NULL COMMENT '签到设备',
    remark VARCHAR(200) DEFAULT NULL COMMENT '备注',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='会员签到表';

-- 8. 会员等级变更记录表
CREATE TABLE mms_level_change (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    member_id BIGINT NOT NULL COMMENT '会员ID',
    before_level_id BIGINT DEFAULT NULL COMMENT '变更前等级ID',
    after_level_id BIGINT NOT NULL COMMENT '变更后等级ID',
    change_type VARCHAR(20) NOT NULL COMMENT '变更类型(升级/降级/调整)',
    change_reason VARCHAR(200) DEFAULT NULL COMMENT '变更原因',
    operator_id BIGINT DEFAULT NULL COMMENT '操作人ID',
    operator_name VARCHAR(50) DEFAULT NULL COMMENT '操作人名称',
    remark VARCHAR(200) DEFAULT NULL COMMENT '备注',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='会员等级变更记录表';

-- 9. 会员地址表
CREATE TABLE mms_address (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    member_id BIGINT NOT NULL COMMENT '会员ID',
    receiver_name VARCHAR(50) NOT NULL COMMENT '收货人姓名',
    receiver_phone VARCHAR(20) NOT NULL COMMENT '收货人电话',
    province VARCHAR(50) NOT NULL COMMENT '省份',
    city VARCHAR(50) NOT NULL COMMENT '城市',
    district VARCHAR(50) NOT NULL COMMENT '区/县',
    detail_address VARCHAR(200) NOT NULL COMMENT '详细地址',
    postal_code VARCHAR(20) DEFAULT NULL COMMENT '邮政编码',
    is_default TINYINT DEFAULT 0 COMMENT '是否默认(1:是,0:否)',
    tag VARCHAR(20) DEFAULT NULL COMMENT '地址标签(家/公司/学校)',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='会员地址表'; 