package web418.project.ServiceHub.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="package_details")
public class PackageDetails {
    @Id
    @Column(name = "packageID", nullable = false, unique = true)
            private String packageID;
    @Column(name = "packageName", nullable = false)
            private String packageName;
    @Column(name = "price", nullable = false)
            private int price;
    @Column(name = "description", nullable = false)
            private String description;
    @Column(name = "accessPackages", nullable = false)
            private int accessPackages;
    @Column(name = "templateNo", nullable = false)
            private int templateNo;
    @Column(name = "googleMap", nullable = false)
            private boolean googleMap;
    @Column(name = "googleCalendar", nullable = false)
            private boolean googleCalendar;
    @Column(name = "subPeriod", nullable = false)
            private int subPeriod;
    @Lob
    @Column(name = "logo", length = Integer.MAX_VALUE, nullable = false)
    private byte[] logo;

    @Lob
    @Column(name = "advertisement", length = Integer.MAX_VALUE, nullable = false)
    private byte[] advertisement;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "lastUpdated", nullable = false)
    private Date lastUpdated;


    public PackageDetails() {
    }

    public String getPackageID() {
        return packageID;
    }

    public void setPackageID(String packageID) {
        this.packageID = packageID;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAccessPackages() {
        return accessPackages;
    }

    public void setAccessPackages(int accessPackages) {
        this.accessPackages = accessPackages;
    }

    public int getTemplateNo() {
        return templateNo;
    }

    public void setTemplateNo(int templateNo) {
        this.templateNo = templateNo;
    }

    public boolean getGoogleMap() {
        return googleMap;
    }

    public void setGoogleMap(boolean googleMap) {
        this.googleMap = googleMap;
    }

    public boolean getGoogleCalendar() {
        return googleCalendar;
    }

    public void setGoogleCalendar(boolean googleCalendar) {
        this.googleCalendar = googleCalendar;
    }

    public int getSubPeriod() {
        return subPeriod;
    }

    public void setSubPeriod(int subPeriod) {
        this.subPeriod = subPeriod;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public byte[] getAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(byte[] advertisement) {
        this.advertisement = advertisement;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }


}
