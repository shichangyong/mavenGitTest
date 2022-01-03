# mavenGitTest
使用纯maven命令创建一个SpringBoot项目，然后添加相关依赖编写一个controller类实现一个简单的git请求返回“HelloWorld”，最后使用git命令将项目上传到gitHub
## 一 使用Maven命令创建项目
### 1.1 在项目创建位置打开窗口命令行，在命令行中执行如下命令：
<pre><code>mvn archetype:generate -DinteractiveMode=false -DgroupId=com.scy -DartifactId=task2 -Dversion=1.0.0-SNAPSHOT</code></pre>
### 1.2 项目创建成功后，使用文本编辑器打开项目中的pom.xml文件，在文件相应文件中添加如下依赖：
```xml
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.0.0.RELEASE</version>
</parent>
<!--Spring Boot WEB依赖-->
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
</dependencies>
```
### 1.3 在项目src/main/java/com/scy目录下创建controller包
### 1.4 在controller包中创建类first.java,内容如下:
```java
@RestController
public class first {
    @GetMapping("/hello")
    public String index() {
        return "HelloWorld~";
    }
}
```
### 1.5 将App改变为启动类，如下相关app.java类
```java
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
```
### 1.6 将项目导入IDEA中，并启动服务器，在浏览器上服务http://localhost:8080/hello
## 二 使用git命令将文件上传到gitHub
2.1 在gitHub上创建一个public仓库命名mavenGitTest
2.2 在使用git命令生成SSH令牌，命令如下:
<pre><code>ssh-keygen -t rsa -C "2776441252@qq.com" </code></pre>
2.3 将生成的SHH令牌添加到仓库中

2.4 在项目根目录下打开git，依次执行如下命令：
<pre><code>
1、git init //初始化项目，执行完此命令后会生成一个.git文件夹
2、git add . //将本地项目所有文件添加到git管理，.指全部文件
3、git commit -m "第一次提交" 
4、git remote add origin 刚刚新建的Github地址 //将本地项目与远程git仓库关联
5、git push -f origin master，强制将本地项目push到远程仓库。
</code></pre>
2.5 命令执行成功后在我的仓库中即存在项目的所有文件
