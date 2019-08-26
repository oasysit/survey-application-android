package np.com.sushantpaudel.surveyapplication.active_android;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Delete;
import com.activeandroid.query.Select;

import java.util.List;

@Table(name = "survey_data")
public class DataModel extends Model {

    @Column(name = "json_data")
    public String json = "";

    public static List<DataModel> getAllData() {
        return new Select().from(DataModel.class).execute();
    }

    public static void deleteAllData() {
        new Delete().from(DataModel.class).execute();
    }

    public static int countData() {
        return new Select().from(DataModel.class).count();
    }

}
