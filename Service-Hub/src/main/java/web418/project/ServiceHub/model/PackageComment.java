package web418.project.ServiceHub.model;


import javax.persistence.*;

@Entity
@Table(name="packagecomment")
public class PackageComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commentId", nullable = false, unique = true)
    private int commentId;
    @Column(name = "comments", nullable = false)
    private String comments;
    @Column(name = "userid", nullable = false)
    private String userid;
    @Column(name = "packages", nullable = false)
    private int packageType;

    public PackageComment() {
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public int getPackageType() {
        return packageType;
    }

    public void setPackageType(int packageType) {
        this.packageType = packageType;
    }
}
