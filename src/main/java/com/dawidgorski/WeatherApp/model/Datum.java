
package com.dawidgorski.WeatherApp.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "moonrise_ts",
    "wind_cdir",
    "rh",
    "pres",
    "high_temp",
    "sunset_ts",
    "ozone",
    "moon_phase",
    "wind_gust_spd",
    "snow_depth",
    "clouds",
    "ts",
    "sunrise_ts",
    "app_min_temp",
    "wind_spd",
    "pop",
    "wind_cdir_full",
    "slp",
    "moon_phase_lunation",
    "valid_date",
    "app_max_temp",
    "vis",
    "dewpt",
    "snow",
    "uv",
    "weather",
    "wind_dir",
    "max_dhi",
    "clouds_hi",
    "precip",
    "low_temp",
    "max_temp",
    "moonset_ts",
    "datetime",
    "temp",
    "min_temp",
    "clouds_mid",
    "clouds_low"
})
@Generated("jsonschema2pojo")
public class Datum {

    @JsonProperty("moonrise_ts")
    private Integer moonriseTs;
    @JsonProperty("wind_cdir")
    private String windCdir;
    @JsonProperty("rh")
    private Integer rh;
    @JsonProperty("pres")
    private Double pres;
    @JsonProperty("high_temp")
    private Integer highTemp;
    @JsonProperty("sunset_ts")
    private Integer sunsetTs;
    @JsonProperty("ozone")
    private Double ozone;
    @JsonProperty("moon_phase")
    private Double moonPhase;
    @JsonProperty("wind_gust_spd")
    private Double windGustSpd;
    @JsonProperty("snow_depth")
    private Integer snowDepth;
    @JsonProperty("clouds")
    private Integer clouds;
    @JsonProperty("ts")
    private Integer ts;
    @JsonProperty("sunrise_ts")
    private Integer sunriseTs;
    @JsonProperty("app_min_temp")
    private Double appMinTemp;
    @JsonProperty("wind_spd")
    private Double windSpd;
    @JsonProperty("pop")
    private Integer pop;
    @JsonProperty("wind_cdir_full")
    private String windCdirFull;
    @JsonProperty("slp")
    private Double slp;
    @JsonProperty("moon_phase_lunation")
    private Double moonPhaseLunation;
    @JsonProperty("valid_date")
    private String validDate;
    @JsonProperty("app_max_temp")
    private Double appMaxTemp;
    @JsonProperty("vis")
    private Double vis;
    @JsonProperty("dewpt")
    private Double dewpt;
    @JsonProperty("snow")
    private Integer snow;
    @JsonProperty("uv")
    private Double uv;
    @JsonProperty("weather")
    private Weather weather;
    @JsonProperty("wind_dir")
    private Integer windDir;
    @JsonProperty("max_dhi")
    private Object maxDhi;
    @JsonProperty("clouds_hi")
    private Integer cloudsHi;
    @JsonProperty("precip")
    private Double precip;
    @JsonProperty("low_temp")
    private Double lowTemp;
    @JsonProperty("max_temp")
    private Double maxTemp;
    @JsonProperty("moonset_ts")
    private Integer moonsetTs;
    @JsonProperty("datetime")
    private String datetime;
    @JsonProperty("temp")
    private Integer temp;
    @JsonProperty("min_temp")
    private Double minTemp;
    @JsonProperty("clouds_mid")
    private Integer cloudsMid;
    @JsonProperty("clouds_low")
    private Integer cloudsLow;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("moonrise_ts")
    public Integer getMoonriseTs() {
        return moonriseTs;
    }

    @JsonProperty("moonrise_ts")
    public void setMoonriseTs(Integer moonriseTs) {
        this.moonriseTs = moonriseTs;
    }

    @JsonProperty("wind_cdir")
    public String getWindCdir() {
        return windCdir;
    }

    @JsonProperty("wind_cdir")
    public void setWindCdir(String windCdir) {
        this.windCdir = windCdir;
    }

    @JsonProperty("rh")
    public Integer getRh() {
        return rh;
    }

    @JsonProperty("rh")
    public void setRh(Integer rh) {
        this.rh = rh;
    }

    @JsonProperty("pres")
    public Double getPres() {
        return pres;
    }

    @JsonProperty("pres")
    public void setPres(Double pres) {
        this.pres = pres;
    }

    @JsonProperty("high_temp")
    public Integer getHighTemp() {
        return highTemp;
    }

    @JsonProperty("high_temp")
    public void setHighTemp(Integer highTemp) {
        this.highTemp = highTemp;
    }

