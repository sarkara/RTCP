package com.fpl.rtcp.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



public class SystemProperties
{
    static private SystemProperties instance = null;

    private SystemProperties()
    {
    }

    /**
     * This factory method returns the unique instance of this class.
     * 
     * @return the instance of this class.
     */
    static public SystemProperties getInstance()
    {
        if(null == instance)
        {
            instance = new SystemProperties();
        }
        return instance;
    }

    public String getProperty(String propertyName)
    {
        String fileName = "c:/SystemProperties.properties";
        Properties prop = new Properties();
        InputStream is;
        try
        {
            is = new FileInputStream(fileName);
            prop.load(is);
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
            return null;
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
        return prop.getProperty(propertyName);
    }
}
