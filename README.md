# openServ
***
## 1. 本项目是使用springboot-javafx-support实现案例
#### 原本de.roskenet的springboot-javafx-support只支持到是springboot2.x和jdk1.8版本

```xml
<dependency>
    <groupId>de.roskenet</groupId>
    <artifactId>springboot-javafx-support</artifactId>
    <version>2.1.6</version>
</dependency>
```
现在使用魔改版[springboot-javafx-support](https://github.com/GershonWang/springboot-javafx-support)，即可兼容使用最新版本springboot3.x和jdk17版本了
***
## 2. 项目运行
#### 1. 下载springboot-javafx-support的[release](https://github.com/GershonWang/springboot-javafx-support/releases)里的jar包
#### 2. 将jar包打入maven仓库中
```
mvn install:install-file -DgroupId=com.dongpl -DartifactId=springboot-javafx-support -Dversion=1.0.1 -Dpackaging=jar -Dfile=springboot-javafx-support-1.0.1.jar
```
#### 3.运行OpenServApplication类
***
## 3. 项目使用到的样式框架([JFoenix](https://github.com/sshahine/JFoenix))
```xml
<dependency>
    <groupId>com.jfoenix</groupId>
    <artifactId>jfoenix</artifactId>
    <version>8.0.10</version>
</dependency>
```
