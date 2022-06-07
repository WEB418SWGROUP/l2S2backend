package web418.project.ServiceHub.model;


import javax.persistence.*;

@Entity
@Table(name="subscribe")
public class Subscribe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="subscribeid")
    private int subscribeid;
    @Column(name="cardno")
    private String cardno;
    @Column(name="packageid")
    private String packageid;
    @Column(name="Exp_date")
    private String Exp_date;
    @Column(name="userid")
    private int userid;
    @Column(name="CVC")
    private int CVC;
    @Column(name="startdate")
    private String startdate;
    @Column(name="enddate")
    private String enddate;

    public Subscribe() {
    }

    public int getSubscribeid() {
        return subscribeid;
    }

    public void setSubscribeid(int subscribeid) {
        this.subscribeid = subscribeid;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getPackageid() {
        return packageid;
    }

    public void setPackageid(String packageid) {
        this.packageid = packageid;
    }

    public String getExp_date() {
        return Exp_date;
    }

    public void setExp_date(String exp_date) {
        Exp_date = exp_date;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getCVC() {
        return CVC;
    }

    public void setCVC(int CVC) {
        this.CVC = CVC;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }
}
