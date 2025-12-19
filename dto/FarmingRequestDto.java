package com.krishimitra.dto;

public class FarmingRequestDto {
    private String soilType;
    private double ph;
    private double organicMatter;
    private double lat;
    private double lon;

    public String getSoilType() { return soilType; }
    public void setSoilType(String soilType) { this.soilType = soilType; }

    public double getPh() { return ph; }
    public void setPh(double ph) { this.ph = ph; }

    public double getOrganicMatter() { return organicMatter; }
    public void setOrganicMatter(double organicMatter) { this.organicMatter = organicMatter; }

    public double getLat() { return lat; }
    public void setLat(double lat) { this.lat = lat; }

    public double getLon() { return lon; }
    public void setLon(double lon) { this.lon = lon; }
}