    @JsonProperty("sunset_ts")
    public Integer getSunsetTs() {
        return sunsetTs;
    }

    @JsonProperty("sunset_ts")
    public void setSunsetTs(Integer sunsetTs) {
        this.sunsetTs = sunsetTs;
    }

    @JsonProperty("ozone")
    public Double getOzone() {
        return ozone;
    }

    @JsonProperty("ozone")
    public void setOzone(Double ozone) {
        this.ozone = ozone;
    }

    @JsonProperty("moon_phase")
    public Double getMoonPhase() {
        return moonPhase;
    }

    @JsonProperty("moon_phase")
    public void setMoonPhase(Double moonPhase) {
        this.moonPhase = moonPhase;
    }

    @JsonProperty("wind_gust_spd")
    public Double getWindGustSpd() {
        return windGustSpd;
    }

    @JsonProperty("wind_gust_spd")
    public void setWindGustSpd(Double windGustSpd) {
        this.windGustSpd = windGustSpd;
    }

    @JsonProperty("snow_depth")
    public Integer getSnowDepth() {
        return snowDepth;
    }

    @JsonProperty("snow_depth")
    public void setSnowDepth(Integer snowDepth) {
        this.snowDepth = snowDepth;
    }

    @JsonProperty("clouds")
    public Integer getClouds() {
        return clouds;
    }

    @JsonProperty("clouds")
    public void setClouds(Integer clouds) {
        this.clouds = clouds;
    }

    @JsonProperty("ts")
    public Integer getTs() {
        return ts;
    }

    @JsonProperty("ts")
    public void setTs(Integer ts) {
        this.ts = ts;
    }

    @JsonProperty("sunrise_ts")
    public Integer getSunriseTs() {
        return sunriseTs;
    }

    @JsonProperty("sunrise_ts")
    public void setSunriseTs(Integer sunriseTs) {
        this.sunriseTs = sunriseTs;
    }

    @JsonProperty("app_min_temp")
    public Double getAppMinTemp() {
        return appMinTemp;
    }

    @JsonProperty("app_min_temp")
    public void setAppMinTemp(Double appMinTemp) {
        this.appMinTemp = appMinTemp;
    }

    @JsonProperty("wind_spd")
    public Double getWindSpd() {
        return windSpd;
    }

    @JsonProperty("wind_spd")
    public void setWindSpd(Double windSpd) {
        this.windSpd = windSpd;
    }

    @JsonProperty("pop")
    public Integer getPop() {
        return pop;
    }

    @JsonProperty("pop")
    public void setPop(Integer pop) {
        this.pop = pop;
    }

    @JsonProperty("wind_cdir_full")
    public String getWindCdirFull() {
        return windCdirFull;
    }

    @JsonProperty("wind_cdir_full")
    public void setWindCdirFull(String windCdirFull) {
        this.windCdirFull = windCdirFull;
    }

    @JsonProperty("slp")
    public Double getSlp() {
        return slp;
    }

    @JsonProperty("slp")
    public void setSlp(Double slp) {
        this.slp = slp;
    }

    @JsonProperty("moon_phase_lunation")
    public Double getMoonPhaseLunation() {
        return moonPhaseLunation;
    }

    @JsonProperty("moon_phase_lunation")
    public void setMoonPhaseLunation(Double moonPhaseLunation) {
        this.moonPhaseLunation = moonPhaseLunation;
    }

    @JsonProperty("valid_date")
    public String getValidDate() {
        return validDate;
    }

    @JsonProperty("valid_date")
    public void setValidDate(String validDate) {
        this.validDate = validDate;
    }

    @JsonProperty("app_max_temp")
    public Double getAppMaxTemp() {
        return appMaxTemp;
    }

    @JsonProperty("app_max_temp")
    public void setAppMaxTemp(Double appMaxTemp) {
        this.appMaxTemp = appMaxTemp;
    }

    @JsonProperty("vis")
    public Double getVis() {
        return vis;
    }

    @JsonProperty("vis")
    public void setVis(Double vis) {
        this.vis = vis;
    }

    @JsonProperty("dewpt")
    public Double getDewpt() {
        return dewpt;
    }

    @JsonProperty("dewpt")
    public void setDewpt(Double dewpt) {
        this.dewpt = dewpt;
    }

    @JsonProperty("snow")
    public Integer getSnow() {
        return snow;
    }

    @JsonProperty("snow")
    public void setSnow(Integer snow) {
        this.snow = snow;
    }

    @JsonProperty("uv")
    public Double getUv() {
        return uv;
    }

