# ssm
    是什么；spring框架(springmvc是spring的处理web组件) springmvc mybatis
    能干什么；取代servlet+jdbc+jsp
    怎么干；开发业务系统

## mvc：mode+controller+view
    viwe视图 用户看到的东西
    controller控制 controller
    mode server+mapper
### spring框架
    要引入什么jar包（来源在maven仓库下载）
        spring-beans//bean
        spring-contest
        spring-core
        spring-expression
        spring-web的两个是mvc的
        aop
    不用new 对象注入 spring解耦（所以对象都是bean配置文件或者注解放在ioc容器）aotuwea注入
#### ioc控制反转（spring—context依赖）
    对象自己创建，ioc交给springioc容器来（配置一下类bean）
    xml+Java注解+代码

    注解+xml（注册到xml）
    
### bean（类）的生命周期
    创建》销毁

## springmvc（依赖）
    三大组件
        HandlerMapper:接收url》HandlerAdapter
        HandlerAdapter：调用合适的Handler
        ViewResolver：封装view》返回前端
    编写拦截请求
## mybatis（依赖）
    封装jdbc
### aop切面编程（引用aspectjweaver和spring—aspects）
    导包》编写切面类（拦截）注解@component(ioc)和@Aspect(切面类)》被拦截的类》创建aop.xml(扫描的包，开始aop注解)
    前置，后置，后置异常，后置返回
    底层
        jdk动态代理
        cglib
    
    
    
    

