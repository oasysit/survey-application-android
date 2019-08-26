package np.com.sushantpaudel.surveyapplication.new_data_entry;

import android.app.Activity;
import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import java.io.Serializable;

import np.com.sushantpaudel.surveyapplication.R;
import np.com.sushantpaudel.surveyapplication.model.ChapterThree;

import static np.com.sushantpaudel.surveyapplication.new_data_entry.Util.getText;

class ChapterThreeData implements Serializable {

    private Context context;
    private Activity activity;
    private ChapterThree data = new ChapterThree();

    ChapterThreeData(Context context) {
        this.context = context;
        this.activity = (Activity) context;
    }

    void loadDropdownLists() {
        if (context != null) {
            Spinner spinnerDrinkingTap = activity.findViewById(R.id.spinnerDrinkingTap);
            Spinner spinnerWaterAvailability = activity.findViewById(R.id.spinnerWaterAvailability);
            Spinner spinnerWaterQuality = activity.findViewById(R.id.spinnerWaterQuality);
            Spinner spinnerWaterFetchingDistance = activity.findViewById(R.id.spinnerWaterFetchingDistance);
            Spinner spinnerCookingStove = activity.findViewById(R.id.spinnerCookingStove);
            Spinner spinnerTypeofOven = activity.findViewById(R.id.spinnerTypeofOven);
            Spinner spinnerTypeOfElectricity = activity.findViewById(R.id.spinnerTypeOfElectricity);
            Spinner spinnerWhyNoElectricity = activity.findViewById(R.id.spinnerWhyNoElectricity);
            Spinner spinnerTypeOfToilet = activity.findViewById(R.id.spinnerTypeOfToilet);
            Spinner spinnerJointToilet = activity.findViewById(R.id.spinnerJointToilet);
            Spinner spinnerTypeOfWasteManagement = activity.findViewById(R.id.spinnerTypeOfWasteManagement);
            Spinner spinnerHouseDrain = activity.findViewById(R.id.spinnerHouseDrain);
            Spinner spinnerHouseRoad = activity.findViewById(R.id.spinnerHouseRoad);

            ArrayAdapter<CharSequence> arrayAdapterSpinnerDrinkingTap = ArrayAdapter.createFromResource(context,
                    R.array.type_of_drinking_tap, android.R.layout.simple_spinner_item);
            arrayAdapterSpinnerDrinkingTap.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerDrinkingTap.setAdapter(arrayAdapterSpinnerDrinkingTap);

            ArrayAdapter<CharSequence> arrayAdapterSpinnerWaterAvailability = ArrayAdapter.createFromResource(context,
                    R.array.water_availability, android.R.layout.simple_spinner_item);
            arrayAdapterSpinnerWaterAvailability.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerWaterAvailability.setAdapter(arrayAdapterSpinnerWaterAvailability);

            ArrayAdapter<CharSequence> arrayAdapterSpinnerWaterQuality = ArrayAdapter.createFromResource(context,
                    R.array.water_quality, android.R.layout.simple_spinner_item);
            arrayAdapterSpinnerWaterQuality.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerWaterQuality.setAdapter(arrayAdapterSpinnerWaterQuality);

            ArrayAdapter<CharSequence> arrayAdapterSpinnerWaterFetchingDistance = ArrayAdapter.createFromResource(context,
                    R.array.water_fetching_distance, android.R.layout.simple_spinner_item);
            arrayAdapterSpinnerWaterFetchingDistance.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerWaterFetchingDistance.setAdapter(arrayAdapterSpinnerWaterFetchingDistance);

            ArrayAdapter<CharSequence> arrayAdapterSpinnerCookingStove = ArrayAdapter.createFromResource(context,
                    R.array.type_of_cooking_stove, android.R.layout.simple_spinner_item);
            arrayAdapterSpinnerCookingStove.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerCookingStove.setAdapter(arrayAdapterSpinnerCookingStove);

            ArrayAdapter<CharSequence> arrayAdapterSpinnerTypeofOven = ArrayAdapter.createFromResource(context,
                    R.array.type_of_oven, android.R.layout.simple_spinner_item);
            arrayAdapterSpinnerTypeofOven.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerTypeofOven.setAdapter(arrayAdapterSpinnerTypeofOven);

            ArrayAdapter<CharSequence> arrayAdapterSpinnerTypeOfElectricity = ArrayAdapter.createFromResource(context,
                    R.array.type_of_electricity, android.R.layout.simple_spinner_item);
            arrayAdapterSpinnerTypeOfElectricity.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerTypeOfElectricity.setAdapter(arrayAdapterSpinnerTypeOfElectricity);

            ArrayAdapter<CharSequence> arrayAdapterSpinnerWhyNoElectricity = ArrayAdapter.createFromResource(context,
                    R.array.why_no_electricity, android.R.layout.simple_spinner_item);
            arrayAdapterSpinnerWhyNoElectricity.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerWhyNoElectricity.setAdapter(arrayAdapterSpinnerWhyNoElectricity);

            ArrayAdapter<CharSequence> arrayAdapterSpinnerTypeOfToilet = ArrayAdapter.createFromResource(context,
                    R.array.type_of_toilet, android.R.layout.simple_spinner_item);
            arrayAdapterSpinnerTypeOfToilet.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerTypeOfToilet.setAdapter(arrayAdapterSpinnerTypeOfToilet);

            ArrayAdapter<CharSequence> arrayAdapterSpinnerJointToilet = ArrayAdapter.createFromResource(context,
                    R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
            arrayAdapterSpinnerTypeOfToilet.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerJointToilet.setAdapter(arrayAdapterSpinnerJointToilet);

            ArrayAdapter<CharSequence> arrayAdapterSpinnerTypeOfWasteManagement = ArrayAdapter.createFromResource(context,
                    R.array.type_of_waste_management, android.R.layout.simple_spinner_item);
            arrayAdapterSpinnerTypeOfWasteManagement.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerTypeOfWasteManagement.setAdapter(arrayAdapterSpinnerTypeOfWasteManagement);

            ArrayAdapter<CharSequence> arrayAdapterSpinnerHouseDrain = ArrayAdapter.createFromResource(context,
                    R.array.house_drain, android.R.layout.simple_spinner_item);
            arrayAdapterSpinnerHouseDrain.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerHouseDrain.setAdapter(arrayAdapterSpinnerHouseDrain);

            ArrayAdapter<CharSequence> arrayAdapterSpinnerHouseRoad = ArrayAdapter.createFromResource(context,
                    R.array.house_road, android.R.layout.simple_spinner_item);
            arrayAdapterSpinnerHouseRoad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerHouseRoad.setAdapter(arrayAdapterSpinnerHouseRoad);

        }
    }

    ChapterThree getData() {
        /*
         *  SPINNER
         */
        Spinner spinnerDrinkingTap = activity.findViewById(R.id.spinnerDrinkingTap);
        Spinner spinnerWaterAvailability = activity.findViewById(R.id.spinnerWaterAvailability);
        Spinner spinnerWaterQuality = activity.findViewById(R.id.spinnerWaterQuality);
        Spinner spinnerWaterFetchingDistance = activity.findViewById(R.id.spinnerWaterFetchingDistance);
        Spinner spinnerCookingStove = activity.findViewById(R.id.spinnerCookingStove);
        Spinner spinnerTypeofOven = activity.findViewById(R.id.spinnerTypeofOven);
        Spinner spinnerTypeOfElectricity = activity.findViewById(R.id.spinnerTypeOfElectricity);
        Spinner spinnerWhyNoElectricity = activity.findViewById(R.id.spinnerWhyNoElectricity);
        Spinner spinnerTypeOfToilet = activity.findViewById(R.id.spinnerTypeOfToilet);
        Spinner spinnerJointToilet = activity.findViewById(R.id.spinnerJointToilet);
        Spinner spinnerTypeOfWasteManagement = activity.findViewById(R.id.spinnerTypeOfWasteManagement);
        Spinner spinnerHouseDrain = activity.findViewById(R.id.spinnerHouseDrain);
        Spinner spinnerHouseRoad = activity.findViewById(R.id.spinnerHouseRoad);

        data.setDrinkTap(getText(spinnerDrinkingTap));
        data.setWaterAvailability(getText(spinnerWaterAvailability));
        data.setWaterQuality(getText(spinnerWaterQuality));
        data.setDistanceWaterFetching(getText(spinnerWaterFetchingDistance));
        data.setTypeOfCookingStove(getText(spinnerCookingStove));
        data.setTypeOfOven(getText(spinnerTypeofOven));
        data.setTypeOfElectricity(getText(spinnerTypeOfElectricity));
        data.setWhyNoElectricity(getText(spinnerWhyNoElectricity));
        data.setTypeOfToilet(getText(spinnerTypeOfToilet));
        data.setJointToilet(getText(spinnerJointToilet));
        data.setWasteManagement(getText(spinnerTypeOfWasteManagement));
        data.setHouseDrain(getText(spinnerHouseDrain));
        data.setHouseRoad(getText(spinnerHouseRoad));
        /*
         *  EDIT TEXT
         */
        EditText editTextRoadWidth = activity.findViewById(R.id.editTextRoadWidth);

        data.setRoadWidth(getText(editTextRoadWidth));
        /*
         *  CHECK BOX
         */
        EditText editTextRadio = activity.findViewById(R.id.editTextRadio);
        EditText editTextTelevision = activity.findViewById(R.id.editTextTelevision);
        EditText editTextMobile = activity.findViewById(R.id.editTextMobile);
        EditText editTextComputer = activity.findViewById(R.id.editTextComputer);
        EditText editTextEmailInternet = activity.findViewById(R.id.editTextEmailInternet);
        EditText editTextBikeScooter = activity.findViewById(R.id.editTextBikeScooter);
        EditText editTextMotorCar = activity.findViewById(R.id.editTextMotorCar);
        EditText editTextRefrigerator = activity.findViewById(R.id.editTextRefrigerator);
        EditText editTextWashingMachine = activity.findViewById(R.id.editTextWashingMachine);
        EditText editTextAirConditioner = activity.findViewById(R.id.editTextAirConditioner);
        EditText editTextHeaterGeyserSolar = activity.findViewById(R.id.editTextHeaterGeyserSolar);

        data.setRadio(getText(editTextRadio));
        data.setTelevision(getText(editTextTelevision));
        data.setMobile(getText(editTextMobile));
        data.setComputer(getText(editTextComputer));
        data.setEmailInternet(getText(editTextEmailInternet));
        data.setBikeScooter(getText(editTextBikeScooter));
        data.setMotorCar(getText(editTextMotorCar));
        data.setRefrigerator(getText(editTextRefrigerator));
        data.setWashingMachine(getText(editTextWashingMachine));
        data.setAirConditioner(getText(editTextAirConditioner));
        data.setHeaterGeyserSolar(getText(editTextHeaterGeyserSolar));

        return data;

    }

}
