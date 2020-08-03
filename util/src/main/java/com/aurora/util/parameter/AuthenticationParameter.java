package com.aurora.util.parameter;

public class AuthenticationParameter {
    public static boolean  AuthenticationParameter(Object... objects){
        for (Object o:objects){

            if(o==null||o.equals("")){
                System.out.println(false);
            }else {
                System.out.println(o.getClass().getName() + "----" + "yes");
            }
        }
        return  false;
    }
}
