package com.zerobank.utilities;

import com.zerobank.pages.LoginPage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties;

    static {
        try{
            String path="configurations.properties";
            FileInputStream input=new FileInputStream(path);
            properties=new Properties();
            properties.load(input);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String get(String key){
        return properties.getProperty(key);
    }


}
