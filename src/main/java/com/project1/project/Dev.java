package com.project1.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    @Autowired
    @Qualifier("laptop")
    private Computer comp;

    public void setComp(Computer comp) {
        this.comp = comp;
    }



    public void build()
    {
        comp.compile();
    }

}
