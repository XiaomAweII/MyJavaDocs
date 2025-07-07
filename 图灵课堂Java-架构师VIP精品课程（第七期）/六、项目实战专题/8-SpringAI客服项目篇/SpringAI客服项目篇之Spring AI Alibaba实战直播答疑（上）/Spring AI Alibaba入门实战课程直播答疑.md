# Spring AI Alibaba实战直播答疑

主讲老师：Fox



Spring AI Alibaba实战直播答疑 

1. Spring AI Alibaba重点梳理
2. Spring AI Alibaba常见问题答疑
3. 拓展：如何无缝切换多个大模型



## 课程大纲

https://www.processon.com/view/link/6810800f83d6ee240f5796b0?cid=67ff3b399346680abca00ff9



## Spring AI Alibaba重点梳理

### 技术选型

- **Spring AI**：这是Spring框架的AI扩展，旨在简化AI应用开发，提供模型集成与自动配置等功能
- **Spring Cloud Alibaba AI**：基于Spring AI，专为国内开发者设计，支持通义千问等阿里云AI服务，适用于聊天、文生图等场景

### 大模型选型

- 本地大模型
- 云端大模型



### 接入大模型方式

- ollama
- DashScope

- 类Open AI  API



### 核心组件

- ChatClient
- Model
  - Chat Model
  - Image Model
  - Audio Model

- Prompt
  - 动态模版
- 结构化输出
  - 实体
  - Json

### 核心功能实现

- 多轮对话记忆

  - 内存
  - mysql
  - Redis

- 回答私域知识

  - RAG

    - 动态知识（如股价、政策）适合用RAG，便于实时更新。

  - 微调

    - 静态知识（如法律条款、医学指南）更适合微调，深度学习后稳定性好

    ![img](https://i0.hdslb.com/bfs/new_dyn/de524ebb39d614ba2b1a8883ae8ee0582137303540.jpg@1192w.webp)

- 调用工具

  - Function/Tool Calling

    ![image-20250511141029528](C:\Users\图灵\AppData\Roaming\Typora\typora-user-images\image-20250511141029528.png)

  - MCP

  ![image-20250511141222592](C:\Users\图灵\AppData\Roaming\Typora\typora-user-images\image-20250511141222592.png)

![image-20250511141323270](C:\Users\图灵\AppData\Roaming\Typora\typora-user-images\image-20250511141323270.png)





## 拓展：多个大模型如何实现无缝切换

如何实现DeepSeek-R1 和 QwQ-32B大模型的无缝切换，比如当deepseek调用失败，可以降级调用qwq-32b？

https://www.yuque.com/u12222632/as5rgl/vteq5qp3a1krczve

![img](https://cdn.nlark.com/yuque/0/2025/png/12590378/1741760832753-71421487-462c-4e10-9d26-05efdc8b6a6f.png)