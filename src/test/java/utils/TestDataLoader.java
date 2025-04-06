package utils;

import constants.FrameworkConstants;

import java.util.Properties;

public class TestDataLoader {

    private static TestDataLoader testDataLoader;   // singleton concerop. need to undersatnd more on that


    public static TestDataLoader testDataLoader() {

        if(testDataLoader == null) {
            testDataLoader = new TestDataLoader();
        }

        return testDataLoader;
    }

    Properties prop;
    private TestDataLoader(){
        switch (FrameworkConstants.ENVIRONMENT){
            case "QA":
                prop = PropertyUtils.propertyUtils((FrameworkConstants.QA_TEST_DATA_FILE));
                break;
            case "Prod":
                prop = PropertyUtils.propertyUtils((FrameworkConstants.PROD_TEST_DATA_FILE));
                break;
            default:
                break;

        }

    }

    public String getAppURL(){

        return prop.getProperty("appurl");

        //return null;
    }

}
