package com.sun.tomorrow.autoConfig;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("com.sun.region")
public class RegionProperties {

    private String fileName;
    private String type;
    private String ClassName;

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
