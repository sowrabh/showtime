package in.nash.showtime.model;

import com.activeandroid.annotation.Table;
import com.google.gson.annotations.Expose;

/**
 * Created by Avinash Hindupur on 25/06/15.
 */
@Table(name="Person")
public class Person {

    @Expose
    private String id;

    @Expose
    private String name;

    @Expose
    private String profile_path;

    @Expose
    private String credit_id;

    @Expose
    private String character;

    @Expose
    private String job;

    @Expose
    private String department;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfilePath() {
        return profile_path;
    }

    public void setProfilePath(String profilePath) {
        this.profile_path = profilePath;
    }

    public String getCreditId() {
        return credit_id;
    }

    public void setCreditId(String creditId) {
        this.credit_id = creditId;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
