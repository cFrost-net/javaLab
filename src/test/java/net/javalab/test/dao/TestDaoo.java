package net.javalab.test.dao;

import net.javalab.test.domain.A;

public class TestDaoo extends TestDao<A> {

    public Class<? extends TestDao> getsuperc(){
        return super.getClass();
    }
}
