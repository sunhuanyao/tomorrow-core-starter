该项目是面向基于tomorrow项目服务于springbootstarter。
--

###用法步骤：
注：以下步骤均在JDK1.8上执行。

1、将该项目下载到本地文件执行maven编译；
```
mvn clean package -Dmaven.test.skip=true
mvn install
```
2、引入maven
```
<dependency>
    <groupId>com.sun.tomorrow</groupId>
    <artifactId>tomorrow-core-starter</artifactId>
    <version>1.0.1</version>
</dependency>
```
3、

```
@Autowired
private ApplicationRegionFactory applicationRegionFactory;

```

