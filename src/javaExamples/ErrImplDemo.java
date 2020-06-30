package javaExamples;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ErrImplDemo {


    public static void main(String[] args) {

        ErrMappingEnum obj=ErrMappingEnum.valueOf("ERROR2");
        // As we have declared the type  private String errCode; we can't access from implemntation class
       //'errCode' has private access in 'javaExamples.ErrMappingEnum'
        //  System.out.println(obj.errCode + " " + obj.errDesc);
        System.out.println(obj.getErrCode() + "@" + obj.getErrDesc());

        ErrMappingEnum[]  obj2=ErrMappingEnum.values();

        System.out.println(Arrays.stream(obj2)
                .map(e-> e.getErrCode() + "-->" + e.getErrDesc())
                .collect(Collectors.joining("\n")));

    }
}
