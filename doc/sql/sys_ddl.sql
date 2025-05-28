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

-- 机构表
CREATE TABLE sys_organization (
                                  id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
                                  tenant_id BIGINT NOT NULL COMMENT '租户ID',
                                  parent_id BIGINT DEFAULT NULL COMMENT '父机构ID',
                                  name VARCHAR(100) NOT NULL COMMENT '机构名称',
                                  code VARCHAR(50) DEFAULT NULL COMMENT '机构编码',
                                  type TINYINT DEFAULT 1 COMMENT '机构类型(1:公司,2:部门,3:小组)',
                                  leader_id BIGINT DEFAULT NULL COMMENT '负责人ID',
                                  contact_phone VARCHAR(20) DEFAULT NULL COMMENT '联系电话',
                                  status TINYINT DEFAULT 1 COMMENT '状态(1:正常,0:禁用)',
                                  sort INT DEFAULT 0 COMMENT '排序号',
                                  remark VARCHAR(200) DEFAULT NULL COMMENT '备注',
                                  version INT DEFAULT 1 COMMENT '版本号(用于乐观锁)',
                                  created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                  updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间(自动更新)'
) COMMENT='机构表';

-- 岗位表
CREATE TABLE sys_position (
                              id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
                              tenant_id BIGINT NOT NULL COMMENT '租户ID',
                              org_id BIGINT NOT NULL COMMENT '所属机构ID',
                              name VARCHAR(50) NOT NULL COMMENT '岗位名称',
                              code VARCHAR(50) DEFAULT NULL COMMENT '岗位编码',
                              level TINYINT DEFAULT 1 COMMENT '岗位层级',
                              description VARCHAR(200) DEFAULT NULL COMMENT '岗位描述',
                              status TINYINT DEFAULT 1 COMMENT '状态(1:正常,0:禁用)',
                              sort INT DEFAULT 0 COMMENT '排序号',
                              remark VARCHAR(200) DEFAULT NULL COMMENT '备注',
                              version INT DEFAULT 1 COMMENT '版本号(用于乐观锁)',
                              created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                              updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间(自动更新)'
) COMMENT='岗位表';

-- 用户-机构-岗位关联表
CREATE TABLE sys_user_position (
                                   id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
                                   tenant_id BIGINT NOT NULL COMMENT '租户ID',
                                   user_id BIGINT NOT NULL COMMENT '用户ID',
                                   org_id BIGINT NOT NULL COMMENT '机构ID',
                                   position_id BIGINT NOT NULL COMMENT '岗位ID',
                                   is_primary TINYINT DEFAULT 0 COMMENT '是否主岗(1:是,0:否)',
                                   start_date DATE DEFAULT NULL COMMENT '开始日期',
                                   end_date DATE DEFAULT NULL COMMENT '结束日期',
                                   status TINYINT DEFAULT 1 COMMENT '状态(1:正常,0:禁用)',
                                   version INT DEFAULT 1 COMMENT '版本号(用于乐观锁)',
                                   created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                   updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间(自动更新)'
) COMMENT='用户-机构-岗位关联表';

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

-- 岗位-角色关联表
CREATE TABLE sys_position_role (
                                   id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
                                   tenant_id BIGINT NOT NULL COMMENT '租户ID',
                                   position_id BIGINT NOT NULL COMMENT '岗位ID',
                                   role_id BIGINT NOT NULL COMMENT '角色ID',
                                   status TINYINT DEFAULT 1 COMMENT '状态(1:正常,0:禁用)',
                                   version INT DEFAULT 1 COMMENT '版本号(用于乐观锁)',
                                   created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                   updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间(自动更新)'
) COMMENT='岗位-角色关联表';

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

-- 权限表
CREATE TABLE sys_permission (
                                id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
                                tenant_id BIGINT NOT NULL COMMENT '租户ID',
                                name VARCHAR(50) NOT NULL COMMENT '权限名称',
                                code VARCHAR(50) NOT NULL COMMENT '权限编码',
                                resource_id BIGINT NOT NULL COMMENT '关联资源ID',
                                action VARCHAR(50) DEFAULT NULL COMMENT '操作类型(GET/POST/PUT/DELETE等)',
                                description VARCHAR(200) DEFAULT NULL COMMENT '权限描述',
                                status TINYINT DEFAULT 1 COMMENT '状态(1:正常,0:禁用)',
                                version INT DEFAULT 1 COMMENT '版本号(用于乐观锁)',
                                created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间(自动更新)'
) COMMENT='权限表';

-- 角色-权限关联表
CREATE TABLE sys_role_permission (
                                     id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
                                     tenant_id BIGINT NOT NULL COMMENT '租户ID',
                                     role_id BIGINT NOT NULL COMMENT '角色ID',
                                     permission_id BIGINT NOT NULL COMMENT '权限ID',
                                     version INT DEFAULT 1 COMMENT '版本号(用于乐观锁)',
                                     created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                     updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间(自动更新)'
) COMMENT='角色-权限关联表';

