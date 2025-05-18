# ecoShop 通用电商项目

ecoShop 是一个基于微服务架构的电商系统，采用分层架构设计，提供完整的电商业务解决方案。

## 项目结构

```
ecoShop/
├── common/                        # 公共模块
│   └── src/main/java/com/ecoshop/common/
│       ├── config/               # 公共配置
│       ├── constant/             # 常量定义
│       ├── enums/               # 枚举定义
│       ├── exception/           # 异常定义
│       ├── utils/               # 工具类
│       └── validation/          # 校验相关
│
├── api/                          # API 模块
│   └── src/main/java/com/ecoshop/
│       ├── api/                 # 对外接口定义
│       └── vo/                  # 视图对象
│           ├── request/         # 请求对象
│           │   ├── product/     # 商品相关请求
│           │   ├── order/       # 订单相关请求
│           │   └── user/        # 用户相关请求
│           └── response/        # 响应对象
│               ├── product/     # 商品相关响应
│               ├── order/       # 订单相关响应
│               └── user/        # 用户相关响应
│
├── domain/                       # 领域模块
│   └── src/main/java/com/ecoshop/
│       ├── dao/                 # 数据访问层
│       │   ├── mapper/         # MyBatis Mapper
│       │   └── po/            # 持久化对象
│       ├── repository/         # 仓储层
│       └── resources/
│           └── mapper/        # MyBatis XML 映射文件
│
├── model/                       # 模型模块
│   └── src/main/java/com/ecoshop/
│       ├── bo/                 # 业务对象
│       │   ├── product/       # 商品相关业务对象
│       │   ├── order/         # 订单相关业务对象
│       │   └── user/          # 用户相关业务对象
│       └── dto/               # 数据传输对象
│
├── service/                     # 服务模块
│   └── src/main/java/com/ecoshop/
│       ├── service/            # 服务接口
│       │   ├── product/       # 商品相关服务
│       │   ├── order/         # 订单相关服务
│       │   └── user/          # 用户相关服务
│       └── impl/              # 服务实现
│           ├── product/       # 商品服务实现
│           ├── order/         # 订单服务实现
│           └── user/          # 用户服务实现
│
├── web/                         # Web 模块
│   └── src/main/java/com/ecoshop/
│       ├── controller/         # 控制器
│       │   ├── product/       # 商品相关控制器
│       │   ├── order/         # 订单相关控制器
│       │   └── user/          # 用户相关控制器
│       ├── config/            # Web 配置
│       ├── interceptor/       # 拦截器
│       └── resources/
│           ├── application.yml # 应用配置
│           └── static/        # 静态资源
│
├── doc/                         # 项目文档
│   ├── api/                    # API 文档
│   └── sql/                    # 数据库脚本
│
├── pom.xml                     # 父 POM 文件
└── README.md                   # 项目说明文档
```

## 模块说明

- **common**: 公共模块，包含工具类、通用配置、常量定义等
- **api**: API 接口定义和视图对象（VO）
- **domain**: 领域模块，包含数据访问层和持久化对象
- **model**: 模型模块，包含业务对象（BO）和数据传输对象（DTO）
- **service**: 业务服务层，包含业务逻辑实现
- **web**: Web 层，包含控制器和 Web 相关配置
- **doc**: 项目文档，包含 API 文档和数据库脚本

## 技术栈

- 基础框架：Spring Boot
- 持久层：MyBatis
- 数据库：MySQL
- 项目管理：Maven
- 开发工具：Lombok
- 文档工具：Swagger/OpenAPI

## 开发指南

1. 项目构建
   ```bash
   mvn clean install
   ```

2. 项目启动
   ```bash
   cd web
   mvn spring-boot:run
   ```

## 项目规范

1. 代码规范遵循阿里巴巴 Java 开发手册
2. 遵循 RESTful API 设计规范
3. 使用统一的异常处理机制
4. 遵循 DDD 领域驱动设计思想
