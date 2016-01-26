package net.javalab.test.domain;

import java.util.Date;

public class B {

    private Long data;
    private Date data2;
    public Long getData() {
        return data;
    }
    public void setData(Long data) {
        this.data = data;
    }
    public Date getData2() {
        return data2;
    }
    public void setData2(Date data2) {
        this.data2 = data2;
    }
    
    public void loadA(A a){
        this.data = a.getData();
        this.data2 = a.getData2();
    }
    
}
