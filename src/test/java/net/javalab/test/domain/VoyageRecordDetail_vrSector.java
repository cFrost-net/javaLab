package net.javalab.test.domain;

import java.util.ArrayList;
import java.util.List;

public class VoyageRecordDetail_vrSector {
    private List<VrDetailRHS> vrDetailRHS;
    private List<VrDetailLHS> vrDetailLHS;
    private String index;
    private String vrDetailGoAroundNumber;
    private String vrDetailNumberOfLanding;
    private String vrDetailLandingPFName;
    private String vrDetailGoAround;
    private String vrDetailAutoLand;

    public VoyageRecordDetail_vrSector() {}

    public VoyageRecordDetail_vrSector(VoyageRecordDetail_vrSector o) {
        this.index = o.getIndex();
        this.vrDetailGoAroundNumber = o.getVrDetailGoAroundNumber();
        this.vrDetailNumberOfLanding = o.getVrDetailNumberOfLanding();
        this.vrDetailLandingPFName = o.getVrDetailLandingPFName();
        this.vrDetailGoAround = o.getVrDetailGoAround();
        this.vrDetailAutoLand = o.getVrDetailAutoLand();
        
        this.vrDetailRHS = new ArrayList<VrDetailRHS>();
        for(VrDetailRHS each : o.getVrDetailRHS()){
            VrDetailRHS data = new VrDetailRHS(each);
            this.vrDetailRHS.add(data);
        }
        
        this.vrDetailLHS = new ArrayList<VrDetailLHS>();
        for(VrDetailLHS each : o.getVrDetailLHS()){
            VrDetailLHS data = new VrDetailLHS(each);
            this.vrDetailLHS.add(data);
        }
    }

    public void setVrDetailRHS(List<VrDetailRHS> vrDetailRHS) {
        this.vrDetailRHS = vrDetailRHS;
    }

    public List<VrDetailRHS> getVrDetailRHS() {
        return this.vrDetailRHS;
    }

    public void setVrDetailLHS(List<VrDetailLHS> vrDetailLHS) {
        this.vrDetailLHS = vrDetailLHS;
    }

    public List<VrDetailLHS> getVrDetailLHS() {
        return this.vrDetailLHS;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getIndex() {
        return this.index;
    }

    public void setVrDetailGoAroundNumber(String vrDetailGoAroundNumber) {
        this.vrDetailGoAroundNumber = vrDetailGoAroundNumber;
    }

    public String getVrDetailGoAroundNumber() {
        return this.vrDetailGoAroundNumber;
    }

    public void setVrDetailNumberOfLanding(String vrDetailNumberOfLanding) {
        this.vrDetailNumberOfLanding = vrDetailNumberOfLanding;
    }

    public String getVrDetailNumberOfLanding() {
        return this.vrDetailNumberOfLanding;
    }

    public void setVrDetailLandingPFName(String vrDetailLandingPFName) {
        this.vrDetailLandingPFName = vrDetailLandingPFName;
    }

    public String getVrDetailLandingPFName() {
        return this.vrDetailLandingPFName;
    }

    public void setVrDetailGoAround(String vrDetailGoAround) {
        this.vrDetailGoAround = vrDetailGoAround;
    }

    public String getVrDetailGoAround() {
        return this.vrDetailGoAround;
    }

    public void setVrDetailAutoLand(String vrDetailAutoLand) {
        this.vrDetailAutoLand = vrDetailAutoLand;
    }

    public String getVrDetailAutoLand() {
        return this.vrDetailAutoLand;
    }

}
