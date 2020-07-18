package com.bitrix.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties=new Properties();


    static{

        String path="Configuration.properties";

        try{
            FileInputStream fileInputStream=new FileInputStream(path);

            properties.load(fileInputStream);

            fileInputStream.close();



        }catch(Exception e){
            System.out.println("Properties file not found");
        }

    }

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }

}
