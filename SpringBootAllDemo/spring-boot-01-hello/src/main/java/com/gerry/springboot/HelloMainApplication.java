package com.gerry.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBootApplication  : 标注在某个类上,说明该类是SpringBoot的引导类,SpringBoot就会运行该类的main方法来启动SpringBoot引用
 *      @SpringBootConfiguration
 *          @Configuration : 它属于SpringBoot底层的一个注解,定义配置类,等价于配置文件
 *               @Component : 添加到spring容器中,标识是一个组件
 *      @EnableAutoConfiguration
 *              @AutoConfigurationPackage : 将引导类所在包及其子包下面的所有组件添加到spring容器中
 *              @Import({AutoConfigurationImportSelector.class}):
 *                  1.将所有组件已全类名的方式返回,并且提那家到spring容器中
 *                  2.会给容器中导入非常多的自动 配置类(***AutoConfiguration),
 *                      就是导入 并配置好很多当前项目中所需要的组件
 *                      省去我们手动编写配置然后注入到组件中
 *
 *      @ComponentScan : 被 该注解标识的类会被纳入Spring容器进行管理
 *
 */


//程序的入口(启动类)
@SpringBootApplication
public class HelloMainApplication {
        public static void main(String[] args){
            SpringApplication.run(HelloMainApplication.class,args );
        }
}
