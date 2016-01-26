package net.javalab.test.domain;

public class VoyageRecordSummary_vrSector {

    private String index;
    private String vrTakeOff;
    private String vrLanding;
    private String vrFlightTime;
    private String vrNightTime;
    private String vrTaxiOut;
    private String vrTaxiIn;

    public VoyageRecordSummary_vrSector() {}

    public VoyageRecordSummary_vrSector(VoyageRecordSummary_vrSector o) {
        this.index = o.getIndex();
        this.vrTakeOff = o.getVrTakeOff();
        this.vrLanding = o.getVrLanding();
        this.vrFlightTime = o.getVrFlightTime();
        this.vrNightTime = o.getVrNightTime();
        this.vrTaxiOut = o.getVrTaxiOut();
        this.vrTaxiIn = o.getVrTaxiIn();
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getIndex() {
        return this.index;
    }

    public void setVrTakeOff(String vrTakeOff) {
        this.vrTakeOff = vrTakeOff;
    }

    public String getVrTakeOff() {
        return this.vrTakeOff;
    }

    public void setVrLanding(String vrLanding) {
        this.vrLanding = vrLanding;
    }

    public String getVrLanding() {
        return this.vrLanding;
    }

    public void setVrFlightTime(String vrFlightTime) {
        this.vrFlightTime = vrFlightTime;
    }

    public String getVrFlightTime() {
        return this.vrFlightTime;
    }

    public void setVrNightTime(String vrNightTime) {
        this.vrNightTime = vrNightTime;
    }

    public String getVrNightTime() {
        return this.vrNightTime;
    }

    public void setVrTaxiOut(String vrTaxiOut) {
        this.vrTaxiOut = vrTaxiOut;
    }

    public String getVrTaxiOut() {
        return this.vrTaxiOut;
    }

    public void setVrTaxiIn(String vrTaxiIn) {
        this.vrTaxiIn = vrTaxiIn;
    }

    public String getVrTaxiIn() {
        return this.vrTaxiIn;
    }

}
