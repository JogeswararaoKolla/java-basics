package javaExamples;


//We have created an class with ServiceConstants with variables and these can be access via
// import or we can create an ServiceConstants class instance and then call getters and setters to access them.

public class ConstantsImplDemo {

    public static void main(String[] args) {
        System.out.println("printing the Constant with import way !");
        System.out.println(ServiceConstants.successCode + ServiceConstants.successMessage + ServiceConstants.SERVERNAME);
        ServiceConstants obj1=new ServiceConstants();
        System.out.println("printing new instance obj1");
        System.out.println(obj1.getSuccessCode() + " " + obj1.getSuccessMessage() + " " + obj1.getSERVERNAME());
        System.out.println("Modifying the success code !");
        obj1.setSuccessCode("200");
        System.out.println(obj1.getSuccessCode());
        ServiceConstants obj2=new ServiceConstants();
        System.out.println("printing new instance obj2");
        System.out.println(obj2.getSuccessCode() + " " + obj2.getSuccessMessage() + " " + obj1.getSERVERNAME());
        // Because variables are public static String successCode="000"; whenever variable is modified
        // with an object instance it modifies at class level that is the reason we get the same
        // values for obj2 here


    }


}
