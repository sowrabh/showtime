package in.nash.showtime.model;

import com.google.gson.annotations.Expose;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

import in.nash.showtime.model.db.ShowTimeDatabase;

/**
 * Created by Avinash Hindupur on 25/06/15.
 */
@Table(databaseName = ShowTimeDatabase.NAME)
public class Person extends BaseModel{

    @Expose
    @Column
    @PrimaryKey
    public String id;

    @Expose
    @Column
    public String name;

    @Expose
    @Column
    public String profile_path;

    @Expose
    @Column
    public String credit_id;

    @Expose
    @Column
    public String character;

    @Expose
    @Column
    public String job;

    @Expose
    @Column
    public String department;


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
