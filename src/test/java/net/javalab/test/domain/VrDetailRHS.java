package net.javalab.test.domain;

public class VrDetailRHS {
    private String vrDetailStickTimeRight;
    private String vrDetailNameRight;
    private String index;
    private String vrDetailNightTimeRight;
    
    public VrDetailRHS() {}
    
    public VrDetailRHS(VrDetailRHS o) {
        this.vrDetailStickTimeRight = o.getVrDetailStickTimeRight();
        this.vrDetailNameRight = o.getVrDetailNameRight();
        this.index = o.getIndex();
        this.vrDetailNightTimeRight = o.getVrDetailNightTimeRight();
    }
    
    public void setVrDetailStickTimeRight(String vrDetailStickTimeRight){
    this.vrDetailStickTimeRight = vrDetailStickTimeRight;
    }
    public String getVrDetailStickTimeRight(){
    return this.vrDetailStickTimeRight;
    }
    public void setVrDetailNameRight(String vrDetailNameRight){
    this.vrDetailNameRight = vrDetailNameRight;
    }
    public String getVrDetailNameRight(){
    return this.vrDetailNameRight;
    }
    public void setIndex(String index){
    this.index = index;
    }
    public String getIndex(){
    return this.index;
    }
    public void setVrDetailNightTimeRight(String vrDetailNightTimeRight){
    this.vrDetailNightTimeRight = vrDetailNightTimeRight;
    }

    public String getVrDetailNightTimeRight(){
    return this.vrDetailNightTimeRight;
    }


}