-- 数据权限规则表
CREATE TABLE sys_data_rule (
                               id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
                               tenant_id BIGINT NOT NULL COMMENT '租户ID',
                               name VARCHAR(50) NOT NULL COMMENT '规则名称',
                               code VARCHAR(50) DEFAULT NULL COMMENT '规则编码',
                               description VARCHAR(200) DEFAULT NULL COMMENT '规则描述',
                               rule_condition TEXT DEFAULT NULL COMMENT '规则条件表达式',
                               status TINYINT DEFAULT 1 COMMENT '状态(1:正常,0:禁用)',
                               version INT DEFAULT 1 COMMENT '版本号(用于乐观锁)',
                               created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                               updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间(自动更新)'
) COMMENT='数据权限规则表';

-- 角色-数据规则关联表
CREATE TABLE sys_role_data_rule (
                                    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
                                    tenant_id BIGINT NOT NULL COMMENT '租户ID',
                                    role_id BIGINT NOT NULL COMMENT '角色ID',
                                    data_rule_id BIGINT NOT NULL COMMENT '数据规则ID',
                                    version INT DEFAULT 1 COMMENT '版本号(用于乐观锁)',
                                    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间(自动更新)'
) COMMENT='角色-数据规则关联表';

-- ----------------------------
-- 路由管理模块
-- ----------------------------

-- 路由表
CREATE TABLE sys_route (
                           id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
                           tenant_id BIGINT NOT NULL COMMENT '租户ID',
                           parent_id BIGINT DEFAULT NULL COMMENT '父路由ID',
                           name VARCHAR(50) NOT NULL COMMENT '路由名称',
                           path VARCHAR(100) NOT NULL COMMENT '路由路径',
                           component VARCHAR(100) DEFAULT NULL COMMENT '组件路径',
                           redirect VARCHAR(100) DEFAULT NULL COMMENT '重定向路径',
                           meta JSON DEFAULT NULL COMMENT '元数据(JSON格式)',
                           sort INT DEFAULT 0 COMMENT '排序号',
                           hidden TINYINT DEFAULT 0 COMMENT '是否隐藏(1:是,0:否)',
                           status TINYINT DEFAULT 1 COMMENT '状态(1:正常,0:禁用)',
                           remark VARCHAR(200) DEFAULT NULL COMMENT '备注',
                           version INT DEFAULT 1 COMMENT '版本号(用于乐观锁)',
                           created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                           updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间(自动更新)'
) COMMENT='路由表';

-- 资源-路由关联表
CREATE TABLE sys_resource_route (
                                    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
                                    tenant_id BIGINT NOT NULL COMMENT '租户ID',
                                    resource_id BIGINT NOT NULL COMMENT '资源ID',
                                    route_id BIGINT NOT NULL COMMENT '路由ID',
                                    version INT DEFAULT 1 COMMENT '版本号(用于乐观锁)',
                                    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间(自动更新)'
) COMMENT='资源-路由关联表';

-- sys_user表：租户内用户查询和登录验证
ALTER TABLE sys_user ADD INDEX idx_tenant_id (tenant_id);
ALTER TABLE sys_user ADD INDEX idx_username_tenant (username, tenant_id);

-- sys_tenant表：租户编码查询
ALTER TABLE sys_tenant ADD INDEX idx_tenant_code (code);

-- sys_organization表：机构层级查询
ALTER TABLE sys_organization ADD INDEX idx_tenant_parent (tenant_id, parent_id);

-- sys_position表：岗位查询
ALTER TABLE sys_position ADD INDEX idx_tenant_org (tenant_id, org_id);

-- sys_user_position表：用户岗位关系查询
ALTER TABLE sys_user_position ADD INDEX idx_user_tenant (user_id, tenant_id);
ALTER TABLE sys_user_position ADD INDEX idx_user_primary (user_id, is_primary);

-- sys_role表：角色查询
ALTER TABLE sys_role ADD INDEX idx_tenant_code (tenant_id, code);

-- sys_position_role表：岗位-角色关联查询
ALTER TABLE sys_position_role ADD INDEX idx_position_role (position_id, role_id);

-- sys_role_permission表：角色权限关联查询
ALTER TABLE sys_role_permission ADD INDEX idx_role_permission (role_id, permission_id);

-- sys_permission表：权限编码查询
ALTER TABLE sys_permission ADD INDEX idx_permission_code (code);
-- sys_resource表：资源层级查询和类型过滤
ALTER TABLE sys_resource ADD INDEX idx_tenant_parent (tenant_id, parent_id);
ALTER TABLE sys_resource ADD INDEX idx_resource_type (type);

-- sys_route表：路由路径查询
ALTER TABLE sys_route ADD INDEX idx_tenant_path (tenant_id, path);

-- sys_data_rule表：规则编码查询
ALTER TABLE sys_data_rule ADD INDEX idx_rule_code (code);

-- sys_role_data_rule表：角色-数据规则关联查询
ALTER TABLE sys_role_data_rule ADD INDEX idx_role_rule (role_id, data_rule_id);