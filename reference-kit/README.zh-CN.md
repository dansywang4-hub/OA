# 企业 OA 通用架构参考与组件示例

本项目由通用需求独立编写，用于演示企业 OA 的 RBAC 权限控制、审批流状态机、表单元数据设计。**不是生产 OA 源码或可直接投产的完整 OA。**

## 使用

Java 17 + Maven + Spring Boot 3.2.1：

```sh
cd backend
mvn test
mvn spring-boot:run
```

启动后访问 `http://localhost:8080/api/public/info`。

## 脱敏边界

不包含真实人员、考勤、合同、固定资产数据、公司名称、内网地址、密码、密钥、数据库备份、附件或生产后端 JAR；没有直接复制现有内部实现。

## 安全说明

示例 RBAC 不能替代 Spring Security，审批流仅保存在内存中；正式系统仍需身份验证、服务端授权、事务、并发控制、审计与安全测试。

许可证及发布注意事项见 `LICENSE-NOTICE.md` 与 `docs/` 文档。
