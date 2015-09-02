package com.oracle.csm.cdiexample;

import javax.inject.Named;

@Named("cdiTest")
public class CdiTestImpl implements CdiTest {

    public CdiTestImpl() {
        System.out.println(CdiTestImpl.class.getName() + " instantiated.");
    }
    
    public String getMessage() {
        return "Hi!";
    }
}