    @JsonProperty("uv")
    public void setUv(Double uv) {
        this.uv = uv;
    }

    @JsonProperty("weather")
    public Weather getWeather() {
        return weather;
    }

    @JsonProperty("weather")
    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    @JsonProperty("wind_dir")
    public Integer getWindDir() {
        return windDir;
    }

    @JsonProperty("wind_dir")
    public void setWindDir(Integer windDir) {
        this.windDir = windDir;
    }

    @JsonProperty("max_dhi")
    public Object getMaxDhi() {
        return maxDhi;
    }

    @JsonProperty("max_dhi")
    public void setMaxDhi(Object maxDhi) {
        this.maxDhi = maxDhi;
    }

    @JsonProperty("clouds_hi")
    public Integer getCloudsHi() {
        return cloudsHi;
    }

    @JsonProperty("clouds_hi")
    public void setCloudsHi(Integer cloudsHi) {
        this.cloudsHi = cloudsHi;
    }

    @JsonProperty("precip")
    public Double getPrecip() {
        return precip;
    }

    @JsonProperty("precip")
    public void setPrecip(Double precip) {
        this.precip = precip;
    }

    @JsonProperty("low_temp")
    public Double getLowTemp() {
        return lowTemp;
    }

    @JsonProperty("low_temp")
    public void setLowTemp(Double lowTemp) {
        this.lowTemp = lowTemp;
    }

    @JsonProperty("max_temp")
    public Double getMaxTemp() {
        return maxTemp;
    }

    @JsonProperty("max_temp")
    public void setMaxTemp(Double maxTemp) {
        this.maxTemp = maxTemp;
    }

    @JsonProperty("moonset_ts")
    public Integer getMoonsetTs() {
        return moonsetTs;
    }

    @JsonProperty("moonset_ts")
    public void setMoonsetTs(Integer moonsetTs) {
        this.moonsetTs = moonsetTs;
    }

    @JsonProperty("datetime")
    public String getDatetime() {
        return datetime;
    }

    @JsonProperty("datetime")
    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    @JsonProperty("temp")
    public Integer getTemp() {
        return temp;
    }

    @JsonProperty("temp")
    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    @JsonProperty("min_temp")
    public Double getMinTemp() {
        return minTemp;
    }

    @JsonProperty("min_temp")
    public void setMinTemp(Double minTemp) {
        this.minTemp = minTemp;
    }

    @JsonProperty("clouds_mid")
    public Integer getCloudsMid() {
        return cloudsMid;
    }

    @JsonProperty("clouds_mid")
    public void setCloudsMid(Integer cloudsMid) {
        this.cloudsMid = cloudsMid;
    }

    @JsonProperty("clouds_low")
    public Integer getCloudsLow() {
        return cloudsLow;
    }

    @JsonProperty("clouds_low")
    public void setCloudsLow(Integer cloudsLow) {
        this.cloudsLow = cloudsLow;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Datum{" +
                "moonriseTs=" + moonriseTs +
                ", windCdir='" + windCdir + '\'' +
                ", rh=" + rh +
                ", pres=" + pres +
                ", highTemp=" + highTemp +
                ", sunsetTs=" + sunsetTs +
                ", ozone=" + ozone +
                ", moonPhase=" + moonPhase +
                ", windGustSpd=" + windGustSpd +
                ", snowDepth=" + snowDepth +
                ", clouds=" + clouds +
                ", ts=" + ts +
                ", sunriseTs=" + sunriseTs +
                ", appMinTemp=" + appMinTemp +
                ", windSpd=" + windSpd +
                ", pop=" + pop +
                ", windCdirFull='" + windCdirFull + '\'' +
                ", slp=" + slp +
                ", moonPhaseLunation=" + moonPhaseLunation +
                ", validDate='" + validDate + '\'' +
                ", appMaxTemp=" + appMaxTemp +
                ", vis=" + vis +
                ", dewpt=" + dewpt +
                ", snow=" + snow +
                ", uv=" + uv +
                ", weather=" + weather +
                ", windDir=" + windDir +
                ", maxDhi=" + maxDhi +
                ", cloudsHi=" + cloudsHi +
                ", precip=" + precip +
                ", lowTemp=" + lowTemp +
                ", maxTemp=" + maxTemp +
                ", moonsetTs=" + moonsetTs +
                ", datetime='" + datetime + '\'' +
                ", temp=" + temp +
                ", minTemp=" + minTemp +
                ", cloudsMid=" + cloudsMid +
                ", cloudsLow=" + cloudsLow +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
