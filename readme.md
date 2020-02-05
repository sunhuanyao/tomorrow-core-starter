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
3、而后在resources下放入经纬度信息文件，如tomorrow_region.xml;也可以不放，
不放则默认读取一份经纬度信息，对查询需求没有影响，如需更新，则需要加入一个新的文件，
如果加入文件，则需要在application.yml下面加入
```
com:
  sun:
    region:
        file-name:tomorrow_region.xml
```
4、用法
```
@Autowired
private ApplicationRegionFactory applicationRegionFactory;

List<RegionInfo> regionInfoList = applicationRegionFactory.getRegionInfo(new Point(x,y));

```

