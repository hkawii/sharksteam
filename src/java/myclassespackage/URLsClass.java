package myclassespackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class URLsClass {
    static String domain = "http://localhost:8080/mavenrestfullservice/rest/";
    static String service = "websiteservice/";
    
    public static String getdrivers = domain+service+"getdrivers/";//get
    public static String adddriver = domain+service+"adddriver/";
    public static String getdriver = domain+service+"getdriver/";
    public static String editdriver = domain+service+"editdriver/";
    public static String deletedriver = domain+service+"deletedriver/";

    
    public static String getvehicles = domain+service+"getvehicles/";//get
    public static String getvehicle = domain+service+"getvehicle/";//get
    public static String addvehicle = domain+service+"addvehicle/";//get
    public static String editvehicle = domain+service+"editvehicle/";//get
    public static String deletevehicle = domain+service+"deletevehicle/";//get
    
    public static String loginmember = domain+service+"loginmember/";//get
    public static String addmonitormember = domain+service+"addmonitormember/";//get
    
    public static String getpmembers = domain+service+"getpmembers/";//get
    
    public static String getcurrentvds = domain+service+"getcurrentvds/";//get
    
    public static String gettrips = domain+service+"gettrips/";//get
    public static String getpathwaymap = domain+service+"getpathwaymap/";//get
    
    public static String addristrictedroute = domain+service+"addristrictedroute/";//post
    
    public static String assignvehicle = domain+service+"assignvehicle/";

    //public static String apikey = "AIzaSyCj2uPSrU6P6L9AIQp0IVS1Ad7qqPnXePA"; 

    public static String apikey = "AIzaSyATc18NoAmLoEZFU9gIbIb8uGpXEbLoTDk";





}
