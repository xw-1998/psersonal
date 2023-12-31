source from https://dongzl.github.io/netty-handbook/#/_content/chapter05?id=_586-netty-%e5%bf%ab%e9%80%9f%e5%85%a5%e9%97%a8%e5%ae%9e%e4%be%8b-tcp-%e6%9c%8d%e5%8a%a1

**Netty**是一个基于Java的开源网络应用框架，提供了高性能、异步事件驱动的网络编程能力。它专注于提供可扩展的、灵活的、并发性高的网络通信能力，广泛应用于构建各种类型的网络服务器和客户端应用。

Netty的设计目标是为了满足高性能、高并发、低延迟的网络应用需求。它采用了**事件驱动和异步的编程模型，基于NIO（Non-blocking I/O）技术**，使得在处理大量并发连接时能够有效地利用系统资源，提供出色的性能和可伸缩性。

Netty提供了一系列易于使用的抽象组件和丰富的功能，使得开发者可以更轻松地构建各种网络应用。其主要特点包括：
1. 异步和事件驱动：Netty的核心是基于事件驱动的模型，通过回调机制和Future/Promise模式处理网络事件和操作结果，实现非阻塞式的网络编程。
2. 高性能：Netty通过使用高效的I/O模型、内存池和零拷贝等技术，提供了卓越的性能表现。
3. 可扩展性：Netty提供了灵活的组件和扩展点，使得开发者可以定制和扩展框架的行为以满足特定需求。
4. 多协议支持：Netty支持多种常见的网络协议，例如HTTP、WebSocket、TCP、UDP等，使得开发者能够轻松构建各种类型的网络应用。
5. 安全性：Netty提供了一些安全加密和认证的组件，支持SSL/TLS等加密协议，保障网络通信的安全性。
6. 易于使用：Netty提供了简洁、一致的API和文档，使得开发者能够快速上手并构建可靠的网络应用。