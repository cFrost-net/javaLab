package net.javalab.test.domain;

import java.util.List;

public class OptObjectForVr {
    private List<VoyageRecordSummary_vrSector> voyageRecordSummary_vrSector;
    private List<FuelRecord_vrSector> fuelRecord_vrSector;
    private List<VoyageRecordDetail_vrSector> voyageRecordDetail_vrSector;
    private String vrReportingTime;
    private String vrTotalDutyTime;
    private String vrEndOfDutyTime;
    private String vrTotalFlightTime;
    private String vrTotalNightTime;
    private String vrReportHotel;
    private String vrReportShuttleBus;
    private String vrReportFeedbackRequired;
    private String vrReportOthers;
    private String vrReportDirectRoute;
    private String vrReportDescription;
    private String vrFirstOfficer;
    private String vrPilotInCommand;
    private String airlineAndStd;
    private String acTypeAndReg;

    public String getVrReportDescription() {
        return vrReportDescription;
    }

    public void setVrReportDescription(String vrReportDescription) {
        this.vrReportDescription = vrReportDescription;
    }

    public void setVoyageRecordSummary_vrSector(List<VoyageRecordSummary_vrSector> voyageRecordSummary_vrSector) {
        this.voyageRecordSummary_vrSector = voyageRecordSummary_vrSector;
    }

    public List<VoyageRecordSummary_vrSector> getVoyageRecordSummary_vrSector() {
        return this.voyageRecordSummary_vrSector;
    }

    public void setFuelRecord_vrSector(List<FuelRecord_vrSector> fuelRecord_vrSector) {
        this.fuelRecord_vrSector = fuelRecord_vrSector;
    }

    public List<FuelRecord_vrSector> getFuelRecord_vrSector() {
        return this.fuelRecord_vrSector;
    }

    public void setVoyageRecordDetail_vrSector(List<VoyageRecordDetail_vrSector> voyageRecordDetail_vrSector) {
        this.voyageRecordDetail_vrSector = voyageRecordDetail_vrSector;
    }

    public List<VoyageRecordDetail_vrSector> getVoyageRecordDetail_vrSector() {
        return this.voyageRecordDetail_vrSector;
    }

    public void setVrReportingTime(String vrReportingTime) {
        this.vrReportingTime = vrReportingTime;
    }

    public String getVrReportingTime() {
        return this.vrReportingTime;
    }

    public void setVrTotalDutyTime(String vrTotalDutyTime) {
        this.vrTotalDutyTime = vrTotalDutyTime;
    }

    public String getVrTotalDutyTime() {
        return this.vrTotalDutyTime;
    }

    public void setVrEndOfDutyTime(String vrEndOfDutyTime) {
        this.vrEndOfDutyTime = vrEndOfDutyTime;
    }

    public String getVrEndOfDutyTime() {
        return this.vrEndOfDutyTime;
    }

    public void setVrTotalFlightTime(String vrTotalFlightTime) {
        this.vrTotalFlightTime = vrTotalFlightTime;
    }

    public String getVrTotalFlightTime() {
        return this.vrTotalFlightTime;
    }

    public void setVrTotalNightTime(String vrTotalNightTime) {
        this.vrTotalNightTime = vrTotalNightTime;
    }

    public String getVrTotalNightTime() {
        return this.vrTotalNightTime;
    }

    public void setVrReportHotel(String vrReportHotel) {
        this.vrReportHotel = vrReportHotel;
    }

    public String getVrReportHotel() {
        return this.vrReportHotel;
    }

    public void setVrReportShuttleBus(String vrReportShuttleBus) {
        this.vrReportShuttleBus = vrReportShuttleBus;
    }

    public String getVrReportShuttleBus() {
        return this.vrReportShuttleBus;
    }

    public void setVrReportFeedbackRequired(String vrReportFeedbackRequired) {
        this.vrReportFeedbackRequired = vrReportFeedbackRequired;
    }

    public String getVrReportFeedbackRequired() {
        return this.vrReportFeedbackRequired;
    }

    public void setVrReportOthers(String vrReportOthers) {
        this.vrReportOthers = vrReportOthers;
    }

    public String getVrReportOthers() {
        return this.vrReportOthers;
    }

    public void setVrReportDirectRoute(String vrReportDirectRoute) {
        this.vrReportDirectRoute = vrReportDirectRoute;
    }

    public String getVrReportDirectRoute() {
        return this.vrReportDirectRoute;
    }

    public void setVrFirstOfficer(String vrFirstOfficer) {
        this.vrFirstOfficer = vrFirstOfficer;
    }

    public String getVrFirstOfficer() {
        return this.vrFirstOfficer;
    }

    public void setVrPilotInCommand(String vrPilotInCommand) {
        this.vrPilotInCommand = vrPilotInCommand;
    }

    public String getVrPilotInCommand() {
        return this.vrPilotInCommand;
    }

    public void setAirlineAndStd(String airlineAndStd) {
        this.airlineAndStd = airlineAndStd;
    }

    public String getAirlineAndStd() {
        return this.airlineAndStd;
    }

    public void setAcTypeAndReg(String acTypeAndReg) {
        this.acTypeAndReg = acTypeAndReg;
    }

    public String getAcTypeAndReg() {
        return this.acTypeAndReg;
    }

    public void loadMainData(OptObjectForVr oldOptObjectForVr) {
        this.setAcTypeAndReg(oldOptObjectForVr.getAcTypeAndReg());
        this.setAirlineAndStd(oldOptObjectForVr.getAirlineAndStd());
        this.setVrEndOfDutyTime(oldOptObjectForVr.getVrEndOfDutyTime());
        this.setVrFirstOfficer(oldOptObjectForVr.getVrFirstOfficer());
        this.setVrPilotInCommand(oldOptObjectForVr.getVrPilotInCommand());
        this.setVrReportDirectRoute(oldOptObjectForVr.getVrReportDirectRoute());
        this.setVrReportFeedbackRequired(oldOptObjectForVr.getVrReportFeedbackRequired());
        this.setVrReportHotel(oldOptObjectForVr.getVrReportHotel());
        this.setVrReportingTime(oldOptObjectForVr.getVrReportingTime());
        this.setVrReportOthers(oldOptObjectForVr.getVrReportOthers());
        this.setVrReportShuttleBus(oldOptObjectForVr.getVrReportShuttleBus());
        this.setVrTotalDutyTime(oldOptObjectForVr.getVrTotalDutyTime());
        this.setVrTotalFlightTime(oldOptObjectForVr.getVrTotalFlightTime());
        this.setVrTotalNightTime(oldOptObjectForVr.getVrTotalNightTime());
        this.setVrReportDescription(oldOptObjectForVr.getVrReportDescription());        
    }
}
