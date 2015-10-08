package in.nash.showtime.model.db;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.ConflictAction;
import com.raizlabs.android.dbflow.annotation.ForeignKey;
import com.raizlabs.android.dbflow.annotation.ForeignKeyReference;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.annotation.Unique;
import com.raizlabs.android.dbflow.annotation.UniqueGroup;
import com.raizlabs.android.dbflow.structure.BaseModel;

import in.nash.showtime.model.Credits;
import in.nash.showtime.model.Person;

/**
 * Created by Sowrabh on 10/8/2015.
 */
@Table(databaseName = ShowTimeDatabase.NAME,
        uniqueColumnGroups = {@UniqueGroup(groupNumber = 1, uniqueConflict = ConflictAction.IGNORE)})
public class PersonToCredits extends BaseModel{
    public static final String COLUMN_PERSON_ID = "person_id";
    public static final String COLUMN_CREDITS_ID = "credits_id";

    @Column
    @PrimaryKey(autoincrement = true)
    public long id;

    @Column
    @ForeignKey(
            references = {@ForeignKeyReference(columnName = COLUMN_PERSON_ID,
                    columnType = String.class,
                    foreignColumnName = "id")},
            saveForeignKeyModel = false)
    @Unique(unique = false, uniqueGroups = 1)
    public Person person;

    @Column
    @ForeignKey(
            references = {@ForeignKeyReference(columnName = COLUMN_CREDITS_ID,
                    columnType = Integer.class,
                    foreignColumnName = "id")},
            saveForeignKeyModel = false)
    @Unique(unique = false, uniqueGroups = 1)
    public Credits credits;
}