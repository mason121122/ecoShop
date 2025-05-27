-- ===============================
-- 会员模块（mbr_）
-- ===============================

-- 1. 会员表
CREATE TABLE mbr_member (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    username VARCHAR(50) NOT NULL COMMENT '用户名',
    password VARCHAR(100) NOT NULL COMMENT '密码',
    salt VARCHAR(20) DEFAULT NULL COMMENT '密码盐',
    nickname VARCHAR(50) DEFAULT NULL COMMENT '昵称',
    real_name VARCHAR(50) DEFAULT NULL COMMENT '真实姓名',
    avatar VARCHAR(255) DEFAULT NULL COMMENT '头像',
    gender TINYINT DEFAULT 0 COMMENT '性别(0:未知,1:男,2:女)',
    birthday DATE DEFAULT NULL COMMENT '生日',
    mobile VARCHAR(20) DEFAULT NULL COMMENT '手机号',
    email VARCHAR(100) DEFAULT NULL COMMENT '邮箱',
    status TINYINT DEFAULT 1 COMMENT '状态(1:正常,0:禁用)',
    level_id BIGINT DEFAULT NULL COMMENT '会员等级ID',
    points INT DEFAULT 0 COMMENT '积分',
    balance DECIMAL(10,2) DEFAULT 0.00 COMMENT '余额',
    last_login_time DATETIME DEFAULT NULL COMMENT '最后登录时间',
    last_login_ip VARCHAR(50) DEFAULT NULL COMMENT '最后登录IP',
    source VARCHAR(20) DEFAULT NULL COMMENT '注册来源',
    remark VARCHAR(200) DEFAULT NULL COMMENT '备注',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='会员表';

-- 2. 会员等级表
CREATE TABLE mbr_level (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    name VARCHAR(50) NOT NULL COMMENT '等级名称',
    icon VARCHAR(255) DEFAULT NULL COMMENT '等级图标',
    growth_value INT NOT NULL COMMENT '所需成长值',
    discount DECIMAL(3,2) DEFAULT 1.00 COMMENT '折扣率',
    description VARCHAR(200) DEFAULT NULL COMMENT '等级描述',
    status TINYINT DEFAULT 1 COMMENT '状态(1:启用,0:禁用)',
    remark VARCHAR(200) DEFAULT NULL COMMENT '备注',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='会员等级表';

-- 3. 会员地址表
CREATE TABLE mbr_address (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    member_id BIGINT NOT NULL COMMENT '会员ID',
    name VARCHAR(50) NOT NULL COMMENT '收货人姓名',
    phone VARCHAR(20) NOT NULL COMMENT '收货人电话',
    province VARCHAR(50) NOT NULL COMMENT '省份',
    city VARCHAR(50) NOT NULL COMMENT '城市',
    district VARCHAR(50) NOT NULL COMMENT '区县',
    detail VARCHAR(200) NOT NULL COMMENT '详细地址',
    post_code VARCHAR(20) DEFAULT NULL COMMENT '邮政编码',
    is_default TINYINT DEFAULT 0 COMMENT '是否默认(1:是,0:否)',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='会员地址表';

-- 4. 积分记录表
CREATE TABLE mbr_points_log (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    member_id BIGINT NOT NULL COMMENT '会员ID',
    type VARCHAR(20) NOT NULL COMMENT '类型(签到/购物/评价/活动)',
    points INT NOT NULL COMMENT '积分变动',
    before_points INT NOT NULL COMMENT '变动前积分',
    after_points INT NOT NULL COMMENT '变动后积分',
    order_id BIGINT DEFAULT NULL COMMENT '关联订单ID',
    description VARCHAR(200) DEFAULT NULL COMMENT '变动描述',
    operator_id BIGINT DEFAULT NULL COMMENT '操作人ID',
    operator_name VARCHAR(50) DEFAULT NULL COMMENT '操作人名称',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='积分记录表';

-- 5. 余额记录表
CREATE TABLE mbr_balance_log (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    member_id BIGINT NOT NULL COMMENT '会员ID',
    type VARCHAR(20) NOT NULL COMMENT '类型(充值/消费/退款/提现)',
    amount DECIMAL(10,2) NOT NULL COMMENT '变动金额',
    before_balance DECIMAL(10,2) NOT NULL COMMENT '变动前余额',
    after_balance DECIMAL(10,2) NOT NULL COMMENT '变动后余额',
    order_id BIGINT DEFAULT NULL COMMENT '关联订单ID',
    description VARCHAR(200) DEFAULT NULL COMMENT '变动描述',
    operator_id BIGINT DEFAULT NULL COMMENT '操作人ID',
    operator_name VARCHAR(50) DEFAULT NULL COMMENT '操作人名称',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='余额记录表';

-- 6. 成长值记录表
CREATE TABLE mbr_growth_log (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    member_id BIGINT NOT NULL COMMENT '会员ID',
    type VARCHAR(20) NOT NULL COMMENT '类型(购物/评价/活动)',
    growth INT NOT NULL COMMENT '成长值变动',
    before_growth INT NOT NULL COMMENT '变动前成长值',
    after_growth INT NOT NULL COMMENT '变动后成长值',
    order_id BIGINT DEFAULT NULL COMMENT '关联订单ID',
    description VARCHAR(200) DEFAULT NULL COMMENT '变动描述',
    operator_id BIGINT DEFAULT NULL COMMENT '操作人ID',
    operator_name VARCHAR(50) DEFAULT NULL COMMENT '操作人名称',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='成长值记录表';

-- 7. 会员登录记录表
CREATE TABLE mbr_login_log (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    tenant_id BIGINT DEFAULT NULL COMMENT '租户ID',
    member_id BIGINT NOT NULL COMMENT '会员ID',
    login_type VARCHAR(20) NOT NULL COMMENT '登录方式(账号密码/手机验证码/第三方)',
    login_ip VARCHAR(50) DEFAULT NULL COMMENT '登录IP',
    login_location VARCHAR(100) DEFAULT NULL COMMENT '登录地点',
    device_type VARCHAR(20) DEFAULT NULL COMMENT '设备类型',
    device_name VARCHAR(100) DEFAULT NULL COMMENT '设备名称',
    browser_type VARCHAR(20) DEFAULT NULL COMMENT '浏览器类型',
    browser_version VARCHAR(20) DEFAULT NULL COMMENT '浏览器版本',
    os_type VARCHAR(20) DEFAULT NULL COMMENT '操作系统类型',
    os_version VARCHAR(20) DEFAULT NULL COMMENT '操作系统版本',
    status TINYINT DEFAULT 1 COMMENT '状态(1:成功,0:失败)',
    msg VARCHAR(200) DEFAULT NULL COMMENT '消息提示',
    version INT DEFAULT 1 COMMENT '版本号',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
) COMMENT='会员登录记录表'; 