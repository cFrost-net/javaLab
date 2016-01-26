package net.javalab.test.domain;

public class VrDetailLHS {
    private String index;
    private String vrDetailNightTimeLeft;
    private String vrDetailNameLeft;
    private String vrDetailStickTimeLeft;
    
    public VrDetailLHS() {}
    
    public VrDetailLHS(VrDetailLHS o) {
        this.vrDetailStickTimeLeft = o.getVrDetailStickTimeLeft();
        this.vrDetailNameLeft = o.getVrDetailNameLeft();
        this.index = o.getIndex();
        this.vrDetailNightTimeLeft = o.getVrDetailNightTimeLeft();
    }
    
    public void setIndex(String index){
    this.index = index;
    }
    public String getIndex(){
    return this.index;
    }
    public void setVrDetailNightTimeLeft(String vrDetailNightTimeLeft){
    this.vrDetailNightTimeLeft = vrDetailNightTimeLeft;
    }
    public String getVrDetailNightTimeLeft(){
    return this.vrDetailNightTimeLeft;
    }
    public void setVrDetailNameLeft(String vrDetailNameLeft){
    this.vrDetailNameLeft = vrDetailNameLeft;
    }
    public String getVrDetailNameLeft(){
    return this.vrDetailNameLeft;
    }
    public void setVrDetailStickTimeLeft(String vrDetailStickTimeLeft){
    this.vrDetailStickTimeLeft = vrDetailStickTimeLeft;
    }

    public String getVrDetailStickTimeLeft(){
    return this.vrDetailStickTimeLeft;
    }


}
