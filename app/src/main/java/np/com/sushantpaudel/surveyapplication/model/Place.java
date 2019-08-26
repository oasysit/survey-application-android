package np.com.sushantpaudel.surveyapplication.model;

import java.util.ArrayList;

public class Place {
    private boolean status;
    private String message;
    private ArrayList<PlaceName> placeNames;

    public boolean isStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public ArrayList<PlaceName> getPlaceNames() {
        return placeNames;
    }

    public class PlaceName{
        private String placeName;

        public String getPlaceName() {
            return placeName;
        }
    }
}
