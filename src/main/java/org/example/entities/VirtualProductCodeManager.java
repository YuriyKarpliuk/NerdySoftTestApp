package org.example.entities;

import java.util.HashSet;
import java.util.Set;

public class VirtualProductCodeManager {
    private static VirtualProductCodeManager virtualProductCodeManager;
    private Set<String> usedCodes;


    private VirtualProductCodeManager() {
        usedCodes=new HashSet<>();
    }

    public static synchronized VirtualProductCodeManager getInstance()
    {
        if (virtualProductCodeManager == null)
            virtualProductCodeManager = new VirtualProductCodeManager();

        return virtualProductCodeManager;
    }
    public void useCode(String code){
        if(code!=null){
            usedCodes.add(code);
        }
    }
    public Boolean isCodeUsed(String code){
        return code!=null&&usedCodes.contains(code);
    }
}
