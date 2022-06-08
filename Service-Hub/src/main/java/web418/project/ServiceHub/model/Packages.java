package web418.project.ServiceHub.model;

import javax.persistence.*;


@Entity
@Table(name="packages")
public class Packages {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "packId")
    private int packId;
    @Column(name = "packname")
    private String packname;
    @Column(name = "price")
    private int price;
    @Column(name = "description")
    private String description;
    @Column(name = "gmap")
    private boolean gmap;
    @Column(name = "gcal")
    private boolean gcal;
    @Column(name = "packaccess" )
    private int packaccess;
    @Column(name = "template" )
    private int template;

    public Packages() {
    }

    public int getPackId() {
        return packId;
    }

    public void setPackId(int packId) {
        this.packId = packId;
    }

    public String getPackname() {
        return packname;
    }

    public void setPackname(String packname) {
        this.packname = packname;
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

    public boolean isGmap() {
        return gmap;
    }

    public void setGmap(boolean gmap) {
        this.gmap = gmap;
    }

    public boolean isGcal() {
        return gcal;
    }

    public void setGcal(boolean gcal) {
        this.gcal = gcal;
    }

    public int getPackaccess() {
        return packaccess;
    }

    public void setPackaccess(int packaccess) {
        this.packaccess = packaccess;
    }

    public int getTemplate() {
        return template;
    }

    public void setTemplate(int template) {
        this.template = template;
    }
}
