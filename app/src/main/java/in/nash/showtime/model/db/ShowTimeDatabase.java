package in.nash.showtime.model.db;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by Sowrabh on 10/7/2015.
 */
@Database(name = ShowTimeDatabase.NAME, version = ShowTimeDatabase.VERSION, foreignKeysSupported = true)
public class ShowTimeDatabase {
    public static final String NAME = "showtime";

    public static final int VERSION = 1;
}
