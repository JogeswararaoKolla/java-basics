package javaExamples;

public enum  ErrMappingEnum {

    // Enum Types are Classes
    // Implicitly inherit from Java Enum Class
    // Enum types can have fields ,methods,constructors
    // Each value is an instance of enum type
  // define a fine list of valid values
    //At end of the list with ";"

    ERROR1("101","Error_101"),
    ERROR2("102","Error_102");

    private String errCode;
    private String errDesc;
    ErrMappingEnum(String errCode,String errDesc){
        this.errCode=errCode;
        this.errDesc=errDesc;
    }

    public String getErrCode() {
        return errCode;
    }

    public String getErrDesc() {
        return errDesc;
    }
}
