-- 1. 会员等级表
CREATE TABLE member_level (
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

-- 2. 会员信息表
CREATE TABLE member (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    user_id BIGINT NOT NULL COMMENT '用户ID',
    level_id BIGINT DEFAULT NULL COMMENT '等级ID',
    nickname VARCHAR(50) DEFAULT NULL COMMENT '昵称',
    avatar VARCHAR(255) DEFAULT NULL COMMENT '头像',
    gender CHAR(1) DEFAULT NULL COMMENT '性别(M:男 F:女)',
    birthday DATE DEFAULT NULL COMMENT '生日',
    mobile VARCHAR(20) DEFAULT NULL COMMENT '手机号',
    email VARCHAR(100) DEFAULT NULL COMMENT '邮箱',
    points INT DEFAULT 0 COMMENT '积分',
    consumption_amount DECIMAL(12,2) DEFAULT 0.00 COMMENT '消费金额',
    consumption_count INT DEFAULT 0 COMMENT '消费次数',
    last_consumption_time DATETIME DEFAULT NULL COMMENT '最后消费时间',
    register_time DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间',
    register_source VARCHAR(20) DEFAULT NULL COMMENT '注册来源',
    status TINYINT DEFAULT 1 COMMENT '状态(1:正常,0:冻结)',
    remark VARCHAR(200) DEFAULT NULL COMMENT '备注',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='会员信息表';

-- 3. 会员标签表
CREATE TABLE member_tag (
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
CREATE TABLE member_tag_relation (
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
CREATE TABLE points_record (
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
CREATE TABLE points_rule (
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
CREATE TABLE member_sign_in (
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

-- 8. 会员成长值记录表
CREATE TABLE member_growth_record (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    member_id BIGINT NOT NULL COMMENT '会员ID',
    type VARCHAR(20) NOT NULL COMMENT '类型(获取/消费/过期/调整)',
    growth INT NOT NULL COMMENT '成长值变动',
    before_growth INT NOT NULL COMMENT '变动前成长值',
    after_growth INT NOT NULL COMMENT '变动后成长值',
    description VARCHAR(200) NOT NULL COMMENT '变动描述',
    source VARCHAR(50) DEFAULT NULL COMMENT '成长值来源',
    source_id VARCHAR(50) DEFAULT NULL COMMENT '来源ID',
    operator_id BIGINT DEFAULT NULL COMMENT '操作人ID',
    operator_name VARCHAR(50) DEFAULT NULL COMMENT '操作人名称',
    remark VARCHAR(200) DEFAULT NULL COMMENT '备注',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='会员成长值记录表';

-- 9. 会员等级变更记录表
CREATE TABLE member_level_change (
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

-- 10. 会员统计表
CREATE TABLE member_statistics (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    member_id BIGINT NOT NULL COMMENT '会员ID',
    total_order_count INT DEFAULT 0 COMMENT '订单总数',
    total_order_amount DECIMAL(12,2) DEFAULT 0.00 COMMENT '订单总金额',
    total_points_gained INT DEFAULT 0 COMMENT '累计获得积分',
    total_points_used INT DEFAULT 0 COMMENT '累计使用积分',
    total_coupon_count INT DEFAULT 0 COMMENT '领取优惠券数',
    used_coupon_count INT DEFAULT 0 COMMENT '使用优惠券数',
    favorite_product_count INT DEFAULT 0 COMMENT '收藏商品数',
    review_count INT DEFAULT 0 COMMENT '评价数',
    return_order_count INT DEFAULT 0 COMMENT '退货订单数',
    last_login_time DATETIME DEFAULT NULL COMMENT '最后登录时间',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='会员统计表';

-- 11. 会员地址簿表
CREATE TABLE member_address (
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
) COMMENT='会员地址簿表';

-- 12. 会员钱包表
CREATE TABLE member_wallet (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    member_id BIGINT NOT NULL COMMENT '会员ID',
    balance DECIMAL(12,2) DEFAULT 0.00 COMMENT '余额',
    freeze_balance DECIMAL(12,2) DEFAULT 0.00 COMMENT '冻结余额',
    password VARCHAR(255) DEFAULT NULL COMMENT '支付密码',
    status TINYINT DEFAULT 1 COMMENT '状态(1:正常,0:冻结)',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='会员钱包表';

-- 13. 钱包交易记录表
CREATE TABLE wallet_transaction (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    member_id BIGINT NOT NULL COMMENT '会员ID',
    transaction_no VARCHAR(50) NOT NULL COMMENT '交易流水号',
    type VARCHAR(20) NOT NULL COMMENT '交易类型(充值/消费/退款/提现)',
    amount DECIMAL(12,2) NOT NULL COMMENT '交易金额',
    before_balance DECIMAL(12,2) NOT NULL COMMENT '交易前余额',
    after_balance DECIMAL(12,2) NOT NULL COMMENT '交易后余额',
    status VARCHAR(20) DEFAULT '成功' COMMENT '交易状态(处理中/成功/失败)',
    description VARCHAR(200) NOT NULL COMMENT '交易描述',
    source VARCHAR(50) DEFAULT NULL COMMENT '交易来源',
    source_id VARCHAR(50) DEFAULT NULL COMMENT '来源ID',
    payment_method VARCHAR(20) DEFAULT NULL COMMENT '支付方式',
    payment_time DATETIME DEFAULT NULL COMMENT '支付时间',
    remark VARCHAR(200) DEFAULT NULL COMMENT '备注',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='钱包交易记录表'; 