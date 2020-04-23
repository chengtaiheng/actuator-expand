# actuator-expand

## · 这是一个actuator health 检测功能的拓展，需要检测什么可以在ActuatorExpandTester类中的doHealthCheck方法中写要检测的内容，
## · 当访问host:port/actuator/health 路径的时候才会启动检测
## · 本项目用产生的一个随机数，对2取余。来模仿状态的检测，是偶数的时候，状态为在线，是奇数的时候，状态为掉线。
