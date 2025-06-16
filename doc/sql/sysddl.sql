-- ----------------------------
-- 租户管理模块
-- ----------------------------

-- 租户表
CREATE TABLE sys_tenant (
                            id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
                            name VARCHAR(100) NOT NULL COMMENT '租户名称',
                            code VARCHAR(50) NOT NULL COMMENT '租户编码',
                            domain VARCHAR(100) DEFAULT NULL COMMENT '域名',
                            logo VARCHAR(255) DEFAULT NULL COMMENT 'Logo',
                            contact_name VARCHAR(50) DEFAULT NULL COMMENT '联系人',
                            contact_phone VARCHAR(20) DEFAULT NULL COMMENT '联系电话',
                            contact_email VARCHAR(100) DEFAULT NULL COMMENT '联系邮箱',
                            expire_time DATETIME DEFAULT NULL COMMENT '过期时间',
                            status TINYINT DEFAULT 1 COMMENT '状态(1:正常,0:禁用)',
                            remark VARCHAR(200) DEFAULT NULL COMMENT '备注',
                            version INT DEFAULT 1 COMMENT '版本号(用于乐观锁)',
                            created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                            updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间(自动更新)'
) COMMENT='租户表';

-- ----------------------------
-- 用户与身份管理模块
-- ----------------------------

-- 用户表
CREATE TABLE sys_user (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
                          tenant_id BIGINT NOT NULL COMMENT '租户ID',
                          username VARCHAR(50) NOT NULL COMMENT '用户名',
                          password VARCHAR(100) NOT NULL COMMENT '密码',
                          real_name VARCHAR(50) DEFAULT NULL COMMENT '真实姓名',
                          avatar VARCHAR(255) DEFAULT NULL COMMENT '头像',
                          email VARCHAR(100) DEFAULT NULL COMMENT '邮箱',
                          phone VARCHAR(20) DEFAULT NULL COMMENT '手机号',
                          status TINYINT DEFAULT 1 COMMENT '状态(1:正常,0:禁用)',
                          remark VARCHAR(200) DEFAULT NULL COMMENT '备注',
                          version INT DEFAULT 1 COMMENT '版本号(用于乐观锁)',
                          created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                          updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间(自动更新)'
) COMMENT='用户表';


-- ----------------------------
-- 权限管理模块
-- ----------------------------

-- 角色表
CREATE TABLE sys_role (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
                          tenant_id BIGINT NOT NULL COMMENT '租户ID',
                          name VARCHAR(50) NOT NULL COMMENT '角色名称',
                          code VARCHAR(50) DEFAULT NULL COMMENT '角色编码',
                          description VARCHAR(200) DEFAULT NULL COMMENT '角色描述',
                          data_scope TINYINT DEFAULT 1 COMMENT '数据范围(1:全部数据,2:本部门及下级,3:本部门,4:仅本人数据,5:自定义)',
                          status TINYINT DEFAULT 1 COMMENT '状态(1:正常,0:禁用)',
                          sort INT DEFAULT 0 COMMENT '排序号',
                          remark VARCHAR(200) DEFAULT NULL COMMENT '备注',
                          version INT DEFAULT 1 COMMENT '版本号(用于乐观锁)',
                          created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                          updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间(自动更新)'
) COMMENT='角色表';


-- 资源表(菜单/页面元素)
CREATE TABLE sys_resource (
                              id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
                              tenant_id BIGINT NOT NULL COMMENT '租户ID',
                              parent_id BIGINT DEFAULT NULL COMMENT '父资源ID',
                              name VARCHAR(50) NOT NULL COMMENT '资源名称',
                              code VARCHAR(50) DEFAULT NULL COMMENT '资源编码',
                              type TINYINT NOT NULL COMMENT '资源类型(1:菜单,2:按钮,3:字段,4:API)',
                              url VARCHAR(255) DEFAULT NULL COMMENT 'URL路径',
                              icon VARCHAR(50) DEFAULT NULL COMMENT '图标',
                              sort INT DEFAULT 0 COMMENT '排序号',
                              visible TINYINT DEFAULT 1 COMMENT '是否可见(1:是,0:否)',
                              status TINYINT DEFAULT 1 COMMENT '状态(1:正常,0:禁用)',
                              remark VARCHAR(200) DEFAULT NULL COMMENT '备注',
                              version INT DEFAULT 1 COMMENT '版本号(用于乐观锁)',
                              created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                              updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间(自动更新)'
) COMMENT='资源表';


-- 角色-资源关联表
CREATE TABLE sys_role_permission (
                                     id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
                                     tenant_id BIGINT NOT NULL COMMENT '租户ID',
                                     role_id BIGINT NOT NULL COMMENT '角色ID',
                                     resource_id BIGINT NOT NULL COMMENT '关联资源ID',
                                     version INT DEFAULT 1 COMMENT '版本号(用于乐观锁)',
                                     created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                     updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间(自动更新)'
) COMMENT='角色-资源关联表';


-- sys_user表：租户内用户查询和登录验证
ALTER TABLE sys_user ADD INDEX idx_tenant_id (tenant_id);
ALTER TABLE sys_user ADD INDEX idx_username_tenant (username, tenant_id);

-- sys_tenant表：租户编码查询
ALTER TABLE sys_tenant ADD INDEX idx_tenant_code (code);

-- sys_role表：角色查询
ALTER TABLE sys_role ADD INDEX idx_tenant_code (tenant_id, code);

-- sys_role_permission表：角色资源关联查询
ALTER TABLE sys_role_permission ADD INDEX idx_role_permission (role_id, resource_id);

-- sys_resource表：资源层级查询和类型过滤
ALTER TABLE sys_resource ADD INDEX idx_tenant_parent (tenant_id, parent_id);
ALTER TABLE sys_resource ADD INDEX idx_resource_type (type);
