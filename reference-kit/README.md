# Enterprise OA Reference Kit

An independent, privacy-safe architecture reference and generic component examples for enterprise Office Automation (OA). **Not the company's production system and not production-ready.**

[中文说明](README.zh-CN.md)

## Included

- RBAC: deny-by-default role and permission checks, including route-level permission examples.
- Approval flow: a minimal, in-memory state machine.
- Form schema: metadata-driven required-field validation.
- Java 17 / Spring Boot 3.2.1 / Maven tests. No database or credentials.

## Start

```sh
cd backend
mvn test
mvn spring-boot:run
```

Visit `http://localhost:8080/api/public/info` or `/actuator/health`.

These are illustrative building blocks, not authenticated business endpoints. A real application needs Spring Security or equivalent, server-side authorization, persistence, auditing, concurrency controls, and additional validation.

## Boundary

No internal source code, production JARs, database dumps, employees, contracts, attendance, secrets, attachments, internal endpoints or company-specific business logic are included.

See `docs/ARCHITECTURE.md`, `docs/SECURITY.md` and `docs/OPEN_SOURCE_CHECKLIST.md`.

## License

See `LICENSE-NOTICE.md`. Do not reuse proprietary or third-party code without authorization.
