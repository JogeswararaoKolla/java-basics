package javaExamples;

//We have created an class with ServiceConstants with variables and these can be access via
// import or we can create an ServiceConstants class instance and then call getters and setters to access them.
// As it public static final String SERVERNAME we can't have setter function which means we can't modify the value

public class ServiceConstants {
    public static String successCode="000";
    public static  String successMessage="Suc";

    public static final String SERVERNAME="apple";

    public static String getSERVERNAME() {
        return SERVERNAME;
    }

    public String getSuccessCode() {
        return successCode;
    }

    public void setSuccessCode(String successCode) {
        ServiceConstants.successCode = successCode;
    }

    public String getSuccessMessage() {
        return successMessage;
    }

    public void setSuccessMessage(String successMessage) {
        ServiceConstants.successMessage = successMessage;
    }
}
